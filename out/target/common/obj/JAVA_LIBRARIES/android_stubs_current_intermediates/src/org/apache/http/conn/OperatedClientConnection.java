package org.apache.http.conn;
public interface OperatedClientConnection
  extends org.apache.http.HttpClientConnection, org.apache.http.HttpInetConnection
{
public abstract  org.apache.http.HttpHost getTargetHost();
public abstract  boolean isSecure();
public abstract  java.net.Socket getSocket();
public abstract  void opening(java.net.Socket sock, org.apache.http.HttpHost target) throws java.io.IOException;
public abstract  void openCompleted(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void update(java.net.Socket sock, org.apache.http.HttpHost target, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException;
}
