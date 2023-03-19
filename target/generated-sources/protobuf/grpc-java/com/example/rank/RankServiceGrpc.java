package com.example.rank;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: rank.proto")
public final class RankServiceGrpc {

  private RankServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.rank.RankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.rank.CreateRankRequest,
      com.example.rank.CreateRankResponse> getCreateRankMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRank",
      requestType = com.example.rank.CreateRankRequest.class,
      responseType = com.example.rank.CreateRankResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.rank.CreateRankRequest,
      com.example.rank.CreateRankResponse> getCreateRankMethod() {
    io.grpc.MethodDescriptor<com.example.rank.CreateRankRequest, com.example.rank.CreateRankResponse> getCreateRankMethod;
    if ((getCreateRankMethod = RankServiceGrpc.getCreateRankMethod) == null) {
      synchronized (RankServiceGrpc.class) {
        if ((getCreateRankMethod = RankServiceGrpc.getCreateRankMethod) == null) {
          RankServiceGrpc.getCreateRankMethod = getCreateRankMethod =
              io.grpc.MethodDescriptor.<com.example.rank.CreateRankRequest, com.example.rank.CreateRankResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRank"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.CreateRankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.CreateRankResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RankServiceMethodDescriptorSupplier("CreateRank"))
              .build();
        }
      }
    }
    return getCreateRankMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.rank.AddScoreRequest,
      com.example.rank.AddScoreResponse> getAddScoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddScore",
      requestType = com.example.rank.AddScoreRequest.class,
      responseType = com.example.rank.AddScoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.rank.AddScoreRequest,
      com.example.rank.AddScoreResponse> getAddScoreMethod() {
    io.grpc.MethodDescriptor<com.example.rank.AddScoreRequest, com.example.rank.AddScoreResponse> getAddScoreMethod;
    if ((getAddScoreMethod = RankServiceGrpc.getAddScoreMethod) == null) {
      synchronized (RankServiceGrpc.class) {
        if ((getAddScoreMethod = RankServiceGrpc.getAddScoreMethod) == null) {
          RankServiceGrpc.getAddScoreMethod = getAddScoreMethod =
              io.grpc.MethodDescriptor.<com.example.rank.AddScoreRequest, com.example.rank.AddScoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddScore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.AddScoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.AddScoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RankServiceMethodDescriptorSupplier("AddScore"))
              .build();
        }
      }
    }
    return getAddScoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.rank.GetRankByUuidRequest,
      com.example.rank.GetRankByUuidResponse> getGetRankByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRankByUuid",
      requestType = com.example.rank.GetRankByUuidRequest.class,
      responseType = com.example.rank.GetRankByUuidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.rank.GetRankByUuidRequest,
      com.example.rank.GetRankByUuidResponse> getGetRankByUuidMethod() {
    io.grpc.MethodDescriptor<com.example.rank.GetRankByUuidRequest, com.example.rank.GetRankByUuidResponse> getGetRankByUuidMethod;
    if ((getGetRankByUuidMethod = RankServiceGrpc.getGetRankByUuidMethod) == null) {
      synchronized (RankServiceGrpc.class) {
        if ((getGetRankByUuidMethod = RankServiceGrpc.getGetRankByUuidMethod) == null) {
          RankServiceGrpc.getGetRankByUuidMethod = getGetRankByUuidMethod =
              io.grpc.MethodDescriptor.<com.example.rank.GetRankByUuidRequest, com.example.rank.GetRankByUuidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRankByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.GetRankByUuidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.GetRankByUuidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RankServiceMethodDescriptorSupplier("GetRankByUuid"))
              .build();
        }
      }
    }
    return getGetRankByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.rank.GetAllRanksRequest,
      com.example.rank.GetAllRanksResponse> getGetAllRanksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRanks",
      requestType = com.example.rank.GetAllRanksRequest.class,
      responseType = com.example.rank.GetAllRanksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.rank.GetAllRanksRequest,
      com.example.rank.GetAllRanksResponse> getGetAllRanksMethod() {
    io.grpc.MethodDescriptor<com.example.rank.GetAllRanksRequest, com.example.rank.GetAllRanksResponse> getGetAllRanksMethod;
    if ((getGetAllRanksMethod = RankServiceGrpc.getGetAllRanksMethod) == null) {
      synchronized (RankServiceGrpc.class) {
        if ((getGetAllRanksMethod = RankServiceGrpc.getGetAllRanksMethod) == null) {
          RankServiceGrpc.getGetAllRanksMethod = getGetAllRanksMethod =
              io.grpc.MethodDescriptor.<com.example.rank.GetAllRanksRequest, com.example.rank.GetAllRanksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllRanks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.GetAllRanksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.GetAllRanksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RankServiceMethodDescriptorSupplier("GetAllRanks"))
              .build();
        }
      }
    }
    return getGetAllRanksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.rank.ClearRankRequest,
      com.example.rank.ClearRankResponse> getClearRankMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearRank",
      requestType = com.example.rank.ClearRankRequest.class,
      responseType = com.example.rank.ClearRankResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.rank.ClearRankRequest,
      com.example.rank.ClearRankResponse> getClearRankMethod() {
    io.grpc.MethodDescriptor<com.example.rank.ClearRankRequest, com.example.rank.ClearRankResponse> getClearRankMethod;
    if ((getClearRankMethod = RankServiceGrpc.getClearRankMethod) == null) {
      synchronized (RankServiceGrpc.class) {
        if ((getClearRankMethod = RankServiceGrpc.getClearRankMethod) == null) {
          RankServiceGrpc.getClearRankMethod = getClearRankMethod =
              io.grpc.MethodDescriptor.<com.example.rank.ClearRankRequest, com.example.rank.ClearRankResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearRank"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.ClearRankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rank.ClearRankResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RankServiceMethodDescriptorSupplier("ClearRank"))
              .build();
        }
      }
    }
    return getClearRankMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RankServiceStub>() {
        @java.lang.Override
        public RankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RankServiceStub(channel, callOptions);
        }
      };
    return RankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RankServiceBlockingStub>() {
        @java.lang.Override
        public RankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RankServiceBlockingStub(channel, callOptions);
        }
      };
    return RankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RankServiceFutureStub>() {
        @java.lang.Override
        public RankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RankServiceFutureStub(channel, callOptions);
        }
      };
    return RankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createRank(com.example.rank.CreateRankRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.CreateRankResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRankMethod(), responseObserver);
    }

    /**
     */
    public void addScore(com.example.rank.AddScoreRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.AddScoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddScoreMethod(), responseObserver);
    }

    /**
     */
    public void getRankByUuid(com.example.rank.GetRankByUuidRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.GetRankByUuidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRankByUuidMethod(), responseObserver);
    }

    /**
     */
    public void getAllRanks(com.example.rank.GetAllRanksRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.GetAllRanksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllRanksMethod(), responseObserver);
    }

    /**
     */
    public void clearRank(com.example.rank.ClearRankRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.ClearRankResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearRankMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRankMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.rank.CreateRankRequest,
                com.example.rank.CreateRankResponse>(
                  this, METHODID_CREATE_RANK)))
          .addMethod(
            getAddScoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.rank.AddScoreRequest,
                com.example.rank.AddScoreResponse>(
                  this, METHODID_ADD_SCORE)))
          .addMethod(
            getGetRankByUuidMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.rank.GetRankByUuidRequest,
                com.example.rank.GetRankByUuidResponse>(
                  this, METHODID_GET_RANK_BY_UUID)))
          .addMethod(
            getGetAllRanksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.rank.GetAllRanksRequest,
                com.example.rank.GetAllRanksResponse>(
                  this, METHODID_GET_ALL_RANKS)))
          .addMethod(
            getClearRankMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.rank.ClearRankRequest,
                com.example.rank.ClearRankResponse>(
                  this, METHODID_CLEAR_RANK)))
          .build();
    }
  }

  /**
   */
  public static final class RankServiceStub extends io.grpc.stub.AbstractAsyncStub<RankServiceStub> {
    private RankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RankServiceStub(channel, callOptions);
    }

    /**
     */
    public void createRank(com.example.rank.CreateRankRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.CreateRankResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRankMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addScore(com.example.rank.AddScoreRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.AddScoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddScoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRankByUuid(com.example.rank.GetRankByUuidRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.GetRankByUuidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRankByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRanks(com.example.rank.GetAllRanksRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.GetAllRanksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllRanksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearRank(com.example.rank.ClearRankRequest request,
        io.grpc.stub.StreamObserver<com.example.rank.ClearRankResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearRankMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RankServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RankServiceBlockingStub> {
    private RankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.rank.CreateRankResponse createRank(com.example.rank.CreateRankRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRankMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.rank.AddScoreResponse addScore(com.example.rank.AddScoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddScoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.rank.GetRankByUuidResponse getRankByUuid(com.example.rank.GetRankByUuidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRankByUuidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.rank.GetAllRanksResponse getAllRanks(com.example.rank.GetAllRanksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllRanksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.rank.ClearRankResponse clearRank(com.example.rank.ClearRankRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearRankMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RankServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RankServiceFutureStub> {
    private RankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.rank.CreateRankResponse> createRank(
        com.example.rank.CreateRankRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRankMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.rank.AddScoreResponse> addScore(
        com.example.rank.AddScoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddScoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.rank.GetRankByUuidResponse> getRankByUuid(
        com.example.rank.GetRankByUuidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRankByUuidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.rank.GetAllRanksResponse> getAllRanks(
        com.example.rank.GetAllRanksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllRanksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.rank.ClearRankResponse> clearRank(
        com.example.rank.ClearRankRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearRankMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RANK = 0;
  private static final int METHODID_ADD_SCORE = 1;
  private static final int METHODID_GET_RANK_BY_UUID = 2;
  private static final int METHODID_GET_ALL_RANKS = 3;
  private static final int METHODID_CLEAR_RANK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RANK:
          serviceImpl.createRank((com.example.rank.CreateRankRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rank.CreateRankResponse>) responseObserver);
          break;
        case METHODID_ADD_SCORE:
          serviceImpl.addScore((com.example.rank.AddScoreRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rank.AddScoreResponse>) responseObserver);
          break;
        case METHODID_GET_RANK_BY_UUID:
          serviceImpl.getRankByUuid((com.example.rank.GetRankByUuidRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rank.GetRankByUuidResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_RANKS:
          serviceImpl.getAllRanks((com.example.rank.GetAllRanksRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rank.GetAllRanksResponse>) responseObserver);
          break;
        case METHODID_CLEAR_RANK:
          serviceImpl.clearRank((com.example.rank.ClearRankRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rank.ClearRankResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.rank.RankProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RankService");
    }
  }

  private static final class RankServiceFileDescriptorSupplier
      extends RankServiceBaseDescriptorSupplier {
    RankServiceFileDescriptorSupplier() {}
  }

  private static final class RankServiceMethodDescriptorSupplier
      extends RankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RankServiceFileDescriptorSupplier())
              .addMethod(getCreateRankMethod())
              .addMethod(getAddScoreMethod())
              .addMethod(getGetRankByUuidMethod())
              .addMethod(getGetAllRanksMethod())
              .addMethod(getClearRankMethod())
              .build();
        }
      }
    }
    return result;
  }
}
