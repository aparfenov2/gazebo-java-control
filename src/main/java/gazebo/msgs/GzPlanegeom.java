// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: planegeom.proto

package gazebo.msgs;

public final class GzPlanegeom {
  private GzPlanegeom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlaneGeomOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .gazebo.msgs.Vector3d normal = 1;
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     */
    boolean hasNormal();
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     */
    gazebo.msgs.GzVector3d.Vector3d getNormal();
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     */
    gazebo.msgs.GzVector3d.Vector3dOrBuilder getNormalOrBuilder();

    // required .gazebo.msgs.Vector2d size = 2;
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     */
    boolean hasSize();
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     */
    gazebo.msgs.GzVector2d.Vector2d getSize();
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     */
    gazebo.msgs.GzVector2d.Vector2dOrBuilder getSizeOrBuilder();

    // optional double d = 3 [default = 0];
    /**
     * <code>optional double d = 3 [default = 0];</code>
     */
    boolean hasD();
    /**
     * <code>optional double d = 3 [default = 0];</code>
     */
    double getD();
  }
  /**
   * Protobuf type {@code gazebo.msgs.PlaneGeom}
   */
  public static final class PlaneGeom extends
      com.google.protobuf.GeneratedMessage
      implements PlaneGeomOrBuilder {
    // Use PlaneGeom.newBuilder() to construct.
    private PlaneGeom(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PlaneGeom(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PlaneGeom defaultInstance;
    public static PlaneGeom getDefaultInstance() {
      return defaultInstance;
    }

    public PlaneGeom getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PlaneGeom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              gazebo.msgs.GzVector3d.Vector3d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = normal_.toBuilder();
              }
              normal_ = input.readMessage(gazebo.msgs.GzVector3d.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(normal_);
                normal_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              gazebo.msgs.GzVector2d.Vector2d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = size_.toBuilder();
              }
              size_ = input.readMessage(gazebo.msgs.GzVector2d.Vector2d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(size_);
                size_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              d_ = input.readDouble();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.GzPlanegeom.internal_static_gazebo_msgs_PlaneGeom_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzPlanegeom.internal_static_gazebo_msgs_PlaneGeom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzPlanegeom.PlaneGeom.class, gazebo.msgs.GzPlanegeom.PlaneGeom.Builder.class);
    }

    public static com.google.protobuf.Parser<PlaneGeom> PARSER =
        new com.google.protobuf.AbstractParser<PlaneGeom>() {
      public PlaneGeom parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlaneGeom(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PlaneGeom> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .gazebo.msgs.Vector3d normal = 1;
    public static final int NORMAL_FIELD_NUMBER = 1;
    private gazebo.msgs.GzVector3d.Vector3d normal_;
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     */
    public boolean hasNormal() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3d getNormal() {
      return normal_;
    }
    /**
     * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3dOrBuilder getNormalOrBuilder() {
      return normal_;
    }

    // required .gazebo.msgs.Vector2d size = 2;
    public static final int SIZE_FIELD_NUMBER = 2;
    private gazebo.msgs.GzVector2d.Vector2d size_;
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     */
    public boolean hasSize() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     */
    public gazebo.msgs.GzVector2d.Vector2d getSize() {
      return size_;
    }
    /**
     * <code>required .gazebo.msgs.Vector2d size = 2;</code>
     */
    public gazebo.msgs.GzVector2d.Vector2dOrBuilder getSizeOrBuilder() {
      return size_;
    }

    // optional double d = 3 [default = 0];
    public static final int D_FIELD_NUMBER = 3;
    private double d_;
    /**
     * <code>optional double d = 3 [default = 0];</code>
     */
    public boolean hasD() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional double d = 3 [default = 0];</code>
     */
    public double getD() {
      return d_;
    }

    private void initFields() {
      normal_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
      size_ = gazebo.msgs.GzVector2d.Vector2d.getDefaultInstance();
      d_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasNormal()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSize()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getNormal().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSize().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, normal_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, size_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, d_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, normal_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, size_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, d_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzPlanegeom.PlaneGeom parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzPlanegeom.PlaneGeom prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gazebo.msgs.PlaneGeom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzPlanegeom.PlaneGeomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzPlanegeom.internal_static_gazebo_msgs_PlaneGeom_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzPlanegeom.internal_static_gazebo_msgs_PlaneGeom_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzPlanegeom.PlaneGeom.class, gazebo.msgs.GzPlanegeom.PlaneGeom.Builder.class);
      }

      // Construct using gazebo.msgs.GzPlanegeom.PlaneGeom.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getNormalFieldBuilder();
          getSizeFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (normalBuilder_ == null) {
          normal_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
        } else {
          normalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (sizeBuilder_ == null) {
          size_ = gazebo.msgs.GzVector2d.Vector2d.getDefaultInstance();
        } else {
          sizeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        d_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzPlanegeom.internal_static_gazebo_msgs_PlaneGeom_descriptor;
      }

      public gazebo.msgs.GzPlanegeom.PlaneGeom getDefaultInstanceForType() {
        return gazebo.msgs.GzPlanegeom.PlaneGeom.getDefaultInstance();
      }

      public gazebo.msgs.GzPlanegeom.PlaneGeom build() {
        gazebo.msgs.GzPlanegeom.PlaneGeom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzPlanegeom.PlaneGeom buildPartial() {
        gazebo.msgs.GzPlanegeom.PlaneGeom result = new gazebo.msgs.GzPlanegeom.PlaneGeom(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (normalBuilder_ == null) {
          result.normal_ = normal_;
        } else {
          result.normal_ = normalBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (sizeBuilder_ == null) {
          result.size_ = size_;
        } else {
          result.size_ = sizeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.d_ = d_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzPlanegeom.PlaneGeom) {
          return mergeFrom((gazebo.msgs.GzPlanegeom.PlaneGeom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzPlanegeom.PlaneGeom other) {
        if (other == gazebo.msgs.GzPlanegeom.PlaneGeom.getDefaultInstance()) return this;
        if (other.hasNormal()) {
          mergeNormal(other.getNormal());
        }
        if (other.hasSize()) {
          mergeSize(other.getSize());
        }
        if (other.hasD()) {
          setD(other.getD());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasNormal()) {
          
          return false;
        }
        if (!hasSize()) {
          
          return false;
        }
        if (!getNormal().isInitialized()) {
          
          return false;
        }
        if (!getSize().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzPlanegeom.PlaneGeom parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzPlanegeom.PlaneGeom) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .gazebo.msgs.Vector3d normal = 1;
      private gazebo.msgs.GzVector3d.Vector3d normal_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> normalBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public boolean hasNormal() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d getNormal() {
        if (normalBuilder_ == null) {
          return normal_;
        } else {
          return normalBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public Builder setNormal(gazebo.msgs.GzVector3d.Vector3d value) {
        if (normalBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          normal_ = value;
          onChanged();
        } else {
          normalBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public Builder setNormal(
          gazebo.msgs.GzVector3d.Vector3d.Builder builderForValue) {
        if (normalBuilder_ == null) {
          normal_ = builderForValue.build();
          onChanged();
        } else {
          normalBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public Builder mergeNormal(gazebo.msgs.GzVector3d.Vector3d value) {
        if (normalBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              normal_ != gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance()) {
            normal_ =
              gazebo.msgs.GzVector3d.Vector3d.newBuilder(normal_).mergeFrom(value).buildPartial();
          } else {
            normal_ = value;
          }
          onChanged();
        } else {
          normalBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public Builder clearNormal() {
        if (normalBuilder_ == null) {
          normal_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
          onChanged();
        } else {
          normalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d.Builder getNormalBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getNormalFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3dOrBuilder getNormalOrBuilder() {
        if (normalBuilder_ != null) {
          return normalBuilder_.getMessageOrBuilder();
        } else {
          return normal_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector3d normal = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> 
          getNormalFieldBuilder() {
        if (normalBuilder_ == null) {
          normalBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder>(
                  normal_,
                  getParentForChildren(),
                  isClean());
          normal_ = null;
        }
        return normalBuilder_;
      }

      // required .gazebo.msgs.Vector2d size = 2;
      private gazebo.msgs.GzVector2d.Vector2d size_ = gazebo.msgs.GzVector2d.Vector2d.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector2d.Vector2d, gazebo.msgs.GzVector2d.Vector2d.Builder, gazebo.msgs.GzVector2d.Vector2dOrBuilder> sizeBuilder_;
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public boolean hasSize() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public gazebo.msgs.GzVector2d.Vector2d getSize() {
        if (sizeBuilder_ == null) {
          return size_;
        } else {
          return sizeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public Builder setSize(gazebo.msgs.GzVector2d.Vector2d value) {
        if (sizeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          size_ = value;
          onChanged();
        } else {
          sizeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public Builder setSize(
          gazebo.msgs.GzVector2d.Vector2d.Builder builderForValue) {
        if (sizeBuilder_ == null) {
          size_ = builderForValue.build();
          onChanged();
        } else {
          sizeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public Builder mergeSize(gazebo.msgs.GzVector2d.Vector2d value) {
        if (sizeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              size_ != gazebo.msgs.GzVector2d.Vector2d.getDefaultInstance()) {
            size_ =
              gazebo.msgs.GzVector2d.Vector2d.newBuilder(size_).mergeFrom(value).buildPartial();
          } else {
            size_ = value;
          }
          onChanged();
        } else {
          sizeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public Builder clearSize() {
        if (sizeBuilder_ == null) {
          size_ = gazebo.msgs.GzVector2d.Vector2d.getDefaultInstance();
          onChanged();
        } else {
          sizeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public gazebo.msgs.GzVector2d.Vector2d.Builder getSizeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSizeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      public gazebo.msgs.GzVector2d.Vector2dOrBuilder getSizeOrBuilder() {
        if (sizeBuilder_ != null) {
          return sizeBuilder_.getMessageOrBuilder();
        } else {
          return size_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Vector2d size = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector2d.Vector2d, gazebo.msgs.GzVector2d.Vector2d.Builder, gazebo.msgs.GzVector2d.Vector2dOrBuilder> 
          getSizeFieldBuilder() {
        if (sizeBuilder_ == null) {
          sizeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzVector2d.Vector2d, gazebo.msgs.GzVector2d.Vector2d.Builder, gazebo.msgs.GzVector2d.Vector2dOrBuilder>(
                  size_,
                  getParentForChildren(),
                  isClean());
          size_ = null;
        }
        return sizeBuilder_;
      }

      // optional double d = 3 [default = 0];
      private double d_ ;
      /**
       * <code>optional double d = 3 [default = 0];</code>
       */
      public boolean hasD() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional double d = 3 [default = 0];</code>
       */
      public double getD() {
        return d_;
      }
      /**
       * <code>optional double d = 3 [default = 0];</code>
       */
      public Builder setD(double value) {
        bitField0_ |= 0x00000004;
        d_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double d = 3 [default = 0];</code>
       */
      public Builder clearD() {
        bitField0_ = (bitField0_ & ~0x00000004);
        d_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.PlaneGeom)
    }

    static {
      defaultInstance = new PlaneGeom(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.PlaneGeom)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_PlaneGeom_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_PlaneGeom_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017planegeom.proto\022\013gazebo.msgs\032\016vector3d" +
      ".proto\032\016vector2d.proto\"e\n\tPlaneGeom\022%\n\006n" +
      "ormal\030\001 \002(\0132\025.gazebo.msgs.Vector3d\022#\n\004si" +
      "ze\030\002 \002(\0132\025.gazebo.msgs.Vector2d\022\014\n\001d\030\003 \001" +
      "(\001:\0010B\rB\013GzPlanegeom"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_PlaneGeom_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_PlaneGeom_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_PlaneGeom_descriptor,
              new java.lang.String[] { "Normal", "Size", "D", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzVector3d.getDescriptor(),
          gazebo.msgs.GzVector2d.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}