package java.util.zip;
public class ZipOutputStream
  extends java.util.zip.DeflaterOutputStream
{
public  ZipOutputStream(java.io.OutputStream p1) { super((java.io.OutputStream)null,(java.util.zip.Deflater)null,0); throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void closeEntry() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void finish() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void putNextEntry(java.util.zip.ZipEntry ze) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setComment(java.lang.String comment) { throw new RuntimeException("Stub!"); }
public  void setLevel(int level) { throw new RuntimeException("Stub!"); }
public  void setMethod(int method) { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer, int off, int nbytes) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final int DEFLATED = 8;
public static final int STORED = 0;
}
