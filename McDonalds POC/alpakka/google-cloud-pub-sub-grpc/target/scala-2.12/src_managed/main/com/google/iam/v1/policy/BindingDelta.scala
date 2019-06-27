// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.iam.v1.policy

/** One delta entry for Binding. Each individual change (only one member in each
  * entry) to a binding will be a separate entry.
  *
  * @param action
  *   The action that was performed on a Binding.
  *   Required
  * @param role
  *   Role that is assigned to `members`.
  *   For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
  *   Required
  * @param member
  *   A single identity requesting access for a Cloud Platform resource.
  *   Follows the same format of Binding.members.
  *   Required
  */
@SerialVersionUID(0L)
final case class BindingDelta(
    action: com.google.iam.v1.policy.BindingDelta.Action = com.google.iam.v1.policy.BindingDelta.Action.ACTION_UNSPECIFIED,
    role: _root_.scala.Predef.String = "",
    member: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[BindingDelta] with scalapb.lenses.Updatable[BindingDelta] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = action
        if (__value != com.google.iam.v1.policy.BindingDelta.Action.ACTION_UNSPECIFIED) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value.value)
        }
      };
      
      {
        val __value = role
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = member
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
        val __v = action
        if (__v != com.google.iam.v1.policy.BindingDelta.Action.ACTION_UNSPECIFIED) {
          _output__.writeEnum(1, __v.value)
        }
      };
      {
        val __v = role
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = member
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.iam.v1.policy.BindingDelta = {
      var __action = this.action
      var __role = this.role
      var __member = this.member
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __action = com.google.iam.v1.policy.BindingDelta.Action.fromValue(_input__.readEnum())
          case 18 =>
            __role = _input__.readString()
          case 26 =>
            __member = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.iam.v1.policy.BindingDelta(
          action = __action,
          role = __role,
          member = __member
      )
    }
    def withAction(__v: com.google.iam.v1.policy.BindingDelta.Action): BindingDelta = copy(action = __v)
    def withRole(__v: _root_.scala.Predef.String): BindingDelta = copy(role = __v)
    def withMember(__v: _root_.scala.Predef.String): BindingDelta = copy(member = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = action.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 2 => {
          val __t = role
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = member
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(action.scalaValueDescriptor)
        case 2 => _root_.scalapb.descriptors.PString(role)
        case 3 => _root_.scalapb.descriptors.PString(member)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.iam.v1.policy.BindingDelta
}

object BindingDelta extends scalapb.GeneratedMessageCompanion[com.google.iam.v1.policy.BindingDelta] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.iam.v1.policy.BindingDelta] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.iam.v1.policy.BindingDelta = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.iam.v1.policy.BindingDelta(
      com.google.iam.v1.policy.BindingDelta.Action.fromValue(__fieldsMap.getOrElse(__fields.get(0), com.google.iam.v1.policy.BindingDelta.Action.ACTION_UNSPECIFIED.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.iam.v1.policy.BindingDelta] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.iam.v1.policy.BindingDelta(
        com.google.iam.v1.policy.BindingDelta.Action.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.iam.v1.policy.BindingDelta.Action.ACTION_UNSPECIFIED.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PolicyProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PolicyProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.google.iam.v1.policy.BindingDelta.Action
    }
  }
  lazy val defaultInstance = com.google.iam.v1.policy.BindingDelta(
  )
  sealed trait Action extends _root_.scalapb.GeneratedEnum {
    type EnumType = Action
    def isActionUnspecified: _root_.scala.Boolean = false
    def isAdd: _root_.scala.Boolean = false
    def isRemove: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Action] = com.google.iam.v1.policy.BindingDelta.Action
  }
  
  object Action extends _root_.scalapb.GeneratedEnumCompanion[Action] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Action] = this
    @SerialVersionUID(0L)
    case object ACTION_UNSPECIFIED extends Action {
      val value = 0
      val index = 0
      val name = "ACTION_UNSPECIFIED"
      override def isActionUnspecified: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object ADD extends Action {
      val value = 1
      val index = 1
      val name = "ADD"
      override def isAdd: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object REMOVE extends Action {
      val value = 2
      val index = 2
      val name = "REMOVE"
      override def isRemove: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Action with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(ACTION_UNSPECIFIED, ADD, REMOVE)
    def fromValue(value: _root_.scala.Int): Action = value match {
      case 0 => ACTION_UNSPECIFIED
      case 1 => ADD
      case 2 => REMOVE
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.iam.v1.policy.BindingDelta.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.iam.v1.policy.BindingDelta.scalaDescriptor.enums(0)
  }
  implicit class BindingDeltaLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.iam.v1.policy.BindingDelta]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.iam.v1.policy.BindingDelta](_l) {
    def action: _root_.scalapb.lenses.Lens[UpperPB, com.google.iam.v1.policy.BindingDelta.Action] = field(_.action)((c_, f_) => c_.copy(action = f_))
    def role: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.role)((c_, f_) => c_.copy(role = f_))
    def member: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.member)((c_, f_) => c_.copy(member = f_))
  }
  final val ACTION_FIELD_NUMBER = 1
  final val ROLE_FIELD_NUMBER = 2
  final val MEMBER_FIELD_NUMBER = 3
  def of(
    action: com.google.iam.v1.policy.BindingDelta.Action,
    role: _root_.scala.Predef.String,
    member: _root_.scala.Predef.String
  ): _root_.com.google.iam.v1.policy.BindingDelta = _root_.com.google.iam.v1.policy.BindingDelta(
    action,
    role,
    member
  )
}
