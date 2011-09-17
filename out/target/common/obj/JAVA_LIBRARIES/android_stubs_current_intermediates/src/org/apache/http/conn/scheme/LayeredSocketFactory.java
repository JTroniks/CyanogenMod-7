package org.apache.http.conn.scheme;
public interface LayeredSocketFactory
  extends org.apache.http.conn.scheme.SocketFactory
{
public abstract  java.net.Socket createSocket(java.net.Socket socket, java.lang.String host, int port, boolean autoClose) throws java.io.IOException, java.net.UnknownHostException;
}
