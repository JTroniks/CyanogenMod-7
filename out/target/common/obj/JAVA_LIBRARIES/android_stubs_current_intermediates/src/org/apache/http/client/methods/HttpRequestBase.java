package org.apache.http.client.methods;
public abstract class HttpRequestBase
  extends org.apache.http.message.AbstractHttpMessage
  implements org.apache.http.client.methods.HttpUriRequest, org.apache.http.client.methods.AbortableHttpRequest, java.lang.Cloneable
{
public  HttpRequestBase() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getMethod();
public  org.apache.http.ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); }
public  java.net.URI getURI() { throw new RuntimeException("Stub!"); }
public  org.apache.http.RequestLine getRequestLine() { throw new RuntimeException("Stub!"); }
public  void setURI(java.net.URI uri) { throw new RuntimeException("Stub!"); }
public  void setConnectionRequest(org.apache.http.conn.ClientConnectionRequest connRequest) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setReleaseTrigger(org.apache.http.conn.ConnectionReleaseTrigger releaseTrigger) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void abort() { throw new RuntimeException("Stub!"); }
public  boolean isAborted() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
