package org.apache.http.auth;
public final class AuthSchemeRegistry
{
public  AuthSchemeRegistry() { throw new RuntimeException("Stub!"); }
public synchronized  void register(java.lang.String name, org.apache.http.auth.AuthSchemeFactory factory) { throw new RuntimeException("Stub!"); }
public synchronized  void unregister(java.lang.String name) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.auth.AuthScheme getAuthScheme(java.lang.String name, org.apache.http.params.HttpParams params) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public synchronized  java.util.List<java.lang.String> getSchemeNames() { throw new RuntimeException("Stub!"); }
public synchronized  void setItems(java.util.Map<java.lang.String, org.apache.http.auth.AuthSchemeFactory> map) { throw new RuntimeException("Stub!"); }
}
