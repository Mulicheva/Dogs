// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dog.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.grpc.examples.animals;

@kotlin.jvm.JvmName("-initializebarkReply")
public inline fun barkReply(block: io.grpc.examples.animals.BarkReplyKt.Dsl.() -> kotlin.Unit): io.grpc.examples.animals.BarkReply =
  io.grpc.examples.animals.BarkReplyKt.Dsl._create(io.grpc.examples.animals.BarkReply.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `animals.BarkReply`
 */
public object BarkReplyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.grpc.examples.animals.BarkReply.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.grpc.examples.animals.BarkReply.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.grpc.examples.animals.BarkReply = _builder.build()

    /**
     * `string message = 1;`
     */
    public var message: kotlin.String
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * `string message = 1;`
     */
    public fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
@com.google.errorprone.annotations.CheckReturnValue
public inline fun io.grpc.examples.animals.BarkReply.copy(block: io.grpc.examples.animals.BarkReplyKt.Dsl.() -> kotlin.Unit): io.grpc.examples.animals.BarkReply =
  io.grpc.examples.animals.BarkReplyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

