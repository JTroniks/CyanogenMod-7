package java.nio;
public abstract class IntBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.IntBuffer>
{
IntBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.IntBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.IntBuffer wrap(int[] array) { throw new RuntimeException("Stub!"); }
public static  java.nio.IntBuffer wrap(int[] array, int start, int len) { throw new RuntimeException("Stub!"); }
public final  int[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.IntBuffer asReadOnlyBuffer();
public abstract  java.nio.IntBuffer compact();
public  int compareTo(java.nio.IntBuffer otherBuffer) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.IntBuffer duplicate();
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public abstract  int get();
public  java.nio.IntBuffer get(int[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.IntBuffer get(int[] dst, int off, int len) { throw new RuntimeException("Stub!"); }
public abstract  int get(int index);
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDirect();
public abstract  java.nio.ByteOrder order();
public abstract  java.nio.IntBuffer put(int i);
public final  java.nio.IntBuffer put(int[] src) { throw new RuntimeException("Stub!"); }
public  java.nio.IntBuffer put(int[] src, int off, int len) { throw new RuntimeException("Stub!"); }
public  java.nio.IntBuffer put(java.nio.IntBuffer src) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.IntBuffer put(int index, int i);
public abstract  java.nio.IntBuffer slice();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
