package org.apache.http.impl.cookie;
public abstract class AbstractCookieSpec
  implements org.apache.http.cookie.CookieSpec
{
public  AbstractCookieSpec() { throw new RuntimeException("Stub!"); }
public  void registerAttribHandler(java.lang.String name, org.apache.http.cookie.CookieAttributeHandler handler) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.cookie.CookieAttributeHandler findAttribHandler(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.cookie.CookieAttributeHandler getAttribHandler(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<org.apache.http.cookie.CookieAttributeHandler> getAttribHandlers() { throw new RuntimeException("Stub!"); }
}
