package com.akeshala.cw2.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Item Services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: ReservationService.proto")
public final class ItemAddServiceGrpc {

  private ItemAddServiceGrpc() {}

  public static final String SERVICE_NAME = "com.akeshala.cw2.grpc.generated.ItemAddService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemAddRequest,
      com.akeshala.cw2.grpc.generated.StatusResponse> getAddItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addItem",
      requestType = com.akeshala.cw2.grpc.generated.ItemAddRequest.class,
      responseType = com.akeshala.cw2.grpc.generated.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemAddRequest,
      com.akeshala.cw2.grpc.generated.StatusResponse> getAddItemMethod() {
    io.grpc.MethodDescriptor<com.akeshala.cw2.grpc.generated.ItemAddRequest, com.akeshala.cw2.grpc.generated.StatusResponse> getAddItemMethod;
    if ((getAddItemMethod = ItemAddServiceGrpc.getAddItemMethod) == null) {
      synchronized (ItemAddServiceGrpc.class) {
        if ((getAddItemMethod = ItemAddServiceGrpc.getAddItemMethod) == null) {
          ItemAddServiceGrpc.getAddItemMethod = getAddItemMethod =
              io.grpc.MethodDescriptor.<com.akeshala.cw2.grpc.generated.ItemAddRequest, com.akeshala.cw2.grpc.generated.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.ItemAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akeshala.cw2.grpc.generated.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ItemAddServiceMethodDescriptorSupplier("addItem"))
              .build();
        }
      }
    }
    return getAddItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemAddServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemAddServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemAddServiceStub>() {
        @java.lang.Override
        public ItemAddServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemAddServiceStub(channel, callOptions);
        }
      };
    return ItemAddServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemAddServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemAddServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemAddServiceBlockingStub>() {
        @java.lang.Override
        public ItemAddServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemAddServiceBlockingStub(channel, callOptions);
        }
      };
    return ItemAddServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemAddServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemAddServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemAddServiceFutureStub>() {
        @java.lang.Override
        public ItemAddServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemAddServiceFutureStub(channel, callOptions);
        }
      };
    return ItemAddServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Item Services
   * </pre>
   */
  public static abstract class ItemAddServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addItem(com.akeshala.cw2.grpc.generated.ItemAddRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.akeshala.cw2.grpc.generated.ItemAddRequest,
                com.akeshala.cw2.grpc.generated.StatusResponse>(
                  this, METHODID_ADD_ITEM)))
          .build();
    }
  }

  /**
   * <pre>
   * Item Services
   * </pre>
   */
  public static final class ItemAddServiceStub extends io.grpc.stub.AbstractAsyncStub<ItemAddServiceStub> {
    private ItemAddServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemAddServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemAddServiceStub(channel, callOptions);
    }

    /**
     */
    public void addItem(com.akeshala.cw2.grpc.generated.ItemAddRequest request,
        io.grpc.stub.StreamObserver<com.akeshala.cw2.grpc.generated.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Item Services
   * </pre>
   */
  public static final class ItemAddServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ItemAddServiceBlockingStub> {
    private ItemAddServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemAddServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemAddServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.akeshala.cw2.grpc.generated.StatusResponse addItem(com.akeshala.cw2.grpc.generated.ItemAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddItemMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Item Services
   * </pre>
   */
  public static final class ItemAddServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ItemAddServiceFutureStub> {
    private ItemAddServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemAddServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemAddServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akeshala.cw2.grpc.generated.StatusResponse> addItem(
        com.akeshala.cw2.grpc.generated.ItemAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ITEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemAddServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemAddServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ITEM:
          serviceImpl.addItem((com.akeshala.cw2.grpc.generated.ItemAddRequest) request,
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

  private static abstract class ItemAddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemAddServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akeshala.cw2.grpc.generated.ReservationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemAddService");
    }
  }

  private static final class ItemAddServiceFileDescriptorSupplier
      extends ItemAddServiceBaseDescriptorSupplier {
    ItemAddServiceFileDescriptorSupplier() {}
  }

  private static final class ItemAddServiceMethodDescriptorSupplier
      extends ItemAddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemAddServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemAddServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemAddServiceFileDescriptorSupplier())
              .addMethod(getAddItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
