package org.apache.http.impl.conn;
public class ProxySelectorRoutePlanner
  implements org.apache.http.conn.routing.HttpRoutePlanner
{
public  ProxySelectorRoutePlanner(org.apache.http.conn.scheme.SchemeRegistry schreg, java.net.ProxySelector prosel) { throw new RuntimeException("Stub!"); }
public  java.net.ProxySelector getProxySelector() { throw new RuntimeException("Stub!"); }
public  void setProxySelector(java.net.ProxySelector prosel) { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.routing.HttpRoute determineRoute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpHost determineProxy(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  java.lang.String getHost(java.net.InetSocketAddress isa) { throw new RuntimeException("Stub!"); }
protected  java.net.Proxy chooseProxy(java.util.List<java.net.Proxy> proxies, org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
protected org.apache.http.conn.scheme.SchemeRegistry schemeRegistry;
protected java.net.ProxySelector proxySelector;
}
