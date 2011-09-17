package java.nio.channels;
public abstract class FileLock
{
protected  FileLock(java.nio.channels.FileChannel channel, long position, long size, boolean shared) { throw new RuntimeException("Stub!"); }
public final  java.nio.channels.FileChannel channel() { throw new RuntimeException("Stub!"); }
public final  long position() { throw new RuntimeException("Stub!"); }
public final  long size() { throw new RuntimeException("Stub!"); }
public final  boolean isShared() { throw new RuntimeException("Stub!"); }
public final  boolean overlaps(long start, long length) { throw new RuntimeException("Stub!"); }
public abstract  boolean isValid();
public abstract  void release() throws java.io.IOException;
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
