// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.monitoring

object MonitoringProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.api.annotations.AnnotationsProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.google.api.monitoring.Monitoring
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Chtnb29nbGUvYXBpL21vbml0b3JpbmcucHJvdG8SCmdvb2dsZS5hcGkaHGdvb2dsZS9hcGkvYW5ub3RhdGlvbnMucHJvdG8ik
  QMKCk1vbml0b3JpbmcSfAoVcHJvZHVjZXJfZGVzdGluYXRpb25zGAEgAygLMiwuZ29vZ2xlLmFwaS5Nb25pdG9yaW5nLk1vbml0b
  3JpbmdEZXN0aW5hdGlvbkIZ4j8WEhRwcm9kdWNlckRlc3RpbmF0aW9uc1IUcHJvZHVjZXJEZXN0aW5hdGlvbnMSfAoVY29uc3VtZ
  XJfZGVzdGluYXRpb25zGAIgAygLMiwuZ29vZ2xlLmFwaS5Nb25pdG9yaW5nLk1vbml0b3JpbmdEZXN0aW5hdGlvbkIZ4j8WEhRjb
  25zdW1lckRlc3RpbmF0aW9uc1IUY29uc3VtZXJEZXN0aW5hdGlvbnMahgEKFU1vbml0b3JpbmdEZXN0aW5hdGlvbhJFChJtb25pd
  G9yZWRfcmVzb3VyY2UYASABKAlCFuI/ExIRbW9uaXRvcmVkUmVzb3VyY2VSEW1vbml0b3JlZFJlc291cmNlEiYKB21ldHJpY3MYA
  iADKAlCDOI/CRIHbWV0cmljc1IHbWV0cmljc0JxCg5jb20uZ29vZ2xlLmFwaUIPTW9uaXRvcmluZ1Byb3RvUAFaRWdvb2dsZS5nb
  2xhbmcub3JnL2dlbnByb3RvL2dvb2dsZWFwaXMvYXBpL3NlcnZpY2Vjb25maWc7c2VydmljZWNvbmZpZ6ICBEdBUEliBnByb3RvM
  w=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.api.annotations.AnnotationsProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}