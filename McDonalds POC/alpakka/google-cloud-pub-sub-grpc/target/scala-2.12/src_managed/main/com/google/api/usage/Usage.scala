// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.usage

/** Configuration controlling usage of a service.
  *
  * @param requirements
  *   Requirements that must be satisfied before a consumer project can use the
  *   service. Each requirement is of the form &lt;service.name&gt;/&lt;requirement-id&gt;;
  *   for example 'serviceusage.googleapis.com/billing-enabled'.
  * @param rules
  *   A list of usage rules that apply to individual API methods.
  *  
  *   **NOTE:** All service configuration rules follow "last one wins" order.
  * @param producerNotificationChannel
  *   The full resource name of a channel used for sending notifications to the
  *   service producer.
  *  
  *   Google Service Management currently only supports
  *   [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification
  *   channel. To use Google Cloud Pub/Sub as the channel, this must be the name
  *   of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format
  *   documented in https://cloud.google.com/pubsub/docs/overview.
  */
@SerialVersionUID(0L)
final case class Usage(
    requirements: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty,
    rules: _root_.scala.collection.Seq[com.google.api.usage.UsageRule] = _root_.scala.collection.Seq.empty,
    producerNotificationChannel: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[Usage] with scalapb.lenses.Updatable[Usage] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      requirements.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
      rules.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = producerNotificationChannel
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
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
      requirements.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      rules.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = producerNotificationChannel
        if (__v != "") {
          _output__.writeString(7, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.usage.Usage = {
      val __requirements = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.requirements)
      val __rules = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.usage.UsageRule] ++= this.rules)
      var __producerNotificationChannel = this.producerNotificationChannel
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __requirements += _input__.readString()
          case 50 =>
            __rules += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.usage.UsageRule.defaultInstance)
          case 58 =>
            __producerNotificationChannel = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.usage.Usage(
          requirements = __requirements.result(),
          rules = __rules.result(),
          producerNotificationChannel = __producerNotificationChannel
      )
    }
    def clearRequirements = copy(requirements = _root_.scala.collection.Seq.empty)
    def addRequirements(__vs: _root_.scala.Predef.String*): Usage = addAllRequirements(__vs)
    def addAllRequirements(__vs: TraversableOnce[_root_.scala.Predef.String]): Usage = copy(requirements = requirements ++ __vs)
    def withRequirements(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): Usage = copy(requirements = __v)
    def clearRules = copy(rules = _root_.scala.collection.Seq.empty)
    def addRules(__vs: com.google.api.usage.UsageRule*): Usage = addAllRules(__vs)
    def addAllRules(__vs: TraversableOnce[com.google.api.usage.UsageRule]): Usage = copy(rules = rules ++ __vs)
    def withRules(__v: _root_.scala.collection.Seq[com.google.api.usage.UsageRule]): Usage = copy(rules = __v)
    def withProducerNotificationChannel(__v: _root_.scala.Predef.String): Usage = copy(producerNotificationChannel = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => requirements
        case 6 => rules
        case 7 => {
          val __t = producerNotificationChannel
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(requirements.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 6 => _root_.scalapb.descriptors.PRepeated(rules.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 7 => _root_.scalapb.descriptors.PString(producerNotificationChannel)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.usage.Usage
}

object Usage extends scalapb.GeneratedMessageCompanion[com.google.api.usage.Usage] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.usage.Usage] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.usage.Usage = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.usage.Usage(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.api.usage.UsageRule]],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.usage.Usage] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.usage.Usage(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.collection.Seq[com.google.api.usage.UsageRule]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = UsageProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = UsageProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 6 => __out = com.google.api.usage.UsageRule
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.usage.Usage(
  )
  implicit class UsageLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.usage.Usage]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.usage.Usage](_l) {
    def requirements: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.requirements)((c_, f_) => c_.copy(requirements = f_))
    def rules: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.api.usage.UsageRule]] = field(_.rules)((c_, f_) => c_.copy(rules = f_))
    def producerNotificationChannel: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.producerNotificationChannel)((c_, f_) => c_.copy(producerNotificationChannel = f_))
  }
  final val REQUIREMENTS_FIELD_NUMBER = 1
  final val RULES_FIELD_NUMBER = 6
  final val PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7
  def of(
    requirements: _root_.scala.collection.Seq[_root_.scala.Predef.String],
    rules: _root_.scala.collection.Seq[com.google.api.usage.UsageRule],
    producerNotificationChannel: _root_.scala.Predef.String
  ): _root_.com.google.api.usage.Usage = _root_.com.google.api.usage.Usage(
    requirements,
    rules,
    producerNotificationChannel
  )
}
