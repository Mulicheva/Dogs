// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dog.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.grpc.examples.animals;

@kotlin.jvm.JvmName("-initializebarkRequest")
public inline fun barkRequest(block: io.grpc.examples.animals.BarkRequestKt.Dsl.() -> kotlin.Unit): io.grpc.examples.animals.BarkRequest =
  io.grpc.examples.animals.BarkRequestKt.Dsl._create(io.grpc.examples.animals.BarkRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `animals.BarkRequest`
 */
public object BarkRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.grpc.examples.animals.BarkRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.grpc.examples.animals.BarkRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.grpc.examples.animals.BarkRequest = _builder.build()

    /**
     * `string whoBark = 1;`
     */
    public var whoBark: kotlin.String
      @JvmName("getWhoBark")
      get() = _builder.getWhoBark()
      @JvmName("setWhoBark")
      set(value) {
        _builder.setWhoBark(value)
      }
    /**
     * `string whoBark = 1;`
     */
    public fun clearWhoBark() {
      _builder.clearWhoBark()
    }

    /**
     * `string whereBark = 2;`
     */
    public var whereBark: kotlin.String
      @JvmName("getWhereBark")
      get() = _builder.getWhereBark()
      @JvmName("setWhereBark")
      set(value) {
        _builder.setWhereBark(value)
      }
    /**
     * `string whereBark = 2;`
     */
    public fun clearWhereBark() {
      _builder.clearWhereBark()
    }

    /**
     * `string whyBark = 3;`
     */
    public var whyBark: kotlin.String
      @JvmName("getWhyBark")
      get() = _builder.getWhyBark()
      @JvmName("setWhyBark")
      set(value) {
        _builder.setWhyBark(value)
      }
    /**
     * `string whyBark = 3;`
     */
    public fun clearWhyBark() {
      _builder.clearWhyBark()
    }

    /**
     * `int32 howManyTimesBark = 4;`
     */
    public var howManyTimesBark: kotlin.Int
      @JvmName("getHowManyTimesBark")
      get() = _builder.getHowManyTimesBark()
      @JvmName("setHowManyTimesBark")
      set(value) {
        _builder.setHowManyTimesBark(value)
      }
    /**
     * `int32 howManyTimesBark = 4;`
     */
    public fun clearHowManyTimesBark() {
      _builder.clearHowManyTimesBark()
    }
  }
}
@kotlin.jvm.JvmSynthetic
@com.google.errorprone.annotations.CheckReturnValue
public inline fun io.grpc.examples.animals.BarkRequest.copy(block: io.grpc.examples.animals.BarkRequestKt.Dsl.() -> kotlin.Unit): io.grpc.examples.animals.BarkRequest =
  io.grpc.examples.animals.BarkRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

