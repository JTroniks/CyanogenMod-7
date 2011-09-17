package java.io;
public class ByteArrayInputStream
  extends java.io.InputStream
{
public  ByteArrayInputStream(byte[] buf) { throw new RuntimeException("Stub!"); }
public  ByteArrayInputStream(byte[] buf, int offset, int length) { throw new RuntimeException("Stub!"); }
public synchronized  int available() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void mark(int readlimit) { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public synchronized  int read() { throw new RuntimeException("Stub!"); }
public synchronized  int read(byte[] buffer, int offset, int length) { throw new RuntimeException("Stub!"); }
public synchronized  void reset() { throw new RuntimeException("Stub!"); }
public synchronized  long skip(long n) { throw new RuntimeException("Stub!"); }
protected byte[] buf = null;
protected int pos;
protected int mark;
protected int count;
}
