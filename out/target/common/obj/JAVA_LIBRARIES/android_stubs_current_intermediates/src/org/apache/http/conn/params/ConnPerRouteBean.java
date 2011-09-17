package org.apache.http.conn.params;
public final class ConnPerRouteBean
  implements org.apache.http.conn.params.ConnPerRoute
{
public  ConnPerRouteBean(int defaultMax) { throw new RuntimeException("Stub!"); }
public  ConnPerRouteBean() { throw new RuntimeException("Stub!"); }
public  int getDefaultMax() { throw new RuntimeException("Stub!"); }
public  void setDefaultMaxPerRoute(int max) { throw new RuntimeException("Stub!"); }
public  void setMaxForRoute(org.apache.http.conn.routing.HttpRoute route, int max) { throw new RuntimeException("Stub!"); }
public  int getMaxForRoute(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public  void setMaxForRoutes(java.util.Map<org.apache.http.conn.routing.HttpRoute, java.lang.Integer> map) { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;
}
