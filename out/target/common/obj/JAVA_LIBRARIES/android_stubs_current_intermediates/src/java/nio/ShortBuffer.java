package java.nio;
public abstract class ShortBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.ShortBuffer>
{
ShortBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.ShortBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.ShortBuffer wrap(short[] array) { throw new RuntimeException("Stub!"); }
public static  java.nio.ShortBuffer wrap(short[] array, int start, int len) { throw new RuntimeException("Stub!"); }
public final  short[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ShortBuffer asReadOnlyBuffer();
public abstract  java.nio.ShortBuffer compact();
public  int compareTo(java.nio.ShortBuffer otherBuffer) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ShortBuffer duplicate();
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public abstract  short get();
public  java.nio.ShortBuffer get(short[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.ShortBuffer get(short[] dst, int off, int len) { throw new RuntimeException("Stub!"); }
public abstract  short get(int index);
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDirect();
public abstract  java.nio.ByteOrder order();
public abstract  java.nio.ShortBuffer put(short s);
public final  java.nio.ShortBuffer put(short[] src) { throw new RuntimeException("Stub!"); }
public  java.nio.ShortBuffer put(short[] src, int off, int len) { throw new RuntimeException("Stub!"); }
public  java.nio.ShortBuffer put(java.nio.ShortBuffer src) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ShortBuffer put(int index, short s);
public abstract  java.nio.ShortBuffer slice();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
