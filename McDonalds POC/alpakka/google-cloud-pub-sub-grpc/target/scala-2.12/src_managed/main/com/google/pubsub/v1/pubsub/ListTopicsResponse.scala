// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.pubsub.v1.pubsub

/** Response for the `ListTopics` method.
  *
  * @param topics
  *   The resulting topics.
  * @param nextPageToken
  *   If not empty, indicates that there may be more topics that match the
  *   request; this value should be passed in a new `ListTopicsRequest`.
  */
@SerialVersionUID(0L)
final case class ListTopicsResponse(
    topics: _root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Topic] = _root_.scala.collection.Seq.empty,
    nextPageToken: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[ListTopicsResponse] with scalapb.lenses.Updatable[ListTopicsResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      topics.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = nextPageToken
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
      topics.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = nextPageToken
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.pubsub.v1.pubsub.ListTopicsResponse = {
      val __topics = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.pubsub.v1.pubsub.Topic] ++= this.topics)
      var __nextPageToken = this.nextPageToken
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __topics += _root_.scalapb.LiteParser.readMessage(_input__, com.google.pubsub.v1.pubsub.Topic.defaultInstance)
          case 18 =>
            __nextPageToken = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.pubsub.v1.pubsub.ListTopicsResponse(
          topics = __topics.result(),
          nextPageToken = __nextPageToken
      )
    }
    def clearTopics = copy(topics = _root_.scala.collection.Seq.empty)
    def addTopics(__vs: com.google.pubsub.v1.pubsub.Topic*): ListTopicsResponse = addAllTopics(__vs)
    def addAllTopics(__vs: TraversableOnce[com.google.pubsub.v1.pubsub.Topic]): ListTopicsResponse = copy(topics = topics ++ __vs)
    def withTopics(__v: _root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Topic]): ListTopicsResponse = copy(topics = __v)
    def withNextPageToken(__v: _root_.scala.Predef.String): ListTopicsResponse = copy(nextPageToken = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => topics
        case 2 => {
          val __t = nextPageToken
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(topics.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 2 => _root_.scalapb.descriptors.PString(nextPageToken)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.pubsub.v1.pubsub.ListTopicsResponse
}

object ListTopicsResponse extends scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.ListTopicsResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.ListTopicsResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.pubsub.v1.pubsub.ListTopicsResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.pubsub.v1.pubsub.ListTopicsResponse(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Topic]],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.pubsub.v1.pubsub.ListTopicsResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.pubsub.v1.pubsub.ListTopicsResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Topic]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PubsubProto.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PubsubProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.pubsub.v1.pubsub.Topic
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.pubsub.v1.pubsub.ListTopicsResponse(
  )
  implicit class ListTopicsResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.ListTopicsResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.pubsub.v1.pubsub.ListTopicsResponse](_l) {
    def topics: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Topic]] = field(_.topics)((c_, f_) => c_.copy(topics = f_))
    def nextPageToken: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.nextPageToken)((c_, f_) => c_.copy(nextPageToken = f_))
  }
  final val TOPICS_FIELD_NUMBER = 1
  final val NEXT_PAGE_TOKEN_FIELD_NUMBER = 2
  def of(
    topics: _root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Topic],
    nextPageToken: _root_.scala.Predef.String
  ): _root_.com.google.pubsub.v1.pubsub.ListTopicsResponse = _root_.com.google.pubsub.v1.pubsub.ListTopicsResponse(
    topics,
    nextPageToken
  )
}
