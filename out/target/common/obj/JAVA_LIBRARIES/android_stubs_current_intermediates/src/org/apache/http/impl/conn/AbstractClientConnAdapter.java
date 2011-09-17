package org.apache.http.impl.conn;
public abstract class AbstractClientConnAdapter
  implements org.apache.http.conn.ManagedClientConnection
{
protected  AbstractClientConnAdapter(org.apache.http.conn.ClientConnectionManager mgr, org.apache.http.conn.OperatedClientConnection conn) { throw new RuntimeException("Stub!"); }
protected  void detach() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.OperatedClientConnection getWrappedConnection() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.ClientConnectionManager getManager() { throw new RuntimeException("Stub!"); }
protected final  void assertNotAborted() throws java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
protected final  void assertValid(org.apache.http.conn.OperatedClientConnection wrappedConn) { throw new RuntimeException("Stub!"); }
public  boolean isOpen() { throw new RuntimeException("Stub!"); }
public  boolean isStale() { throw new RuntimeException("Stub!"); }
public  void setSocketTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getSocketTimeout() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isResponseAvailable(int timeout) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void receiveResponseEntity(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestHeader(org.apache.http.HttpRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); }
public  int getRemotePort() { throw new RuntimeException("Stub!"); }
public  boolean isSecure() { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLSession getSSLSession() { throw new RuntimeException("Stub!"); }
public  void markReusable() { throw new RuntimeException("Stub!"); }
public  void unmarkReusable() { throw new RuntimeException("Stub!"); }
public  boolean isMarkedReusable() { throw new RuntimeException("Stub!"); }
public  void setIdleDuration(long duration, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  void releaseConnection() { throw new RuntimeException("Stub!"); }
public  void abortConnection() { throw new RuntimeException("Stub!"); }
}
