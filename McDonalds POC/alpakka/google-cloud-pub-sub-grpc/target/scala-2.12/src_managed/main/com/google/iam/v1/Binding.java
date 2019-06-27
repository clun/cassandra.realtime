// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/policy.proto

package com.google.iam.v1;

/**
 * <pre>
 * Associates `members` with a `role`.
 * </pre>
 *
 * Protobuf type {@code google.iam.v1.Binding}
 */
public  final class Binding extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.v1.Binding)
    BindingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Binding.newBuilder() to construct.
  private Binding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Binding() {
    role_ = "";
    members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Binding(
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
            java.lang.String s = input.readStringRequireUtf8();

            role_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              members_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            members_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        members_ = members_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Binding_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Binding_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v1.Binding.class, com.google.iam.v1.Binding.Builder.class);
  }

  private int bitField0_;
  public static final int ROLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object role_;
  /**
   * <pre>
   * Role that is assigned to `members`.
   * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
   * Required
   * </pre>
   *
   * <code>string role = 1;</code>
   */
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      role_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Role that is assigned to `members`.
   * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
   * Required
   * </pre>
   *
   * <code>string role = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      role_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEMBERS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList members_;
  /**
   * <pre>
   * Specifies the identities requesting access for a Cloud Platform resource.
   * `members` can have the following values:
   * * `allUsers`: A special identifier that represents anyone who is
   *    on the internet; with or without a Google account.
   * * `allAuthenticatedUsers`: A special identifier that represents anyone
   *    who is authenticated with a Google account or a service account.
   * * `user:{emailid}`: An email address that represents a specific Google
   *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
   * * `serviceAccount:{emailid}`: An email address that represents a service
   *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
   * * `group:{emailid}`: An email address that represents a Google group.
   *    For example, `admins&#64;example.com`.
   * * `domain:{domain}`: A Google Apps domain name that represents all the
   *    users of that domain. For example, `google.com` or `example.com`.
   * </pre>
   *
   * <code>repeated string members = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMembersList() {
    return members_;
  }
  /**
   * <pre>
   * Specifies the identities requesting access for a Cloud Platform resource.
   * `members` can have the following values:
   * * `allUsers`: A special identifier that represents anyone who is
   *    on the internet; with or without a Google account.
   * * `allAuthenticatedUsers`: A special identifier that represents anyone
   *    who is authenticated with a Google account or a service account.
   * * `user:{emailid}`: An email address that represents a specific Google
   *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
   * * `serviceAccount:{emailid}`: An email address that represents a service
   *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
   * * `group:{emailid}`: An email address that represents a Google group.
   *    For example, `admins&#64;example.com`.
   * * `domain:{domain}`: A Google Apps domain name that represents all the
   *    users of that domain. For example, `google.com` or `example.com`.
   * </pre>
   *
   * <code>repeated string members = 2;</code>
   */
  public int getMembersCount() {
    return members_.size();
  }
  /**
   * <pre>
   * Specifies the identities requesting access for a Cloud Platform resource.
   * `members` can have the following values:
   * * `allUsers`: A special identifier that represents anyone who is
   *    on the internet; with or without a Google account.
   * * `allAuthenticatedUsers`: A special identifier that represents anyone
   *    who is authenticated with a Google account or a service account.
   * * `user:{emailid}`: An email address that represents a specific Google
   *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
   * * `serviceAccount:{emailid}`: An email address that represents a service
   *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
   * * `group:{emailid}`: An email address that represents a Google group.
   *    For example, `admins&#64;example.com`.
   * * `domain:{domain}`: A Google Apps domain name that represents all the
   *    users of that domain. For example, `google.com` or `example.com`.
   * </pre>
   *
   * <code>repeated string members = 2;</code>
   */
  public java.lang.String getMembers(int index) {
    return members_.get(index);
  }
  /**
   * <pre>
   * Specifies the identities requesting access for a Cloud Platform resource.
   * `members` can have the following values:
   * * `allUsers`: A special identifier that represents anyone who is
   *    on the internet; with or without a Google account.
   * * `allAuthenticatedUsers`: A special identifier that represents anyone
   *    who is authenticated with a Google account or a service account.
   * * `user:{emailid}`: An email address that represents a specific Google
   *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
   * * `serviceAccount:{emailid}`: An email address that represents a service
   *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
   * * `group:{emailid}`: An email address that represents a Google group.
   *    For example, `admins&#64;example.com`.
   * * `domain:{domain}`: A Google Apps domain name that represents all the
   *    users of that domain. For example, `google.com` or `example.com`.
   * </pre>
   *
   * <code>repeated string members = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMembersBytes(int index) {
    return members_.getByteString(index);
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
    if (!getRoleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, role_);
    }
    for (int i = 0; i < members_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, members_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRoleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, role_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < members_.size(); i++) {
        dataSize += computeStringSizeNoTag(members_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMembersList().size();
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
    if (!(obj instanceof com.google.iam.v1.Binding)) {
      return super.equals(obj);
    }
    com.google.iam.v1.Binding other = (com.google.iam.v1.Binding) obj;

    boolean result = true;
    result = result && getRole()
        .equals(other.getRole());
    result = result && getMembersList()
        .equals(other.getMembersList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getRole().hashCode();
    if (getMembersCount() > 0) {
      hash = (37 * hash) + MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getMembersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v1.Binding parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.Binding parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.Binding parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.Binding parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.Binding parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.Binding parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.Binding parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.Binding parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.v1.Binding parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.Binding parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.v1.Binding parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.Binding parseFrom(
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
  public static Builder newBuilder(com.google.iam.v1.Binding prototype) {
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
   * <pre>
   * Associates `members` with a `role`.
   * </pre>
   *
   * Protobuf type {@code google.iam.v1.Binding}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.v1.Binding)
      com.google.iam.v1.BindingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Binding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Binding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v1.Binding.class, com.google.iam.v1.Binding.Builder.class);
    }

    // Construct using com.google.iam.v1.Binding.newBuilder()
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
      role_ = "";

      members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Binding_descriptor;
    }

    @java.lang.Override
    public com.google.iam.v1.Binding getDefaultInstanceForType() {
      return com.google.iam.v1.Binding.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.v1.Binding build() {
      com.google.iam.v1.Binding result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.v1.Binding buildPartial() {
      com.google.iam.v1.Binding result = new com.google.iam.v1.Binding(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.role_ = role_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        members_ = members_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.members_ = members_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.iam.v1.Binding) {
        return mergeFrom((com.google.iam.v1.Binding)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v1.Binding other) {
      if (other == com.google.iam.v1.Binding.getDefaultInstance()) return this;
      if (!other.getRole().isEmpty()) {
        role_ = other.role_;
        onChanged();
      }
      if (!other.members_.isEmpty()) {
        if (members_.isEmpty()) {
          members_ = other.members_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureMembersIsMutable();
          members_.addAll(other.members_);
        }
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
      com.google.iam.v1.Binding parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.v1.Binding) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object role_ = "";
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 1;</code>
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 1;</code>
     */
    public Builder setRole(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 1;</code>
     */
    public Builder clearRole() {
      
      role_ = getDefaultInstance().getRole();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Role that is assigned to `members`.
     * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * Required
     * </pre>
     *
     * <code>string role = 1;</code>
     */
    public Builder setRoleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      role_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMembersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        members_ = new com.google.protobuf.LazyStringArrayList(members_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMembersList() {
      return members_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public int getMembersCount() {
      return members_.size();
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public java.lang.String getMembers(int index) {
      return members_.get(index);
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMembersBytes(int index) {
      return members_.getByteString(index);
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public Builder setMembers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMembersIsMutable();
      members_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public Builder addMembers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMembersIsMutable();
      members_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public Builder addAllMembers(
        java.lang.Iterable<java.lang.String> values) {
      ensureMembersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, members_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public Builder clearMembers() {
      members_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the identities requesting access for a Cloud Platform resource.
     * `members` can have the following values:
     * * `allUsers`: A special identifier that represents anyone who is
     *    on the internet; with or without a Google account.
     * * `allAuthenticatedUsers`: A special identifier that represents anyone
     *    who is authenticated with a Google account or a service account.
     * * `user:{emailid}`: An email address that represents a specific Google
     *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
     * * `serviceAccount:{emailid}`: An email address that represents a service
     *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
     * * `group:{emailid}`: An email address that represents a Google group.
     *    For example, `admins&#64;example.com`.
     * * `domain:{domain}`: A Google Apps domain name that represents all the
     *    users of that domain. For example, `google.com` or `example.com`.
     * </pre>
     *
     * <code>repeated string members = 2;</code>
     */
    public Builder addMembersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMembersIsMutable();
      members_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.iam.v1.Binding)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v1.Binding)
  private static final com.google.iam.v1.Binding DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.v1.Binding();
  }

  public static com.google.iam.v1.Binding getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Binding>
      PARSER = new com.google.protobuf.AbstractParser<Binding>() {
    @java.lang.Override
    public Binding parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Binding(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Binding> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Binding> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.v1.Binding getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

