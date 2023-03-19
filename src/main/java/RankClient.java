
import com.example.rank.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RankClient {
    private final ManagedChannel channel;
    private final RankServiceGrpc.RankServiceBlockingStub blockingStub;

    public RankClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext().build());
    }

    public RankClient(ManagedChannel channel) {
        this.channel = channel;
        this.blockingStub = RankServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        RankClient client = new RankClient("localhost", 50051);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add score");
            System.out.println("2. Get rank by uuid");
            System.out.println("3. Get all ranks");
            System.out.println("4. Clear rank");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Please enter RankingList name: ");
                    String name = scanner.nextLine();
                    System.out.print("Please enter user uuid: ");
                    String uuid = scanner.nextLine();
                    System.out.print("Please enter score: ");
                    int score = scanner.nextInt();
                    client.addScore(name, uuid, score);
                    break;
                case 2:
                    System.out.print("Please enter RankingList name: ");
                    name = scanner.nextLine();
                    System.out.print("Please enter uuid: ");
                    uuid = scanner.nextLine();
                    client.getRankByUuid(uuid,name);
                    break;
                case 3:
                    System.out.print("Please enter RankingList name: ");
                    name = scanner.nextLine();
                    client.getAllRanks(name);
                    break;
                case 4:
                    System.out.print("Please enter RankingList: ");
                    name = scanner.nextLine();
                    client.clearRank(name);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        client.shutdown();
    }

    public void createRank(String name, String uuid) {
        CreateRankRequest request = CreateRankRequest.newBuilder()
                .setName(name)
                .setUuid(uuid)
                .build();
        try {
            blockingStub.createRank(request);
            System.out.println("Rank created successfully");
        } catch (StatusRuntimeException e) {
            System.out.println("Error creating rank: " + e.getStatus());
        }
    }

    public void addScore(String name, String uuid, int score) {
        AddScoreRequest request = AddScoreRequest.newBuilder()
                .setRankName(name)
                .setUuid(uuid)
                .setScore(score)
                .build();
        try {
            blockingStub.addScore(request);
            System.out.println("Score added successfully");
        } catch (StatusRuntimeException e) {
            System.out.println("Error adding score: " + e.getStatus());
        }
    }

    public void getRankByUuid(String uuid,String RankingList) {
        GetRankByUuidRequest request = GetRankByUuidRequest.newBuilder()
                .setUuid(uuid)
                .setRankName(RankingList)
                .build();
        try {
            GetRankByUuidResponse response = blockingStub.getRankByUuid(request);
            int rank = response.getRank();
            System.out.println(uuid + " is RankingList " + rank);
        } catch (StatusRuntimeException e) {
            System.out.println("Error getting RankingList: " + e.getStatus());
        }
    }

    public void getAllRanks(String name) {
        GetAllRanksRequest request = GetAllRanksRequest.newBuilder().setRankName(name).build();
        try {
            GetAllRanksResponse response = blockingStub.getAllRanks(request);
            System.out.println("All RankingList:");
            for (Rank rank : response.getRanksList()) {
                System.out.println(rank.getUuid() + ": " + rank.getScore());
            }
        } catch (StatusRuntimeException e) {
            System.out.println("Error getting all ranks: " + e.getStatus());
        }
    }

    public void clearRank(String name) {
        ClearRankRequest request = ClearRankRequest.newBuilder()
                .setName(name)
                .build();
        try {
            blockingStub.clearRank(request);
            System.out.println("Rank cleared successfully");
        } catch (StatusRuntimeException e) {
            System.out.println("Error clearing RankingList: " + e.getStatus());
        }
    }
}