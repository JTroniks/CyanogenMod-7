package org.apache.http.cookie;
public final class CookieSpecRegistry
{
public  CookieSpecRegistry() { throw new RuntimeException("Stub!"); }
public synchronized  void register(java.lang.String name, org.apache.http.cookie.CookieSpecFactory factory) { throw new RuntimeException("Stub!"); }
public synchronized  void unregister(java.lang.String id) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.cookie.CookieSpec getCookieSpec(java.lang.String name, org.apache.http.params.HttpParams params) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.cookie.CookieSpec getCookieSpec(java.lang.String name) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public synchronized  java.util.List<java.lang.String> getSpecNames() { throw new RuntimeException("Stub!"); }
public synchronized  void setItems(java.util.Map<java.lang.String, org.apache.http.cookie.CookieSpecFactory> map) { throw new RuntimeException("Stub!"); }
}
