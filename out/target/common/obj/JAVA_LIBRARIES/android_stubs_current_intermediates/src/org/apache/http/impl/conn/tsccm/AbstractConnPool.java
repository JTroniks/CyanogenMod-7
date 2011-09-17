package org.apache.http.impl.conn.tsccm;
public abstract class AbstractConnPool
  implements org.apache.http.impl.conn.tsccm.RefQueueHandler
{
protected  AbstractConnPool() { throw new RuntimeException("Stub!"); }
public  void enableConnectionGC() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  org.apache.http.impl.conn.tsccm.BasicPoolEntry getEntry(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state, long timeout, java.util.concurrent.TimeUnit tunit) throws org.apache.http.conn.ConnectionPoolTimeoutException, java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public abstract  org.apache.http.impl.conn.tsccm.PoolEntryRequest requestPoolEntry(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state);
public abstract  void freeEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry, boolean reusable, long validDuration, java.util.concurrent.TimeUnit timeUnit);
public  void handleReference(java.lang.ref.Reference ref) { throw new RuntimeException("Stub!"); }
protected abstract  void handleLostEntry(org.apache.http.conn.routing.HttpRoute route);
public  void closeIdleConnections(long idletime, java.util.concurrent.TimeUnit tunit) { throw new RuntimeException("Stub!"); }
public  void closeExpiredConnections() { throw new RuntimeException("Stub!"); }
public abstract  void deleteClosedConnections();
public  void shutdown() { throw new RuntimeException("Stub!"); }
protected  void closeConnection(org.apache.http.conn.OperatedClientConnection conn) { throw new RuntimeException("Stub!"); }
protected final java.util.concurrent.locks.Lock poolLock;
protected java.util.Set<org.apache.http.impl.conn.tsccm.BasicPoolEntryRef> issuedConnections;
protected org.apache.http.impl.conn.IdleConnectionHandler idleConnHandler;
protected int numConnections;
protected java.lang.ref.ReferenceQueue<java.lang.Object> refQueue;
protected volatile boolean isShutDown;
}
