package org.apache.http.client.methods;
public interface HttpUriRequest
  extends org.apache.http.HttpRequest
{
public abstract  java.lang.String getMethod();
public abstract  java.net.URI getURI();
public abstract  void abort() throws java.lang.UnsupportedOperationException;
public abstract  boolean isAborted();
}
