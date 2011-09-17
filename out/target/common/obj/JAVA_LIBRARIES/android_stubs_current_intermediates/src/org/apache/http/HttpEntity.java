package org.apache.http;
public interface HttpEntity
{
public abstract  boolean isRepeatable();
public abstract  boolean isChunked();
public abstract  long getContentLength();
public abstract  org.apache.http.Header getContentType();
public abstract  org.apache.http.Header getContentEncoding();
public abstract  java.io.InputStream getContent() throws java.io.IOException, java.lang.IllegalStateException;
public abstract  void writeTo(java.io.OutputStream outstream) throws java.io.IOException;
public abstract  boolean isStreaming();
public abstract  void consumeContent() throws java.io.IOException;
}
