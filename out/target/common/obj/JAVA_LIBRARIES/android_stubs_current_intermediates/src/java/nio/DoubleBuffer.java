package java.nio;
public abstract class DoubleBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.DoubleBuffer>
{
DoubleBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.DoubleBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.DoubleBuffer wrap(double[] array) { throw new RuntimeException("Stub!"); }
public static  java.nio.DoubleBuffer wrap(double[] array, int start, int len) { throw new RuntimeException("Stub!"); }
public final  double[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.DoubleBuffer asReadOnlyBuffer();
public abstract  java.nio.DoubleBuffer compact();
public  int compareTo(java.nio.DoubleBuffer otherBuffer) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.DoubleBuffer duplicate();
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public abstract  double get();
public  java.nio.DoubleBuffer get(double[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.DoubleBuffer get(double[] dst, int off, int len) { throw new RuntimeException("Stub!"); }
public abstract  double get(int index);
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDirect();
public abstract  java.nio.ByteOrder order();
public abstract  java.nio.DoubleBuffer put(double d);
public final  java.nio.DoubleBuffer put(double[] src) { throw new RuntimeException("Stub!"); }
public  java.nio.DoubleBuffer put(double[] src, int off, int len) { throw new RuntimeException("Stub!"); }
public  java.nio.DoubleBuffer put(java.nio.DoubleBuffer src) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.DoubleBuffer put(int index, double d);
public abstract  java.nio.DoubleBuffer slice();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
