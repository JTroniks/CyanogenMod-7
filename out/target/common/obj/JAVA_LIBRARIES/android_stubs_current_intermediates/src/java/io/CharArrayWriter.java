package java.io;
public class CharArrayWriter
  extends java.io.Writer
{
public  CharArrayWriter() { throw new RuntimeException("Stub!"); }
public  CharArrayWriter(int initialSize) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void flush() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  char[] toCharArray() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void write(char[] buffer, int offset, int len) { throw new RuntimeException("Stub!"); }
public  void write(int oneChar) { throw new RuntimeException("Stub!"); }
public  void write(java.lang.String str, int offset, int len) { throw new RuntimeException("Stub!"); }
public  void writeTo(java.io.Writer out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.CharArrayWriter append(char c) { throw new RuntimeException("Stub!"); }
public  java.io.CharArrayWriter append(java.lang.CharSequence csq) { throw new RuntimeException("Stub!"); }
public  java.io.CharArrayWriter append(java.lang.CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
protected char[] buf = null;
protected int count;
}
