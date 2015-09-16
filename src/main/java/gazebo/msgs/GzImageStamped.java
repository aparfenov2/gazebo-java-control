// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_stamped.proto

package gazebo.msgs;

public final class GzImageStamped {
  private GzImageStamped() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ImageStampedOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .gazebo.msgs.Time time = 1;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    gazebo.msgs.GzTime.Time getTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    gazebo.msgs.GzTime.TimeOrBuilder getTimeOrBuilder();

    // required .gazebo.msgs.Image image = 2;
    /**
     * <code>required .gazebo.msgs.Image image = 2;</code>
     */
    boolean hasImage();
    /**
     * <code>required .gazebo.msgs.Image image = 2;</code>
     */
    gazebo.msgs.GzImage.Image getImage();
    /**
     * <code>required .gazebo.msgs.Image image = 2;</code>
     */
    gazebo.msgs.GzImage.ImageOrBuilder getImageOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.ImageStamped}
   */
  public static final class ImageStamped extends
      com.google.protobuf.GeneratedMessage
      implements ImageStampedOrBuilder {
    // Use ImageStamped.newBuilder() to construct.
    private ImageStamped(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ImageStamped(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ImageStamped defaultInstance;
    public static ImageStamped getDefaultInstance() {
      return defaultInstance;
    }

    public ImageStamped getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ImageStamped(
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
              gazebo.msgs.GzTime.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(gazebo.msgs.GzTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              gazebo.msgs.GzImage.Image.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = image_.toBuilder();
              }
              image_ = input.readMessage(gazebo.msgs.GzImage.Image.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(image_);
                image_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return gazebo.msgs.GzImageStamped.internal_static_gazebo_msgs_ImageStamped_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzImageStamped.internal_static_gazebo_msgs_ImageStamped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzImageStamped.ImageStamped.class, gazebo.msgs.GzImageStamped.ImageStamped.Builder.class);
    }

    public static com.google.protobuf.Parser<ImageStamped> PARSER =
        new com.google.protobuf.AbstractParser<ImageStamped>() {
      public ImageStamped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImageStamped(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ImageStamped> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .gazebo.msgs.Time time = 1;
    public static final int TIME_FIELD_NUMBER = 1;
    private gazebo.msgs.GzTime.Time time_;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public gazebo.msgs.GzTime.Time getTime() {
      return time_;
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public gazebo.msgs.GzTime.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    // required .gazebo.msgs.Image image = 2;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private gazebo.msgs.GzImage.Image image_;
    /**
     * <code>required .gazebo.msgs.Image image = 2;</code>
     */
    public boolean hasImage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .gazebo.msgs.Image image = 2;</code>
     */
    public gazebo.msgs.GzImage.Image getImage() {
      return image_;
    }
    /**
     * <code>required .gazebo.msgs.Image image = 2;</code>
     */
    public gazebo.msgs.GzImage.ImageOrBuilder getImageOrBuilder() {
      return image_;
    }

    private void initFields() {
      time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
      image_ = gazebo.msgs.GzImage.Image.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasImage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getImage().isInitialized()) {
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
        output.writeMessage(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, image_);
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
          .computeMessageSize(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, image_);
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

    public static gazebo.msgs.GzImageStamped.ImageStamped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzImageStamped.ImageStamped parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzImageStamped.ImageStamped prototype) {
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
     * Protobuf type {@code gazebo.msgs.ImageStamped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzImageStamped.ImageStampedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzImageStamped.internal_static_gazebo_msgs_ImageStamped_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzImageStamped.internal_static_gazebo_msgs_ImageStamped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzImageStamped.ImageStamped.class, gazebo.msgs.GzImageStamped.ImageStamped.Builder.class);
      }

      // Construct using gazebo.msgs.GzImageStamped.ImageStamped.newBuilder()
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
          getTimeFieldBuilder();
          getImageFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (imageBuilder_ == null) {
          image_ = gazebo.msgs.GzImage.Image.getDefaultInstance();
        } else {
          imageBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzImageStamped.internal_static_gazebo_msgs_ImageStamped_descriptor;
      }

      public gazebo.msgs.GzImageStamped.ImageStamped getDefaultInstanceForType() {
        return gazebo.msgs.GzImageStamped.ImageStamped.getDefaultInstance();
      }

      public gazebo.msgs.GzImageStamped.ImageStamped build() {
        gazebo.msgs.GzImageStamped.ImageStamped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzImageStamped.ImageStamped buildPartial() {
        gazebo.msgs.GzImageStamped.ImageStamped result = new gazebo.msgs.GzImageStamped.ImageStamped(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (imageBuilder_ == null) {
          result.image_ = image_;
        } else {
          result.image_ = imageBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzImageStamped.ImageStamped) {
          return mergeFrom((gazebo.msgs.GzImageStamped.ImageStamped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzImageStamped.ImageStamped other) {
        if (other == gazebo.msgs.GzImageStamped.ImageStamped.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasImage()) {
          mergeImage(other.getImage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!hasImage()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        if (!getImage().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzImageStamped.ImageStamped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzImageStamped.ImageStamped) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .gazebo.msgs.Time time = 1;
      private gazebo.msgs.GzTime.Time time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder> timeBuilder_;
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public gazebo.msgs.GzTime.Time getTime() {
        if (timeBuilder_ == null) {
          return time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder setTime(gazebo.msgs.GzTime.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder setTime(
          gazebo.msgs.GzTime.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder mergeTime(gazebo.msgs.GzTime.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              time_ != gazebo.msgs.GzTime.Time.getDefaultInstance()) {
            time_ =
              gazebo.msgs.GzTime.Time.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public gazebo.msgs.GzTime.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public gazebo.msgs.GzTime.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder> 
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder>(
                  time_,
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      // required .gazebo.msgs.Image image = 2;
      private gazebo.msgs.GzImage.Image image_ = gazebo.msgs.GzImage.Image.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzImage.Image, gazebo.msgs.GzImage.Image.Builder, gazebo.msgs.GzImage.ImageOrBuilder> imageBuilder_;
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      public boolean hasImage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      public gazebo.msgs.GzImage.Image getImage() {
        if (imageBuilder_ == null) {
          return image_;
        } else {
          return imageBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      public Builder setImage(gazebo.msgs.GzImage.Image value) {
        if (imageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          image_ = value;
          onChanged();
        } else {
          imageBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      public Builder setImage(
          gazebo.msgs.GzImage.Image.Builder builderForValue) {
        if (imageBuilder_ == null) {
          image_ = builderForValue.build();
          onChanged();
        } else {
          imageBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      public Builder mergeImage(gazebo.msgs.GzImage.Image value) {
        if (imageBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              image_ != gazebo.msgs.GzImage.Image.getDefaultInstance()) {
            image_ =
              gazebo.msgs.GzImage.Image.newBuilder(image_).mergeFrom(value).buildPartial();
          } else {
            image_ = value;
          }
          onChanged();
        } else {
          imageBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      public Builder clearImage() {
        if (imageBuilder_ == null) {
          image_ = gazebo.msgs.GzImage.Image.getDefaultInstance();
          onChanged();
        } else {
          imageBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      public gazebo.msgs.GzImage.Image.Builder getImageBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getImageFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      public gazebo.msgs.GzImage.ImageOrBuilder getImageOrBuilder() {
        if (imageBuilder_ != null) {
          return imageBuilder_.getMessageOrBuilder();
        } else {
          return image_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Image image = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzImage.Image, gazebo.msgs.GzImage.Image.Builder, gazebo.msgs.GzImage.ImageOrBuilder> 
          getImageFieldBuilder() {
        if (imageBuilder_ == null) {
          imageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzImage.Image, gazebo.msgs.GzImage.Image.Builder, gazebo.msgs.GzImage.ImageOrBuilder>(
                  image_,
                  getParentForChildren(),
                  isClean());
          image_ = null;
        }
        return imageBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.ImageStamped)
    }

    static {
      defaultInstance = new ImageStamped(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.ImageStamped)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_ImageStamped_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_ImageStamped_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023image_stamped.proto\022\013gazebo.msgs\032\ntime" +
      ".proto\032\013image.proto\"R\n\014ImageStamped\022\037\n\004t" +
      "ime\030\001 \002(\0132\021.gazebo.msgs.Time\022!\n\005image\030\002 " +
      "\002(\0132\022.gazebo.msgs.ImageB\020B\016GzImageStampe" +
      "d"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_ImageStamped_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_ImageStamped_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_ImageStamped_descriptor,
              new java.lang.String[] { "Time", "Image", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzTime.getDescriptor(),
          gazebo.msgs.GzImage.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}