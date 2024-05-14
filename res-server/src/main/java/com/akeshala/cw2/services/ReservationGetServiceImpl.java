package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ReservationGetServiceGrpc;
import com.akeshala.cw2.grpc.generated.ReservationSearchResponse;
import com.akeshala.cw2.grpc.generated.UserRequest;
import com.akeshala.cw2.utils.DataProviderImpl;
import io.grpc.stub.StreamObserver;

public class ReservationGetServiceImpl extends ReservationGetServiceGrpc.ReservationGetServiceImplBase {

    private final DataProviderImpl dataProvider;
    public ReservationGetServiceImpl(DataProviderImpl dataProvider) {

        this.dataProvider = dataProvider;
    }

    @Override
    public void getReservations(UserRequest request, StreamObserver<ReservationSearchResponse> responseObserver) {
        String buyerId = request.getUserName();
        ReservationSearchResponse response = ReservationSearchResponse
                .newBuilder()
                .addAllReservations(dataProvider.getReservationsByUserName(buyerId))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
