package org.apache.http.conn;
public class EofSensorInputStream
  extends java.io.InputStream
  implements org.apache.http.conn.ConnectionReleaseTrigger
{
public  EofSensorInputStream(java.io.InputStream in, org.apache.http.conn.EofSensorWatcher watcher) { throw new RuntimeException("Stub!"); }
protected  boolean isReadAllowed() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void checkEOF(int eof) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void checkClose() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void checkAbort() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void releaseConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void abortConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected java.io.InputStream wrappedStream;
}
