package org.apache.http.conn.scheme;
public interface SocketFactory
{
public abstract  java.net.Socket createSocket() throws java.io.IOException;
public abstract  java.net.Socket connectSocket(java.net.Socket sock, java.lang.String host, int port, java.net.InetAddress localAddress, int localPort, org.apache.http.params.HttpParams params) throws java.io.IOException, java.net.UnknownHostException, org.apache.http.conn.ConnectTimeoutException;
public abstract  boolean isSecure(java.net.Socket sock) throws java.lang.IllegalArgumentException;
}
