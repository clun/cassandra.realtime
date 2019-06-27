// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.`type`.postal_address

/** Represents a postal address, e.g. for postal delivery or payments addresses.
  * Given a postal address, a postal service can deliver items to a premise, P.O.
  * Box or similar.
  * It is not intended to model geographical locations (roads, towns,
  * mountains).
  *
  * In typical usage an address would be created via user input or from importing
  * existing data, depending on the type of process.
  *
  * Advice on address input / editing:
  *  - Use an i18n-ready address widget such as
  *    https://github.com/googlei18n/libaddressinput)
  * - Users should not be presented with UI elements for input or editing of
  *   fields outside countries where that field is used.
  *
  * For more guidance on how to use this schema, please see:
  * https://support.google.com/business/answer/6397478
  *
  * @param revision
  *   The schema revision of the `PostalAddress`.
  *   All new revisions **must** be backward compatible with old revisions.
  * @param regionCode
  *   Required. CLDR region code of the country/region of the address. This
  *   is never inferred and it is up to the user to ensure the value is
  *   correct. See http://cldr.unicode.org/ and
  *   http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
  *   for details. Example: "CH" for Switzerland.
  * @param languageCode
  *   Optional. BCP-47 language code of the contents of this address (if
  *   known). This is often the UI language of the input form or is expected
  *   to match one of the languages used in the address' country/region, or their
  *   transliterated equivalents.
  *   This can affect formatting in certain countries, but is not critical
  *   to the correctness of the data and will never affect any validation or
  *   other non-formatting related operations.
  *  
  *   If this value is not known, it should be omitted (rather than specifying a
  *   possibly incorrect default).
  *  
  *   Examples: "zh-Hant", "ja", "ja-Latn", "en".
  * @param postalCode
  *   Optional. Postal code of the address. Not all countries use or require
  *   postal codes to be present, but where they are used, they may trigger
  *   additional validation with other parts of the address (e.g. state/zip
  *   validation in the U.S.A.).
  * @param sortingCode
  *   Optional. Additional, country-specific, sorting code. This is not used
  *   in most regions. Where it is used, the value is either a string like
  *   "CEDEX", optionally followed by a number (e.g. "CEDEX 7"), or just a number
  *   alone, representing the "sector code" (Jamaica), "delivery area indicator"
  *   (Malawi) or "post office indicator" (e.g. Côte d'Ivoire).
  * @param administrativeArea
  *   Optional. Highest administrative subdivision which is used for postal
  *   addresses of a country or region.
  *   For example, this can be a state, a province, an oblast, or a prefecture.
  *   Specifically, for Spain this is the province and not the autonomous
  *   community (e.g. "Barcelona" and not "Catalonia").
  *   Many countries don't use an administrative area in postal addresses. E.g.
  *   in Switzerland this should be left unpopulated.
  * @param locality
  *   Optional. Generally refers to the city/town portion of the address.
  *   Examples: US city, IT comune, UK post town.
  *   In regions of the world where localities are not well defined or do not fit
  *   into this structure well, leave locality empty and use address_lines.
  * @param sublocality
  *   Optional. Sublocality of the address.
  *   For example, this can be neighborhoods, boroughs, districts.
  * @param addressLines
  *   Unstructured address lines describing the lower levels of an address.
  *  
  *   Because values in address_lines do not have type information and may
  *   sometimes contain multiple values in a single field (e.g.
  *   "Austin, TX"), it is important that the line order is clear. The order of
  *   address lines should be "envelope order" for the country/region of the
  *   address. In places where this can vary (e.g. Japan), address_language is
  *   used to make it explicit (e.g. "ja" for large-to-small ordering and
  *   "ja-Latn" or "en" for small-to-large). This way, the most specific line of
  *   an address can be selected based on the language.
  *  
  *   The minimum permitted structural representation of an address consists
  *   of a region_code with all remaining information placed in the
  *   address_lines. It would be possible to format such an address very
  *   approximately without geocoding, but no semantic reasoning could be
  *   made about any of the address components until it was at least
  *   partially resolved.
  *  
  *   Creating an address only containing a region_code and address_lines, and
  *   then geocoding is the recommended way to handle completely unstructured
  *   addresses (as opposed to guessing which parts of the address should be
  *   localities or administrative areas).
  * @param recipients
  *   Optional. The recipient at the address.
  *   This field may, under certain circumstances, contain multiline information.
  *   For example, it might contain "care of" information.
  * @param organization
  *   Optional. The name of the organization at the address.
  */
@SerialVersionUID(0L)
final case class PostalAddress(
    revision: _root_.scala.Int = 0,
    regionCode: _root_.scala.Predef.String = "",
    languageCode: _root_.scala.Predef.String = "",
    postalCode: _root_.scala.Predef.String = "",
    sortingCode: _root_.scala.Predef.String = "",
    administrativeArea: _root_.scala.Predef.String = "",
    locality: _root_.scala.Predef.String = "",
    sublocality: _root_.scala.Predef.String = "",
    addressLines: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty,
    recipients: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty,
    organization: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[PostalAddress] with scalapb.lenses.Updatable[PostalAddress] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = revision
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      
      {
        val __value = regionCode
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = languageCode
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = postalCode
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = sortingCode
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
        }
      };
      
      {
        val __value = administrativeArea
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
        }
      };
      
      {
        val __value = locality
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
        }
      };
      
      {
        val __value = sublocality
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
        }
      };
      addressLines.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(9, __value)
      }
      recipients.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, __value)
      }
      
      {
        val __value = organization
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(11, __value)
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
        val __v = revision
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = regionCode
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = languageCode
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = postalCode
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = sortingCode
        if (__v != "") {
          _output__.writeString(5, __v)
        }
      };
      {
        val __v = administrativeArea
        if (__v != "") {
          _output__.writeString(6, __v)
        }
      };
      {
        val __v = locality
        if (__v != "") {
          _output__.writeString(7, __v)
        }
      };
      {
        val __v = sublocality
        if (__v != "") {
          _output__.writeString(8, __v)
        }
      };
      addressLines.foreach { __v =>
        val __m = __v
        _output__.writeString(9, __m)
      };
      recipients.foreach { __v =>
        val __m = __v
        _output__.writeString(10, __m)
      };
      {
        val __v = organization
        if (__v != "") {
          _output__.writeString(11, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.`type`.postal_address.PostalAddress = {
      var __revision = this.revision
      var __regionCode = this.regionCode
      var __languageCode = this.languageCode
      var __postalCode = this.postalCode
      var __sortingCode = this.sortingCode
      var __administrativeArea = this.administrativeArea
      var __locality = this.locality
      var __sublocality = this.sublocality
      val __addressLines = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.addressLines)
      val __recipients = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.recipients)
      var __organization = this.organization
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __revision = _input__.readInt32()
          case 18 =>
            __regionCode = _input__.readString()
          case 26 =>
            __languageCode = _input__.readString()
          case 34 =>
            __postalCode = _input__.readString()
          case 42 =>
            __sortingCode = _input__.readString()
          case 50 =>
            __administrativeArea = _input__.readString()
          case 58 =>
            __locality = _input__.readString()
          case 66 =>
            __sublocality = _input__.readString()
          case 74 =>
            __addressLines += _input__.readString()
          case 82 =>
            __recipients += _input__.readString()
          case 90 =>
            __organization = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.`type`.postal_address.PostalAddress(
          revision = __revision,
          regionCode = __regionCode,
          languageCode = __languageCode,
          postalCode = __postalCode,
          sortingCode = __sortingCode,
          administrativeArea = __administrativeArea,
          locality = __locality,
          sublocality = __sublocality,
          addressLines = __addressLines.result(),
          recipients = __recipients.result(),
          organization = __organization
      )
    }
    def withRevision(__v: _root_.scala.Int): PostalAddress = copy(revision = __v)
    def withRegionCode(__v: _root_.scala.Predef.String): PostalAddress = copy(regionCode = __v)
    def withLanguageCode(__v: _root_.scala.Predef.String): PostalAddress = copy(languageCode = __v)
    def withPostalCode(__v: _root_.scala.Predef.String): PostalAddress = copy(postalCode = __v)
    def withSortingCode(__v: _root_.scala.Predef.String): PostalAddress = copy(sortingCode = __v)
    def withAdministrativeArea(__v: _root_.scala.Predef.String): PostalAddress = copy(administrativeArea = __v)
    def withLocality(__v: _root_.scala.Predef.String): PostalAddress = copy(locality = __v)
    def withSublocality(__v: _root_.scala.Predef.String): PostalAddress = copy(sublocality = __v)
    def clearAddressLines = copy(addressLines = _root_.scala.collection.Seq.empty)
    def addAddressLines(__vs: _root_.scala.Predef.String*): PostalAddress = addAllAddressLines(__vs)
    def addAllAddressLines(__vs: TraversableOnce[_root_.scala.Predef.String]): PostalAddress = copy(addressLines = addressLines ++ __vs)
    def withAddressLines(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): PostalAddress = copy(addressLines = __v)
    def clearRecipients = copy(recipients = _root_.scala.collection.Seq.empty)
    def addRecipients(__vs: _root_.scala.Predef.String*): PostalAddress = addAllRecipients(__vs)
    def addAllRecipients(__vs: TraversableOnce[_root_.scala.Predef.String]): PostalAddress = copy(recipients = recipients ++ __vs)
    def withRecipients(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): PostalAddress = copy(recipients = __v)
    def withOrganization(__v: _root_.scala.Predef.String): PostalAddress = copy(organization = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = revision
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = regionCode
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = languageCode
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = postalCode
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = sortingCode
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = administrativeArea
          if (__t != "") __t else null
        }
        case 7 => {
          val __t = locality
          if (__t != "") __t else null
        }
        case 8 => {
          val __t = sublocality
          if (__t != "") __t else null
        }
        case 9 => addressLines
        case 10 => recipients
        case 11 => {
          val __t = organization
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(revision)
        case 2 => _root_.scalapb.descriptors.PString(regionCode)
        case 3 => _root_.scalapb.descriptors.PString(languageCode)
        case 4 => _root_.scalapb.descriptors.PString(postalCode)
        case 5 => _root_.scalapb.descriptors.PString(sortingCode)
        case 6 => _root_.scalapb.descriptors.PString(administrativeArea)
        case 7 => _root_.scalapb.descriptors.PString(locality)
        case 8 => _root_.scalapb.descriptors.PString(sublocality)
        case 9 => _root_.scalapb.descriptors.PRepeated(addressLines.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 10 => _root_.scalapb.descriptors.PRepeated(recipients.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 11 => _root_.scalapb.descriptors.PString(organization)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.`type`.postal_address.PostalAddress
}

object PostalAddress extends scalapb.GeneratedMessageCompanion[com.google.`type`.postal_address.PostalAddress] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.`type`.postal_address.PostalAddress] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.`type`.postal_address.PostalAddress = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.`type`.postal_address.PostalAddress(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(4), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(5), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(6), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(7), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(8), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(9), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(10), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.`type`.postal_address.PostalAddress] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.`type`.postal_address.PostalAddress(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PostalAddressProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PostalAddressProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.`type`.postal_address.PostalAddress(
  )
  implicit class PostalAddressLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.`type`.postal_address.PostalAddress]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.`type`.postal_address.PostalAddress](_l) {
    def revision: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.revision)((c_, f_) => c_.copy(revision = f_))
    def regionCode: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.regionCode)((c_, f_) => c_.copy(regionCode = f_))
    def languageCode: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.languageCode)((c_, f_) => c_.copy(languageCode = f_))
    def postalCode: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.postalCode)((c_, f_) => c_.copy(postalCode = f_))
    def sortingCode: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.sortingCode)((c_, f_) => c_.copy(sortingCode = f_))
    def administrativeArea: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.administrativeArea)((c_, f_) => c_.copy(administrativeArea = f_))
    def locality: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.locality)((c_, f_) => c_.copy(locality = f_))
    def sublocality: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.sublocality)((c_, f_) => c_.copy(sublocality = f_))
    def addressLines: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.addressLines)((c_, f_) => c_.copy(addressLines = f_))
    def recipients: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.recipients)((c_, f_) => c_.copy(recipients = f_))
    def organization: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.organization)((c_, f_) => c_.copy(organization = f_))
  }
  final val REVISION_FIELD_NUMBER = 1
  final val REGION_CODE_FIELD_NUMBER = 2
  final val LANGUAGE_CODE_FIELD_NUMBER = 3
  final val POSTAL_CODE_FIELD_NUMBER = 4
  final val SORTING_CODE_FIELD_NUMBER = 5
  final val ADMINISTRATIVE_AREA_FIELD_NUMBER = 6
  final val LOCALITY_FIELD_NUMBER = 7
  final val SUBLOCALITY_FIELD_NUMBER = 8
  final val ADDRESS_LINES_FIELD_NUMBER = 9
  final val RECIPIENTS_FIELD_NUMBER = 10
  final val ORGANIZATION_FIELD_NUMBER = 11
  def of(
    revision: _root_.scala.Int,
    regionCode: _root_.scala.Predef.String,
    languageCode: _root_.scala.Predef.String,
    postalCode: _root_.scala.Predef.String,
    sortingCode: _root_.scala.Predef.String,
    administrativeArea: _root_.scala.Predef.String,
    locality: _root_.scala.Predef.String,
    sublocality: _root_.scala.Predef.String,
    addressLines: _root_.scala.collection.Seq[_root_.scala.Predef.String],
    recipients: _root_.scala.collection.Seq[_root_.scala.Predef.String],
    organization: _root_.scala.Predef.String
  ): _root_.com.google.`type`.postal_address.PostalAddress = _root_.com.google.`type`.postal_address.PostalAddress(
    revision,
    regionCode,
    languageCode,
    postalCode,
    sortingCode,
    administrativeArea,
    locality,
    sublocality,
    addressLines,
    recipients,
    organization
  )
}
