package java.util.zip;
public class InflaterInputStream
  extends java.io.FilterInputStream
{
public  InflaterInputStream(java.io.InputStream is) { super((java.io.InputStream)null); throw new RuntimeException("Stub!"); }
public  InflaterInputStream(java.io.InputStream is, java.util.zip.Inflater inflater) { super((java.io.InputStream)null); throw new RuntimeException("Stub!"); }
public  InflaterInputStream(java.io.InputStream is, java.util.zip.Inflater inflater, int bsize) { super((java.io.InputStream)null); throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer, int off, int nbytes) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void fill() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long skip(long byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void mark(int readlimit) { throw new RuntimeException("Stub!"); }
public  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean markSupported() { throw new RuntimeException("Stub!"); }
protected java.util.zip.Inflater inf;
protected byte[] buf = null;
protected int len;
}
