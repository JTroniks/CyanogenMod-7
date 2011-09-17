package java.io;
public abstract class Reader
  implements java.lang.Readable, java.io.Closeable
{
protected  Reader() { throw new RuntimeException("Stub!"); }
protected  Reader(java.lang.Object lock) { throw new RuntimeException("Stub!"); }
public abstract  void close() throws java.io.IOException;
public  void mark(int readLimit) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(char[] buf) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  int read(char[] buf, int offset, int count) throws java.io.IOException;
public  boolean ready() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(java.nio.CharBuffer target) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected java.lang.Object lock;
}
