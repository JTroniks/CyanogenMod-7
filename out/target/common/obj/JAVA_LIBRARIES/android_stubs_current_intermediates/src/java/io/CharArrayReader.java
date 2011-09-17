package java.io;
public class CharArrayReader
  extends java.io.Reader
{
public  CharArrayReader(char[] buf) { throw new RuntimeException("Stub!"); }
public  CharArrayReader(char[] buf, int offset, int length) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void mark(int readLimit) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(char[] buffer, int offset, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean ready() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long n) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected char[] buf = null;
protected int pos;
protected int markedPos;
protected int count;
}
