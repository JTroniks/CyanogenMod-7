package org.apache.http;
public interface HttpResponse
  extends org.apache.http.HttpMessage
{
public abstract  org.apache.http.StatusLine getStatusLine();
public abstract  void setStatusLine(org.apache.http.StatusLine statusline);
public abstract  void setStatusLine(org.apache.http.ProtocolVersion ver, int code);
public abstract  void setStatusLine(org.apache.http.ProtocolVersion ver, int code, java.lang.String reason);
public abstract  void setStatusCode(int code) throws java.lang.IllegalStateException;
public abstract  void setReasonPhrase(java.lang.String reason) throws java.lang.IllegalStateException;
public abstract  org.apache.http.HttpEntity getEntity();
public abstract  void setEntity(org.apache.http.HttpEntity entity);
public abstract  java.util.Locale getLocale();
public abstract  void setLocale(java.util.Locale loc);
}
