package com.akeshala.cw2.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: ReservationService.proto")
public final class UserAddServiceGrpc {

  private UserAddServiceGrpc() {}

  public static final String SERVICE_NAME = "com.akeshala.cw2.grpc.generated.UserAddService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserAddRequest,
      com.akeshala.cw2.grpc.generated.StatusResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUser",
      requestType = com.akeshala.cw2.grpc.generated.UserAddRequest.class,
      responseType = com.akeshala.cw2.grpc.generated.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserAddRequest,
      com.akeshala.cw2.grpc.generated.StatusResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserAddRequest, com.akeshala.cw2.grpc.generated.StatusResponse> getAddUserMethod;
    if ((getAddUserMethod = UserAddServiceGrpc.getAddUserMethod) == null) {
      synchronized (UserAddServiceGrpc.class) {
        if ((getAddUserMethod = UserAddServiceGrpc.getAddUserMethod) == null) {
          UserAddServiceGrpc.getAddUserMethod = getAddUserMethod =
              io.grpc.MethodDescriptor.<com.akeshala.cw2.grpc.generated.UserAddRequest, com.akeshala.cw2.grpc.generated.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.UserAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAddServiceMethodDescriptorSupplier("addUser"))
              .build();
        }
      }
    }
    return getAddUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAddServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAddServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAddServiceStub>() {
        @java.lang.Override
        public UserAddServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAddServiceStub(channel, callOptions);
        }
      };
    return UserAddServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAddServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAddServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAddServiceBlockingStub>() {
        @java.lang.Override
        public UserAddServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAddServiceBlockingStub(channel, callOptions);
        }
      };
    return UserAddServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAddServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAddServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAddServiceFutureStub>() {
        @java.lang.Override
        public UserAddServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAddServiceFutureStub(channel, callOptions);
        }
      };
    return UserAddServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserAddServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(com.akeshala.cw2.grpc.generated.UserAddRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.akeshala.cw2.grpc.generated.UserAddRequest,
                com.akeshala.cw2.grpc.generated.StatusResponse>(
                  this, METHODID_ADD_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserAddServiceStub extends io.grpc.stub.AbstractAsyncStub<UserAddServiceStub> {
    private UserAddServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAddServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAddServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUser(com.akeshala.cw2.grpc.generated.UserAddRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserAddServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserAddServiceBlockingStub> {
    private UserAddServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAddServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAddServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.akeshala.cw2.grpc.generated.StatusResponse addUser(com.akeshala.cw2.grpc.generated.UserAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserAddServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserAddServiceFutureStub> {
    private UserAddServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAddServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAddServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akeshala.cw2.grpc.generated.StatusResponse> addUser(
        com.akeshala.cw2.grpc.generated.UserAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserAddServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserAddServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.akeshala.cw2.grpc.generated.UserAddRequest) request,
              (io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.StatusResponse>) responseObserver);
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

  private static abstract class UserAddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAddServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akeshala.cw2.grpc.generated.ReservationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAddService");
    }
  }

  private static final class UserAddServiceFileDescriptorSupplier
      extends UserAddServiceBaseDescriptorSupplier {
    UserAddServiceFileDescriptorSupplier() {}
  }

  private static final class UserAddServiceMethodDescriptorSupplier
      extends UserAddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserAddServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserAddServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAddServiceFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
