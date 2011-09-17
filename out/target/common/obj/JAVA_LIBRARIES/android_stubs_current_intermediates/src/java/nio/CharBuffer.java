package java.nio;
public abstract class CharBuffer
  extends java.nio.Buffer
  implements java.lang.Comparable<java.nio.CharBuffer>, java.lang.CharSequence, java.lang.Appendable, java.lang.Readable
{
CharBuffer() { throw new RuntimeException("Stub!"); }
public static  java.nio.CharBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
public static  java.nio.CharBuffer wrap(char[] array) { throw new RuntimeException("Stub!"); }
public static  java.nio.CharBuffer wrap(char[] array, int start, int len) { throw new RuntimeException("Stub!"); }
public static  java.nio.CharBuffer wrap(java.lang.CharSequence chseq) { throw new RuntimeException("Stub!"); }
public static  java.nio.CharBuffer wrap(java.lang.CharSequence chseq, int start, int end) { throw new RuntimeException("Stub!"); }
public final  char[] array() { throw new RuntimeException("Stub!"); }
public final  int arrayOffset() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.CharBuffer asReadOnlyBuffer();
public final  char charAt(int index) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.CharBuffer compact();
public  int compareTo(java.nio.CharBuffer otherBuffer) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.CharBuffer duplicate();
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public abstract  char get();
public  java.nio.CharBuffer get(char[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.CharBuffer get(char[] dst, int off, int len) { throw new RuntimeException("Stub!"); }
public abstract  char get(int index);
public final  boolean hasArray() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  boolean isDirect();
public final  int length() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.ByteOrder order();
public abstract  java.nio.CharBuffer put(char c);
public final  java.nio.CharBuffer put(char[] src) { throw new RuntimeException("Stub!"); }
public  java.nio.CharBuffer put(char[] src, int off, int len) { throw new RuntimeException("Stub!"); }
public  java.nio.CharBuffer put(java.nio.CharBuffer src) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.CharBuffer put(int index, char c);
public final  java.nio.CharBuffer put(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  java.nio.CharBuffer put(java.lang.String str, int start, int end) { throw new RuntimeException("Stub!"); }
public abstract  java.nio.CharBuffer slice();
public abstract  java.lang.CharSequence subSequence(int start, int end);
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.nio.CharBuffer append(char c) { throw new RuntimeException("Stub!"); }
public  java.nio.CharBuffer append(java.lang.CharSequence csq) { throw new RuntimeException("Stub!"); }
public  java.nio.CharBuffer append(java.lang.CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
public  int read(java.nio.CharBuffer target) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
