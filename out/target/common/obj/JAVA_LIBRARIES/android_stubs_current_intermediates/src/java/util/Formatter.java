package java.util;
public final class Formatter
  implements java.io.Closeable, java.io.Flushable
{
public static enum BigDecimalLayoutForm
{
DECIMAL_FLOAT(),
SCIENTIFIC();
}
public  Formatter() { throw new RuntimeException("Stub!"); }
public  Formatter(java.lang.Appendable a) { throw new RuntimeException("Stub!"); }
public  Formatter(java.util.Locale l) { throw new RuntimeException("Stub!"); }
public  Formatter(java.lang.Appendable a, java.util.Locale l) { throw new RuntimeException("Stub!"); }
public  Formatter(java.lang.String fileName) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  Formatter(java.lang.String fileName, java.lang.String csn) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  Formatter(java.lang.String fileName, java.lang.String csn, java.util.Locale l) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  Formatter(java.io.File file) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  Formatter(java.io.File file, java.lang.String csn) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  Formatter(java.io.File file, java.lang.String csn, java.util.Locale l) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  Formatter(java.io.OutputStream os) { throw new RuntimeException("Stub!"); }
public  Formatter(java.io.OutputStream os, java.lang.String csn) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  Formatter(java.io.OutputStream os, java.lang.String csn, java.util.Locale l) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  Formatter(java.io.PrintStream ps) { throw new RuntimeException("Stub!"); }
public  java.util.Locale locale() { throw new RuntimeException("Stub!"); }
public  java.lang.Appendable out() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void flush() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  java.io.IOException ioException() { throw new RuntimeException("Stub!"); }
public  java.util.Formatter format(java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.util.Formatter format(java.util.Locale l, java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
}
