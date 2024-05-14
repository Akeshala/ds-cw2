package com.akeshala.cw2.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: ReservationService.proto")
public final class ItemSearchServiceGrpc {

  private ItemSearchServiceGrpc() {}

  public static final String SERVICE_NAME = "com.akeshala.cw2.grpc.generated.ItemSearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest,
      com.akeshala.cw2.grpc.generated.ItemSellerResponse> getGetSellerItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSellerItems",
      requestType = com.akeshala.cw2.grpc.generated.UserRequest.class,
      responseType = com.akeshala.cw2.grpc.generated.ItemSellerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest,
      com.akeshala.cw2.grpc.generated.ItemSellerResponse> getGetSellerItemsMethod() {
    io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest, com.akeshala.cw2.grpc.generated.ItemSellerResponse> getGetSellerItemsMethod;
    if ((getGetSellerItemsMethod = ItemSearchServiceGrpc.getGetSellerItemsMethod) == null) {
      synchronized (ItemSearchServiceGrpc.class) {
        if ((getGetSellerItemsMethod = ItemSearchServiceGrpc.getGetSellerItemsMethod) == null) {
          ItemSearchServiceGrpc.getGetSellerItemsMethod = getGetSellerItemsMethod =
              io.grpc.MethodDescriptor.<com.akeshala.cw2.grpc.generated.UserRequest, com.akeshala.cw2.grpc.generated.ItemSellerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSellerItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ItemSellerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ItemSearchServiceMethodDescriptorSupplier("getSellerItems"))
              .build();
        }
      }
    }
    return getGetSellerItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest,
      com.akeshala.cw2.grpc.generated.ItemGetAllResponse> getGetAllItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllItems",
      requestType = com.akeshala.cw2.grpc.generated.UserRequest.class,
      responseType = com.akeshala.cw2.grpc.generated.ItemGetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest,
      com.akeshala.cw2.grpc.generated.ItemGetAllResponse> getGetAllItemsMethod() {
    io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.UserRequest, com.akeshala.cw2.grpc.generated.ItemGetAllResponse> getGetAllItemsMethod;
    if ((getGetAllItemsMethod = ItemSearchServiceGrpc.getGetAllItemsMethod) == null) {
      synchronized (ItemSearchServiceGrpc.class) {
        if ((getGetAllItemsMethod = ItemSearchServiceGrpc.getGetAllItemsMethod) == null) {
          ItemSearchServiceGrpc.getGetAllItemsMethod = getGetAllItemsMethod =
              io.grpc.MethodDescriptor.<com.akeshala.cw2.grpc.generated.UserRequest, com.akeshala.cw2.grpc.generated.ItemGetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ItemGetAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ItemSearchServiceMethodDescriptorSupplier("getAllItems"))
              .build();
        }
      }
    }
    return getGetAllItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemSearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemSearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemSearchServiceStub>() {
        @java.lang.Override
        public ItemSearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemSearchServiceStub(channel, callOptions);
        }
      };
    return ItemSearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemSearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemSearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemSearchServiceBlockingStub>() {
        @java.lang.Override
        public ItemSearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemSearchServiceBlockingStub(channel, callOptions);
        }
      };
    return ItemSearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemSearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemSearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemSearchServiceFutureStub>() {
        @java.lang.Override
        public ItemSearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemSearchServiceFutureStub(channel, callOptions);
        }
      };
    return ItemSearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ItemSearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSellerItems(com.akeshala.cw2.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemSellerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSellerItemsMethod(), responseObserver);
    }

    /**
     */
    public void getAllItems(com.akeshala.cw2.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemGetAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSellerItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.akeshala.cw2.grpc.generated.UserRequest,
                com.akeshala.cw2.grpc.generated.ItemSellerResponse>(
                  this, METHODID_GET_SELLER_ITEMS)))
          .addMethod(
            getGetAllItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.akeshala.cw2.grpc.generated.UserRequest,
                com.akeshala.cw2.grpc.generated.ItemGetAllResponse>(
                  this, METHODID_GET_ALL_ITEMS)))
          .build();
    }
  }

  /**
   */
  public static final class ItemSearchServiceStub extends io.grpc.stub.AbstractAsyncStub<ItemSearchServiceStub> {
    private ItemSearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemSearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemSearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSellerItems(com.akeshala.cw2.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemSellerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSellerItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllItems(com.akeshala.cw2.grpc.generated.UserRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemGetAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemSearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ItemSearchServiceBlockingStub> {
    private ItemSearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemSearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemSearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.akeshala.cw2.grpc.generated.ItemSellerResponse getSellerItems(com.akeshala.cw2.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSellerItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.akeshala.cw2.grpc.generated.ItemGetAllResponse getAllItems(com.akeshala.cw2.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemSearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ItemSearchServiceFutureStub> {
    private ItemSearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemSearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemSearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akeshala.cw2.grpc.generated.ItemSellerResponse> getSellerItems(
        com.akeshala.cw2.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSellerItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akeshala.cw2.grpc.generated.ItemGetAllResponse> getAllItems(
        com.akeshala.cw2.grpc.generated.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SELLER_ITEMS = 0;
  private static final int METHODID_GET_ALL_ITEMS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemSearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemSearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SELLER_ITEMS:
          serviceImpl.getSellerItems((com.akeshala.cw2.grpc.generated.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemSellerResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ITEMS:
          serviceImpl.getAllItems((com.akeshala.cw2.grpc.generated.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.ItemGetAllResponse>) responseObserver);
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

  private static abstract class ItemSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemSearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akeshala.cw2.grpc.generated.ReservationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemSearchService");
    }
  }

  private static final class ItemSearchServiceFileDescriptorSupplier
      extends ItemSearchServiceBaseDescriptorSupplier {
    ItemSearchServiceFileDescriptorSupplier() {}
  }

  private static final class ItemSearchServiceMethodDescriptorSupplier
      extends ItemSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemSearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemSearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemSearchServiceFileDescriptorSupplier())
              .addMethod(getGetSellerItemsMethod())
              .addMethod(getGetAllItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
