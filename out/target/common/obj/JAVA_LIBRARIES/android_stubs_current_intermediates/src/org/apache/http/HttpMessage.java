package org.apache.http;
public interface HttpMessage
{
public abstract  org.apache.http.ProtocolVersion getProtocolVersion();
public abstract  boolean containsHeader(java.lang.String name);
public abstract  org.apache.http.Header[] getHeaders(java.lang.String name);
public abstract  org.apache.http.Header getFirstHeader(java.lang.String name);
public abstract  org.apache.http.Header getLastHeader(java.lang.String name);
public abstract  org.apache.http.Header[] getAllHeaders();
public abstract  void addHeader(org.apache.http.Header header);
public abstract  void addHeader(java.lang.String name, java.lang.String value);
public abstract  void setHeader(org.apache.http.Header header);
public abstract  void setHeader(java.lang.String name, java.lang.String value);
public abstract  void setHeaders(org.apache.http.Header[] headers);
public abstract  void removeHeader(org.apache.http.Header header);
public abstract  void removeHeaders(java.lang.String name);
public abstract  org.apache.http.HeaderIterator headerIterator();
public abstract  org.apache.http.HeaderIterator headerIterator(java.lang.String name);
public abstract  org.apache.http.params.HttpParams getParams();
public abstract  void setParams(org.apache.http.params.HttpParams params);
}
