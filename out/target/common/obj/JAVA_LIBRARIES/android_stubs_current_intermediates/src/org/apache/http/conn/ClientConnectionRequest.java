package org.apache.http.conn;
public interface ClientConnectionRequest
{
public abstract  org.apache.http.conn.ManagedClientConnection getConnection(long timeout, java.util.concurrent.TimeUnit tunit) throws java.lang.InterruptedException, org.apache.http.conn.ConnectionPoolTimeoutException;
public abstract  void abortRequest();
}
