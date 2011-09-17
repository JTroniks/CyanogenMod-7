package java.nio;
public abstract class Buffer
{
Buffer() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Object array();
public abstract  int arrayOffset();
public final  int capacity() { throw new RuntimeException("Stub!"); }
public final  java.nio.Buffer clear() { throw new RuntimeException("Stub!"); }
public final  java.nio.Buffer flip() { throw new RuntimeException("Stub!"); }
public abstract  boolean hasArray();
public final  boolean hasRemaining() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDirect();
public abstract  boolean isReadOnly();
public final  int limit() { throw new RuntimeException("Stub!"); }
public final  java.nio.Buffer limit(int newLimit) { throw new RuntimeException("Stub!"); }
public final  java.nio.Buffer mark() { throw new RuntimeException("Stub!"); }
public final  int position() { throw new RuntimeException("Stub!"); }
public final  java.nio.Buffer position(int newPosition) { throw new RuntimeException("Stub!"); }
public final  int remaining() { throw new RuntimeException("Stub!"); }
public final  java.nio.Buffer reset() { throw new RuntimeException("Stub!"); }
public final  java.nio.Buffer rewind() { throw new RuntimeException("Stub!"); }
}
