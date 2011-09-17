package org.apache.http.impl.conn;
public abstract class AbstractPoolEntry
{
protected  AbstractPoolEntry(org.apache.http.conn.ClientConnectionOperator connOperator, org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getState() { throw new RuntimeException("Stub!"); }
public  void setState(java.lang.Object state) { throw new RuntimeException("Stub!"); }
public  void open(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void tunnelTarget(boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void tunnelProxy(org.apache.http.HttpHost next, boolean secure, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void layerProtocol(org.apache.http.protocol.HttpContext context, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void shutdownEntry() { throw new RuntimeException("Stub!"); }
protected final org.apache.http.conn.ClientConnectionOperator connOperator;
protected final org.apache.http.conn.OperatedClientConnection connection;
protected volatile org.apache.http.conn.routing.HttpRoute route;
protected volatile java.lang.Object state;
protected volatile org.apache.http.conn.routing.RouteTracker tracker;
}
