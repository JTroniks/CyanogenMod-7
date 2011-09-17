package org.apache.http.protocol;
public interface HttpContext
{
public abstract  java.lang.Object getAttribute(java.lang.String id);
public abstract  void setAttribute(java.lang.String id, java.lang.Object obj);
public abstract  java.lang.Object removeAttribute(java.lang.String id);
public static final java.lang.String RESERVED_PREFIX = "http.";
}
