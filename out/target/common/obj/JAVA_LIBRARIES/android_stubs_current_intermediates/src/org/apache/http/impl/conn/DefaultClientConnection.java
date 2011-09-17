package org.apache.http.impl.conn;
public class DefaultClientConnection
  extends org.apache.http.impl.SocketHttpClientConnection
  implements org.apache.http.conn.OperatedClientConnection
{
public  DefaultClientConnection() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpHost getTargetHost() { throw new RuntimeException("Stub!"); }
public final  boolean isSecure() { throw new RuntimeException("Stub!"); }
public final  java.net.Socket getSocket() { throw new RuntimeException("Stub!"); }
public  void opening(java.net.Socket sock, org.apache.http.HttpHost target) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void openCompleted(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.SessionInputBuffer createSessionInputBuffer(java.net.Socket socket, int buffersize, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.SessionOutputBuffer createSessionOutputBuffer(java.net.Socket socket, int buffersize, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.HttpMessageParser createResponseParser(org.apache.http.io.SessionInputBuffer buffer, org.apache.http.HttpResponseFactory responseFactory, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public  void update(java.net.Socket sock, org.apache.http.HttpHost target, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestHeader(org.apache.http.HttpRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
}
