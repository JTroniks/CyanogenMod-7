package java.io;
public class FileInputStream
  extends java.io.InputStream
  implements java.io.Closeable
{
public  FileInputStream(java.io.File file) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  FileInputStream(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  FileInputStream(java.lang.String fileName) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.nio.channels.FileChannel getChannel() { throw new RuntimeException("Stub!"); }
public final  java.io.FileDescriptor getFD() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
