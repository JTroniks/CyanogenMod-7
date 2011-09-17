package org.apache.http.impl;
public class SocketHttpClientConnection
  extends org.apache.http.impl.AbstractHttpClientConnection
  implements org.apache.http.HttpInetConnection
{
public  SocketHttpClientConnection() { throw new RuntimeException("Stub!"); }
protected  void assertNotOpen() { throw new RuntimeException("Stub!"); }
protected  void assertOpen() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.SessionInputBuffer createSessionInputBuffer(java.net.Socket socket, int buffersize, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.SessionOutputBuffer createSessionOutputBuffer(java.net.Socket socket, int buffersize, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void bind(java.net.Socket socket, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
protected  java.net.Socket getSocket() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); }
public  int getRemotePort() { throw new RuntimeException("Stub!"); }
public  void setSocketTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getSocketTimeout() { throw new RuntimeException("Stub!"); }
public  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
