package java.nio.channels;
public interface GatheringByteChannel
  extends java.nio.channels.WritableByteChannel
{
public abstract  long write(java.nio.ByteBuffer[] buffers) throws java.io.IOException;
public abstract  long write(java.nio.ByteBuffer[] buffers, int offset, int length) throws java.io.IOException;
}
