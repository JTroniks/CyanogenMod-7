package org.apache.http.cookie;
public interface Cookie
{
public abstract  java.lang.String getName();
public abstract  java.lang.String getValue();
public abstract  java.lang.String getComment();
public abstract  java.lang.String getCommentURL();
public abstract  java.util.Date getExpiryDate();
public abstract  boolean isPersistent();
public abstract  java.lang.String getDomain();
public abstract  java.lang.String getPath();
public abstract  int[] getPorts();
public abstract  boolean isSecure();
public abstract  int getVersion();
public abstract  boolean isExpired(java.util.Date date);
}
