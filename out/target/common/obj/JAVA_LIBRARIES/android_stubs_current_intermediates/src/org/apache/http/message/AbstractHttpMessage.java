package org.apache.http.message;
public abstract class AbstractHttpMessage
  implements org.apache.http.HttpMessage
{
protected  AbstractHttpMessage(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  AbstractHttpMessage() { throw new RuntimeException("Stub!"); }
public  boolean containsHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header[] getHeaders(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getFirstHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getLastHeader(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header[] getAllHeaders() { throw new RuntimeException("Stub!"); }
public  void addHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void addHeader(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void setHeader(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setHeaders(org.apache.http.Header[] headers) { throw new RuntimeException("Stub!"); }
public  void removeHeader(org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public  void removeHeaders(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderIterator headerIterator() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderIterator headerIterator(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams getParams() { throw new RuntimeException("Stub!"); }
public  void setParams(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected org.apache.http.message.HeaderGroup headergroup;
protected org.apache.http.params.HttpParams params;
}
