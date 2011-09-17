package org.apache.http.entity;
public class HttpEntityWrapper
  implements org.apache.http.HttpEntity
{
public  HttpEntityWrapper(org.apache.http.HttpEntity wrapped) { throw new RuntimeException("Stub!"); }
public  boolean isRepeatable() { throw new RuntimeException("Stub!"); }
public  boolean isChunked() { throw new RuntimeException("Stub!"); }
public  long getContentLength() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getContentType() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header getContentEncoding() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeTo(java.io.OutputStream outstream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isStreaming() { throw new RuntimeException("Stub!"); }
public  void consumeContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected org.apache.http.HttpEntity wrappedEntity;
}
