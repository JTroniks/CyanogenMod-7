package org.apache.http.conn;
public interface ClientConnectionManager
{
public abstract  org.apache.http.conn.scheme.SchemeRegistry getSchemeRegistry();
public abstract  org.apache.http.conn.ClientConnectionRequest requestConnection(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state);
public abstract  void releaseConnection(org.apache.http.conn.ManagedClientConnection conn, long validDuration, java.util.concurrent.TimeUnit timeUnit);
public abstract  void closeIdleConnections(long idletime, java.util.concurrent.TimeUnit tunit);
public abstract  void closeExpiredConnections();
public abstract  void shutdown();
}
