package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ItemSearchServiceGrpc;
import com.akeshala.cw2.grpc.generated.UserRequest;
import com.akeshala.cw2.grpc.generated.ItemGetAllResponse;
import com.akeshala.cw2.grpc.generated.ItemDTO;
import io.grpc.ManagedChannel;

import java.util.Scanner;

public class ItemGetAllService {

    String host = null;
    int port = -1;
    private ManagedChannel channel = null;
    ItemSearchServiceGrpc.ItemSearchServiceBlockingStub clientStub = null;

    public ItemGetAllService(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void init (ManagedChannel channel) {
        System.out.println("Initializing item get all service");
        this.channel = channel;
        clientStub = ItemSearchServiceGrpc.newBlockingStub(this.channel);
    }

    public void handleRequest(Scanner userInput) throws InterruptedException {
        System.out.println("\nInput username -");
        String userName = userInput.nextLine().trim();

        System.out.println("Get items by " + userName);
        UserRequest request = UserRequest.newBuilder().setUserName(userName).build();
        ItemGetAllResponse response = clientStub.getAllItems(request);

        // Table header
        String headerFormat = "| %-60s| %-15s| %-18s| %-12s| %-22s|%-18s|%n";
        String headerBorder = "+-----------------------------------------------------------------------------------------------------------------------------------------------------------+";

        System.out.printf("%n%s %n", headerBorder);
        System.out.printf(headerFormat, "Item Id", "Item Name", "Type", "Price", "Available Quantity", "Seller Name");
        System.out.printf("%s %n", headerBorder);

        // Print items
        for (ItemDTO item : response.getItemsList()) {
            System.out.printf(headerFormat, item.getItemId(), item.getItemName(), item.getType(), item.getPrice(), item.getAvailableQuantity(), item.getSellerName());
            System.out.printf("%s %n", headerBorder);
        }
        System.out.println();

        Thread.sleep(1000);
    }

    public void close() {

        channel.shutdown();
    }
}
