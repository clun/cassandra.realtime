// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.auth

/** `Authentication` defines the authentication configuration for an API.
  *
  * Example for an API targeted for external use:
  *
  *     name: calendar.googleapis.com
  *     authentication:
  *       providers:
  *       - id: google_calendar_auth
  *         jwks_uri: https://www.googleapis.com/oauth2/v1/certs
  *         issuer: https://securetoken.google.com
  *       rules:
  *       - selector: "*"
  *         requirements:
  *           provider_id: google_calendar_auth
  *
  * @param rules
  *   A list of authentication rules that apply to individual API methods.
  *  
  *   **NOTE:** All service configuration rules follow "last one wins" order.
  * @param providers
  *   Defines a set of authentication providers that a service supports.
  */
@SerialVersionUID(0L)
final case class Authentication(
    rules: _root_.scala.collection.Seq[com.google.api.auth.AuthenticationRule] = _root_.scala.collection.Seq.empty,
    providers: _root_.scala.collection.Seq[com.google.api.auth.AuthProvider] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Authentication] with scalapb.lenses.Updatable[Authentication] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      rules.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      providers.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      rules.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      providers.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.auth.Authentication = {
      val __rules = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.auth.AuthenticationRule] ++= this.rules)
      val __providers = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.auth.AuthProvider] ++= this.providers)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 26 =>
            __rules += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.auth.AuthenticationRule.defaultInstance)
          case 34 =>
            __providers += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.auth.AuthProvider.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.auth.Authentication(
          rules = __rules.result(),
          providers = __providers.result()
      )
    }
    def clearRules = copy(rules = _root_.scala.collection.Seq.empty)
    def addRules(__vs: com.google.api.auth.AuthenticationRule*): Authentication = addAllRules(__vs)
    def addAllRules(__vs: TraversableOnce[com.google.api.auth.AuthenticationRule]): Authentication = copy(rules = rules ++ __vs)
    def withRules(__v: _root_.scala.collection.Seq[com.google.api.auth.AuthenticationRule]): Authentication = copy(rules = __v)
    def clearProviders = copy(providers = _root_.scala.collection.Seq.empty)
    def addProviders(__vs: com.google.api.auth.AuthProvider*): Authentication = addAllProviders(__vs)
    def addAllProviders(__vs: TraversableOnce[com.google.api.auth.AuthProvider]): Authentication = copy(providers = providers ++ __vs)
    def withProviders(__v: _root_.scala.collection.Seq[com.google.api.auth.AuthProvider]): Authentication = copy(providers = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 3 => rules
        case 4 => providers
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 3 => _root_.scalapb.descriptors.PRepeated(rules.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 4 => _root_.scalapb.descriptors.PRepeated(providers.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.auth.Authentication
}

object Authentication extends scalapb.GeneratedMessageCompanion[com.google.api.auth.Authentication] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.auth.Authentication] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.auth.Authentication = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.auth.Authentication(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.api.auth.AuthenticationRule]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.api.auth.AuthProvider]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.auth.Authentication] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.auth.Authentication(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.collection.Seq[com.google.api.auth.AuthenticationRule]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.collection.Seq[com.google.api.auth.AuthProvider]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AuthProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AuthProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = com.google.api.auth.AuthenticationRule
      case 4 => __out = com.google.api.auth.AuthProvider
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.auth.Authentication(
  )
  implicit class AuthenticationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.auth.Authentication]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.auth.Authentication](_l) {
    def rules: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.api.auth.AuthenticationRule]] = field(_.rules)((c_, f_) => c_.copy(rules = f_))
    def providers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.api.auth.AuthProvider]] = field(_.providers)((c_, f_) => c_.copy(providers = f_))
  }
  final val RULES_FIELD_NUMBER = 3
  final val PROVIDERS_FIELD_NUMBER = 4
  def of(
    rules: _root_.scala.collection.Seq[com.google.api.auth.AuthenticationRule],
    providers: _root_.scala.collection.Seq[com.google.api.auth.AuthProvider]
  ): _root_.com.google.api.auth.Authentication = _root_.com.google.api.auth.Authentication(
    rules,
    providers
  )
}
