package java.nio;
public abstract class LongBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.LongBuffer>
{
LongBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.LongBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.LongBuffer wrap(long[] array) { throw new RuntimeException("Stub!"); }
public static  java.nio.LongBuffer wrap(long[] array, int start, int len) { throw new RuntimeException("Stub!"); }
public final  long[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.LongBuffer asReadOnlyBuffer();
public abstract  java.nio.LongBuffer compact();
public  int compareTo(java.nio.LongBuffer otherBuffer) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.LongBuffer duplicate();
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public abstract  long get();
public  java.nio.LongBuffer get(long[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.LongBuffer get(long[] dst, int off, int len) { throw new RuntimeException("Stub!"); }
public abstract  long get(int index);
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDirect();
public abstract  java.nio.ByteOrder order();
public abstract  java.nio.LongBuffer put(long l);
public final  java.nio.LongBuffer put(long[] src) { throw new RuntimeException("Stub!"); }
public  java.nio.LongBuffer put(long[] src, int off, int len) { throw new RuntimeException("Stub!"); }
public  java.nio.LongBuffer put(java.nio.LongBuffer src) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.LongBuffer put(int index, long l);
public abstract  java.nio.LongBuffer slice();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
