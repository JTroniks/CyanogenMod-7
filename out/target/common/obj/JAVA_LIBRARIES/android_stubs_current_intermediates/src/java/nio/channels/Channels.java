package java.nio.channels;
public final class Channels
{
Channels() { throw new RuntimeException("Stub!"); }
public static  java.io.InputStream newInputStream(java.nio.channels.ReadableByteChannel channel) { throw new RuntimeException("Stub!"); }
public static  java.io.OutputStream newOutputStream(java.nio.channels.WritableByteChannel channel) { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.ReadableByteChannel newChannel(java.io.InputStream inputStream) { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.WritableByteChannel newChannel(java.io.OutputStream outputStream) { throw new RuntimeException("Stub!"); }
public static  java.io.Reader newReader(java.nio.channels.ReadableByteChannel channel, java.nio.charset.CharsetDecoder decoder, int minBufferCapacity) { throw new RuntimeException("Stub!"); }
public static  java.io.Reader newReader(java.nio.channels.ReadableByteChannel channel, java.lang.String charsetName) { throw new RuntimeException("Stub!"); }
public static  java.io.Writer newWriter(java.nio.channels.WritableByteChannel channel, java.nio.charset.CharsetEncoder encoder, int minBufferCapacity) { throw new RuntimeException("Stub!"); }
public static  java.io.Writer newWriter(java.nio.channels.WritableByteChannel channel, java.lang.String charsetName) { throw new RuntimeException("Stub!"); }
}
