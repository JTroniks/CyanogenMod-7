package java.io;
public class BufferedOutputStream
  extends java.io.FilterOutputStream
{
public  BufferedOutputStream(java.io.OutputStream out) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  BufferedOutputStream(java.io.OutputStream out, int size) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public synchronized  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void write(byte[] buffer, int offset, int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void write(int oneByte) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected byte[] buf = null;
protected int count;
}
