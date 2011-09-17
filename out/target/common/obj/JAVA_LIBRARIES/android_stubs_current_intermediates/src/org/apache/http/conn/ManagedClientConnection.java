package org.apache.http.conn;
public interface ManagedClientConnection
  extends org.apache.http.HttpClientConnection, org.apache.http.HttpInetConnection, org.apache.http.conn.ConnectionReleaseTrigger
{
public abstract  boolean isSecure();
public abstract  org.apache.http.conn.routing.HttpRoute getRoute();
public abstract  javax.net.ssl.SSLSession getSSLSession();
public abstract  void open(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void tunnelTarget(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void tunnelProxy(org.apache.http.HttpHost next, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void layerProtocol(org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException;
public abstract  void markReusable();
public abstract  void unmarkReusable();
public abstract  boolean isMarkedReusable();
public abstract  void setState(java.lang.Object state);
public abstract  java.lang.Object getState();
public abstract  void setIdleDuration(long duration, java.util.concurrent.TimeUnit unit);
}
