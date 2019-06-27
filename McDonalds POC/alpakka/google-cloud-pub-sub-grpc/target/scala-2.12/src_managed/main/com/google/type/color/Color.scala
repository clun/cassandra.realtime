// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.`type`.color

/** Represents a color in the RGBA color space. This representation is designed
  * for simplicity of conversion to/from color representations in various
  * languages over compactness; for example, the fields of this representation
  * can be trivially provided to the constructor of "java.awt.Color" in Java; it
  * can also be trivially provided to UIColor's "+colorWithRed:green:blue:alpha"
  * method in iOS; and, with just a little work, it can be easily formatted into
  * a CSS "rgba()" string in JavaScript, as well. Here are some examples:
  *
  * Example (Java):
  *
  *      import com.google.type.Color;
  *
  *      // ...
  *      public static java.awt.Color fromProto(Color protocolor) {
  *        float alpha = protocolor.hasAlpha()
  *            ? protocolor.getAlpha().getValue()
  *            : 1.0;
  *
  *        return new java.awt.Color(
  *            protocolor.getRed(),
  *            protocolor.getGreen(),
  *            protocolor.getBlue(),
  *            alpha);
  *      }
  *
  *      public static Color toProto(java.awt.Color color) {
  *        float red = (float) color.getRed();
  *        float green = (float) color.getGreen();
  *        float blue = (float) color.getBlue();
  *        float denominator = 255.0;
  *        Color.Builder resultBuilder =
  *            Color
  *                .newBuilder()
  *                .setRed(red / denominator)
  *                .setGreen(green / denominator)
  *                .setBlue(blue / denominator);
  *        int alpha = color.getAlpha();
  *        if (alpha != 255) {
  *          result.setAlpha(
  *              FloatValue
  *                  .newBuilder()
  *                  .setValue(((float) alpha) / denominator)
  *                  .build());
  *        }
  *        return resultBuilder.build();
  *      }
  *      // ...
  *
  * Example (iOS / Obj-C):
  *
  *      // ...
  *      static UIColor* fromProto(Color* protocolor) {
  *         float red = [protocolor red];
  *         float green = [protocolor green];
  *         float blue = [protocolor blue];
  *         FloatValue* alpha_wrapper = [protocolor alpha];
  *         float alpha = 1.0;
  *         if (alpha_wrapper != nil) {
  *           alpha = [alpha_wrapper value];
  *         }
  *         return [UIColor colorWithRed:red green:green blue:blue alpha:alpha];
  *      }
  *
  *      static Color* toProto(UIColor* color) {
  *          CGFloat red, green, blue, alpha;
  *          if (![color getRed:&amp;red green:&amp;green blue:&amp;blue alpha:&amp;alpha]) {
  *            return nil;
  *          }
  *          Color* result = [Color alloc] init];
  *          [result setRed:red];
  *          [result setGreen:green];
  *          [result setBlue:blue];
  *          if (alpha &lt;= 0.9999) {
  *            [result setAlpha:floatWrapperWithValue(alpha)];
  *          }
  *          [result autorelease];
  *          return result;
  *     }
  *     // ...
  *
  *  Example (JavaScript):
  *
  *     // ...
  *
  *     var protoToCssColor = function(rgb_color) {
  *        var redFrac = rgb_color.red || 0.0;
  *        var greenFrac = rgb_color.green || 0.0;
  *        var blueFrac = rgb_color.blue || 0.0;
  *        var red = Math.floor(redFrac * 255);
  *        var green = Math.floor(greenFrac * 255);
  *        var blue = Math.floor(blueFrac * 255);
  *
  *        if (!('alpha' in rgb_color)) {
  *           return rgbToCssColor_(red, green, blue);
  *        }
  *
  *        var alphaFrac = rgb_color.alpha.value || 0.0;
  *        var rgbParams = [red, green, blue].join(',');
  *        return ['rgba(', rgbParams, ',', alphaFrac, ')'].join('');
  *     };
  *
  *     var rgbToCssColor_ = function(red, green, blue) {
  *       var rgbNumber = new Number((red &lt;&lt; 16) | (green &lt;&lt; 8) | blue);
  *       var hexString = rgbNumber.toString(16);
  *       var missingZeros = 6 - hexString.length;
  *       var resultBuilder = ['#'];
  *       for (var i = 0; i &lt; missingZeros; i++) {
  *          resultBuilder.push('0');
  *       }
  *       resultBuilder.push(hexString);
  *       return resultBuilder.join('');
  *     };
  *
  *     // ...
  *
  * @param red
  *   The amount of red in the color as a value in the interval [0, 1].
  * @param green
  *   The amount of green in the color as a value in the interval [0, 1].
  * @param blue
  *   The amount of blue in the color as a value in the interval [0, 1].
  * @param alpha
  *   The fraction of this color that should be applied to the pixel. That is,
  *   the final pixel color is defined by the equation:
  *  
  *     pixel color = alpha * (this color) + (1.0 - alpha) * (background color)
  *  
  *   This means that a value of 1.0 corresponds to a solid color, whereas
  *   a value of 0.0 corresponds to a completely transparent color. This
  *   uses a wrapper message rather than a simple float scalar so that it is
  *   possible to distinguish between a default value and the value being unset.
  *   If omitted, this color object is to be rendered as a solid color
  *   (as if the alpha value had been explicitly given with a value of 1.0).
  */
@SerialVersionUID(0L)
final case class Color(
    red: _root_.scala.Float = 0.0f,
    green: _root_.scala.Float = 0.0f,
    blue: _root_.scala.Float = 0.0f,
    alpha: _root_.scala.Option[_root_.scala.Float] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[Color] with scalapb.lenses.Updatable[Color] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = red
        if (__value != 0.0f) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeFloatSize(1, __value)
        }
      };
      
      {
        val __value = green
        if (__value != 0.0f) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeFloatSize(2, __value)
        }
      };
      
      {
        val __value = blue
        if (__value != 0.0f) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeFloatSize(3, __value)
        }
      };
      if (alpha.isDefined) {
        val __value = com.google.`type`.color.Color._typemapper_alpha.toBase(alpha.get)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
        val __v = red
        if (__v != 0.0f) {
          _output__.writeFloat(1, __v)
        }
      };
      {
        val __v = green
        if (__v != 0.0f) {
          _output__.writeFloat(2, __v)
        }
      };
      {
        val __v = blue
        if (__v != 0.0f) {
          _output__.writeFloat(3, __v)
        }
      };
      alpha.foreach { __v =>
        val __m = com.google.`type`.color.Color._typemapper_alpha.toBase(__v)
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.`type`.color.Color = {
      var __red = this.red
      var __green = this.green
      var __blue = this.blue
      var __alpha = this.alpha
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 13 =>
            __red = _input__.readFloat()
          case 21 =>
            __green = _input__.readFloat()
          case 29 =>
            __blue = _input__.readFloat()
          case 34 =>
            __alpha = Option(com.google.`type`.color.Color._typemapper_alpha.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, __alpha.map(com.google.`type`.color.Color._typemapper_alpha.toBase).getOrElse(com.google.protobuf.wrappers.FloatValue.defaultInstance))))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.`type`.color.Color(
          red = __red,
          green = __green,
          blue = __blue,
          alpha = __alpha
      )
    }
    def withRed(__v: _root_.scala.Float): Color = copy(red = __v)
    def withGreen(__v: _root_.scala.Float): Color = copy(green = __v)
    def withBlue(__v: _root_.scala.Float): Color = copy(blue = __v)
    def getAlpha: _root_.scala.Float = alpha.getOrElse(com.google.`type`.color.Color._typemapper_alpha.toCustom(com.google.protobuf.wrappers.FloatValue.defaultInstance))
    def clearAlpha: Color = copy(alpha = None)
    def withAlpha(__v: _root_.scala.Float): Color = copy(alpha = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = red
          if (__t != 0.0f) __t else null
        }
        case 2 => {
          val __t = green
          if (__t != 0.0f) __t else null
        }
        case 3 => {
          val __t = blue
          if (__t != 0.0f) __t else null
        }
        case 4 => alpha.map(com.google.`type`.color.Color._typemapper_alpha.toBase).orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PFloat(red)
        case 2 => _root_.scalapb.descriptors.PFloat(green)
        case 3 => _root_.scalapb.descriptors.PFloat(blue)
        case 4 => alpha.map(com.google.`type`.color.Color._typemapper_alpha.toBase(_).toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.`type`.color.Color
}

object Color extends scalapb.GeneratedMessageCompanion[com.google.`type`.color.Color] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.`type`.color.Color] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.`type`.color.Color = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.`type`.color.Color(
      __fieldsMap.getOrElse(__fields.get(0), 0.0f).asInstanceOf[_root_.scala.Float],
      __fieldsMap.getOrElse(__fields.get(1), 0.0f).asInstanceOf[_root_.scala.Float],
      __fieldsMap.getOrElse(__fields.get(2), 0.0f).asInstanceOf[_root_.scala.Float],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[com.google.protobuf.wrappers.FloatValue]].map(com.google.`type`.color.Color._typemapper_alpha.toCustom)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.`type`.color.Color] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.`type`.color.Color(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Float]).getOrElse(0.0f),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Float]).getOrElse(0.0f),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Float]).getOrElse(0.0f),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.wrappers.FloatValue]]).map(com.google.`type`.color.Color._typemapper_alpha.toCustom)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ColorProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ColorProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 4 => __out = com.google.protobuf.wrappers.FloatValue
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.`type`.color.Color(
  )
  implicit class ColorLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.`type`.color.Color]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.`type`.color.Color](_l) {
    def red: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Float] = field(_.red)((c_, f_) => c_.copy(red = f_))
    def green: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Float] = field(_.green)((c_, f_) => c_.copy(green = f_))
    def blue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Float] = field(_.blue)((c_, f_) => c_.copy(blue = f_))
    def alpha: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Float] = field(_.getAlpha)((c_, f_) => c_.copy(alpha = Option(f_)))
    def optionalAlpha: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Float]] = field(_.alpha)((c_, f_) => c_.copy(alpha = f_))
  }
  final val RED_FIELD_NUMBER = 1
  final val GREEN_FIELD_NUMBER = 2
  final val BLUE_FIELD_NUMBER = 3
  final val ALPHA_FIELD_NUMBER = 4
  @transient
  private val _typemapper_alpha: _root_.scalapb.TypeMapper[com.google.protobuf.wrappers.FloatValue, _root_.scala.Float] = implicitly[_root_.scalapb.TypeMapper[com.google.protobuf.wrappers.FloatValue, _root_.scala.Float]]
  def of(
    red: _root_.scala.Float,
    green: _root_.scala.Float,
    blue: _root_.scala.Float,
    alpha: _root_.scala.Option[_root_.scala.Float]
  ): _root_.com.google.`type`.color.Color = _root_.com.google.`type`.color.Color(
    red,
    green,
    blue,
    alpha
  )
}
