// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package com.akeshala.cw2.grpc.generated;

public interface ItemUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.akeshala.cw2.grpc.generated.ItemUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string itemId = 1;</code>
   * @return The itemId.
   */
  java.lang.String getItemId();
  /**
   * <code>string itemId = 1;</code>
   * @return The bytes for itemId.
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <code>string sellerName = 2;</code>
   * @return The sellerName.
   */
  java.lang.String getSellerName();
  /**
   * <code>string sellerName = 2;</code>
   * @return The bytes for sellerName.
   */
  com.google.protobuf.ByteString
      getSellerNameBytes();

  /**
   * <code>double price = 3;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>int32 availableQuantity = 4;</code>
   * @return The availableQuantity.
   */
  int getAvailableQuantity();

  /**
   * <code>bool isSentByPrimary = 5;</code>
   * @return The isSentByPrimary.
   */
  boolean getIsSentByPrimary();
}
