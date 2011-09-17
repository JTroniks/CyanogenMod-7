package org.apache.http.impl.conn;
public class LoggingSessionInputBuffer
  implements org.apache.http.io.SessionInputBuffer
{
public  LoggingSessionInputBuffer(org.apache.http.io.SessionInputBuffer in, org.apache.http.impl.conn.Wire wire) { throw new RuntimeException("Stub!"); }
public  boolean isDataAvailable(int timeout) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String readLine() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int readLine(org.apache.http.util.CharArrayBuffer buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.io.HttpTransportMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
