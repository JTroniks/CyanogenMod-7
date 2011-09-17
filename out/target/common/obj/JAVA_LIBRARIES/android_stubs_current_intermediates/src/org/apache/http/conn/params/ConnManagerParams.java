package org.apache.http.conn.params;
public final class ConnManagerParams
  implements org.apache.http.conn.params.ConnManagerPNames
{
public  ConnManagerParams() { throw new RuntimeException("Stub!"); }
public static  long getTimeout(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setTimeout(org.apache.http.params.HttpParams params, long timeout) { throw new RuntimeException("Stub!"); }
public static  void setMaxConnectionsPerRoute(org.apache.http.params.HttpParams params, org.apache.http.conn.params.ConnPerRoute connPerRoute) { throw new RuntimeException("Stub!"); }
public static  org.apache.http.conn.params.ConnPerRoute getMaxConnectionsPerRoute(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  void setMaxTotalConnections(org.apache.http.params.HttpParams params, int maxTotalConnections) { throw new RuntimeException("Stub!"); }
public static  int getMaxTotalConnections(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;
}
