// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.backend

object BackendProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.google.api.backend.Backend,
    com.google.api.backend.BackendRule
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Chhnb29nbGUvYXBpL2JhY2tlbmQucHJvdG8SCmdvb2dsZS5hcGkiRAoHQmFja2VuZBI5CgVydWxlcxgBIAMoCzIXLmdvb2dsZ
  S5hcGkuQmFja2VuZFJ1bGVCCuI/BxIFcnVsZXNSBXJ1bGVzIosBCgtCYWNrZW5kUnVsZRIpCghzZWxlY3RvchgBIAEoCUIN4j8KE
  ghzZWxlY3RvclIIc2VsZWN0b3ISJgoHYWRkcmVzcxgCIAEoCUIM4j8JEgdhZGRyZXNzUgdhZGRyZXNzEikKCGRlYWRsaW5lGAMgA
  SgBQg3iPwoSCGRlYWRsaW5lUghkZWFkbGluZUJuCg5jb20uZ29vZ2xlLmFwaUIMQmFja2VuZFByb3RvUAFaRWdvb2dsZS5nb2xhb
  mcub3JnL2dlbnByb3RvL2dvb2dsZWFwaXMvYXBpL3NlcnZpY2Vjb25maWc7c2VydmljZWNvbmZpZ6ICBEdBUEliBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}