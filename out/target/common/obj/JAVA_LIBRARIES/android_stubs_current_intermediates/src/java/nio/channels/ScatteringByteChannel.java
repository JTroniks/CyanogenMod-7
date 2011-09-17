package java.nio.channels;
public interface ScatteringByteChannel
  extends java.nio.channels.ReadableByteChannel
{
public abstract  long read(java.nio.ByteBuffer[] buffers) throws java.io.IOException;
public abstract  long read(java.nio.ByteBuffer[] buffers, int offset, int length) throws java.io.IOException;
}
