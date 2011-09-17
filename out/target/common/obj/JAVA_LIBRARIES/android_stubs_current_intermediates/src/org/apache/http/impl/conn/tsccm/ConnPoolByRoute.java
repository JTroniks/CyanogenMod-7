package org.apache.http.impl.conn.tsccm;
public class ConnPoolByRoute
  extends org.apache.http.impl.conn.tsccm.AbstractConnPool
{
public  ConnPoolByRoute(org.apache.http.conn.ClientConnectionOperator operator, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  java.util.Queue<org.apache.http.impl.conn.tsccm.BasicPoolEntry> createFreeConnQueue() { throw new RuntimeException("Stub!"); }
protected  java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> createWaitingThreadQueue() { throw new RuntimeException("Stub!"); }
protected  java.util.Map<org.apache.http.conn.routing.HttpRoute, org.apache.http.impl.conn.tsccm.RouteSpecificPool> createRouteToPoolMap() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.RouteSpecificPool newRouteSpecificPool(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.WaitingThread newWaitingThread(java.util.concurrent.locks.Condition cond, org.apache.http.impl.conn.tsccm.RouteSpecificPool rospl) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.RouteSpecificPool getRoutePool(org.apache.http.conn.routing.HttpRoute route, boolean create) { throw new RuntimeException("Stub!"); }
public  int getConnectionsInPool(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public  org.apache.http.impl.conn.tsccm.PoolEntryRequest requestPoolEntry(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.BasicPoolEntry getEntryBlocking(org.apache.http.conn.routing.HttpRoute route, java.lang.Object state, long timeout, java.util.concurrent.TimeUnit tunit, org.apache.http.impl.conn.tsccm.WaitingThreadAborter aborter) throws org.apache.http.conn.ConnectionPoolTimeoutException, java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void freeEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry, boolean reusable, long validDuration, java.util.concurrent.TimeUnit timeUnit) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.BasicPoolEntry getFreeEntry(org.apache.http.impl.conn.tsccm.RouteSpecificPool rospl, java.lang.Object state) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.conn.tsccm.BasicPoolEntry createEntry(org.apache.http.impl.conn.tsccm.RouteSpecificPool rospl, org.apache.http.conn.ClientConnectionOperator op) { throw new RuntimeException("Stub!"); }
protected  void deleteEntry(org.apache.http.impl.conn.tsccm.BasicPoolEntry entry) { throw new RuntimeException("Stub!"); }
protected  void deleteLeastUsedEntry() { throw new RuntimeException("Stub!"); }
protected  void handleLostEntry(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
protected  void notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool rospl) { throw new RuntimeException("Stub!"); }
public  void deleteClosedConnections() { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
protected final org.apache.http.conn.ClientConnectionOperator operator;
protected java.util.Queue<org.apache.http.impl.conn.tsccm.BasicPoolEntry> freeConnections;
protected java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> waitingThreads;
protected final java.util.Map<org.apache.http.conn.routing.HttpRoute, org.apache.http.impl.conn.tsccm.RouteSpecificPool> routeToPool;
protected final int maxTotalConnections;
}
