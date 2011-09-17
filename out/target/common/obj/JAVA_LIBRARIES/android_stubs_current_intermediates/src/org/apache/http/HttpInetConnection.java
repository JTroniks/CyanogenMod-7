package org.apache.http;
public interface HttpInetConnection
  extends org.apache.http.HttpConnection
{
public abstract  java.net.InetAddress getLocalAddress();
public abstract  int getLocalPort();
public abstract  java.net.InetAddress getRemoteAddress();
public abstract  int getRemotePort();
}
