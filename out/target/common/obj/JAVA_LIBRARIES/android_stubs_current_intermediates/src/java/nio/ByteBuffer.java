package java.nio;
public abstract class ByteBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.ByteBuffer>
{
ByteBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.ByteBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.ByteBuffer allocateDirect(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.ByteBuffer wrap(byte[] array) { throw new RuntimeException("Stub!"); }
public static  java.nio.ByteBuffer wrap(byte[] array, int start, int len) { throw new RuntimeException("Stub!"); }
public final  byte[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.CharBuffer asCharBuffer();
public abstract  java.nio.DoubleBuffer asDoubleBuffer();
public abstract  java.nio.FloatBuffer asFloatBuffer();
public abstract  java.nio.IntBuffer asIntBuffer();
public abstract  java.nio.LongBuffer asLongBuffer();
public abstract  java.nio.ByteBuffer asReadOnlyBuffer();
public abstract  java.nio.ShortBuffer asShortBuffer();
public abstract  java.nio.ByteBuffer compact();
public  int compareTo(java.nio.ByteBuffer otherBuffer) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ByteBuffer duplicate();
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public abstract  byte get();
public  java.nio.ByteBuffer get(byte[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer get(byte[] dst, int off, int len) { throw new RuntimeException("Stub!"); }
public abstract  byte get(int index);
public abstract  char getChar();
public abstract  char getChar(int index);
public abstract  double getDouble();
public abstract  double getDouble(int index);
public abstract  float getFloat();
public abstract  float getFloat(int index);
public abstract  int getInt();
public abstract  int getInt(int index);
public abstract  long getLong();
public abstract  long getLong(int index);
public abstract  short getShort();
public abstract  short getShort(int index);
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDirect();
public final  java.nio.ByteOrder order() { throw new RuntimeException("Stub!"); }
public final  java.nio.ByteBuffer order(java.nio.ByteOrder byteOrder) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ByteBuffer put(byte b);
public final  java.nio.ByteBuffer put(byte[] src) { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer put(byte[] src, int off, int len) { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer put(java.nio.ByteBuffer src) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ByteBuffer put(int index, byte b);
public abstract  java.nio.ByteBuffer putChar(char value);
public abstract  java.nio.ByteBuffer putChar(int index, char value);
public abstract  java.nio.ByteBuffer putDouble(double value);
public abstract  java.nio.ByteBuffer putDouble(int index, double value);
public abstract  java.nio.ByteBuffer putFloat(float value);
public abstract  java.nio.ByteBuffer putFloat(int index, float value);
public abstract  java.nio.ByteBuffer putInt(int value);
public abstract  java.nio.ByteBuffer putInt(int index, int value);
public abstract  java.nio.ByteBuffer putLong(long value);
public abstract  java.nio.ByteBuffer putLong(int index, long value);
public abstract  java.nio.ByteBuffer putShort(short value);
public abstract  java.nio.ByteBuffer putShort(int index, short value);
public abstract  java.nio.ByteBuffer slice();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
