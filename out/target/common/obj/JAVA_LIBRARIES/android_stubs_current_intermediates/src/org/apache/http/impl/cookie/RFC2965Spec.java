package org.apache.http.impl.cookie;
public class RFC2965Spec
  extends org.apache.http.impl.cookie.RFC2109Spec
{
public  RFC2965Spec() { throw new RuntimeException("Stub!"); }
public  RFC2965Spec(java.lang.String[] datepatterns, boolean oneHeader) { throw new RuntimeException("Stub!"); }
public  java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header header, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException { throw new RuntimeException("Stub!"); }
public  void validate(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException { throw new RuntimeException("Stub!"); }
public  boolean match(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) { throw new RuntimeException("Stub!"); }
protected  void formatCookieAsVer(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.cookie.Cookie cookie, int version) { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getVersionHeader() { throw new RuntimeException("Stub!"); }
}
