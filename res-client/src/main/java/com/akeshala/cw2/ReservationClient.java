package com.akeshala.cw2;

import com.akeshala.cw2.services.*;
import com.akeshala.cw2.utils.ConsolePrinter;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class ReservationClient {
    private final ItemAddService itemAddService;
    private final ItemGetService itemGetService;
    private final ItemGetAllService itemGetAllService;
    private final ItemDeleteService itemDeleteService;
    private final ItemUpdateService itemUpdateService;
    private final ReservationService reservationService;
    private final ReservationGetService reservationGetService;
    private final UserAddService userAddService;

    public ReservationClient(
            ItemAddService itemAddService,
            ItemGetService itemGetService,
            ItemGetAllService itemGetAllService,
            ItemDeleteService itemDeleteService,
            ItemUpdateService itemUpdateService,
            ReservationService reservationService,
            ReservationGetService reservationGetService,
            UserAddService userAddService
    ) {
        this.itemAddService = itemAddService;
        this.itemGetService = itemGetService;
        this.itemGetAllService = itemGetAllService;
        this.itemDeleteService = itemDeleteService;
        this.itemUpdateService = itemUpdateService;
        this.reservationService = reservationService;
        this.reservationGetService = reservationGetService;
        this.userAddService = userAddService;
    }

    public static void main( String[] args ) {

        if (args.length != 2) {
            System.out.println("Invalid arguments!");
            System.out.println("Args - [host] [port]");
            System.exit(1);
        }

        String host = args[0].trim();
        int port = Integer.parseInt(args[1].trim());

        ConsolePrinter.displayStart();
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host,port).usePlaintext().build();
        Scanner userInput = new Scanner(System.in);

        ItemAddService itemAddService = new ItemAddService(host, port);
        ItemGetAllService itemGetAllService = new ItemGetAllService(host, port);
        ItemGetService itemGetService = new ItemGetService(host, port);
        ItemDeleteService itemDeleteService = new ItemDeleteService(host, port);
        ItemUpdateService itemUpdateService = new ItemUpdateService(host, port);
        ReservationService reservationService = new ReservationService(host, port);
        ReservationGetService reservationGetService = new ReservationGetService(host, port);
        UserAddService userAddService = new UserAddService(host, port);

        ReservationClient reservationClient = new ReservationClient(
                itemAddService,
                itemGetService,
                itemGetAllService,
                itemDeleteService,
                itemUpdateService,
                reservationService,
                reservationGetService,
                userAddService
        );

        reservationClient.init(channel);
        reservationClient.handleUserInput(userInput);
        reservationClient.close();
    }

    private void init(ManagedChannel channel) {
        itemAddService.init(channel);
        itemGetAllService.init(channel);
        itemGetService.init(channel);
        itemDeleteService.init(channel);
        itemUpdateService.init(channel);
        reservationService.init(channel);
        reservationGetService.init(channel);
        userAddService.init(channel);
    }

    private void handleUserInput(Scanner userInput) {
        while (true) {
            ConsolePrinter.displayMenu();
            String choiceStr = userInput.nextLine();
            try {
                int choice = Integer.parseInt(choiceStr);
                switch (choice) {
                    case 1:
                        itemAddService.handleRequest(userInput);
                        break;
                    case 2:
                        itemGetService.handleRequest(userInput);
                        break;
                    case 3:
                        itemGetAllService.handleRequest(userInput);
                        break;
                    case 4:
                        itemDeleteService.handleRequest(userInput);
                        break;
                    case 5:
                        itemUpdateService.handleRequest(userInput);
                        break;
                    case 6:
                        reservationService.handleRequest(userInput);
                        break;
                    case 7:
                        reservationGetService.handleRequest(userInput);
                        break;
                    case 8:
                        userAddService.handleRequest(userInput);
                        break;
                    case 9:
                        ConsolePrinter.displayStop();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option selected! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error : " + e);
                System.out.println();
                System.out.println("Try again.");
            }
        }
    }

    private void close() {
        itemAddService.close();
        itemGetAllService.close();
        itemGetService.close();
        itemDeleteService.close();
        itemUpdateService.close();
        reservationService.close();
        reservationGetService.close();
        userAddService.close();
    }
}
