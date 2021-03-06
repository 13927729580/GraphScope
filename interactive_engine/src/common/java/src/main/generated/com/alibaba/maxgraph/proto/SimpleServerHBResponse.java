// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hb.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code SimpleServerHBResponse}
 */
public  final class SimpleServerHBResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SimpleServerHBResponse)
    SimpleServerHBResponseOrBuilder {
  // Use SimpleServerHBResponse.newBuilder() to construct.
  private SimpleServerHBResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleServerHBResponse() {
    isLegal_ = false;
    snapshotId_ = 0L;
    servingServerId_ = java.util.Collections.emptyList();
    aliveId_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SimpleServerHBResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.alibaba.maxgraph.proto.Response.Builder subBuilder = null;
            if (resp_ != null) {
              subBuilder = resp_.toBuilder();
            }
            resp_ = input.readMessage(com.alibaba.maxgraph.proto.Response.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resp_);
              resp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.alibaba.maxgraph.proto.WorkerInfoProtos.Builder subBuilder = null;
            if (workerInfoProtos_ != null) {
              subBuilder = workerInfoProtos_.toBuilder();
            }
            workerInfoProtos_ = input.readMessage(com.alibaba.maxgraph.proto.WorkerInfoProtos.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(workerInfoProtos_);
              workerInfoProtos_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            isLegal_ = input.readBool();
            break;
          }
          case 32: {

            snapshotId_ = input.readInt64();
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              servingServerId_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000010;
            }
            servingServerId_.add(input.readInt32());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010) && input.getBytesUntilLimit() > 0) {
              servingServerId_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000010;
            }
            while (input.getBytesUntilLimit() > 0) {
              servingServerId_.add(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 48: {

            aliveId_ = input.readUInt64();
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        servingServerId_ = java.util.Collections.unmodifiableList(servingServerId_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.Hb.internal_static_SimpleServerHBResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.Hb.internal_static_SimpleServerHBResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.SimpleServerHBResponse.class, com.alibaba.maxgraph.proto.SimpleServerHBResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESP_FIELD_NUMBER = 1;
  private com.alibaba.maxgraph.proto.Response resp_;
  /**
   * <code>optional .Response resp = 1;</code>
   */
  public boolean hasResp() {
    return resp_ != null;
  }
  /**
   * <code>optional .Response resp = 1;</code>
   */
  public com.alibaba.maxgraph.proto.Response getResp() {
    return resp_ == null ? com.alibaba.maxgraph.proto.Response.getDefaultInstance() : resp_;
  }
  /**
   * <code>optional .Response resp = 1;</code>
   */
  public com.alibaba.maxgraph.proto.ResponseOrBuilder getRespOrBuilder() {
    return getResp();
  }

  public static final int WORKERINFOPROTOS_FIELD_NUMBER = 2;
  private com.alibaba.maxgraph.proto.WorkerInfoProtos workerInfoProtos_;
  /**
   * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
   */
  public boolean hasWorkerInfoProtos() {
    return workerInfoProtos_ != null;
  }
  /**
   * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
   */
  public com.alibaba.maxgraph.proto.WorkerInfoProtos getWorkerInfoProtos() {
    return workerInfoProtos_ == null ? com.alibaba.maxgraph.proto.WorkerInfoProtos.getDefaultInstance() : workerInfoProtos_;
  }
  /**
   * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
   */
  public com.alibaba.maxgraph.proto.WorkerInfoProtosOrBuilder getWorkerInfoProtosOrBuilder() {
    return getWorkerInfoProtos();
  }

  public static final int ISLEGAL_FIELD_NUMBER = 3;
  private boolean isLegal_;
  /**
   * <code>optional bool isLegal = 3;</code>
   */
  public boolean getIsLegal() {
    return isLegal_;
  }

  public static final int SNAPSHOTID_FIELD_NUMBER = 4;
  private long snapshotId_;
  /**
   * <code>optional int64 snapshotId = 4;</code>
   */
  public long getSnapshotId() {
    return snapshotId_;
  }

  public static final int SERVINGSERVERID_FIELD_NUMBER = 5;
  private java.util.List<java.lang.Integer> servingServerId_;
  /**
   * <code>repeated int32 servingServerId = 5;</code>
   */
  public java.util.List<java.lang.Integer>
      getServingServerIdList() {
    return servingServerId_;
  }
  /**
   * <code>repeated int32 servingServerId = 5;</code>
   */
  public int getServingServerIdCount() {
    return servingServerId_.size();
  }
  /**
   * <code>repeated int32 servingServerId = 5;</code>
   */
  public int getServingServerId(int index) {
    return servingServerId_.get(index);
  }
  private int servingServerIdMemoizedSerializedSize = -1;

  public static final int ALIVEID_FIELD_NUMBER = 6;
  private long aliveId_;
  /**
   * <code>optional uint64 aliveId = 6;</code>
   */
  public long getAliveId() {
    return aliveId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (resp_ != null) {
      output.writeMessage(1, getResp());
    }
    if (workerInfoProtos_ != null) {
      output.writeMessage(2, getWorkerInfoProtos());
    }
    if (isLegal_ != false) {
      output.writeBool(3, isLegal_);
    }
    if (snapshotId_ != 0L) {
      output.writeInt64(4, snapshotId_);
    }
    if (getServingServerIdList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(servingServerIdMemoizedSerializedSize);
    }
    for (int i = 0; i < servingServerId_.size(); i++) {
      output.writeInt32NoTag(servingServerId_.get(i));
    }
    if (aliveId_ != 0L) {
      output.writeUInt64(6, aliveId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResp());
    }
    if (workerInfoProtos_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWorkerInfoProtos());
    }
    if (isLegal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isLegal_);
    }
    if (snapshotId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, snapshotId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < servingServerId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(servingServerId_.get(i));
      }
      size += dataSize;
      if (!getServingServerIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      servingServerIdMemoizedSerializedSize = dataSize;
    }
    if (aliveId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, aliveId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.maxgraph.proto.SimpleServerHBResponse)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.SimpleServerHBResponse other = (com.alibaba.maxgraph.proto.SimpleServerHBResponse) obj;

    boolean result = true;
    result = result && (hasResp() == other.hasResp());
    if (hasResp()) {
      result = result && getResp()
          .equals(other.getResp());
    }
    result = result && (hasWorkerInfoProtos() == other.hasWorkerInfoProtos());
    if (hasWorkerInfoProtos()) {
      result = result && getWorkerInfoProtos()
          .equals(other.getWorkerInfoProtos());
    }
    result = result && (getIsLegal()
        == other.getIsLegal());
    result = result && (getSnapshotId()
        == other.getSnapshotId());
    result = result && getServingServerIdList()
        .equals(other.getServingServerIdList());
    result = result && (getAliveId()
        == other.getAliveId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasResp()) {
      hash = (37 * hash) + RESP_FIELD_NUMBER;
      hash = (53 * hash) + getResp().hashCode();
    }
    if (hasWorkerInfoProtos()) {
      hash = (37 * hash) + WORKERINFOPROTOS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerInfoProtos().hashCode();
    }
    hash = (37 * hash) + ISLEGAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsLegal());
    hash = (37 * hash) + SNAPSHOTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSnapshotId());
    if (getServingServerIdCount() > 0) {
      hash = (37 * hash) + SERVINGSERVERID_FIELD_NUMBER;
      hash = (53 * hash) + getServingServerIdList().hashCode();
    }
    hash = (37 * hash) + ALIVEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAliveId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.maxgraph.proto.SimpleServerHBResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code SimpleServerHBResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SimpleServerHBResponse)
      com.alibaba.maxgraph.proto.SimpleServerHBResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.Hb.internal_static_SimpleServerHBResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.Hb.internal_static_SimpleServerHBResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.SimpleServerHBResponse.class, com.alibaba.maxgraph.proto.SimpleServerHBResponse.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.SimpleServerHBResponse.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (respBuilder_ == null) {
        resp_ = null;
      } else {
        resp_ = null;
        respBuilder_ = null;
      }
      if (workerInfoProtosBuilder_ == null) {
        workerInfoProtos_ = null;
      } else {
        workerInfoProtos_ = null;
        workerInfoProtosBuilder_ = null;
      }
      isLegal_ = false;

      snapshotId_ = 0L;

      servingServerId_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000010);
      aliveId_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.Hb.internal_static_SimpleServerHBResponse_descriptor;
    }

    public com.alibaba.maxgraph.proto.SimpleServerHBResponse getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.SimpleServerHBResponse.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.SimpleServerHBResponse build() {
      com.alibaba.maxgraph.proto.SimpleServerHBResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.SimpleServerHBResponse buildPartial() {
      com.alibaba.maxgraph.proto.SimpleServerHBResponse result = new com.alibaba.maxgraph.proto.SimpleServerHBResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (respBuilder_ == null) {
        result.resp_ = resp_;
      } else {
        result.resp_ = respBuilder_.build();
      }
      if (workerInfoProtosBuilder_ == null) {
        result.workerInfoProtos_ = workerInfoProtos_;
      } else {
        result.workerInfoProtos_ = workerInfoProtosBuilder_.build();
      }
      result.isLegal_ = isLegal_;
      result.snapshotId_ = snapshotId_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        servingServerId_ = java.util.Collections.unmodifiableList(servingServerId_);
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.servingServerId_ = servingServerId_;
      result.aliveId_ = aliveId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.maxgraph.proto.SimpleServerHBResponse) {
        return mergeFrom((com.alibaba.maxgraph.proto.SimpleServerHBResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.SimpleServerHBResponse other) {
      if (other == com.alibaba.maxgraph.proto.SimpleServerHBResponse.getDefaultInstance()) return this;
      if (other.hasResp()) {
        mergeResp(other.getResp());
      }
      if (other.hasWorkerInfoProtos()) {
        mergeWorkerInfoProtos(other.getWorkerInfoProtos());
      }
      if (other.getIsLegal() != false) {
        setIsLegal(other.getIsLegal());
      }
      if (other.getSnapshotId() != 0L) {
        setSnapshotId(other.getSnapshotId());
      }
      if (!other.servingServerId_.isEmpty()) {
        if (servingServerId_.isEmpty()) {
          servingServerId_ = other.servingServerId_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureServingServerIdIsMutable();
          servingServerId_.addAll(other.servingServerId_);
        }
        onChanged();
      }
      if (other.getAliveId() != 0L) {
        setAliveId(other.getAliveId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.maxgraph.proto.SimpleServerHBResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.SimpleServerHBResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.alibaba.maxgraph.proto.Response resp_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.Response, com.alibaba.maxgraph.proto.Response.Builder, com.alibaba.maxgraph.proto.ResponseOrBuilder> respBuilder_;
    /**
     * <code>optional .Response resp = 1;</code>
     */
    public boolean hasResp() {
      return respBuilder_ != null || resp_ != null;
    }
    /**
     * <code>optional .Response resp = 1;</code>
     */
    public com.alibaba.maxgraph.proto.Response getResp() {
      if (respBuilder_ == null) {
        return resp_ == null ? com.alibaba.maxgraph.proto.Response.getDefaultInstance() : resp_;
      } else {
        return respBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Response resp = 1;</code>
     */
    public Builder setResp(com.alibaba.maxgraph.proto.Response value) {
      if (respBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resp_ = value;
        onChanged();
      } else {
        respBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .Response resp = 1;</code>
     */
    public Builder setResp(
        com.alibaba.maxgraph.proto.Response.Builder builderForValue) {
      if (respBuilder_ == null) {
        resp_ = builderForValue.build();
        onChanged();
      } else {
        respBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .Response resp = 1;</code>
     */
    public Builder mergeResp(com.alibaba.maxgraph.proto.Response value) {
      if (respBuilder_ == null) {
        if (resp_ != null) {
          resp_ =
            com.alibaba.maxgraph.proto.Response.newBuilder(resp_).mergeFrom(value).buildPartial();
        } else {
          resp_ = value;
        }
        onChanged();
      } else {
        respBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .Response resp = 1;</code>
     */
    public Builder clearResp() {
      if (respBuilder_ == null) {
        resp_ = null;
        onChanged();
      } else {
        resp_ = null;
        respBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .Response resp = 1;</code>
     */
    public com.alibaba.maxgraph.proto.Response.Builder getRespBuilder() {
      
      onChanged();
      return getRespFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Response resp = 1;</code>
     */
    public com.alibaba.maxgraph.proto.ResponseOrBuilder getRespOrBuilder() {
      if (respBuilder_ != null) {
        return respBuilder_.getMessageOrBuilder();
      } else {
        return resp_ == null ?
            com.alibaba.maxgraph.proto.Response.getDefaultInstance() : resp_;
      }
    }
    /**
     * <code>optional .Response resp = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.Response, com.alibaba.maxgraph.proto.Response.Builder, com.alibaba.maxgraph.proto.ResponseOrBuilder> 
        getRespFieldBuilder() {
      if (respBuilder_ == null) {
        respBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.alibaba.maxgraph.proto.Response, com.alibaba.maxgraph.proto.Response.Builder, com.alibaba.maxgraph.proto.ResponseOrBuilder>(
                getResp(),
                getParentForChildren(),
                isClean());
        resp_ = null;
      }
      return respBuilder_;
    }

    private com.alibaba.maxgraph.proto.WorkerInfoProtos workerInfoProtos_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.WorkerInfoProtos, com.alibaba.maxgraph.proto.WorkerInfoProtos.Builder, com.alibaba.maxgraph.proto.WorkerInfoProtosOrBuilder> workerInfoProtosBuilder_;
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    public boolean hasWorkerInfoProtos() {
      return workerInfoProtosBuilder_ != null || workerInfoProtos_ != null;
    }
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    public com.alibaba.maxgraph.proto.WorkerInfoProtos getWorkerInfoProtos() {
      if (workerInfoProtosBuilder_ == null) {
        return workerInfoProtos_ == null ? com.alibaba.maxgraph.proto.WorkerInfoProtos.getDefaultInstance() : workerInfoProtos_;
      } else {
        return workerInfoProtosBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    public Builder setWorkerInfoProtos(com.alibaba.maxgraph.proto.WorkerInfoProtos value) {
      if (workerInfoProtosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workerInfoProtos_ = value;
        onChanged();
      } else {
        workerInfoProtosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    public Builder setWorkerInfoProtos(
        com.alibaba.maxgraph.proto.WorkerInfoProtos.Builder builderForValue) {
      if (workerInfoProtosBuilder_ == null) {
        workerInfoProtos_ = builderForValue.build();
        onChanged();
      } else {
        workerInfoProtosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    public Builder mergeWorkerInfoProtos(com.alibaba.maxgraph.proto.WorkerInfoProtos value) {
      if (workerInfoProtosBuilder_ == null) {
        if (workerInfoProtos_ != null) {
          workerInfoProtos_ =
            com.alibaba.maxgraph.proto.WorkerInfoProtos.newBuilder(workerInfoProtos_).mergeFrom(value).buildPartial();
        } else {
          workerInfoProtos_ = value;
        }
        onChanged();
      } else {
        workerInfoProtosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    public Builder clearWorkerInfoProtos() {
      if (workerInfoProtosBuilder_ == null) {
        workerInfoProtos_ = null;
        onChanged();
      } else {
        workerInfoProtos_ = null;
        workerInfoProtosBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    public com.alibaba.maxgraph.proto.WorkerInfoProtos.Builder getWorkerInfoProtosBuilder() {
      
      onChanged();
      return getWorkerInfoProtosFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    public com.alibaba.maxgraph.proto.WorkerInfoProtosOrBuilder getWorkerInfoProtosOrBuilder() {
      if (workerInfoProtosBuilder_ != null) {
        return workerInfoProtosBuilder_.getMessageOrBuilder();
      } else {
        return workerInfoProtos_ == null ?
            com.alibaba.maxgraph.proto.WorkerInfoProtos.getDefaultInstance() : workerInfoProtos_;
      }
    }
    /**
     * <code>optional .WorkerInfoProtos workerInfoProtos = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.WorkerInfoProtos, com.alibaba.maxgraph.proto.WorkerInfoProtos.Builder, com.alibaba.maxgraph.proto.WorkerInfoProtosOrBuilder> 
        getWorkerInfoProtosFieldBuilder() {
      if (workerInfoProtosBuilder_ == null) {
        workerInfoProtosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.alibaba.maxgraph.proto.WorkerInfoProtos, com.alibaba.maxgraph.proto.WorkerInfoProtos.Builder, com.alibaba.maxgraph.proto.WorkerInfoProtosOrBuilder>(
                getWorkerInfoProtos(),
                getParentForChildren(),
                isClean());
        workerInfoProtos_ = null;
      }
      return workerInfoProtosBuilder_;
    }

    private boolean isLegal_ ;
    /**
     * <code>optional bool isLegal = 3;</code>
     */
    public boolean getIsLegal() {
      return isLegal_;
    }
    /**
     * <code>optional bool isLegal = 3;</code>
     */
    public Builder setIsLegal(boolean value) {
      
      isLegal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool isLegal = 3;</code>
     */
    public Builder clearIsLegal() {
      
      isLegal_ = false;
      onChanged();
      return this;
    }

    private long snapshotId_ ;
    /**
     * <code>optional int64 snapshotId = 4;</code>
     */
    public long getSnapshotId() {
      return snapshotId_;
    }
    /**
     * <code>optional int64 snapshotId = 4;</code>
     */
    public Builder setSnapshotId(long value) {
      
      snapshotId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 snapshotId = 4;</code>
     */
    public Builder clearSnapshotId() {
      
      snapshotId_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> servingServerId_ = java.util.Collections.emptyList();
    private void ensureServingServerIdIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        servingServerId_ = new java.util.ArrayList<java.lang.Integer>(servingServerId_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated int32 servingServerId = 5;</code>
     */
    public java.util.List<java.lang.Integer>
        getServingServerIdList() {
      return java.util.Collections.unmodifiableList(servingServerId_);
    }
    /**
     * <code>repeated int32 servingServerId = 5;</code>
     */
    public int getServingServerIdCount() {
      return servingServerId_.size();
    }
    /**
     * <code>repeated int32 servingServerId = 5;</code>
     */
    public int getServingServerId(int index) {
      return servingServerId_.get(index);
    }
    /**
     * <code>repeated int32 servingServerId = 5;</code>
     */
    public Builder setServingServerId(
        int index, int value) {
      ensureServingServerIdIsMutable();
      servingServerId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 servingServerId = 5;</code>
     */
    public Builder addServingServerId(int value) {
      ensureServingServerIdIsMutable();
      servingServerId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 servingServerId = 5;</code>
     */
    public Builder addAllServingServerId(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureServingServerIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, servingServerId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 servingServerId = 5;</code>
     */
    public Builder clearServingServerId() {
      servingServerId_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }

    private long aliveId_ ;
    /**
     * <code>optional uint64 aliveId = 6;</code>
     */
    public long getAliveId() {
      return aliveId_;
    }
    /**
     * <code>optional uint64 aliveId = 6;</code>
     */
    public Builder setAliveId(long value) {
      
      aliveId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 aliveId = 6;</code>
     */
    public Builder clearAliveId() {
      
      aliveId_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:SimpleServerHBResponse)
  }

  // @@protoc_insertion_point(class_scope:SimpleServerHBResponse)
  private static final com.alibaba.maxgraph.proto.SimpleServerHBResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.SimpleServerHBResponse();
  }

  public static com.alibaba.maxgraph.proto.SimpleServerHBResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleServerHBResponse>
      PARSER = new com.google.protobuf.AbstractParser<SimpleServerHBResponse>() {
    public SimpleServerHBResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SimpleServerHBResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimpleServerHBResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleServerHBResponse> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.SimpleServerHBResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

