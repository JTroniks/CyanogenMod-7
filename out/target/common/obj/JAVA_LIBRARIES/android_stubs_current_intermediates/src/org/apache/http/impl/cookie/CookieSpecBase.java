package org.apache.http.impl.cookie;
public abstract class CookieSpecBase
  extends org.apache.http.impl.cookie.AbstractCookieSpec
{
public  CookieSpecBase() { throw new RuntimeException("Stub!"); }
protected static  java.lang.String getDefaultPath(org.apache.http.cookie.CookieOrigin origin) { throw new RuntimeException("Stub!"); }
protected static  java.lang.String getDefaultDomain(org.apache.http.cookie.CookieOrigin origin) { throw new RuntimeException("Stub!"); }
protected  java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.HeaderElement[] elems, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException { throw new RuntimeException("Stub!"); }
public  void validate(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException { throw new RuntimeException("Stub!"); }
public  boolean match(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) { throw new RuntimeException("Stub!"); }
}
