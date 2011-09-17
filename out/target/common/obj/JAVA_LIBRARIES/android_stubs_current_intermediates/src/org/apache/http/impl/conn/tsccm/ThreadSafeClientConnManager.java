package org.apache.http.impl.conn.tsccm;
public class ThreadSafeClientConnManager
  implements org.apache.http.conn.ClientConnectionManager
{
public  ThreadSafeClientConnManager(org.apache.http.params.HttpParams params, org.apache.http.conn.scheme.SchemeRegistry schreg) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.AbstractConnPool createConnectionPool(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.ClientConnectionOperator createConnectionOperator(org.apache.http.conn.scheme.SchemeRegistry schreg) { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.scheme.SchemeRegistry getSchemeRegistry() { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.ClientConnectionRequest requestConnection(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state) { throw new RuntimeException("Stub!"); }
public  void releaseConnection(org.apache.http.conn.ManagedClientConnection conn, long validDuration, java.util.concurrent.TimeUnit timeUnit) { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  int getConnectionsInPool(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public  int getConnectionsInPool() { throw new RuntimeException("Stub!"); }
public  void closeIdleConnections(long idleTimeout, java.util.concurrent.TimeUnit tunit) { throw new RuntimeException("Stub!"); }
public  void closeExpiredConnections() { throw new RuntimeException("Stub!"); }
protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;
protected final org.apache.http.impl.conn.tsccm.AbstractConnPool connectionPool;
protected org.apache.http.conn.ClientConnectionOperator connOperator;
}
