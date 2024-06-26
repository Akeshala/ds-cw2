// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package com.akeshala.cw2.grpc.generated;

/**
 * Protobuf type {@code com.akeshala.cw2.grpc.generated.ItemGetAllResponse}
 */
public final class ItemGetAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.akeshala.cw2.grpc.generated.ItemGetAllResponse)
    ItemGetAllResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ItemGetAllResponse.newBuilder() to construct.
  private ItemGetAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ItemGetAllResponse() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ItemGetAllResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ItemGetAllResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              items_ = new java.util.ArrayList<com.akeshala.cw2.grpc.generated.ItemDTO>();
              mutable_bitField0_ |= 0x00000001;
            }
            items_.add(
                input.readMessage(com.akeshala.cw2.grpc.generated.ItemDTO.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akeshala.cw2.grpc.generated.ReservationService.internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akeshala.cw2.grpc.generated.ReservationService.internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akeshala.cw2.grpc.generated.ItemGetAllResponse.class, com.akeshala.cw2.grpc.generated.ItemGetAllResponse.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  private java.util.List<com.akeshala.cw2.grpc.generated.ItemDTO> items_;
  /**
   * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.akeshala.cw2.grpc.generated.ItemDTO> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.akeshala.cw2.grpc.generated.ItemDTOOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
   */
  @java.lang.Override
  public com.akeshala.cw2.grpc.generated.ItemDTO getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
   */
  @java.lang.Override
  public com.akeshala.cw2.grpc.generated.ItemDTOOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(1, items_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, items_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.akeshala.cw2.grpc.generated.ItemGetAllResponse)) {
      return super.equals(obj);
    }
    com.akeshala.cw2.grpc.generated.ItemGetAllResponse other = (com.akeshala.cw2.grpc.generated.ItemGetAllResponse) obj;

    if (!getItemsList()
        .equals(other.getItemsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.akeshala.cw2.grpc.generated.ItemGetAllResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.akeshala.cw2.grpc.generated.ItemGetAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.akeshala.cw2.grpc.generated.ItemGetAllResponse)
      com.akeshala.cw2.grpc.generated.ItemGetAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akeshala.cw2.grpc.generated.ReservationService.internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akeshala.cw2.grpc.generated.ReservationService.internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akeshala.cw2.grpc.generated.ItemGetAllResponse.class, com.akeshala.cw2.grpc.generated.ItemGetAllResponse.Builder.class);
    }

    // Construct using com.akeshala.cw2.grpc.generated.ItemGetAllResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akeshala.cw2.grpc.generated.ReservationService.internal_static_com_akeshala_cw2_grpc_generated_ItemGetAllResponse_descriptor;
    }

    @java.lang.Override
    public com.akeshala.cw2.grpc.generated.ItemGetAllResponse getDefaultInstanceForType() {
      return com.akeshala.cw2.grpc.generated.ItemGetAllResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.akeshala.cw2.grpc.generated.ItemGetAllResponse build() {
      com.akeshala.cw2.grpc.generated.ItemGetAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akeshala.cw2.grpc.generated.ItemGetAllResponse buildPartial() {
      com.akeshala.cw2.grpc.generated.ItemGetAllResponse result = new com.akeshala.cw2.grpc.generated.ItemGetAllResponse(this);
      int from_bitField0_ = bitField0_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akeshala.cw2.grpc.generated.ItemGetAllResponse) {
        return mergeFrom((com.akeshala.cw2.grpc.generated.ItemGetAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akeshala.cw2.grpc.generated.ItemGetAllResponse other) {
      if (other == com.akeshala.cw2.grpc.generated.ItemGetAllResponse.getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.akeshala.cw2.grpc.generated.ItemGetAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.akeshala.cw2.grpc.generated.ItemGetAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.akeshala.cw2.grpc.generated.ItemDTO> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<com.akeshala.cw2.grpc.generated.ItemDTO>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akeshala.cw2.grpc.generated.ItemDTO, com.akeshala.cw2.grpc.generated.ItemDTO.Builder, com.akeshala.cw2.grpc.generated.ItemDTOOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public java.util.List<com.akeshala.cw2.grpc.generated.ItemDTO> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public com.akeshala.cw2.grpc.generated.ItemDTO getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder setItems(
        int index, com.akeshala.cw2.grpc.generated.ItemDTO value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder setItems(
        int index, com.akeshala.cw2.grpc.generated.ItemDTO.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder addItems(com.akeshala.cw2.grpc.generated.ItemDTO value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder addItems(
        int index, com.akeshala.cw2.grpc.generated.ItemDTO value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder addItems(
        com.akeshala.cw2.grpc.generated.ItemDTO.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder addItems(
        int index, com.akeshala.cw2.grpc.generated.ItemDTO.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.akeshala.cw2.grpc.generated.ItemDTO> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public com.akeshala.cw2.grpc.generated.ItemDTO.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public com.akeshala.cw2.grpc.generated.ItemDTOOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public java.util.List<? extends com.akeshala.cw2.grpc.generated.ItemDTOOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public com.akeshala.cw2.grpc.generated.ItemDTO.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.akeshala.cw2.grpc.generated.ItemDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public com.akeshala.cw2.grpc.generated.ItemDTO.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.akeshala.cw2.grpc.generated.ItemDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .com.akeshala.cw2.grpc.generated.ItemDTO items = 1;</code>
     */
    public java.util.List<com.akeshala.cw2.grpc.generated.ItemDTO.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akeshala.cw2.grpc.generated.ItemDTO, com.akeshala.cw2.grpc.generated.ItemDTO.Builder, com.akeshala.cw2.grpc.generated.ItemDTOOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.akeshala.cw2.grpc.generated.ItemDTO, com.akeshala.cw2.grpc.generated.ItemDTO.Builder, com.akeshala.cw2.grpc.generated.ItemDTOOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.akeshala.cw2.grpc.generated.ItemGetAllResponse)
  }

  // @@protoc_insertion_point(class_scope:com.akeshala.cw2.grpc.generated.ItemGetAllResponse)
  private static final com.akeshala.cw2.grpc.generated.ItemGetAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akeshala.cw2.grpc.generated.ItemGetAllResponse();
  }

  public static com.akeshala.cw2.grpc.generated.ItemGetAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ItemGetAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<ItemGetAllResponse>() {
    @java.lang.Override
    public ItemGetAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ItemGetAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ItemGetAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ItemGetAllResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akeshala.cw2.grpc.generated.ItemGetAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

