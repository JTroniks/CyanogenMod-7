package java.io;
public abstract class FilterReader
  extends java.io.Reader
{
protected  FilterReader(java.io.Reader in) { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void mark(int readlimit) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(char[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean ready() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected java.io.Reader in;
}
