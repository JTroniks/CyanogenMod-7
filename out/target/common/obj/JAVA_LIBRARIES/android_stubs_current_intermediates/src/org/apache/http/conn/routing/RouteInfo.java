package org.apache.http.conn.routing;
public interface RouteInfo
{
public static enum TunnelType
{
PLAIN(),
TUNNELLED();
}
public static enum LayerType
{
LAYERED(),
PLAIN();
}
public abstract  org.apache.http.HttpHost getTargetHost();
public abstract  java.net.InetAddress getLocalAddress();
public abstract  int getHopCount();
public abstract  org.apache.http.HttpHost getHopTarget(int hop);
public abstract  org.apache.http.HttpHost getProxyHost();
public abstract  org.apache.http.conn.routing.RouteInfo.TunnelType getTunnelType();
public abstract  boolean isTunnelled();
public abstract  org.apache.http.conn.routing.RouteInfo.LayerType getLayerType();
public abstract  boolean isLayered();
public abstract  boolean isSecure();
}
