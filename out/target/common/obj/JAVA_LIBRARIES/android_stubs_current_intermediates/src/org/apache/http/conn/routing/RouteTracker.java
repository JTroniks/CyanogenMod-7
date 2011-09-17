package org.apache.http.conn.routing;
public final class RouteTracker
  implements org.apache.http.conn.routing.RouteInfo, java.lang.Cloneable
{
public  RouteTracker(org.apache.http.HttpHost target, java.net.InetAddress local) { throw new RuntimeException("Stub!"); }
public  RouteTracker(org.apache.http.conn.routing.HttpRoute route) { throw new RuntimeException("Stub!"); }
public final  void connectTarget(boolean secure) { throw new RuntimeException("Stub!"); }
public final  void connectProxy(org.apache.http.HttpHost proxy, boolean secure) { throw new RuntimeException("Stub!"); }
public final  void tunnelTarget(boolean secure) { throw new RuntimeException("Stub!"); }
public final  void tunnelProxy(org.apache.http.HttpHost proxy, boolean secure) { throw new RuntimeException("Stub!"); }
public final  void layerProtocol(boolean secure) { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpHost getTargetHost() { throw new RuntimeException("Stub!"); }
public final  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public final  int getHopCount() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpHost getHopTarget(int hop) { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpHost getProxyHost() { throw new RuntimeException("Stub!"); }
public final  boolean isConnected() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.routing.RouteInfo.TunnelType getTunnelType() { throw new RuntimeException("Stub!"); }
public final  boolean isTunnelled() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.routing.RouteInfo.LayerType getLayerType() { throw new RuntimeException("Stub!"); }
public final  boolean isLayered() { throw new RuntimeException("Stub!"); }
public final  boolean isSecure() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.conn.routing.HttpRoute toRoute() { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
