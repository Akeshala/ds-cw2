package com.akeshala.cw2.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: ReservationService.proto")
public final class ReservationGetServiceGrpc {

  private ReservationGetServiceGrpc() {}

  public static final String SERVICE_NAME = "com.akeshala.cw2.grpc.generated.ReservationGetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest,
      com.akeshala.cw2.grpc.generated.ReservationSearchResponse> getGetReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReservations",
      requestType = com.akeshala.cw2.grpc.generated.UserRequest.class,
      responseType = com.akeshala.cw2.grpc.generated.ReservationSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest,
      com.akeshala.cw2.grpc.generated.ReservationSearchResponse> getGetReservationsMethod() {
    io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest, com.akeshala.cw2.grpc.generated.ReservationSearchResponse> getGetReservationsMethod;
    if ((getGetReservationsMethod = ReservationGetServiceGrpc.getGetReservationsMethod) == null) {
      synchronized (ReservationGetServiceGrpc.class) {
        if ((getGetReservationsMethod = ReservationGetServiceGrpc.getGetReservationsMethod) == null) {
          ReservationGetServiceGrpc.getGetReservationsMethod = getGetReservationsMethod =
              io.grpc.MethodDescriptor.<com.akeshala.cw2.grpc.generated.UserRequest, com.akeshala.cw2.grpc.generated.ReservationSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ReservationSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationGetServiceMethodDescriptorSupplier("getReservations"))
              .build();
        }
      }
    }
    return getGetReservationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationGetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationGetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationGetServiceStub>() {
        @java.lang.Override
        public ReservationGetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationGetServiceStub(channel, callOptions);
        }
      };
    return ReservationGetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationGetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationGetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationGetServiceBlockingStub>() {
        @java.lang.Override
        public ReservationGetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationGetServiceBlockingStub(channel, callOptions);
        }
      };
    return ReservationGetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationGetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationGetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationGetServiceFutureStub>() {
        @java.lang.Override
        public ReservationGetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationGetServiceFutureStub(channel, callOptions);
        }
      };
    return ReservationGetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ReservationGetServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getReservations(com.akeshala.cw2.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ReservationSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetReservationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.akeshala.cw2.grpc.generated.UserRequest,
                com.akeshala.cw2.grpc.generated.ReservationSearchResponse>(
                  this, METHODID_GET_RESERVATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationGetServiceStub extends io.grpc.stub.AbstractAsyncStub<ReservationGetServiceStub> {
    private ReservationGetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationGetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationGetServiceStub(channel, callOptions);
    }

    /**
     */
    public void getReservations(com.akeshala.cw2.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ReservationSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationGetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReservationGetServiceBlockingStub> {
    private ReservationGetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationGetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationGetServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.akeshala.cw2.grpc.generated.ReservationSearchResponse getReservations(com.akeshala.cw2.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationGetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ReservationGetServiceFutureStub> {
    private ReservationGetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationGetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationGetServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akeshala.cw2.grpc.generated.ReservationSearchResponse> getReservations(
        com.akeshala.cw2.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESERVATIONS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationGetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationGetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESERVATIONS:
          serviceImpl.getReservations((com.akeshala.cw2.grpc.generated.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ReservationSearchResponse>) responseObserver);
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

  private static abstract class ReservationGetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationGetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akeshala.cw2.grpc.generated.ReservationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationGetService");
    }
  }

  private static final class ReservationGetServiceFileDescriptorSupplier
      extends ReservationGetServiceBaseDescriptorSupplier {
    ReservationGetServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationGetServiceMethodDescriptorSupplier
      extends ReservationGetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationGetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationGetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationGetServiceFileDescriptorSupplier())
              .addMethod(getGetReservationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
