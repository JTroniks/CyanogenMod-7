package java.util.zip;
public class InflaterOutputStream
  extends java.io.FilterOutputStream
{
public  InflaterOutputStream(java.io.OutputStream out) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  InflaterOutputStream(java.io.OutputStream out, java.util.zip.Inflater inf) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  InflaterOutputStream(java.io.OutputStream out, java.util.zip.Inflater inf, int bufferSize) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void finish() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int b) throws java.io.IOException, java.util.zip.ZipException { throw new RuntimeException("Stub!"); }
public  void write(byte[] b, int off, int len) throws java.io.IOException, java.util.zip.ZipException { throw new RuntimeException("Stub!"); }
protected final java.util.zip.Inflater inf;
protected final byte[] buf = null;
}
