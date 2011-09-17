package java.io;
public abstract class FilterWriter
  extends java.io.Writer
{
protected  FilterWriter(java.io.Writer out) { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(char[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int oneChar) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(java.lang.String str, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected java.io.Writer out;
}
