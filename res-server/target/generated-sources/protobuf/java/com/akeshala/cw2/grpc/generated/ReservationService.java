// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package com.akeshala.cw2.grpc.generated;

public final class ReservationService {
  private ReservationService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_StatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_StatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_UserAddRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_UserAddRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_ItemDTO_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_ItemDTO_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_ItemAddRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_ItemAddRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_ItemUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_ItemUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_ItemDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_ItemDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_ItemSellerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_ItemSellerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_Reservation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_Reservation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_ReservationSearchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_ReservationSearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_akeshala_cw2_grpc_generated_ReserveRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_akeshala_cw2_grpc_generated_ReserveRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ReservationService.proto\022\037com.akeshala" +
      ".cw2.grpc.generated\"Z\n\016StatusResponse\0227\n" +
      "\006status\030\001 \001(\0162\'.com.akeshala.cw2.grpc.ge" +
      "nerated.Status\022\017\n\007message\030\002 \001(\t\"\037\n\013UserR" +
      "equest\022\020\n\010userName\030\001 \001(\t\"\222\001\n\004User\022\020\n\010use" +
      "rName\030\001 \001(\t\022\021\n\tfirstName\030\002 \001(\t\022\020\n\010lastNa" +
      "me\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\017\n\007address\030\005 \001(\t" +
      "\0223\n\004role\030\006 \001(\0162%.com.akeshala.cw2.grpc.g" +
      "enerated.Role\"\265\001\n\016UserAddRequest\022\020\n\010user" +
      "Name\030\001 \001(\t\022\021\n\tfirstName\030\002 \001(\t\022\020\n\010lastNam" +
      "e\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\017\n\007address\030\005 \001(\t\022" +
      "3\n\004role\030\006 \001(\0162%.com.akeshala.cw2.grpc.ge" +
      "nerated.Role\022\027\n\017isSentByPrimary\030\007 \001(\010\"\265\001" +
      "\n\004Item\022\016\n\006itemId\030\001 \001(\t\022\020\n\010itemName\030\002 \001(\t" +
      "\0223\n\004type\030\003 \001(\0162%.com.akeshala.cw2.grpc.g" +
      "enerated.Type\022\r\n\005price\030\004 \001(\001\022\031\n\021availabl" +
      "eQuantity\030\005 \001(\005\022\030\n\020reservedQuantity\030\006 \001(" +
      "\005\022\022\n\nsellerName\030\007 \001(\t\"\236\001\n\007ItemDTO\022\016\n\006ite" +
      "mId\030\001 \001(\t\022\020\n\010itemName\030\002 \001(\t\0223\n\004type\030\003 \001(" +
      "\0162%.com.akeshala.cw2.grpc.generated.Type" +
      "\022\r\n\005price\030\004 \001(\001\022\031\n\021availableQuantity\030\005 \001" +
      "(\005\022\022\n\nsellerName\030\006 \001(\t\"\276\001\n\016ItemAddReques" +
      "t\022\016\n\006itemId\030\001 \001(\t\022\020\n\010itemName\030\002 \001(\t\0223\n\004t" +
      "ype\030\003 \001(\0162%.com.akeshala.cw2.grpc.genera" +
      "ted.Type\022\r\n\005price\030\004 \001(\001\022\031\n\021availableQuan" +
      "tity\030\005 \001(\005\022\022\n\nsellerName\030\006 \001(\t\022\027\n\017isSent" +
      "ByPrimary\030\007 \001(\010\"z\n\021ItemUpdateRequest\022\016\n\006" +
      "itemId\030\001 \001(\t\022\022\n\nsellerName\030\002 \001(\t\022\r\n\005pric" +
      "e\030\003 \001(\001\022\031\n\021availableQuantity\030\004 \001(\005\022\027\n\017is" +
      "SentByPrimary\030\005 \001(\010\"P\n\021ItemDeleteRequest" +
      "\022\016\n\006itemId\030\001 \001(\t\022\022\n\nsellerName\030\002 \001(\t\022\027\n\017" +
      "isSentByPrimary\030\003 \001(\010\"J\n\022ItemSellerRespo" +
      "nse\0224\n\005items\030\001 \003(\0132%.com.akeshala.cw2.gr" +
      "pc.generated.Item\"M\n\022ItemGetAllResponse\022" +
      "7\n\005items\030\001 \003(\0132(.com.akeshala.cw2.grpc.g" +
      "enerated.ItemDTO\"\257\001\n\013Reservation\022\025\n\rrese" +
      "rvationId\030\001 \001(\t\022\016\n\006itemId\030\002 \001(\t\022\020\n\010itemN" +
      "ame\030\003 \001(\t\022\021\n\tbuyerName\030\004 \001(\t\022\020\n\010quantity" +
      "\030\005 \001(\005\022\027\n\017reservationDate\030\006 \001(\t\022\025\n\rpayme" +
      "ntAmount\030\007 \001(\001\022\022\n\nsellerName\030\010 \001(\t\"_\n\031Re" +
      "servationSearchResponse\022B\n\014reservations\030" +
      "\001 \003(\0132,.com.akeshala.cw2.grpc.generated." +
      "Reservation\"\216\001\n\016ReserveRequest\022\025\n\rreserv" +
      "ationId\030\001 \001(\t\022\016\n\006itemId\030\002 \001(\t\022\021\n\tbuyerNa" +
      "me\030\004 \001(\t\022\020\n\010quantity\030\005 \001(\005\022\027\n\017reservatio" +
      "nDate\030\006 \001(\t\022\027\n\017isSentByPrimary\030\007 \001(\010*\"\n\006" +
      "Status\022\013\n\007SUCCESS\020\000\022\013\n\007FAILURE\020\001*=\n\004Role" +
      "\022\t\n\005ADMIN\020\000\022\023\n\017INVENTORY_CLERK\020\001\022\t\n\005BUYE" +
      "R\020\002\022\n\n\006SELLER\020\003*+\n\004Type\022\010\n\004SELL\020\000\022\010\n\004REN" +
      "T\020\001\022\017\n\013NEW_ARRIVAL\020\0022}\n\016UserAddService\022k" +
      "\n\007addUser\022/.com.akeshala.cw2.grpc.genera" +
      "ted.UserAddRequest\032/.com.akeshala.cw2.gr" +
      "pc.generated.StatusResponse2}\n\016ItemAddSe" +
      "rvice\022k\n\007addItem\022/.com.akeshala.cw2.grpc" +
      ".generated.ItemAddRequest\032/.com.akeshala" +
      ".cw2.grpc.generated.StatusResponse2\206\001\n\021I" +
      "temUpdateService\022q\n\nupdateItem\0222.com.ake" +
      "shala.cw2.grpc.generated.ItemUpdateReque" +
      "st\032/.com.akeshala.cw2.grpc.generated.Sta" +
      "tusResponse2\206\001\n\021ItemDeleteService\022q\n\ndel" +
      "eteItem\0222.com.akeshala.cw2.grpc.generate" +
      "d.ItemDeleteRequest\032/.com.akeshala.cw2.g" +
      "rpc.generated.StatusResponse2\372\001\n\021ItemSea" +
      "rchService\022s\n\016getSellerItems\022,.com.akesh" +
      "ala.cw2.grpc.generated.UserRequest\0323.com" +
      ".akeshala.cw2.grpc.generated.ItemSellerR" +
      "esponse\022p\n\013getAllItems\022,.com.akeshala.cw" +
      "2.grpc.generated.UserRequest\0323.com.akesh" +
      "ala.cw2.grpc.generated.ItemGetAllRespons" +
      "e2\201\001\n\016ReserveService\022o\n\013reserveItem\022/.co" +
      "m.akeshala.cw2.grpc.generated.ReserveReq" +
      "uest\032/.com.akeshala.cw2.grpc.generated.S" +
      "tatusResponse2\224\001\n\025ReservationGetService\022" +
      "{\n\017getReservations\022,.com.akeshala.cw2.gr" +
      "pc.generated.UserRequest\032:.com.akeshala." +
      "cw2.grpc.generated.ReservationSearchResp" +
      "onseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_akeshala_cw2_grpc_generated_StatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_akeshala_cw2_grpc_generated_StatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_StatusResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_com_akeshala_cw2_grpc_generated_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_akeshala_cw2_grpc_generated_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_UserRequest_descriptor,
        new java.lang.String[] { "UserName", });
    internal_static_com_akeshala_cw2_grpc_generated_User_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_akeshala_cw2_grpc_generated_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_User_descriptor,
        new java.lang.String[] { "UserName", "FirstName", "LastName", "Email", "Address", "Role", });
    internal_static_com_akeshala_cw2_grpc_generated_UserAddRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_akeshala_cw2_grpc_generated_UserAddRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_UserAddRequest_descriptor,
        new java.lang.String[] { "UserName", "FirstName", "LastName", "Email", "Address", "Role", "IsSentByPrimary", });
    internal_static_com_akeshala_cw2_grpc_generated_Item_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_akeshala_cw2_grpc_generated_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_Item_descriptor,
        new java.lang.String[] { "ItemId", "ItemName", "Type", "Price", "AvailableQuantity", "ReservedQuantity", "SellerName", });
    internal_static_com_akeshala_cw2_grpc_generated_ItemDTO_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_akeshala_cw2_grpc_generated_ItemDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_ItemDTO_descriptor,
        new java.lang.String[] { "ItemId", "ItemName", "Type", "Price", "AvailableQuantity", "SellerName", });
    internal_static_com_akeshala_cw2_grpc_generated_ItemAddRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_akeshala_cw2_grpc_generated_ItemAddRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_ItemAddRequest_descriptor,
        new java.lang.String[] { "ItemId", "ItemName", "Type", "Price", "AvailableQuantity", "SellerName", "IsSentByPrimary", });
    internal_static_com_akeshala_cw2_grpc_generated_ItemUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_akeshala_cw2_grpc_generated_ItemUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_ItemUpdateRequest_descriptor,
        new java.lang.String[] { "ItemId", "SellerName", "Price", "AvailableQuantity", "IsSentByPrimary", });
    internal_static_com_akeshala_cw2_grpc_generated_ItemDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_akeshala_cw2_grpc_generated_ItemDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_ItemDeleteRequest_descriptor,
        new java.lang.String[] { "ItemId", "SellerName", "IsSentByPrimary", });
    internal_static_com_akeshala_cw2_grpc_generated_ItemSellerResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_akeshala_cw2_grpc_generated_ItemSellerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_ItemSellerResponse_descriptor,
        new java.lang.String[] { "Items", });
    internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_descriptor,
        new java.lang.String[] { "Items", });
    internal_static_com_akeshala_cw2_grpc_generated_Reservation_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_akeshala_cw2_grpc_generated_Reservation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_Reservation_descriptor,
        new java.lang.String[] { "ReservationId", "ItemId", "ItemName", "BuyerName", "Quantity", "ReservationDate", "PaymentAmount", "SellerName", });
    internal_static_com_akeshala_cw2_grpc_generated_ReservationSearchResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_akeshala_cw2_grpc_generated_ReservationSearchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_ReservationSearchResponse_descriptor,
        new java.lang.String[] { "Reservations", });
    internal_static_com_akeshala_cw2_grpc_generated_ReserveRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_akeshala_cw2_grpc_generated_ReserveRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_akeshala_cw2_grpc_generated_ReserveRequest_descriptor,
        new java.lang.String[] { "ReservationId", "ItemId", "BuyerName", "Quantity", "ReservationDate", "IsSentByPrimary", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}