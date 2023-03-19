import com.example.rank.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class RankServer {
    private final int port;
    private final Server server;

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        RankServer rankServer = new RankServer(port);
        rankServer.start();
        rankServer.blockUntilShutdown();
    }

    public RankServer(int port) {
        this.port = port;
        this.server = ServerBuilder.forPort(port)
                .addService(new RankServiceImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("RankServer started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down RankServer since JVM is shutting down");
            RankServer.this.stop();
            System.err.println("*** RankServer shut down");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    static class RankServiceImpl extends RankServiceGrpc.RankServiceImplBase {
        private final Jedis jedis = new Jedis("localhost");

        @Override
        public void createRank(CreateRankRequest request, StreamObserver<CreateRankResponse> responseObserver) {
            String key = "rank:" + request.getUuid();
            jedis.hset(key, "name", request.getName());
            responseObserver.onNext(CreateRankResponse.newBuilder().build());
            responseObserver.onCompleted();
        }

        @Override
        public void addScore(AddScoreRequest request, StreamObserver<AddScoreResponse> responseObserver) {
            String key = "rank:" + request.getRankName();
            jedis.zadd(key, request.getScore(), request.getUuid());
            responseObserver.onNext(AddScoreResponse.newBuilder().build());
            responseObserver.onCompleted();
        }

        @Override
        public void getRankByUuid(GetRankByUuidRequest request, StreamObserver<GetRankByUuidResponse> responseObserver) {
            String uuid = request.getUuid();
            String rankName = request.getRankName();
            List<String> ranks = getRankingList(rankName);
            int rank = ranks.indexOf(uuid);
            for (int i = 0; i < rank; i++) {
                if(ranks.get(i).equals(uuid)){
                    rank = i;
                }
            }
            responseObserver.onNext(GetRankByUuidResponse.newBuilder().setRank(rank+1).build());
            responseObserver.onCompleted();
        }
        public List<String> getRankingList(String rankName) {
            List<String> rankingList = new ArrayList<>(jedis.zrevrange("rank:"+rankName, 0, -1));
            Map<String, Double> scores = jedis.zrevrangeWithScores("rank:"+rankName, 0, -1)
                    .stream().collect(Collectors.toMap(
                            tuple -> tuple.getElement(),
                            tuple -> tuple.getScore()
                    ));
            Collections.sort(rankingList, (a, b) -> Double.compare(scores.get(b), scores.get(a)));
            return rankingList;
        }


        @Override
        public void getAllRanks(GetAllRanksRequest request, StreamObserver<GetAllRanksResponse> responseObserver) {
            String rankName = request.getRankName();
            List<String> keys = new ArrayList<>(jedis.keys("rank:"+rankName));
            List<Rank> ranks = new ArrayList<>();
            for (String key : keys) {
                Set<String> values = jedis.zrevrange(key, 0, -1);
                for (String value : values) {
                    Rank rank = Rank.newBuilder()
                            .setUuid(value)
                            .setScore(jedis.zscore(key, value).intValue())
                            .build();
                    ranks.add(rank);
                }
            }
            Collections.sort(ranks, (r1, r2) -> Integer.compare(r2.getScore(), r1.getScore()));
            GetAllRanksResponse.Builder builder = GetAllRanksResponse.newBuilder();
            builder.addAllRanks(ranks);
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }

        @Override
        public void clearRank(ClearRankRequest request, StreamObserver<ClearRankResponse> responseObserver) {
            String key = "rank:" + request.getName();
            jedis.del(key);
            responseObserver.onNext(ClearRankResponse.newBuilder().build());
            responseObserver.onCompleted();
        }
    }
}

