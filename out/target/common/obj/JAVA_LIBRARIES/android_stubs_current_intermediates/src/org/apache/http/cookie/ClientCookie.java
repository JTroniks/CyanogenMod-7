package org.apache.http.cookie;
public interface ClientCookie
  extends org.apache.http.cookie.Cookie
{
public abstract  java.lang.String getAttribute(java.lang.String name);
public abstract  boolean containsAttribute(java.lang.String name);
public static final java.lang.String VERSION_ATTR = "version";
public static final java.lang.String PATH_ATTR = "path";
public static final java.lang.String DOMAIN_ATTR = "domain";
public static final java.lang.String MAX_AGE_ATTR = "max-age";
public static final java.lang.String SECURE_ATTR = "secure";
public static final java.lang.String COMMENT_ATTR = "comment";
public static final java.lang.String EXPIRES_ATTR = "expires";
public static final java.lang.String PORT_ATTR = "port";
public static final java.lang.String COMMENTURL_ATTR = "commenturl";
public static final java.lang.String DISCARD_ATTR = "discard";
}
