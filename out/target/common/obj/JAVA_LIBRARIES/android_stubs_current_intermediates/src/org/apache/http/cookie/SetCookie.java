package org.apache.http.cookie;
public interface SetCookie
  extends org.apache.http.cookie.Cookie
{
public abstract  void setValue(java.lang.String value);
public abstract  void setComment(java.lang.String comment);
public abstract  void setExpiryDate(java.util.Date expiryDate);
public abstract  void setDomain(java.lang.String domain);
public abstract  void setPath(java.lang.String path);
public abstract  void setSecure(boolean secure);
public abstract  void setVersion(int version);
}
