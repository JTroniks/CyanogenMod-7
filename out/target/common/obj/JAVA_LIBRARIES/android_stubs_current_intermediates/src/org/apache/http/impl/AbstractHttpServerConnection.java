package org.apache.http.impl;
public abstract class AbstractHttpServerConnection
  implements org.apache.http.HttpServerConnection
{
public  AbstractHttpServerConnection() { throw new RuntimeException("Stub!"); }
protected abstract  void assertOpen() throws java.lang.IllegalStateException;
protected  org.apache.http.impl.entity.EntityDeserializer createEntityDeserializer() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.entity.EntitySerializer createEntitySerializer() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpRequestFactory createHttpRequestFactory() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.HttpMessageParser createRequestParser(org.apache.http.io.SessionInputBuffer buffer, org.apache.http.HttpRequestFactory requestFactory, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.HttpMessageWriter createResponseWriter(org.apache.http.io.SessionOutputBuffer buffer, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  void init(org.apache.http.io.SessionInputBuffer inbuffer, org.apache.http.io.SessionOutputBuffer outbuffer, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpRequest receiveRequestHeader() throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void receiveRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void doFlush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendResponseHeader(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendResponseEntity(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isStale() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
