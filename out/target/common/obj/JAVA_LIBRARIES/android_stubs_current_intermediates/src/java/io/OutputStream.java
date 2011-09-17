package java.io;
public abstract class OutputStream
  implements java.io.Closeable, java.io.Flushable
{
public  OutputStream() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void write(int oneByte) throws java.io.IOException;
}
