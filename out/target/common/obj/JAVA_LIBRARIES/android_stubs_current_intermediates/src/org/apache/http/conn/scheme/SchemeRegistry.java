package org.apache.http.conn.scheme;
public final class SchemeRegistry
{
public  SchemeRegistry() { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.conn.scheme.Scheme getScheme(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.conn.scheme.Scheme getScheme(org.apache.http.HttpHost host) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.conn.scheme.Scheme get(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.conn.scheme.Scheme register(org.apache.http.conn.scheme.Scheme sch) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.conn.scheme.Scheme unregister(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final synchronized  java.util.List<java.lang.String> getSchemeNames() { throw new RuntimeException("Stub!"); }
public synchronized  void setItems(java.util.Map<java.lang.String, org.apache.http.conn.scheme.Scheme> map) { throw new RuntimeException("Stub!"); }
}
