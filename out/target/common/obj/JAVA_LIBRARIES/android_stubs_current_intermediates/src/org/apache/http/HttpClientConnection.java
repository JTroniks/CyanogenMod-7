package org.apache.http;
public interface HttpClientConnection
  extends org.apache.http.HttpConnection
{
public abstract  boolean isResponseAvailable(int timeout) throws java.io.IOException;
public abstract  void sendRequestHeader(org.apache.http.HttpRequest request) throws org.apache.http.HttpException, java.io.IOException;
public abstract  void sendRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException;
public abstract  org.apache.http.HttpResponse receiveResponseHeader() throws org.apache.http.HttpException, java.io.IOException;
public abstract  void receiveResponseEntity(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException;
public abstract  void flush() throws java.io.IOException;
}
