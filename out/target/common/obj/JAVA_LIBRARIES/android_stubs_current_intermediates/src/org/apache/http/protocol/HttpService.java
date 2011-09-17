package org.apache.http.protocol;
public class HttpService
{
public  HttpService(org.apache.http.protocol.HttpProcessor proc, org.apache.http.ConnectionReuseStrategy connStrategy, org.apache.http.HttpResponseFactory responseFactory) { throw new RuntimeException("Stub!"); }
public  void setHttpProcessor(org.apache.http.protocol.HttpProcessor processor) { throw new RuntimeException("Stub!"); }
public  void setConnReuseStrategy(org.apache.http.ConnectionReuseStrategy connStrategy) { throw new RuntimeException("Stub!"); }
public  void setResponseFactory(org.apache.http.HttpResponseFactory responseFactory) { throw new RuntimeException("Stub!"); }
public  void setHandlerResolver(org.apache.http.protocol.HttpRequestHandlerResolver handlerResolver) { throw new RuntimeException("Stub!"); }
public  void setExpectationVerifier(org.apache.http.protocol.HttpExpectationVerifier expectationVerifier) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams getParams() { throw new RuntimeException("Stub!"); }
public  void setParams(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public  void handleRequest(org.apache.http.HttpServerConnection conn, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  void handleException(org.apache.http.HttpException ex, org.apache.http.HttpResponse response) { throw new RuntimeException("Stub!"); }
protected  void doService(org.apache.http.HttpRequest request, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
}
