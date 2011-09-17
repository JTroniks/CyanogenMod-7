package java.nio;
public abstract class FloatBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.FloatBuffer>
{
FloatBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.FloatBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.FloatBuffer wrap(float[] array) { throw new RuntimeException("Stub!"); }
public static  java.nio.FloatBuffer wrap(float[] array, int start, int len) { throw new RuntimeException("Stub!"); }
public final  float[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.FloatBuffer asReadOnlyBuffer();
public abstract  java.nio.FloatBuffer compact();
public  int compareTo(java.nio.FloatBuffer otherBuffer) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.FloatBuffer duplicate();
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public abstract  float get();
public  java.nio.FloatBuffer get(float[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.FloatBuffer get(float[] dst, int off, int len) { throw new RuntimeException("Stub!"); }
public abstract  float get(int index);
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDirect();
public abstract  java.nio.ByteOrder order();
public abstract  java.nio.FloatBuffer put(float f);
public final  java.nio.FloatBuffer put(float[] src) { throw new RuntimeException("Stub!"); }
public  java.nio.FloatBuffer put(float[] src, int off, int len) { throw new RuntimeException("Stub!"); }
public  java.nio.FloatBuffer put(java.nio.FloatBuffer src) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.FloatBuffer put(int index, float f);
public abstract  java.nio.FloatBuffer slice();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
