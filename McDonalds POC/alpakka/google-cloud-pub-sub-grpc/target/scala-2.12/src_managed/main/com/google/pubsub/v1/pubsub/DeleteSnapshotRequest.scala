// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.pubsub.v1.pubsub

/** Request for the `DeleteSnapshot` method.
  *
  * @param snapshot
  *   The name of the snapshot to delete.
  *   Format is `projects/{project}/snapshots/{snap}`.
  */
@SerialVersionUID(0L)
final case class DeleteSnapshotRequest(
    snapshot: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[DeleteSnapshotRequest] with scalapb.lenses.Updatable[DeleteSnapshotRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = snapshot
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
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
        val __v = snapshot
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.pubsub.v1.pubsub.DeleteSnapshotRequest = {
      var __snapshot = this.snapshot
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __snapshot = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.pubsub.v1.pubsub.DeleteSnapshotRequest(
          snapshot = __snapshot
      )
    }
    def withSnapshot(__v: _root_.scala.Predef.String): DeleteSnapshotRequest = copy(snapshot = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = snapshot
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(snapshot)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.pubsub.v1.pubsub.DeleteSnapshotRequest
}

object DeleteSnapshotRequest extends scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.DeleteSnapshotRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.pubsub.v1.pubsub.DeleteSnapshotRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.pubsub.v1.pubsub.DeleteSnapshotRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.pubsub.v1.pubsub.DeleteSnapshotRequest(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.pubsub.v1.pubsub.DeleteSnapshotRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.pubsub.v1.pubsub.DeleteSnapshotRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PubsubProto.javaDescriptor.getMessageTypes.get(31)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PubsubProto.scalaDescriptor.messages(31)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.pubsub.v1.pubsub.DeleteSnapshotRequest(
  )
  implicit class DeleteSnapshotRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.pubsub.v1.pubsub.DeleteSnapshotRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.pubsub.v1.pubsub.DeleteSnapshotRequest](_l) {
    def snapshot: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.snapshot)((c_, f_) => c_.copy(snapshot = f_))
  }
  final val SNAPSHOT_FIELD_NUMBER = 1
  def of(
    snapshot: _root_.scala.Predef.String
  ): _root_.com.google.pubsub.v1.pubsub.DeleteSnapshotRequest = _root_.com.google.pubsub.v1.pubsub.DeleteSnapshotRequest(
    snapshot
  )
}
