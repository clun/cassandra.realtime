// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.documentation

object DocumentationProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.google.api.documentation.Documentation,
    com.google.api.documentation.DocumentationRule,
    com.google.api.documentation.Page
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Ch5nb29nbGUvYXBpL2RvY3VtZW50YXRpb24ucHJvdG8SCmdvb2dsZS5hcGkiqAIKDURvY3VtZW50YXRpb24SJgoHc3VtbWFye
  RgBIAEoCUIM4j8JEgdzdW1tYXJ5UgdzdW1tYXJ5EjIKBXBhZ2VzGAUgAygLMhAuZ29vZ2xlLmFwaS5QYWdlQgriPwcSBXBhZ2VzU
  gVwYWdlcxI/CgVydWxlcxgDIAMoCzIdLmdvb2dsZS5hcGkuRG9jdW1lbnRhdGlvblJ1bGVCCuI/BxIFcnVsZXNSBXJ1bGVzEk8KF
  mRvY3VtZW50YXRpb25fcm9vdF91cmwYBCABKAlCGeI/FhIUZG9jdW1lbnRhdGlvblJvb3RVcmxSFGRvY3VtZW50YXRpb25Sb290V
  XJsEikKCG92ZXJ2aWV3GAIgASgJQg3iPwoSCG92ZXJ2aWV3UghvdmVydmlldyLIAQoRRG9jdW1lbnRhdGlvblJ1bGUSKQoIc2VsZ
  WN0b3IYASABKAlCDeI/ChIIc2VsZWN0b3JSCHNlbGVjdG9yEjIKC2Rlc2NyaXB0aW9uGAIgASgJQhDiPw0SC2Rlc2NyaXB0aW9uU
  gtkZXNjcmlwdGlvbhJUChdkZXByZWNhdGlvbl9kZXNjcmlwdGlvbhgDIAEoCUIb4j8YEhZkZXByZWNhdGlvbkRlc2NyaXB0aW9uU
  hZkZXByZWNhdGlvbkRlc2NyaXB0aW9uIooBCgRQYWdlEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRImCgdjb250ZW50G
  AIgASgJQgziPwkSB2NvbnRlbnRSB2NvbnRlbnQSOwoIc3VicGFnZXMYAyADKAsyEC5nb29nbGUuYXBpLlBhZ2VCDeI/ChIIc3Vic
  GFnZXNSCHN1YnBhZ2VzQnQKDmNvbS5nb29nbGUuYXBpQhJEb2N1bWVudGF0aW9uUHJvdG9QAVpFZ29vZ2xlLmdvbGFuZy5vcmcvZ
  2VucHJvdG8vZ29vZ2xlYXBpcy9hcGkvc2VydmljZWNvbmZpZztzZXJ2aWNlY29uZmlnogIER0FQSWIGcHJvdG8z"""
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