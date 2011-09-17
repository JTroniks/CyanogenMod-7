package java.nio.channels;
public interface ReadableByteChannel
  extends java.nio.channels.Channel
{
public abstract  int read(java.nio.ByteBuffer buffer) throws java.io.IOException;
}
