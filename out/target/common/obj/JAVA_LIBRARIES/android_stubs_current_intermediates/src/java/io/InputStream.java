package java.io;
public abstract class InputStream
  implements java.io.Closeable
{
public  InputStream() { throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void mark(int readlimit) { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public abstract  int read() throws java.io.IOException;
public  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b, int offset, int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
