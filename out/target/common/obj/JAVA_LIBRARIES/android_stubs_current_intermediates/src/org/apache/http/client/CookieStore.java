package org.apache.http.client;
public interface CookieStore
{
public abstract  void addCookie(org.apache.http.cookie.Cookie cookie);
public abstract  java.util.List<org.apache.http.cookie.Cookie> getCookies();
public abstract  boolean clearExpired(java.util.Date date);
public abstract  void clear();
}
