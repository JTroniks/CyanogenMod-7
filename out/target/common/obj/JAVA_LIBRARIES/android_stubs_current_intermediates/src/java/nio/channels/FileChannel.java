package java.nio.channels;
public abstract class FileChannel
  extends java.nio.channels.spi.AbstractInterruptibleChannel
  implements java.nio.channels.GatheringByteChannel, java.nio.channels.ScatteringByteChannel, java.nio.channels.ByteChannel
{
public static class MapMode
{
MapMode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final java.nio.channels.FileChannel.MapMode PRIVATE;
public static final java.nio.channels.FileChannel.MapMode READ_ONLY;
public static final java.nio.channels.FileChannel.MapMode READ_WRITE;
static { PRIVATE = null; READ_ONLY = null; READ_WRITE = null; }
}
protected  FileChannel() { throw new RuntimeException("Stub!"); }
public abstract  void force(boolean metadata) throws java.io.IOException;
public final  java.nio.channels.FileLock lock() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.FileLock lock(long position, long size, boolean shared) throws java.io.IOException;
public abstract  java.nio.MappedByteBuffer map(java.nio.channels.FileChannel.MapMode mode, long position, long size) throws java.io.IOException;
public abstract  long position() throws java.io.IOException;
public abstract  java.nio.channels.FileChannel position(long offset) throws java.io.IOException;
public abstract  int read(java.nio.ByteBuffer buffer) throws java.io.IOException;
public abstract  int read(java.nio.ByteBuffer buffer, long position) throws java.io.IOException;
public final  long read(java.nio.ByteBuffer[] buffers) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  long read(java.nio.ByteBuffer[] buffers, int start, int number) throws java.io.IOException;
public abstract  long size() throws java.io.IOException;
public abstract  long transferFrom(java.nio.channels.ReadableByteChannel src, long position, long count) throws java.io.IOException;
public abstract  long transferTo(long position, long count, java.nio.channels.WritableByteChannel target) throws java.io.IOException;
public abstract  java.nio.channels.FileChannel truncate(long size) throws java.io.IOException;
public final  java.nio.channels.FileLock tryLock() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.FileLock tryLock(long position, long size, boolean shared) throws java.io.IOException;
public abstract  int write(java.nio.ByteBuffer src) throws java.io.IOException;
public abstract  int write(java.nio.ByteBuffer buffer, long position) throws java.io.IOException;
public final  long write(java.nio.ByteBuffer[] buffers) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  long write(java.nio.ByteBuffer[] buffers, int offset, int length) throws java.io.IOException;
}
