// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.distribution

object DistributionProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.api.annotations.AnnotationsProto,
    com.google.protobuf.any.AnyProto,
    com.google.protobuf.timestamp.TimestampProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.google.api.distribution.Distribution
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Ch1nb29nbGUvYXBpL2Rpc3RyaWJ1dGlvbi5wcm90bxIKZ29vZ2xlLmFwaRocZ29vZ2xlL2FwaS9hbm5vdGF0aW9ucy5wcm90b
  xoZZ29vZ2xlL3Byb3RvYnVmL2FueS5wcm90bxofZ29vZ2xlL3Byb3RvYnVmL3RpbWVzdGFtcC5wcm90byK2CQoMRGlzdHJpYnV0a
  W9uEiAKBWNvdW50GAEgASgDQgriPwcSBWNvdW50UgVjb3VudBIdCgRtZWFuGAIgASgBQgniPwYSBG1lYW5SBG1lYW4SUwoYc3VtX
  29mX3NxdWFyZWRfZGV2aWF0aW9uGAMgASgBQhriPxcSFXN1bU9mU3F1YXJlZERldmlhdGlvblIVc3VtT2ZTcXVhcmVkRGV2aWF0a
  W9uEkAKBXJhbmdlGAQgASgLMh4uZ29vZ2xlLmFwaS5EaXN0cmlidXRpb24uUmFuZ2VCCuI/BxIFcmFuZ2VSBXJhbmdlEmEKDmJ1Y
  2tldF9vcHRpb25zGAYgASgLMiYuZ29vZ2xlLmFwaS5EaXN0cmlidXRpb24uQnVja2V0T3B0aW9uc0IS4j8PEg1idWNrZXRPcHRpb
  25zUg1idWNrZXRPcHRpb25zEjYKDWJ1Y2tldF9jb3VudHMYByADKANCEeI/DhIMYnVja2V0Q291bnRzUgxidWNrZXRDb3VudHMaP
  woFUmFuZ2USGgoDbWluGAEgASgBQgjiPwUSA21pblIDbWluEhoKA21heBgCIAEoAUII4j8FEgNtYXhSA21heBrxBQoNQnVja2V0T
  3B0aW9ucxJqCg5saW5lYXJfYnVja2V0cxgBIAEoCzItLmdvb2dsZS5hcGkuRGlzdHJpYnV0aW9uLkJ1Y2tldE9wdGlvbnMuTGluZ
  WFyQhLiPw8SDWxpbmVhckJ1Y2tldHNIAFINbGluZWFyQnVja2V0cxJ+ChNleHBvbmVudGlhbF9idWNrZXRzGAIgASgLMjIuZ29vZ
  2xlLmFwaS5EaXN0cmlidXRpb24uQnVja2V0T3B0aW9ucy5FeHBvbmVudGlhbEIX4j8UEhJleHBvbmVudGlhbEJ1Y2tldHNIAFISZ
  Xhwb25lbnRpYWxCdWNrZXRzEnIKEGV4cGxpY2l0X2J1Y2tldHMYAyABKAsyLy5nb29nbGUuYXBpLkRpc3RyaWJ1dGlvbi5CdWNrZ
  XRPcHRpb25zLkV4cGxpY2l0QhTiPxESD2V4cGxpY2l0QnVja2V0c0gAUg9leHBsaWNpdEJ1Y2tldHMalAEKBkxpbmVhchJDChJud
  W1fZmluaXRlX2J1Y2tldHMYASABKAVCFeI/EhIQbnVtRmluaXRlQnVja2V0c1IQbnVtRmluaXRlQnVja2V0cxIgCgV3aWR0aBgCI
  AEoAUIK4j8HEgV3aWR0aFIFd2lkdGgSIwoGb2Zmc2V0GAMgASgBQgviPwgSBm9mZnNldFIGb2Zmc2V0GqwBCgtFeHBvbmVudGlhb
  BJDChJudW1fZmluaXRlX2J1Y2tldHMYASABKAVCFeI/EhIQbnVtRmluaXRlQnVja2V0c1IQbnVtRmluaXRlQnVja2V0cxI2Cg1nc
  m93dGhfZmFjdG9yGAIgASgBQhHiPw4SDGdyb3d0aEZhY3RvclIMZ3Jvd3RoRmFjdG9yEiAKBXNjYWxlGAMgASgBQgriPwcSBXNjY
  WxlUgVzY2FsZRovCghFeHBsaWNpdBIjCgZib3VuZHMYASADKAFCC+I/CBIGYm91bmRzUgZib3VuZHNCCQoHb3B0aW9uc0JqCg5jb
  20uZ29vZ2xlLmFwaUIRRGlzdHJpYnV0aW9uUHJvdG9QAVpDZ29vZ2xlLmdvbGFuZy5vcmcvZ2VucHJvdG8vZ29vZ2xlYXBpcy9hc
  GkvZGlzdHJpYnV0aW9uO2Rpc3RyaWJ1dGlvbmIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.api.annotations.AnnotationsProto.javaDescriptor,
      com.google.protobuf.any.AnyProto.javaDescriptor,
      com.google.protobuf.timestamp.TimestampProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}