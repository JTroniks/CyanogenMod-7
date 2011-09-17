package org.apache.http.conn;
public interface ClientConnectionOperator
{
public abstract  org.apache.http.conn.OperatedClientConnection createConnection();
public abstract  void openConnection(org.apache.http.conn.OperatedClientConnection conn, org.apache.http.HttpHost target, java.net.InetAddress local, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void updateSecureConnection(org.apache.http.conn.OperatedClientConnection conn, org.apache.http.HttpHost target, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException;
}
