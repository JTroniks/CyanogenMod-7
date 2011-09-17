package org.apache.http.impl;
public abstract class AbstractHttpClientConnection
  implements org.apache.http.HttpClientConnection
{
public  AbstractHttpClientConnection() { throw new RuntimeException("Stub!"); }
protected abstract  void assertOpen() throws java.lang.IllegalStateException;
protected  org.apache.http.impl.entity.EntityDeserializer createEntityDeserializer() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.entity.EntitySerializer createEntitySerializer() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpResponseFactory createHttpResponseFactory() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.HttpMessageParser createResponseParser(org.apache.http.io.SessionInputBuffer buffer, org.apache.http.HttpResponseFactory responseFactory, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.io.HttpMessageWriter createRequestWriter(org.apache.http.io.SessionOutputBuffer buffer, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  void init(org.apache.http.io.SessionInputBuffer inbuffer, org.apache.http.io.SessionOutputBuffer outbuffer, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public  boolean isResponseAvailable(int timeout) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestHeader(org.apache.http.HttpRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void sendRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void doFlush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void receiveResponseEntity(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isStale() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!"); }
}
