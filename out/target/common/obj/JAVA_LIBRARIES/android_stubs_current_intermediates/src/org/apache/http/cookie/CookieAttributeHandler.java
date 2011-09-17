package org.apache.http.cookie;
public interface CookieAttributeHandler
{
public abstract  void parse(org.apache.http.cookie.SetCookie cookie, java.lang.String value) throws org.apache.http.cookie.MalformedCookieException;
public abstract  void validate(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin) throws org.apache.http.cookie.MalformedCookieException;
public abstract  boolean match(org.apache.http.cookie.Cookie cookie, org.apache.http.cookie.CookieOrigin origin);
}
