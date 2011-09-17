package org.apache.http.impl.conn.tsccm;
public interface PoolEntryRequest
{
public abstract  org.apache.http.impl.conn.tsccm.BasicPoolEntry getPoolEntry(long timeout, java.util.concurrent.TimeUnit tunit) throws java.lang.InterruptedException, org.apache.http.conn.ConnectionPoolTimeoutException;
public abstract  void abortRequest();
}
