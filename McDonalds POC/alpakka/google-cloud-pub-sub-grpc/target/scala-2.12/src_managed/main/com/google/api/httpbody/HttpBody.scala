// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.httpbody

/** Message that represents an arbitrary HTTP body. It should only be used for
  * payload formats that can't be represented as JSON, such as raw binary or
  * an HTML page.
  *
  *
  * This message can be used both in streaming and non-streaming API methods in
  * the request as well as the response.
  *
  * It can be used as a top-level request field, which is convenient if one
  * wants to extract parameters from either the URL or HTTP template into the
  * request fields and also want access to the raw HTTP body.
  *
  * Example:
  *
  *     message GetResourceRequest {
  *       // A unique request id.
  *       string request_id = 1;
  *
  *       // The raw HTTP body is bound to this field.
  *       google.api.HttpBody http_body = 2;
  *     }
  *
  *     service ResourceService {
  *       rpc GetResource(GetResourceRequest) returns (google.api.HttpBody);
  *       rpc UpdateResource(google.api.HttpBody) returns (google.protobuf.Empty);
  *     }
  *
  * Example with streaming methods:
  *
  *     service CaldavService {
  *       rpc GetCalendar(stream google.api.HttpBody)
  *         returns (stream google.api.HttpBody);
  *       rpc UpdateCalendar(stream google.api.HttpBody)
  *         returns (stream google.api.HttpBody);
  *     }
  *
  * Use of this type only changes how the request and response bodies are
  * handled, all other features will continue to work unchanged.
  *
  * @param contentType
  *   The HTTP Content-Type string representing the content type of the body.
  * @param data
  *   HTTP body binary data.
  */
@SerialVersionUID(0L)
final case class HttpBody(
    contentType: _root_.scala.Predef.String = "",
    data: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
    ) extends scalapb.GeneratedMessage with scalapb.Message[HttpBody] with scalapb.lenses.Updatable[HttpBody] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = contentType
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = data
        if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(2, __value)
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
        val __v = contentType
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = data
        if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.httpbody.HttpBody = {
      var __contentType = this.contentType
      var __data = this.data
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __contentType = _input__.readString()
          case 18 =>
            __data = _input__.readBytes()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.httpbody.HttpBody(
          contentType = __contentType,
          data = __data
      )
    }
    def withContentType(__v: _root_.scala.Predef.String): HttpBody = copy(contentType = __v)
    def withData(__v: _root_.com.google.protobuf.ByteString): HttpBody = copy(data = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = contentType
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = data
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(contentType)
        case 2 => _root_.scalapb.descriptors.PByteString(data)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.httpbody.HttpBody
}

object HttpBody extends scalapb.GeneratedMessageCompanion[com.google.api.httpbody.HttpBody] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.httpbody.HttpBody] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.httpbody.HttpBody = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.httpbody.HttpBody(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.httpbody.HttpBody] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.httpbody.HttpBody(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HttpbodyProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HttpbodyProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.httpbody.HttpBody(
  )
  implicit class HttpBodyLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.httpbody.HttpBody]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.httpbody.HttpBody](_l) {
    def contentType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.contentType)((c_, f_) => c_.copy(contentType = f_))
    def data: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.data)((c_, f_) => c_.copy(data = f_))
  }
  final val CONTENT_TYPE_FIELD_NUMBER = 1
  final val DATA_FIELD_NUMBER = 2
  def of(
    contentType: _root_.scala.Predef.String,
    data: _root_.com.google.protobuf.ByteString
  ): _root_.com.google.api.httpbody.HttpBody = _root_.com.google.api.httpbody.HttpBody(
    contentType,
    data
  )
}
