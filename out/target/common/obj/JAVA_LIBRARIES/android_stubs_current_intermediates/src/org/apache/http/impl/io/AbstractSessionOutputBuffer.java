package org.apache.http.impl.io;
public abstract class AbstractSessionOutputBuffer
  implements org.apache.http.io.SessionOutputBuffer
{
public  AbstractSessionOutputBuffer() { throw new RuntimeException("Stub!"); }
protected  void init(java.io.OutputStream outstream, int buffersize, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  void flushBuffer() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeLine(java.lang.String s) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeLine(org.apache.http.util.CharArrayBuffer s) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.io.HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
