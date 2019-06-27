// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.pubsub.v1.pubsub

/** Request for the UpdateSnapshot method.
  *
  * @param snapshot
  *   The updated snpashot object.
  * @param updateMask
  *   Indicates which fields in the provided snapshot to update.
  *   Must be specified and non-empty.
  */
@SerialVersionUID(0L)
final case class UpdateSnapshotRequest(
    snapshot: _root_.scala.Option[com.google.pubsub.v1.pubsub.Snapshot] = None,
    updateMask: _root_.scala.Option[com.google.protobuf.field_mask.FieldMask] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[UpdateSnapshotRequest] with scalapb.lenses.Updatable[UpdateSnapshotRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (snapshot.isDefined) {
        val __value = snapshot.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (updateMask.isDefined) {
        val __value = updateMask.get
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
      snapshot.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      updateMask.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.pubsub.v1.pubsub.UpdateSnapshotRequest = {
      var __snapshot = this.snapshot
      var __updateMask = this.updateMask
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __snapshot = Option(_root_.scalapb.LiteParser.readMessage(_input__, __snapshot.getOrElse(com.google.pubsub.v1.pubsub.Snapshot.defaultInstance)))
          case 18 =>
            __updateMask = Option(_root_.scalapb.LiteParser.readMessage(_input__, __updateMask.getOrElse(com.google.protobuf.field_mask.FieldMask.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.pubsub.v1.pubsub.UpdateSnapshotRequest(
          snapshot = __snapshot,
          updateMask = __updateMask
      )
    }
    def getSnapshot: com.google.pubsub.v1.pubsub.Snapshot = snapshot.getOrElse(com.google.pubsub.v1.pubsub.Snapshot.defaultInstance)
    def clearSnapshot: UpdateSnapshotRequest = copy(snapshot = None)
    def withSnapshot(__v: com.google.pubsub.v1.pubsub.Snapshot): UpdateSnapshotRequest = copy(snapshot = Option(__v))
    def getUpdateMask: com.google.protobuf.field_mask.FieldMask = updateMask.getOrElse(com.google.protobuf.field_mask.FieldMask.defaultInstance)
    def clearUpdateMask: UpdateSnapshotRequest = copy(updateMask = None)
    def withUpdateMask(__v: com.google.protobuf.field_mask.FieldMask): UpdateSnapshotRequest = copy(updateMask = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => snapshot.orNull
        case 2 => updateMask.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => snapshot.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => updateMask.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.pubsub.v1.pubsub.UpdateSnapshotRequest
}

object UpdateSnapshotRequest extends scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.UpdateSnapshotRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.UpdateSnapshotRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.pubsub.v1.pubsub.UpdateSnapshotRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.pubsub.v1.pubsub.UpdateSnapshotRequest(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.google.pubsub.v1.pubsub.Snapshot]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.protobuf.field_mask.FieldMask]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.pubsub.v1.pubsub.UpdateSnapshotRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.pubsub.v1.pubsub.UpdateSnapshotRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.google.pubsub.v1.pubsub.Snapshot]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.field_mask.FieldMask]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PubsubProto.javaDescriptor.getMessageTypes.get(27)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PubsubProto.scalaDescriptor.messages(27)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.pubsub.v1.pubsub.Snapshot
      case 2 => __out = com.google.protobuf.field_mask.FieldMask
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.pubsub.v1.pubsub.UpdateSnapshotRequest(
  )
  implicit class UpdateSnapshotRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.UpdateSnapshotRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.pubsub.v1.pubsub.UpdateSnapshotRequest](_l) {
    def snapshot: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.Snapshot] = field(_.getSnapshot)((c_, f_) => c_.copy(snapshot = Option(f_)))
    def optionalSnapshot: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.pubsub.v1.pubsub.Snapshot]] = field(_.snapshot)((c_, f_) => c_.copy(snapshot = f_))
    def updateMask: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.field_mask.FieldMask] = field(_.getUpdateMask)((c_, f_) => c_.copy(updateMask = Option(f_)))
    def optionalUpdateMask: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.field_mask.FieldMask]] = field(_.updateMask)((c_, f_) => c_.copy(updateMask = f_))
  }
  final val SNAPSHOT_FIELD_NUMBER = 1
  final val UPDATE_MASK_FIELD_NUMBER = 2
  def of(
    snapshot: _root_.scala.Option[com.google.pubsub.v1.pubsub.Snapshot],
    updateMask: _root_.scala.Option[com.google.protobuf.field_mask.FieldMask]
  ): _root_.com.google.pubsub.v1.pubsub.UpdateSnapshotRequest = _root_.com.google.pubsub.v1.pubsub.UpdateSnapshotRequest(
    snapshot,
    updateMask
  )
}
