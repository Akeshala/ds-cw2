package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ItemSearchServiceGrpc;
import com.akeshala.cw2.grpc.generated.UserRequest;
import com.akeshala.cw2.grpc.generated.ItemSellerResponse;
import com.akeshala.cw2.grpc.generated.Item;
import io.grpc.ManagedChannel;

import java.util.Scanner;

public class ItemGetService {
    private ManagedChannel channel = null;
    ItemSearchServiceGrpc.ItemSearchServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public ItemGetService(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void init(ManagedChannel channel) {
        System.out.println("Initializing item get service");
        this.channel = channel;
        clientStub = ItemSearchServiceGrpc.newBlockingStub(this.channel);
    }

    public void handleRequest(Scanner userInput) throws InterruptedException {
        System.out.println("\nEnter your username :");
        String userName = userInput.nextLine().trim();

        System.out.println("Get items by" + userName);
        UserRequest request = UserRequest.newBuilder().setUserName(userName).build();
        ItemSellerResponse response = clientStub.getSellerItems(request);

        String horizontalLine = "+----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+";
        String headerFormat = "| %-60s| %-15s| %-18s| %-12s| %-22s|%-22s|%-18s|\n";
        String itemFormat = "| %-60s| %-15s| %-18s| %-12s| %-22s|%-22s|%-18s|\n";

        System.out.printf("%n%s %n", horizontalLine);
        System.out.printf(headerFormat, "Item Id", "Item Name", "Type", "Price", "Available Quantity", "Reserved Quantity", "Seller Name");
        System.out.printf("%s %n", horizontalLine);

        for (Item item : response.getItemsList()) {
            System.out.printf(itemFormat, item.getItemId(), item.getItemName(), item.getType(), item.getPrice(), item.getAvailableQuantity(), item.getReservedQuantity(), item.getSellerName());
            System.out.printf("%s", horizontalLine);
        }
        System.out.println();

        Thread.sleep(1000);
    }

    public void close() {

        channel.shutdown();
    }
}
