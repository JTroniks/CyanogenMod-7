package org.apache.http.message;
public class BasicHttpResponse
  extends org.apache.http.message.AbstractHttpMessage
  implements org.apache.http.HttpResponse
{
public  BasicHttpResponse(org.apache.http.StatusLine statusline, org.apache.http.ReasonPhraseCatalog catalog, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  BasicHttpResponse(org.apache.http.StatusLine statusline) { throw new RuntimeException("Stub!"); }
public  BasicHttpResponse(org.apache.http.ProtocolVersion ver, int code, java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  org.apache.http.ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); }
public  org.apache.http.StatusLine getStatusLine() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpEntity getEntity() { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public  void setStatusLine(org.apache.http.StatusLine statusline) { throw new RuntimeException("Stub!"); }
public  void setStatusLine(org.apache.http.ProtocolVersion ver, int code) { throw new RuntimeException("Stub!"); }
public  void setStatusLine(org.apache.http.ProtocolVersion ver, int code, java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  void setStatusCode(int code) { throw new RuntimeException("Stub!"); }
public  void setReasonPhrase(java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  void setEntity(org.apache.http.HttpEntity entity) { throw new RuntimeException("Stub!"); }
public  void setLocale(java.util.Locale loc) { throw new RuntimeException("Stub!"); }
protected  java.lang.String getReason(int code) { throw new RuntimeException("Stub!"); }
}
