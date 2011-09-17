package org.apache.http.entity;
public abstract class AbstractHttpEntity
  implements org.apache.http.HttpEntity
{
protected  AbstractHttpEntity() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getContentType() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getContentEncoding() { throw new RuntimeException("Stub!"); }
public  boolean isChunked() { throw new RuntimeException("Stub!"); }
public  void setContentType(org.apache.http.Header contentType) { throw new RuntimeException("Stub!"); }
public  void setContentType(java.lang.String ctString) { throw new RuntimeException("Stub!"); }
public  void setContentEncoding(org.apache.http.Header contentEncoding) { throw new RuntimeException("Stub!"); }
public  void setContentEncoding(java.lang.String ceString) { throw new RuntimeException("Stub!"); }
public  void setChunked(boolean b) { throw new RuntimeException("Stub!"); }
public  void consumeContent() throws java.io.IOException, java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
protected org.apache.http.Header contentType;
protected org.apache.http.Header contentEncoding;
protected boolean chunked;
}
