package java.io;
public class BufferedInputStream
  extends java.io.FilterInputStream
{
public  BufferedInputStream(java.io.InputStream in) { super((java.io.InputStream)null); throw new RuntimeException("Stub!"); }
public  BufferedInputStream(java.io.InputStream in, int size) { super((java.io.InputStream)null); throw new RuntimeException("Stub!"); }
public synchronized  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void mark(int readlimit) { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public synchronized  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  int read(byte[] buffer, int offset, int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  long skip(long amount) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected volatile byte[] buf = null;
protected int count;
protected int marklimit;
protected int markpos;
protected int pos;
}
