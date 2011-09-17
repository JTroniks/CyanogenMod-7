package org.apache.http.impl.cookie;
public class RFC2109Spec
  extends org.apache.http.impl.cookie.CookieSpecBase
{
public  RFC2109Spec(java.lang.String[] datepatterns, boolean oneHeader) { throw new RuntimeException("Stub!"); }
public  RFC2109Spec() { throw new RuntimeException("Stub!"); }
public  java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header header, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException { throw new RuntimeException("Stub!"); }
public  void validate(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException { throw new RuntimeException("Stub!"); }
public  java.util.List<org.apache.http.Header> formatCookies(java.util.List<org.apache.http.cookie.Cookie> cookies) { throw new RuntimeException("Stub!"); }
protected  void formatParamAsVer(org.apache.http.util.CharArrayBuffer buffer, java.lang.String name, java.lang.String value, int version) { throw new RuntimeException("Stub!"); }
protected  void formatCookieAsVer(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.cookie.Cookie cookie, int version) { throw new RuntimeException("Stub!"); }
public  int getVersion() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getVersionHeader() { throw new RuntimeException("Stub!"); }
}
