package org.apache.http.impl.conn;
public class SingleClientConnManager
  implements org.apache.http.conn.ClientConnectionManager
{
protected class PoolEntry
  extends org.apache.http.impl.conn.AbstractPoolEntry
{
protected  PoolEntry() { super((org.apache.http.conn.ClientConnectionOperator)null,(org.apache.http.conn.routing.HttpRoute)null); throw new RuntimeException("Stub!"); }
protected  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
protected class ConnAdapter
  extends org.apache.http.impl.conn.AbstractPooledConnAdapter
{
protected  ConnAdapter(org.apache.http.impl.conn.SingleClientConnManager.PoolEntry entry, org.apache.http.conn.routing.HttpRoute route) { super((org.apache.http.conn.ClientConnectionManager)null,(org.apache.http.impl.conn.AbstractPoolEntry)null); throw new RuntimeException("Stub!"); }
}
public  SingleClientConnManager(org.apache.http.params.HttpParams params, org.apache.http.conn.scheme.SchemeRegistry schreg) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.scheme.SchemeRegistry getSchemeRegistry() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.ClientConnectionOperator createConnectionOperator(org.apache.http.conn.scheme.SchemeRegistry schreg) { throw new RuntimeException("Stub!"); }
protected final  void assertStillUp() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.ClientConnectionRequest requestConnection(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state) { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.ManagedClientConnection getConnection(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state) { throw new RuntimeException("Stub!"); }
public  void releaseConnection(org.apache.http.conn.ManagedClientConnection conn, long validDuration, java.util.concurrent.TimeUnit timeUnit) { throw new RuntimeException("Stub!"); }
public  void closeExpiredConnections() { throw new RuntimeException("Stub!"); }
public  void closeIdleConnections(long idletime, java.util.concurrent.TimeUnit tunit) { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
protected  void revokeConnection() { throw new RuntimeException("Stub!"); }
public static final java.lang.String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;
protected org.apache.http.conn.ClientConnectionOperator connOperator;
protected org.apache.http.impl.conn.SingleClientConnManager.PoolEntry uniquePoolEntry;
protected org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter managedConn;
protected long lastReleaseTime;
protected long connectionExpiresTime;
protected boolean alwaysShutDown;
protected volatile boolean isShutDown;
}
