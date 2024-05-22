package com.akeshala.cw2.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: ReservationService.proto")
public final class ReserveServiceGrpc {

  private ReserveServiceGrpc() {}

  public static final String SERVICE_NAME = "com.akeshala.cw2.grpc.generated.ReserveService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ReserveRequest,
      com.akeshala.cw2.grpc.generated.ReserveServiceResponse> getReserveItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reserveItem",
      requestType = com.akeshala.cw2.grpc.generated.ReserveRequest.class,
      responseType = com.akeshala.cw2.grpc.generated.ReserveServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ReserveRequest,
      com.akeshala.cw2.grpc.generated.ReserveServiceResponse> getReserveItemMethod() {
    io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ReserveRequest, com.akeshala.cw2.grpc.generated.ReserveServiceResponse> getReserveItemMethod;
    if ((getReserveItemMethod = ReserveServiceGrpc.getReserveItemMethod) == null) {
      synchronized (ReserveServiceGrpc.class) {
        if ((getReserveItemMethod = ReserveServiceGrpc.getReserveItemMethod) == null) {
          ReserveServiceGrpc.getReserveItemMethod = getReserveItemMethod =
              io.grpc.MethodDescriptor.<com.akeshala.cw2.grpc.generated.ReserveRequest, com.akeshala.cw2.grpc.generated.ReserveServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reserveItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ReserveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ReserveServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReserveServiceMethodDescriptorSupplier("reserveItem"))
              .build();
        }
      }
    }
    return getReserveItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReserveServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReserveServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReserveServiceStub>() {
        @java.lang.Override
        public ReserveServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReserveServiceStub(channel, callOptions);
        }
      };
    return ReserveServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReserveServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReserveServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReserveServiceBlockingStub>() {
        @java.lang.Override
        public ReserveServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReserveServiceBlockingStub(channel, callOptions);
        }
      };
    return ReserveServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReserveServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReserveServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReserveServiceFutureStub>() {
        @java.lang.Override
        public ReserveServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReserveServiceFutureStub(channel, callOptions);
        }
      };
    return ReserveServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ReserveServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void reserveItem(com.akeshala.cw2.grpc.generated.ReserveRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ReserveServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReserveItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.akeshala.cw2.grpc.generated.ReserveRequest,
                com.akeshala.cw2.grpc.generated.ReserveServiceResponse>(
                  this, METHODID_RESERVE_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class ReserveServiceStub extends io.grpc.stub.AbstractAsyncStub<ReserveServiceStub> {
    private ReserveServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReserveServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReserveServiceStub(channel, callOptions);
    }

    /**
     */
    public void reserveItem(com.akeshala.cw2.grpc.generated.ReserveRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ReserveServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReserveServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReserveServiceBlockingStub> {
    private ReserveServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReserveServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReserveServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.akeshala.cw2.grpc.generated.ReserveServiceResponse reserveItem(com.akeshala.cw2.grpc.generated.ReserveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReserveServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ReserveServiceFutureStub> {
    private ReserveServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReserveServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReserveServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akeshala.cw2.grpc.generated.ReserveServiceResponse> reserveItem(
        com.akeshala.cw2.grpc.generated.ReserveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESERVE_ITEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReserveServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReserveServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESERVE_ITEM:
          serviceImpl.reserveItem((com.akeshala.cw2.grpc.generated.ReserveRequest) request,
              (io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ReserveServiceResponse>) responseObserver);
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

  private static abstract class ReserveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReserveServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akeshala.cw2.grpc.generated.ReservationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReserveService");
    }
  }

  private static final class ReserveServiceFileDescriptorSupplier
      extends ReserveServiceBaseDescriptorSupplier {
    ReserveServiceFileDescriptorSupplier() {}
  }

  private static final class ReserveServiceMethodDescriptorSupplier
      extends ReserveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReserveServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReserveServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReserveServiceFileDescriptorSupplier())
              .addMethod(getReserveItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
