package org.apache.http.impl.conn;
public abstract class AbstractPooledConnAdapter
  extends org.apache.http.impl.conn.AbstractClientConnAdapter
{
protected  AbstractPooledConnAdapter(org.apache.http.conn.ClientConnectionManager manager, org.apache.http.impl.conn.AbstractPoolEntry entry) { super((org.apache.http.conn.ClientConnectionManager)null,(org.apache.http.conn.OperatedClientConnection)null); throw new RuntimeException("Stub!"); }
protected final  void assertAttached() { throw new RuntimeException("Stub!"); }
protected  void detach() { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.routing.HttpRoute getRoute() { throw new RuntimeException("Stub!"); }
public  void open(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void tunnelTarget(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void tunnelProxy(org.apache.http.HttpHost next, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void layerProtocol(org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdown() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getState() { throw new RuntimeException("Stub!"); }
public  void setState(java.lang.Object state) { throw new RuntimeException("Stub!"); }
protected volatile org.apache.http.impl.conn.AbstractPoolEntry poolEntry;
}
