package org.apache.http.impl.client;
public class EntityEnclosingRequestWrapper
  extends org.apache.http.impl.client.RequestWrapper
  implements org.apache.http.HttpEntityEnclosingRequest
{
public  EntityEnclosingRequestWrapper(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.ProtocolException { super((org.apache.http.HttpRequest)null); throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpEntity getEntity() { throw new RuntimeException("Stub!"); }
public  void setEntity(org.apache.http.HttpEntity entity) { throw new RuntimeException("Stub!"); }
public  boolean expectContinue() { throw new RuntimeException("Stub!"); }
public  boolean isRepeatable() { throw new RuntimeException("Stub!"); }
}
