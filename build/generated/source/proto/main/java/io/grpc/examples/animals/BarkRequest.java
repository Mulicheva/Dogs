// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dog.proto

package io.grpc.examples.animals;

/**
 * Protobuf type {@code animals.BarkRequest}
 */
public final class BarkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:animals.BarkRequest)
    BarkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BarkRequest.newBuilder() to construct.
  private BarkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BarkRequest() {
    whoBark_ = "";
    whereBark_ = "";
    whyBark_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BarkRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.animals.DogProto.internal_static_animals_BarkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.animals.DogProto.internal_static_animals_BarkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.animals.BarkRequest.class, io.grpc.examples.animals.BarkRequest.Builder.class);
  }

  public static final int WHOBARK_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object whoBark_ = "";
  /**
   * <code>string whoBark = 1;</code>
   * @return The whoBark.
   */
  @java.lang.Override
  public java.lang.String getWhoBark() {
    java.lang.Object ref = whoBark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      whoBark_ = s;
      return s;
    }
  }
  /**
   * <code>string whoBark = 1;</code>
   * @return The bytes for whoBark.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWhoBarkBytes() {
    java.lang.Object ref = whoBark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      whoBark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WHEREBARK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object whereBark_ = "";
  /**
   * <code>string whereBark = 2;</code>
   * @return The whereBark.
   */
  @java.lang.Override
  public java.lang.String getWhereBark() {
    java.lang.Object ref = whereBark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      whereBark_ = s;
      return s;
    }
  }
  /**
   * <code>string whereBark = 2;</code>
   * @return The bytes for whereBark.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWhereBarkBytes() {
    java.lang.Object ref = whereBark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      whereBark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WHYBARK_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object whyBark_ = "";
  /**
   * <code>string whyBark = 3;</code>
   * @return The whyBark.
   */
  @java.lang.Override
  public java.lang.String getWhyBark() {
    java.lang.Object ref = whyBark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      whyBark_ = s;
      return s;
    }
  }
  /**
   * <code>string whyBark = 3;</code>
   * @return The bytes for whyBark.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWhyBarkBytes() {
    java.lang.Object ref = whyBark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      whyBark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOWMANYTIMESBARK_FIELD_NUMBER = 4;
  private int howManyTimesBark_ = 0;
  /**
   * <code>int32 howManyTimesBark = 4;</code>
   * @return The howManyTimesBark.
   */
  @java.lang.Override
  public int getHowManyTimesBark() {
    return howManyTimesBark_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(whoBark_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, whoBark_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(whereBark_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, whereBark_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(whyBark_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, whyBark_);
    }
    if (howManyTimesBark_ != 0) {
      output.writeInt32(4, howManyTimesBark_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(whoBark_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, whoBark_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(whereBark_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, whereBark_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(whyBark_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, whyBark_);
    }
    if (howManyTimesBark_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, howManyTimesBark_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.examples.animals.BarkRequest)) {
      return super.equals(obj);
    }
    io.grpc.examples.animals.BarkRequest other = (io.grpc.examples.animals.BarkRequest) obj;

    if (!getWhoBark()
        .equals(other.getWhoBark())) return false;
    if (!getWhereBark()
        .equals(other.getWhereBark())) return false;
    if (!getWhyBark()
        .equals(other.getWhyBark())) return false;
    if (getHowManyTimesBark()
        != other.getHowManyTimesBark()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WHOBARK_FIELD_NUMBER;
    hash = (53 * hash) + getWhoBark().hashCode();
    hash = (37 * hash) + WHEREBARK_FIELD_NUMBER;
    hash = (53 * hash) + getWhereBark().hashCode();
    hash = (37 * hash) + WHYBARK_FIELD_NUMBER;
    hash = (53 * hash) + getWhyBark().hashCode();
    hash = (37 * hash) + HOWMANYTIMESBARK_FIELD_NUMBER;
    hash = (53 * hash) + getHowManyTimesBark();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.animals.BarkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.animals.BarkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.animals.BarkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.animals.BarkRequest parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.animals.BarkRequest prototype) {
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
   * Protobuf type {@code animals.BarkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:animals.BarkRequest)
      io.grpc.examples.animals.BarkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.animals.DogProto.internal_static_animals_BarkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.animals.DogProto.internal_static_animals_BarkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.animals.BarkRequest.class, io.grpc.examples.animals.BarkRequest.Builder.class);
    }

    // Construct using io.grpc.examples.animals.BarkRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      whoBark_ = "";
      whereBark_ = "";
      whyBark_ = "";
      howManyTimesBark_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.animals.DogProto.internal_static_animals_BarkRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.animals.BarkRequest getDefaultInstanceForType() {
      return io.grpc.examples.animals.BarkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.animals.BarkRequest build() {
      io.grpc.examples.animals.BarkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.animals.BarkRequest buildPartial() {
      io.grpc.examples.animals.BarkRequest result = new io.grpc.examples.animals.BarkRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grpc.examples.animals.BarkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.whoBark_ = whoBark_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.whereBark_ = whereBark_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.whyBark_ = whyBark_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.howManyTimesBark_ = howManyTimesBark_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.animals.BarkRequest) {
        return mergeFrom((io.grpc.examples.animals.BarkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.animals.BarkRequest other) {
      if (other == io.grpc.examples.animals.BarkRequest.getDefaultInstance()) return this;
      if (!other.getWhoBark().isEmpty()) {
        whoBark_ = other.whoBark_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWhereBark().isEmpty()) {
        whereBark_ = other.whereBark_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getWhyBark().isEmpty()) {
        whyBark_ = other.whyBark_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getHowManyTimesBark() != 0) {
        setHowManyTimesBark(other.getHowManyTimesBark());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              whoBark_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              whereBark_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              whyBark_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              howManyTimesBark_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object whoBark_ = "";
    /**
     * <code>string whoBark = 1;</code>
     * @return The whoBark.
     */
    public java.lang.String getWhoBark() {
      java.lang.Object ref = whoBark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        whoBark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string whoBark = 1;</code>
     * @return The bytes for whoBark.
     */
    public com.google.protobuf.ByteString
        getWhoBarkBytes() {
      java.lang.Object ref = whoBark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        whoBark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string whoBark = 1;</code>
     * @param value The whoBark to set.
     * @return This builder for chaining.
     */
    public Builder setWhoBark(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      whoBark_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string whoBark = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWhoBark() {
      whoBark_ = getDefaultInstance().getWhoBark();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string whoBark = 1;</code>
     * @param value The bytes for whoBark to set.
     * @return This builder for chaining.
     */
    public Builder setWhoBarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      whoBark_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object whereBark_ = "";
    /**
     * <code>string whereBark = 2;</code>
     * @return The whereBark.
     */
    public java.lang.String getWhereBark() {
      java.lang.Object ref = whereBark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        whereBark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string whereBark = 2;</code>
     * @return The bytes for whereBark.
     */
    public com.google.protobuf.ByteString
        getWhereBarkBytes() {
      java.lang.Object ref = whereBark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        whereBark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string whereBark = 2;</code>
     * @param value The whereBark to set.
     * @return This builder for chaining.
     */
    public Builder setWhereBark(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      whereBark_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string whereBark = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWhereBark() {
      whereBark_ = getDefaultInstance().getWhereBark();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string whereBark = 2;</code>
     * @param value The bytes for whereBark to set.
     * @return This builder for chaining.
     */
    public Builder setWhereBarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      whereBark_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object whyBark_ = "";
    /**
     * <code>string whyBark = 3;</code>
     * @return The whyBark.
     */
    public java.lang.String getWhyBark() {
      java.lang.Object ref = whyBark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        whyBark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string whyBark = 3;</code>
     * @return The bytes for whyBark.
     */
    public com.google.protobuf.ByteString
        getWhyBarkBytes() {
      java.lang.Object ref = whyBark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        whyBark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string whyBark = 3;</code>
     * @param value The whyBark to set.
     * @return This builder for chaining.
     */
    public Builder setWhyBark(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      whyBark_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string whyBark = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWhyBark() {
      whyBark_ = getDefaultInstance().getWhyBark();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string whyBark = 3;</code>
     * @param value The bytes for whyBark to set.
     * @return This builder for chaining.
     */
    public Builder setWhyBarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      whyBark_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int howManyTimesBark_ ;
    /**
     * <code>int32 howManyTimesBark = 4;</code>
     * @return The howManyTimesBark.
     */
    @java.lang.Override
    public int getHowManyTimesBark() {
      return howManyTimesBark_;
    }
    /**
     * <code>int32 howManyTimesBark = 4;</code>
     * @param value The howManyTimesBark to set.
     * @return This builder for chaining.
     */
    public Builder setHowManyTimesBark(int value) {

      howManyTimesBark_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 howManyTimesBark = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHowManyTimesBark() {
      bitField0_ = (bitField0_ & ~0x00000008);
      howManyTimesBark_ = 0;
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


    // @@protoc_insertion_point(builder_scope:animals.BarkRequest)
  }

  // @@protoc_insertion_point(class_scope:animals.BarkRequest)
  private static final io.grpc.examples.animals.BarkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.animals.BarkRequest();
  }

  public static io.grpc.examples.animals.BarkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BarkRequest>
      PARSER = new com.google.protobuf.AbstractParser<BarkRequest>() {
    @java.lang.Override
    public BarkRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BarkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BarkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.animals.BarkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
