package org.apache.http.protocol;
public class HttpRequestHandlerRegistry
  implements org.apache.http.protocol.HttpRequestHandlerResolver
{
public  HttpRequestHandlerRegistry() { throw new RuntimeException("Stub!"); }
public  void register(java.lang.String pattern, org.apache.http.protocol.HttpRequestHandler handler) { throw new RuntimeException("Stub!"); }
public  void unregister(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  void setHandlers(java.util.Map map) { throw new RuntimeException("Stub!"); }
public  org.apache.http.protocol.HttpRequestHandler lookup(java.lang.String requestURI) { throw new RuntimeException("Stub!"); }
protected  boolean matchUriRequestPattern(java.lang.String pattern, java.lang.String requestUri) { throw new RuntimeException("Stub!"); }
}
