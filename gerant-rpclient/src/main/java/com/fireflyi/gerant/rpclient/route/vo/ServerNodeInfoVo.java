// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerNodeInfoVo.proto

package com.fireflyi.gerant.rpclient.route.vo;

/**
 * Protobuf type {@code protobuf.route.ServerNodeInfoVo}
 */
public  final class ServerNodeInfoVo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protobuf.route.ServerNodeInfoVo)
    ServerNodeInfoVoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerNodeInfoVo.newBuilder() to construct.
  private ServerNodeInfoVo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerNodeInfoVo() {
    ip_ = "";
    name_ = "";
    group_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerNodeInfoVo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerNodeInfoVo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            ip_ = s;
            break;
          }
          case 16: {

            port_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            group_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoPtc.internal_static_protobuf_route_ServerNodeInfoVo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoPtc.internal_static_protobuf_route_ServerNodeInfoVo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo.class, com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo.Builder.class);
  }

  public static final int IP_FIELD_NUMBER = 1;
  private volatile java.lang.Object ip_;
  /**
   * <pre>
   *ip
   * </pre>
   *
   * <code>string ip = 1;</code>
   */
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *ip
   * </pre>
   *
   * <code>string ip = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <code>int32 port = 2;</code>
   */
  public int getPort() {
    return port_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   *名字
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *名字
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUP_FIELD_NUMBER = 4;
  private volatile java.lang.Object group_;
  /**
   * <pre>
   *组名
   * </pre>
   *
   * <code>string group = 4;</code>
   */
  public java.lang.String getGroup() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      group_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *组名
   * </pre>
   *
   * <code>string group = 4;</code>
   */
  public com.google.protobuf.ByteString
      getGroupBytes() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      group_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!getGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, group_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, port_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!getGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, group_);
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
    if (!(obj instanceof com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo)) {
      return super.equals(obj);
    }
    com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo other = (com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo) obj;

    if (!getIp()
        .equals(other.getIp())) return false;
    if (getPort()
        != other.getPort()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getGroup()
        .equals(other.getGroup())) return false;
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
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getGroup().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parseFrom(
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
  public static Builder newBuilder(com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo prototype) {
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
   * Protobuf type {@code protobuf.route.ServerNodeInfoVo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protobuf.route.ServerNodeInfoVo)
      com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoPtc.internal_static_protobuf_route_ServerNodeInfoVo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoPtc.internal_static_protobuf_route_ServerNodeInfoVo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo.class, com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo.Builder.class);
    }

    // Construct using com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ip_ = "";

      port_ = 0;

      name_ = "";

      group_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoPtc.internal_static_protobuf_route_ServerNodeInfoVo_descriptor;
    }

    @java.lang.Override
    public com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo getDefaultInstanceForType() {
      return com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo.getDefaultInstance();
    }

    @java.lang.Override
    public com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo build() {
      com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo buildPartial() {
      com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo result = new com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo(this);
      result.ip_ = ip_;
      result.port_ = port_;
      result.name_ = name_;
      result.group_ = group_;
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
      if (other instanceof com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo) {
        return mergeFrom((com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo other) {
      if (other == com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo.getDefaultInstance()) return this;
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getGroup().isEmpty()) {
        group_ = other.group_;
        onChanged();
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
      com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ip_ = "";
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string ip = 1;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string ip = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string ip = 1;</code>
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ip_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string ip = 1;</code>
     */
    public Builder clearIp() {
      
      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string ip = 1;</code>
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ip_ = value;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <code>int32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <code>int32 port = 2;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 port = 2;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     *名字
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *名字
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *名字
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *名字
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *名字
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object group_ = "";
    /**
     * <pre>
     *组名
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        group_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *组名
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *组名
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    public Builder setGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      group_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *组名
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    public Builder clearGroup() {
      
      group_ = getDefaultInstance().getGroup();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *组名
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    public Builder setGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      group_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:protobuf.route.ServerNodeInfoVo)
  }

  // @@protoc_insertion_point(class_scope:protobuf.route.ServerNodeInfoVo)
  private static final com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo();
  }

  public static com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerNodeInfoVo>
      PARSER = new com.google.protobuf.AbstractParser<ServerNodeInfoVo>() {
    @java.lang.Override
    public ServerNodeInfoVo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerNodeInfoVo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerNodeInfoVo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerNodeInfoVo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fireflyi.gerant.rpclient.route.vo.ServerNodeInfoVo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

