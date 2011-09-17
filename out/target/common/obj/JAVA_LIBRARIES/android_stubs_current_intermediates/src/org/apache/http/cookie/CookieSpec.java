package org.apache.http.cookie;
public interface CookieSpec
{
public abstract  int getVersion();
public abstract  java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header header, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException;
public abstract  void validate(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException;
public abstract  boolean match(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin);
public abstract  java.util.List<org.apache.http.Header> formatCookies(java.util.List<org.apache.http.cookie.Cookie> cookies);
public abstract  org.apache.http.Header getVersionHeader();
}
