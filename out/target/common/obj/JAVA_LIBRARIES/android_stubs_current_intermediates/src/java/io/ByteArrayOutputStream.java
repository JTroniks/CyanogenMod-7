package java.io;
public class ByteArrayOutputStream
  extends java.io.OutputStream
{
public  ByteArrayOutputStream() { throw new RuntimeException("Stub!"); }
public  ByteArrayOutputStream(int size) { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void reset() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public synchronized  byte[] toByteArray() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString(int hibyte) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString(java.lang.String enc) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public synchronized  void write(byte[] buffer, int offset, int len) { throw new RuntimeException("Stub!"); }
public synchronized  void write(int oneByte) { throw new RuntimeException("Stub!"); }
public synchronized  void writeTo(java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected byte[] buf = null;
protected int count;
}
