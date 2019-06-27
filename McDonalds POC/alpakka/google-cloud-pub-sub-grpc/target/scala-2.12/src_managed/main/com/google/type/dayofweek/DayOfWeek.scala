// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.`type`.dayofweek

sealed trait DayOfWeek extends _root_.scalapb.GeneratedEnum {
  type EnumType = DayOfWeek
  def isDayOfWeekUnspecified: _root_.scala.Boolean = false
  def isMonday: _root_.scala.Boolean = false
  def isTuesday: _root_.scala.Boolean = false
  def isWednesday: _root_.scala.Boolean = false
  def isThursday: _root_.scala.Boolean = false
  def isFriday: _root_.scala.Boolean = false
  def isSaturday: _root_.scala.Boolean = false
  def isSunday: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[DayOfWeek] = com.google.`type`.dayofweek.DayOfWeek
}

object DayOfWeek extends _root_.scalapb.GeneratedEnumCompanion[DayOfWeek] {
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[DayOfWeek] = this
  @SerialVersionUID(0L)
  case object DAY_OF_WEEK_UNSPECIFIED extends DayOfWeek {
    val value = 0
    val index = 0
    val name = "DAY_OF_WEEK_UNSPECIFIED"
    override def isDayOfWeekUnspecified: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object MONDAY extends DayOfWeek {
    val value = 1
    val index = 1
    val name = "MONDAY"
    override def isMonday: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object TUESDAY extends DayOfWeek {
    val value = 2
    val index = 2
    val name = "TUESDAY"
    override def isTuesday: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object WEDNESDAY extends DayOfWeek {
    val value = 3
    val index = 3
    val name = "WEDNESDAY"
    override def isWednesday: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object THURSDAY extends DayOfWeek {
    val value = 4
    val index = 4
    val name = "THURSDAY"
    override def isThursday: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object FRIDAY extends DayOfWeek {
    val value = 5
    val index = 5
    val name = "FRIDAY"
    override def isFriday: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object SATURDAY extends DayOfWeek {
    val value = 6
    val index = 6
    val name = "SATURDAY"
    override def isSaturday: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object SUNDAY extends DayOfWeek {
    val value = 7
    val index = 7
    val name = "SUNDAY"
    override def isSunday: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(value: _root_.scala.Int) extends DayOfWeek with _root_.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(DAY_OF_WEEK_UNSPECIFIED, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
  def fromValue(value: _root_.scala.Int): DayOfWeek = value match {
    case 0 => DAY_OF_WEEK_UNSPECIFIED
    case 1 => MONDAY
    case 2 => TUESDAY
    case 3 => WEDNESDAY
    case 4 => THURSDAY
    case 5 => FRIDAY
    case 6 => SATURDAY
    case 7 => SUNDAY
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = DayofweekProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = DayofweekProto.scalaDescriptor.enums(0)
}