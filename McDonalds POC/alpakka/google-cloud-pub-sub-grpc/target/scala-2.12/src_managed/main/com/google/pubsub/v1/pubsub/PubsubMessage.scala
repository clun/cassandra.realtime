// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.pubsub.v1.pubsub

/** A message data and its attributes. The message payload must not be empty;
  * it must contain either a non-empty data field, or at least one attribute.
  *
  * @param data
  *   The message payload.
  * @param attributes
  *   Optional attributes for this message.
  * @param messageId
  *   ID of this message, assigned by the server when the message is published.
  *   Guaranteed to be unique within the topic. This value may be read by a
  *   subscriber that receives a `PubsubMessage` via a `Pull` call or a push
  *   delivery. It must not be populated by the publisher in a `Publish` call.
  * @param publishTime
  *   The time at which the message was published, populated by the server when
  *   it receives the `Publish` call. It must not be populated by the
  *   publisher in a `Publish` call.
  */
@SerialVersionUID(0L)
final case class PubsubMessage(
    data: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    attributes: scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String] = scala.collection.immutable.Map.empty,
    messageId: _root_.scala.Predef.String = "",
    publishTime: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[PubsubMessage] with scalapb.lenses.Updatable[PubsubMessage] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = data
        if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(1, __value)
        }
      };
      attributes.foreach { __item =>
        val __value = com.google.pubsub.v1.pubsub.PubsubMessage._typemapper_attributes.toBase(__item)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = messageId
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      if (publishTime.isDefined) {
        val __value = publishTime.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = data
        if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(1, __v)
        }
      };
      attributes.foreach { __v =>
        val __m = com.google.pubsub.v1.pubsub.PubsubMessage._typemapper_attributes.toBase(__v)
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = messageId
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      publishTime.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.pubsub.v1.pubsub.PubsubMessage = {
      var __data = this.data
      val __attributes = (scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Predef.String] ++= this.attributes)
      var __messageId = this.messageId
      var __publishTime = this.publishTime
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __data = _input__.readBytes()
          case 18 =>
            __attributes += com.google.pubsub.v1.pubsub.PubsubMessage._typemapper_attributes.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry.defaultInstance))
          case 26 =>
            __messageId = _input__.readString()
          case 34 =>
            __publishTime = Option(_root_.scalapb.LiteParser.readMessage(_input__, __publishTime.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.pubsub.v1.pubsub.PubsubMessage(
          data = __data,
          attributes = __attributes.result(),
          messageId = __messageId,
          publishTime = __publishTime
      )
    }
    def withData(__v: _root_.com.google.protobuf.ByteString): PubsubMessage = copy(data = __v)
    def clearAttributes = copy(attributes = scala.collection.immutable.Map.empty)
    def addAttributes(__vs: (_root_.scala.Predef.String, _root_.scala.Predef.String)*): PubsubMessage = addAllAttributes(__vs)
    def addAllAttributes(__vs: TraversableOnce[(_root_.scala.Predef.String, _root_.scala.Predef.String)]): PubsubMessage = copy(attributes = attributes ++ __vs)
    def withAttributes(__v: scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]): PubsubMessage = copy(attributes = __v)
    def withMessageId(__v: _root_.scala.Predef.String): PubsubMessage = copy(messageId = __v)
    def getPublishTime: com.google.protobuf.timestamp.Timestamp = publishTime.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)
    def clearPublishTime: PubsubMessage = copy(publishTime = None)
    def withPublishTime(__v: com.google.protobuf.timestamp.Timestamp): PubsubMessage = copy(publishTime = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = data
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 2 => attributes.map(com.google.pubsub.v1.pubsub.PubsubMessage._typemapper_attributes.toBase)(_root_.scala.collection.breakOut)
        case 3 => {
          val __t = messageId
          if (__t != "") __t else null
        }
        case 4 => publishTime.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PByteString(data)
        case 2 => _root_.scalapb.descriptors.PRepeated(attributes.map(com.google.pubsub.v1.pubsub.PubsubMessage._typemapper_attributes.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
        case 3 => _root_.scalapb.descriptors.PString(messageId)
        case 4 => publishTime.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.pubsub.v1.pubsub.PubsubMessage
}

object PubsubMessage extends scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.PubsubMessage] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.PubsubMessage] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.pubsub.v1.pubsub.PubsubMessage = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.pubsub.v1.pubsub.PubsubMessage(
      __fieldsMap.getOrElse(__fields.get(0), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry]].map(com.google.pubsub.v1.pubsub.PubsubMessage._typemapper_attributes.toCustom)(_root_.scala.collection.breakOut),
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.pubsub.v1.pubsub.PubsubMessage] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.pubsub.v1.pubsub.PubsubMessage(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(com.google.pubsub.v1.pubsub.PubsubMessage._typemapper_attributes.toCustom)(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PubsubProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PubsubProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry
      case 4 => __out = com.google.protobuf.timestamp.Timestamp
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.pubsub.v1.pubsub.PubsubMessage(
  )
  @SerialVersionUID(0L)
  final case class AttributesEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Predef.String = ""
      ) extends scalapb.GeneratedMessage with scalapb.Message[AttributesEntry] with scalapb.lenses.Updatable[AttributesEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        
        {
          val __value = value
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
          }
        };
        __size
      }
      final override def serializedSize: _root_.scala.Int = {
        var read = __serializedSizeCachedValue
        if (read == 0) {
          read = __computeSerializedValue()
          __serializedSizeCachedValue = read
        }
        read
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        {
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = value
          if (__v != "") {
            _output__.writeString(2, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = _input__.readString()
            case tag => _input__.skipField(tag)
          }
        }
        com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): AttributesEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Predef.String): AttributesEntry = copy(value = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = value
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => _root_.scalapb.descriptors.PString(value)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry
  }
  
  object AttributesEntry extends scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.pubsub.v1.pubsub.PubsubMessage.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.pubsub.v1.pubsub.PubsubMessage.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry(
    )
    implicit class AttributesEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] =
      _root_.scalapb.TypeMapper[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)](__m => (__m.key, __m.value))(__p => com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry(__p._1, __p._2))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Predef.String
    ): _root_.com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry = _root_.com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry(
      key,
      value
    )
  }
  
  implicit class PubsubMessageLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.PubsubMessage]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.pubsub.v1.pubsub.PubsubMessage](_l) {
    def data: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.data)((c_, f_) => c_.copy(data = f_))
    def attributes: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]] = field(_.attributes)((c_, f_) => c_.copy(attributes = f_))
    def messageId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.messageId)((c_, f_) => c_.copy(messageId = f_))
    def publishTime: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp] = field(_.getPublishTime)((c_, f_) => c_.copy(publishTime = Option(f_)))
    def optionalPublishTime: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]] = field(_.publishTime)((c_, f_) => c_.copy(publishTime = f_))
  }
  final val DATA_FIELD_NUMBER = 1
  final val ATTRIBUTES_FIELD_NUMBER = 2
  final val MESSAGE_ID_FIELD_NUMBER = 3
  final val PUBLISH_TIME_FIELD_NUMBER = 4
  @transient
  private val _typemapper_attributes: _root_.scalapb.TypeMapper[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] = implicitly[_root_.scalapb.TypeMapper[com.google.pubsub.v1.pubsub.PubsubMessage.AttributesEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)]]
  def of(
    data: _root_.com.google.protobuf.ByteString,
    attributes: scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String],
    messageId: _root_.scala.Predef.String,
    publishTime: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]
  ): _root_.com.google.pubsub.v1.pubsub.PubsubMessage = _root_.com.google.pubsub.v1.pubsub.PubsubMessage(
    data,
    attributes,
    messageId,
    publishTime
  )
}
