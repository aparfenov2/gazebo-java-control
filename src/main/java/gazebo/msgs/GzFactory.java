// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: factory.proto

package gazebo.msgs;

public final class GzFactory {
  private GzFactory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FactoryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string sdf = 1;
    /**
     * <code>optional string sdf = 1;</code>
     */
    boolean hasSdf();
    /**
     * <code>optional string sdf = 1;</code>
     */
    java.lang.String getSdf();
    /**
     * <code>optional string sdf = 1;</code>
     */
    com.google.protobuf.ByteString
        getSdfBytes();

    // optional string sdf_filename = 2;
    /**
     * <code>optional string sdf_filename = 2;</code>
     */
    boolean hasSdfFilename();
    /**
     * <code>optional string sdf_filename = 2;</code>
     */
    java.lang.String getSdfFilename();
    /**
     * <code>optional string sdf_filename = 2;</code>
     */
    com.google.protobuf.ByteString
        getSdfFilenameBytes();

    // optional .gazebo.msgs.Pose pose = 3;
    /**
     * <code>optional .gazebo.msgs.Pose pose = 3;</code>
     */
    boolean hasPose();
    /**
     * <code>optional .gazebo.msgs.Pose pose = 3;</code>
     */
    gazebo.msgs.GzPose.Pose getPose();
    /**
     * <code>optional .gazebo.msgs.Pose pose = 3;</code>
     */
    gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder();

    // optional string edit_name = 4;
    /**
     * <code>optional string edit_name = 4;</code>
     */
    boolean hasEditName();
    /**
     * <code>optional string edit_name = 4;</code>
     */
    java.lang.String getEditName();
    /**
     * <code>optional string edit_name = 4;</code>
     */
    com.google.protobuf.ByteString
        getEditNameBytes();

    // optional string clone_model_name = 5;
    /**
     * <code>optional string clone_model_name = 5;</code>
     */
    boolean hasCloneModelName();
    /**
     * <code>optional string clone_model_name = 5;</code>
     */
    java.lang.String getCloneModelName();
    /**
     * <code>optional string clone_model_name = 5;</code>
     */
    com.google.protobuf.ByteString
        getCloneModelNameBytes();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Factory}
   */
  public static final class Factory extends
      com.google.protobuf.GeneratedMessage
      implements FactoryOrBuilder {
    // Use Factory.newBuilder() to construct.
    private Factory(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Factory(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Factory defaultInstance;
    public static Factory getDefaultInstance() {
      return defaultInstance;
    }

    public Factory getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Factory(
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
              bitField0_ |= 0x00000001;
              sdf_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              sdfFilename_ = input.readBytes();
              break;
            }
            case 26: {
              gazebo.msgs.GzPose.Pose.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = pose_.toBuilder();
              }
              pose_ = input.readMessage(gazebo.msgs.GzPose.Pose.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pose_);
                pose_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              editName_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              cloneModelName_ = input.readBytes();
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
      return gazebo.msgs.GzFactory.internal_static_gazebo_msgs_Factory_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzFactory.internal_static_gazebo_msgs_Factory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzFactory.Factory.class, gazebo.msgs.GzFactory.Factory.Builder.class);
    }

    public static com.google.protobuf.Parser<Factory> PARSER =
        new com.google.protobuf.AbstractParser<Factory>() {
      public Factory parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Factory(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Factory> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string sdf = 1;
    public static final int SDF_FIELD_NUMBER = 1;
    private java.lang.Object sdf_;
    /**
     * <code>optional string sdf = 1;</code>
     */
    public boolean hasSdf() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string sdf = 1;</code>
     */
    public java.lang.String getSdf() {
      java.lang.Object ref = sdf_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sdf_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sdf = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSdfBytes() {
      java.lang.Object ref = sdf_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sdf_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string sdf_filename = 2;
    public static final int SDF_FILENAME_FIELD_NUMBER = 2;
    private java.lang.Object sdfFilename_;
    /**
     * <code>optional string sdf_filename = 2;</code>
     */
    public boolean hasSdfFilename() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string sdf_filename = 2;</code>
     */
    public java.lang.String getSdfFilename() {
      java.lang.Object ref = sdfFilename_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sdfFilename_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sdf_filename = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSdfFilenameBytes() {
      java.lang.Object ref = sdfFilename_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sdfFilename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .gazebo.msgs.Pose pose = 3;
    public static final int POSE_FIELD_NUMBER = 3;
    private gazebo.msgs.GzPose.Pose pose_;
    /**
     * <code>optional .gazebo.msgs.Pose pose = 3;</code>
     */
    public boolean hasPose() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .gazebo.msgs.Pose pose = 3;</code>
     */
    public gazebo.msgs.GzPose.Pose getPose() {
      return pose_;
    }
    /**
     * <code>optional .gazebo.msgs.Pose pose = 3;</code>
     */
    public gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder() {
      return pose_;
    }

    // optional string edit_name = 4;
    public static final int EDIT_NAME_FIELD_NUMBER = 4;
    private java.lang.Object editName_;
    /**
     * <code>optional string edit_name = 4;</code>
     */
    public boolean hasEditName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string edit_name = 4;</code>
     */
    public java.lang.String getEditName() {
      java.lang.Object ref = editName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          editName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string edit_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEditNameBytes() {
      java.lang.Object ref = editName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        editName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string clone_model_name = 5;
    public static final int CLONE_MODEL_NAME_FIELD_NUMBER = 5;
    private java.lang.Object cloneModelName_;
    /**
     * <code>optional string clone_model_name = 5;</code>
     */
    public boolean hasCloneModelName() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string clone_model_name = 5;</code>
     */
    public java.lang.String getCloneModelName() {
      java.lang.Object ref = cloneModelName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          cloneModelName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string clone_model_name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCloneModelNameBytes() {
      java.lang.Object ref = cloneModelName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cloneModelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      sdf_ = "";
      sdfFilename_ = "";
      pose_ = gazebo.msgs.GzPose.Pose.getDefaultInstance();
      editName_ = "";
      cloneModelName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (hasPose()) {
        if (!getPose().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSdfBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getSdfFilenameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, pose_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getEditNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getCloneModelNameBytes());
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
          .computeBytesSize(1, getSdfBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSdfFilenameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, pose_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getEditNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getCloneModelNameBytes());
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

    public static gazebo.msgs.GzFactory.Factory parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzFactory.Factory parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzFactory.Factory parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzFactory.Factory parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzFactory.Factory parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzFactory.Factory parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzFactory.Factory parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzFactory.Factory parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzFactory.Factory parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzFactory.Factory parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzFactory.Factory prototype) {
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
     * Protobuf type {@code gazebo.msgs.Factory}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzFactory.FactoryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzFactory.internal_static_gazebo_msgs_Factory_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzFactory.internal_static_gazebo_msgs_Factory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzFactory.Factory.class, gazebo.msgs.GzFactory.Factory.Builder.class);
      }

      // Construct using gazebo.msgs.GzFactory.Factory.newBuilder()
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
          getPoseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        sdf_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        sdfFilename_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (poseBuilder_ == null) {
          pose_ = gazebo.msgs.GzPose.Pose.getDefaultInstance();
        } else {
          poseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        editName_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        cloneModelName_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzFactory.internal_static_gazebo_msgs_Factory_descriptor;
      }

      public gazebo.msgs.GzFactory.Factory getDefaultInstanceForType() {
        return gazebo.msgs.GzFactory.Factory.getDefaultInstance();
      }

      public gazebo.msgs.GzFactory.Factory build() {
        gazebo.msgs.GzFactory.Factory result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzFactory.Factory buildPartial() {
        gazebo.msgs.GzFactory.Factory result = new gazebo.msgs.GzFactory.Factory(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sdf_ = sdf_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.sdfFilename_ = sdfFilename_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (poseBuilder_ == null) {
          result.pose_ = pose_;
        } else {
          result.pose_ = poseBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.editName_ = editName_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.cloneModelName_ = cloneModelName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzFactory.Factory) {
          return mergeFrom((gazebo.msgs.GzFactory.Factory)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzFactory.Factory other) {
        if (other == gazebo.msgs.GzFactory.Factory.getDefaultInstance()) return this;
        if (other.hasSdf()) {
          bitField0_ |= 0x00000001;
          sdf_ = other.sdf_;
          onChanged();
        }
        if (other.hasSdfFilename()) {
          bitField0_ |= 0x00000002;
          sdfFilename_ = other.sdfFilename_;
          onChanged();
        }
        if (other.hasPose()) {
          mergePose(other.getPose());
        }
        if (other.hasEditName()) {
          bitField0_ |= 0x00000008;
          editName_ = other.editName_;
          onChanged();
        }
        if (other.hasCloneModelName()) {
          bitField0_ |= 0x00000010;
          cloneModelName_ = other.cloneModelName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasPose()) {
          if (!getPose().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzFactory.Factory parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzFactory.Factory) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string sdf = 1;
      private java.lang.Object sdf_ = "";
      /**
       * <code>optional string sdf = 1;</code>
       */
      public boolean hasSdf() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string sdf = 1;</code>
       */
      public java.lang.String getSdf() {
        java.lang.Object ref = sdf_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          sdf_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sdf = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSdfBytes() {
        java.lang.Object ref = sdf_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sdf_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sdf = 1;</code>
       */
      public Builder setSdf(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        sdf_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sdf = 1;</code>
       */
      public Builder clearSdf() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sdf_ = getDefaultInstance().getSdf();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sdf = 1;</code>
       */
      public Builder setSdfBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        sdf_ = value;
        onChanged();
        return this;
      }

      // optional string sdf_filename = 2;
      private java.lang.Object sdfFilename_ = "";
      /**
       * <code>optional string sdf_filename = 2;</code>
       */
      public boolean hasSdfFilename() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string sdf_filename = 2;</code>
       */
      public java.lang.String getSdfFilename() {
        java.lang.Object ref = sdfFilename_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          sdfFilename_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sdf_filename = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSdfFilenameBytes() {
        java.lang.Object ref = sdfFilename_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sdfFilename_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sdf_filename = 2;</code>
       */
      public Builder setSdfFilename(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        sdfFilename_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sdf_filename = 2;</code>
       */
      public Builder clearSdfFilename() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sdfFilename_ = getDefaultInstance().getSdfFilename();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sdf_filename = 2;</code>
       */
      public Builder setSdfFilenameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        sdfFilename_ = value;
        onChanged();
        return this;
      }

      // optional .gazebo.msgs.Pose pose = 3;
      private gazebo.msgs.GzPose.Pose pose_ = gazebo.msgs.GzPose.Pose.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzPose.Pose, gazebo.msgs.GzPose.Pose.Builder, gazebo.msgs.GzPose.PoseOrBuilder> poseBuilder_;
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      public boolean hasPose() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      public gazebo.msgs.GzPose.Pose getPose() {
        if (poseBuilder_ == null) {
          return pose_;
        } else {
          return poseBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      public Builder setPose(gazebo.msgs.GzPose.Pose value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pose_ = value;
          onChanged();
        } else {
          poseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      public Builder setPose(
          gazebo.msgs.GzPose.Pose.Builder builderForValue) {
        if (poseBuilder_ == null) {
          pose_ = builderForValue.build();
          onChanged();
        } else {
          poseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      public Builder mergePose(gazebo.msgs.GzPose.Pose value) {
        if (poseBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              pose_ != gazebo.msgs.GzPose.Pose.getDefaultInstance()) {
            pose_ =
              gazebo.msgs.GzPose.Pose.newBuilder(pose_).mergeFrom(value).buildPartial();
          } else {
            pose_ = value;
          }
          onChanged();
        } else {
          poseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      public Builder clearPose() {
        if (poseBuilder_ == null) {
          pose_ = gazebo.msgs.GzPose.Pose.getDefaultInstance();
          onChanged();
        } else {
          poseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      public gazebo.msgs.GzPose.Pose.Builder getPoseBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPoseFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      public gazebo.msgs.GzPose.PoseOrBuilder getPoseOrBuilder() {
        if (poseBuilder_ != null) {
          return poseBuilder_.getMessageOrBuilder();
        } else {
          return pose_;
        }
      }
      /**
       * <code>optional .gazebo.msgs.Pose pose = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzPose.Pose, gazebo.msgs.GzPose.Pose.Builder, gazebo.msgs.GzPose.PoseOrBuilder> 
          getPoseFieldBuilder() {
        if (poseBuilder_ == null) {
          poseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzPose.Pose, gazebo.msgs.GzPose.Pose.Builder, gazebo.msgs.GzPose.PoseOrBuilder>(
                  pose_,
                  getParentForChildren(),
                  isClean());
          pose_ = null;
        }
        return poseBuilder_;
      }

      // optional string edit_name = 4;
      private java.lang.Object editName_ = "";
      /**
       * <code>optional string edit_name = 4;</code>
       */
      public boolean hasEditName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string edit_name = 4;</code>
       */
      public java.lang.String getEditName() {
        java.lang.Object ref = editName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          editName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string edit_name = 4;</code>
       */
      public com.google.protobuf.ByteString
          getEditNameBytes() {
        java.lang.Object ref = editName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          editName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string edit_name = 4;</code>
       */
      public Builder setEditName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        editName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string edit_name = 4;</code>
       */
      public Builder clearEditName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        editName_ = getDefaultInstance().getEditName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string edit_name = 4;</code>
       */
      public Builder setEditNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        editName_ = value;
        onChanged();
        return this;
      }

      // optional string clone_model_name = 5;
      private java.lang.Object cloneModelName_ = "";
      /**
       * <code>optional string clone_model_name = 5;</code>
       */
      public boolean hasCloneModelName() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string clone_model_name = 5;</code>
       */
      public java.lang.String getCloneModelName() {
        java.lang.Object ref = cloneModelName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          cloneModelName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clone_model_name = 5;</code>
       */
      public com.google.protobuf.ByteString
          getCloneModelNameBytes() {
        java.lang.Object ref = cloneModelName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cloneModelName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clone_model_name = 5;</code>
       */
      public Builder setCloneModelName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        cloneModelName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clone_model_name = 5;</code>
       */
      public Builder clearCloneModelName() {
        bitField0_ = (bitField0_ & ~0x00000010);
        cloneModelName_ = getDefaultInstance().getCloneModelName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clone_model_name = 5;</code>
       */
      public Builder setCloneModelNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        cloneModelName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Factory)
    }

    static {
      defaultInstance = new Factory(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Factory)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Factory_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Factory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rfactory.proto\022\013gazebo.msgs\032\npose.proto" +
      "\"z\n\007Factory\022\013\n\003sdf\030\001 \001(\t\022\024\n\014sdf_filename" +
      "\030\002 \001(\t\022\037\n\004pose\030\003 \001(\0132\021.gazebo.msgs.Pose\022" +
      "\021\n\tedit_name\030\004 \001(\t\022\030\n\020clone_model_name\030\005" +
      " \001(\tB\013B\tGzFactory"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_Factory_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_Factory_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_Factory_descriptor,
              new java.lang.String[] { "Sdf", "SdfFilename", "Pose", "EditName", "CloneModelName", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzPose.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}