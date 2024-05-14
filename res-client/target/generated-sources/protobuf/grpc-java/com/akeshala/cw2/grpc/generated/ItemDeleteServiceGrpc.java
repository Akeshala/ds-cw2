package com.akeshala.cw2.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: ReservationService.proto")
public final class ItemDeleteServiceGrpc {

  private ItemDeleteServiceGrpc() {}

  public static final String SERVICE_NAME = "com.akeshala.cw2.grpc.generated.ItemDeleteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemDeleteRequest,
      com.akeshala.cw2.grpc.generated.StatusResponse> getDeleteItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteItem",
      requestType = com.akeshala.cw2.grpc.generated.ItemDeleteRequest.class,
      responseType = com.akeshala.cw2.grpc.generated.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemDeleteRequest,
      com.akeshala.cw2.grpc.generated.StatusResponse> getDeleteItemMethod() {
    io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemDeleteRequest, com.akeshala.cw2.grpc.generated.StatusResponse> getDeleteItemMethod;
    if ((getDeleteItemMethod = ItemDeleteServiceGrpc.getDeleteItemMethod) == null) {
      synchronized (ItemDeleteServiceGrpc.class) {
        if ((getDeleteItemMethod = ItemDeleteServiceGrpc.getDeleteItemMethod) == null) {
          ItemDeleteServiceGrpc.getDeleteItemMethod = getDeleteItemMethod =
              io.grpc.MethodDescriptor.<com.akeshala.cw2.grpc.generated.ItemDeleteRequest, com.akeshala.cw2.grpc.generated.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ItemDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ItemDeleteServiceMethodDescriptorSupplier("deleteItem"))
              .build();
        }
      }
    }
    return getDeleteItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemDeleteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemDeleteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemDeleteServiceStub>() {
        @java.lang.Override
        public ItemDeleteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemDeleteServiceStub(channel, callOptions);
        }
      };
    return ItemDeleteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemDeleteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemDeleteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemDeleteServiceBlockingStub>() {
        @java.lang.Override
        public ItemDeleteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemDeleteServiceBlockingStub(channel, callOptions);
        }
      };
    return ItemDeleteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemDeleteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemDeleteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemDeleteServiceFutureStub>() {
        @java.lang.Override
        public ItemDeleteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemDeleteServiceFutureStub(channel, callOptions);
        }
      };
    return ItemDeleteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ItemDeleteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deleteItem(com.akeshala.cw2.grpc.generated.ItemDeleteRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeleteItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.akeshala.cw2.grpc.generated.ItemDeleteRequest,
                com.akeshala.cw2.grpc.generated.StatusResponse>(
                  this, METHODID_DELETE_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class ItemDeleteServiceStub extends io.grpc.stub.AbstractAsyncStub<ItemDeleteServiceStub> {
    private ItemDeleteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemDeleteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemDeleteServiceStub(channel, callOptions);
    }

    /**
     */
    public void deleteItem(com.akeshala.cw2.grpc.generated.ItemDeleteRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemDeleteServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ItemDeleteServiceBlockingStub> {
    private ItemDeleteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemDeleteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemDeleteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.akeshala.cw2.grpc.generated.StatusResponse deleteItem(com.akeshala.cw2.grpc.generated.ItemDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemDeleteServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ItemDeleteServiceFutureStub> {
    private ItemDeleteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemDeleteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemDeleteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akeshala.cw2.grpc.generated.StatusResponse> deleteItem(
        com.akeshala.cw2.grpc.generated.ItemDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_ITEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemDeleteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemDeleteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_ITEM:
          serviceImpl.deleteItem((com.akeshala.cw2.grpc.generated.ItemDeleteRequest) request,
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

  private static abstract class ItemDeleteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemDeleteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akeshala.cw2.grpc.generated.ReservationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemDeleteService");
    }
  }

  private static final class ItemDeleteServiceFileDescriptorSupplier
      extends ItemDeleteServiceBaseDescriptorSupplier {
    ItemDeleteServiceFileDescriptorSupplier() {}
  }

  private static final class ItemDeleteServiceMethodDescriptorSupplier
      extends ItemDeleteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemDeleteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemDeleteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemDeleteServiceFileDescriptorSupplier())
              .addMethod(getDeleteItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
