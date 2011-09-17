package org.apache.http.impl.cookie;
public class BestMatchSpec
  implements org.apache.http.cookie.CookieSpec
{
public  BestMatchSpec(java.lang.String[] datepatterns, boolean oneHeader) { throw new RuntimeException("Stub!"); }
public  BestMatchSpec() { throw new RuntimeException("Stub!"); }
public  java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header header, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException { throw new RuntimeException("Stub!"); }
public  void validate(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException { throw new RuntimeException("Stub!"); }
public  boolean match(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) { throw new RuntimeException("Stub!"); }
public  java.util.List<org.apache.http.Header> formatCookies(java.util.List<org.apache.http.cookie.Cookie> cookies) { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getVersionHeader() { throw new RuntimeException("Stub!"); }
}
