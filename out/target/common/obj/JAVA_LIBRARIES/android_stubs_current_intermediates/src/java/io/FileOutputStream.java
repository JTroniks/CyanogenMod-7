package java.io;
public class FileOutputStream
  extends java.io.OutputStream
  implements java.io.Closeable
{
public  FileOutputStream(java.io.File file) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  FileOutputStream(java.io.File file, boolean append) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  FileOutputStream(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  FileOutputStream(java.lang.String filename) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  FileOutputStream(java.lang.String filename, boolean append) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.nio.channels.FileChannel getChannel() { throw new RuntimeException("Stub!"); }
public final  java.io.FileDescriptor getFD() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int oneByte) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
