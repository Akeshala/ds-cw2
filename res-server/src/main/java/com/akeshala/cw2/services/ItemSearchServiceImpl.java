package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ItemGetAllResponse;
import com.akeshala.cw2.grpc.generated.ItemSearchServiceGrpc;
import com.akeshala.cw2.grpc.generated.ItemSellerResponse;
import com.akeshala.cw2.grpc.generated.UserRequest;
import com.akeshala.cw2.utils.DataProviderImpl;
import io.grpc.stub.StreamObserver;

public class ItemSearchServiceImpl extends ItemSearchServiceGrpc.ItemSearchServiceImplBase {

    private final DataProviderImpl dataProvider;

    public ItemSearchServiceImpl(DataProviderImpl dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Override
    public void getSellerItems(UserRequest request, StreamObserver<ItemSellerResponse> responseObserver) {
        String sellerId = request.getUserName();

        ItemSellerResponse responseBuilder = ItemSellerResponse
                .newBuilder()
                .addAllItems(dataProvider.getItemsBySellerName(sellerId))
                .build();
        responseObserver.onNext(responseBuilder);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllItems(UserRequest request, StreamObserver<ItemGetAllResponse> responseObserver) {
        String sellerId = request.getUserName();
        ItemGetAllResponse responseBuilder = ItemGetAllResponse
                .newBuilder()
                .addAllItems(dataProvider.getAllItems(sellerId))
                .build();
        responseObserver.onNext(responseBuilder);
        responseObserver.onCompleted();
    }
}
