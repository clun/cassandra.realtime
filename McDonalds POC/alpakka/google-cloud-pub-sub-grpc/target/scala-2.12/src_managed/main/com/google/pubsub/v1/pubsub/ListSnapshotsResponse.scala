// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.pubsub.v1.pubsub

/** Response for the `ListSnapshots` method.
  *
  * @param snapshots
  *   The resulting snapshots.
  * @param nextPageToken
  *   If not empty, indicates that there may be more snapshot that match the
  *   request; this value should be passed in a new `ListSnapshotsRequest`.
  */
@SerialVersionUID(0L)
final case class ListSnapshotsResponse(
    snapshots: _root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Snapshot] = _root_.scala.collection.Seq.empty,
    nextPageToken: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[ListSnapshotsResponse] with scalapb.lenses.Updatable[ListSnapshotsResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      snapshots.foreach { __item =>
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
      snapshots.foreach { __v =>
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
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.pubsub.v1.pubsub.ListSnapshotsResponse = {
      val __snapshots = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.pubsub.v1.pubsub.Snapshot] ++= this.snapshots)
      var __nextPageToken = this.nextPageToken
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __snapshots += _root_.scalapb.LiteParser.readMessage(_input__, com.google.pubsub.v1.pubsub.Snapshot.defaultInstance)
          case 18 =>
            __nextPageToken = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.pubsub.v1.pubsub.ListSnapshotsResponse(
          snapshots = __snapshots.result(),
          nextPageToken = __nextPageToken
      )
    }
    def clearSnapshots = copy(snapshots = _root_.scala.collection.Seq.empty)
    def addSnapshots(__vs: com.google.pubsub.v1.pubsub.Snapshot*): ListSnapshotsResponse = addAllSnapshots(__vs)
    def addAllSnapshots(__vs: TraversableOnce[com.google.pubsub.v1.pubsub.Snapshot]): ListSnapshotsResponse = copy(snapshots = snapshots ++ __vs)
    def withSnapshots(__v: _root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Snapshot]): ListSnapshotsResponse = copy(snapshots = __v)
    def withNextPageToken(__v: _root_.scala.Predef.String): ListSnapshotsResponse = copy(nextPageToken = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => snapshots
        case 2 => {
          val __t = nextPageToken
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(snapshots.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 2 => _root_.scalapb.descriptors.PString(nextPageToken)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.pubsub.v1.pubsub.ListSnapshotsResponse
}

object ListSnapshotsResponse extends scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.ListSnapshotsResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.ListSnapshotsResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.pubsub.v1.pubsub.ListSnapshotsResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.pubsub.v1.pubsub.ListSnapshotsResponse(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Snapshot]],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.pubsub.v1.pubsub.ListSnapshotsResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.pubsub.v1.pubsub.ListSnapshotsResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Snapshot]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PubsubProto.javaDescriptor.getMessageTypes.get(30)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PubsubProto.scalaDescriptor.messages(30)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.pubsub.v1.pubsub.Snapshot
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.pubsub.v1.pubsub.ListSnapshotsResponse(
  )
  implicit class ListSnapshotsResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.ListSnapshotsResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.pubsub.v1.pubsub.ListSnapshotsResponse](_l) {
    def snapshots: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Snapshot]] = field(_.snapshots)((c_, f_) => c_.copy(snapshots = f_))
    def nextPageToken: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.nextPageToken)((c_, f_) => c_.copy(nextPageToken = f_))
  }
  final val SNAPSHOTS_FIELD_NUMBER = 1
  final val NEXT_PAGE_TOKEN_FIELD_NUMBER = 2
  def of(
    snapshots: _root_.scala.collection.Seq[com.google.pubsub.v1.pubsub.Snapshot],
    nextPageToken: _root_.scala.Predef.String
  ): _root_.com.google.pubsub.v1.pubsub.ListSnapshotsResponse = _root_.com.google.pubsub.v1.pubsub.ListSnapshotsResponse(
    snapshots,
    nextPageToken
  )
}
