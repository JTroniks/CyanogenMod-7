package java.util.zip;
public class GZIPInputStream
  extends java.util.zip.InflaterInputStream
{
public  GZIPInputStream(java.io.InputStream is) throws java.io.IOException { super((java.io.InputStream)null,(java.util.zip.Inflater)null,0); throw new RuntimeException("Stub!"); }
public  GZIPInputStream(java.io.InputStream is, int size) throws java.io.IOException { super((java.io.InputStream)null,(java.util.zip.Inflater)null,0); throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer, int off, int nbytes) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final int GZIP_MAGIC = 35615;
protected java.util.zip.CRC32 crc;
protected boolean eos;
}
