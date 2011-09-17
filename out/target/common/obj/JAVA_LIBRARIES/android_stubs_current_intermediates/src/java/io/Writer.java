package java.io;
public abstract class Writer
  implements java.lang.Appendable, java.io.Closeable, java.io.Flushable
{
protected  Writer() { throw new RuntimeException("Stub!"); }
protected  Writer(java.lang.Object lock) { throw new RuntimeException("Stub!"); }
public abstract  void close() throws java.io.IOException;
public abstract  void flush() throws java.io.IOException;
public  void write(char[] buf) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void write(char[] buf, int offset, int count) throws java.io.IOException;
public  void write(int oneChar) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(java.lang.String str) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(java.lang.String str, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.Writer append(char c) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.Writer append(java.lang.CharSequence csq) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.Writer append(java.lang.CharSequence csq, int start, int end) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected java.lang.Object lock;
}
