package org.apache.http.protocol;
public class HttpRequestExecutor
{
public  HttpRequestExecutor() { throw new RuntimeException("Stub!"); }
protected  boolean canResponseHaveBody(org.apache.http.HttpRequest request, org.apache.http.HttpResponse response) { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse execute(org.apache.http.HttpRequest request, org.apache.http.HttpClientConnection conn, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
public  void preProcess(org.apache.http.HttpRequest request, org.apache.http.protocol.HttpProcessor processor, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpResponse doSendRequest(org.apache.http.HttpRequest request, org.apache.http.HttpClientConnection conn, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpResponse doReceiveResponse(org.apache.http.HttpRequest request, org.apache.http.HttpClientConnection conn, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void postProcess(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpProcessor processor, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
}
