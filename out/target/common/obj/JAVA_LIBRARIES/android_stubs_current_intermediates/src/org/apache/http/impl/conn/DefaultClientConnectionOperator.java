package org.apache.http.impl.conn;
public class DefaultClientConnectionOperator
  implements org.apache.http.conn.ClientConnectionOperator
{
public  DefaultClientConnectionOperator(org.apache.http.conn.scheme.SchemeRegistry schemes) { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.OperatedClientConnection createConnection() { throw new RuntimeException("Stub!"); }
public  void openConnection(org.apache.http.conn.OperatedClientConnection conn, org.apache.http.HttpHost target, java.net.InetAddress local, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void updateSecureConnection(org.apache.http.conn.OperatedClientConnection conn, org.apache.http.HttpHost target, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void prepareSocket(java.net.Socket sock, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;
}
