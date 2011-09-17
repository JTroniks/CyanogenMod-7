package java.io;
public class PrintStream
  extends java.io.FilterOutputStream
  implements java.lang.Appendable, java.io.Closeable
{
public  PrintStream(java.io.OutputStream out) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.io.OutputStream out, boolean autoflush) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.io.OutputStream out, boolean autoflush, java.lang.String enc) throws java.io.UnsupportedEncodingException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.io.File file) throws java.io.FileNotFoundException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.io.File file, java.lang.String csn) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.lang.String fileName) throws java.io.FileNotFoundException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  PrintStream(java.lang.String fileName, java.lang.String csn) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  boolean checkError() { throw new RuntimeException("Stub!"); }
protected  void clearError() { throw new RuntimeException("Stub!"); }
public synchronized  void close() { throw new RuntimeException("Stub!"); }
public synchronized  void flush() { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream format(java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream format(java.util.Locale l, java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream printf(java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream printf(java.util.Locale l, java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  void print(char[] charArray) { throw new RuntimeException("Stub!"); }
public  void print(char ch) { throw new RuntimeException("Stub!"); }
public  void print(double dnum) { throw new RuntimeException("Stub!"); }
public  void print(float fnum) { throw new RuntimeException("Stub!"); }
public  void print(int inum) { throw new RuntimeException("Stub!"); }
public  void print(long lnum) { throw new RuntimeException("Stub!"); }
public  void print(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public synchronized  void print(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  void print(boolean bool) { throw new RuntimeException("Stub!"); }
public  void println() { throw new RuntimeException("Stub!"); }
public  void println(char[] charArray) { throw new RuntimeException("Stub!"); }
public  void println(char ch) { throw new RuntimeException("Stub!"); }
public  void println(double dnum) { throw new RuntimeException("Stub!"); }
public  void println(float fnum) { throw new RuntimeException("Stub!"); }
public  void println(int inum) { throw new RuntimeException("Stub!"); }
public  void println(long lnum) { throw new RuntimeException("Stub!"); }
public  void println(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public synchronized  void println(java.lang.String str) { throw new RuntimeException("Stub!"); }
public  void println(boolean bool) { throw new RuntimeException("Stub!"); }
protected  void setError() { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer, int offset, int length) { throw new RuntimeException("Stub!"); }
public synchronized  void write(int oneByte) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream append(char c) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream append(java.lang.CharSequence csq) { throw new RuntimeException("Stub!"); }
public  java.io.PrintStream append(java.lang.CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
}
