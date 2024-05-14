package com.akeshala.cw2.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: ReservationService.proto")
public final class ItemUpdateServiceGrpc {

  private ItemUpdateServiceGrpc() {}

  public static final String SERVICE_NAME = "com.akeshala.cw2.grpc.generated.ItemUpdateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemUpdateRequest,
      com.akeshala.cw2.grpc.generated.ItemUpdateResponse> getUpdateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateItem",
      requestType = com.akeshala.cw2.grpc.generated.ItemUpdateRequest.class,
      responseType = com.akeshala.cw2.grpc.generated.ItemUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemUpdateRequest,
      com.akeshala.cw2.grpc.generated.ItemUpdateResponse> getUpdateItemMethod() {
    io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemUpdateRequest, com.akeshala.cw2.grpc.generated.ItemUpdateResponse> getUpdateItemMethod;
    if ((getUpdateItemMethod = ItemUpdateServiceGrpc.getUpdateItemMethod) == null) {
      synchronized (ItemUpdateServiceGrpc.class) {
        if ((getUpdateItemMethod = ItemUpdateServiceGrpc.getUpdateItemMethod) == null) {
          ItemUpdateServiceGrpc.getUpdateItemMethod = getUpdateItemMethod =
              io.grpc.MethodDescriptor.<com.akeshala.cw2.grpc.generated.ItemUpdateRequest, com.akeshala.cw2.grpc.generated.ItemUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ItemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ItemUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ItemUpdateServiceMethodDescriptorSupplier("updateItem"))
              .build();
        }
      }
    }
    return getUpdateItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemUpdateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemUpdateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemUpdateServiceStub>() {
        @java.lang.Override
        public ItemUpdateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemUpdateServiceStub(channel, callOptions);
        }
      };
    return ItemUpdateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemUpdateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemUpdateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemUpdateServiceBlockingStub>() {
        @java.lang.Override
        public ItemUpdateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemUpdateServiceBlockingStub(channel, callOptions);
        }
      };
    return ItemUpdateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemUpdateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemUpdateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemUpdateServiceFutureStub>() {
        @java.lang.Override
        public ItemUpdateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemUpdateServiceFutureStub(channel, callOptions);
        }
      };
    return ItemUpdateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ItemUpdateServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateItem(com.akeshala.cw2.grpc.generated.ItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.akeshala.cw2.grpc.generated.ItemUpdateRequest,
                com.akeshala.cw2.grpc.generated.ItemUpdateResponse>(
                  this, METHODID_UPDATE_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class ItemUpdateServiceStub extends io.grpc.stub.AbstractAsyncStub<ItemUpdateServiceStub> {
    private ItemUpdateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemUpdateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemUpdateServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateItem(com.akeshala.cw2.grpc.generated.ItemUpdateRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemUpdateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ItemUpdateServiceBlockingStub> {
    private ItemUpdateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemUpdateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemUpdateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.akeshala.cw2.grpc.generated.ItemUpdateResponse updateItem(com.akeshala.cw2.grpc.generated.ItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemUpdateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ItemUpdateServiceFutureStub> {
    private ItemUpdateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemUpdateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemUpdateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akeshala.cw2.grpc.generated.ItemUpdateResponse> updateItem(
        com.akeshala.cw2.grpc.generated.ItemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_ITEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemUpdateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemUpdateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_ITEM:
          serviceImpl.updateItem((com.akeshala.cw2.grpc.generated.ItemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemUpdateResponse>) responseObserver);
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

  private static abstract class ItemUpdateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemUpdateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akeshala.cw2.grpc.generated.ReservationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemUpdateService");
    }
  }

  private static final class ItemUpdateServiceFileDescriptorSupplier
      extends ItemUpdateServiceBaseDescriptorSupplier {
    ItemUpdateServiceFileDescriptorSupplier() {}
  }

  private static final class ItemUpdateServiceMethodDescriptorSupplier
      extends ItemUpdateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemUpdateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemUpdateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemUpdateServiceFileDescriptorSupplier())
              .addMethod(getUpdateItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
