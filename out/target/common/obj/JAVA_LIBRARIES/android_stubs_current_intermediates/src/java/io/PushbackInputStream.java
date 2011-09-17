package java.io;
public class PushbackInputStream
  extends java.io.FilterInputStream
{
public  PushbackInputStream(java.io.InputStream in) { super((java.io.InputStream)null); throw new RuntimeException("Stub!"); }
public  PushbackInputStream(java.io.InputStream in, int size) { super((java.io.InputStream)null); throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer, int offset, int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void unread(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void unread(byte[] buffer, int offset, int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void unread(int oneByte) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void mark(int readlimit) { throw new RuntimeException("Stub!"); }
public  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected byte[] buf = null;
protected int pos;
}
