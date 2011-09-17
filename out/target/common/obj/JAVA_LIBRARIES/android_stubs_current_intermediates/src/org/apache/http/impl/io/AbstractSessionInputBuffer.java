package org.apache.http.impl.io;
public abstract class AbstractSessionInputBuffer
  implements org.apache.http.io.SessionInputBuffer
{
public  AbstractSessionInputBuffer() { throw new RuntimeException("Stub!"); }
protected  void init(java.io.InputStream instream, int buffersize, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  int fillBuffer() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean hasBufferedData() { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int readLine(org.apache.http.util.CharArrayBuffer charbuffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String readLine() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.io.HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
