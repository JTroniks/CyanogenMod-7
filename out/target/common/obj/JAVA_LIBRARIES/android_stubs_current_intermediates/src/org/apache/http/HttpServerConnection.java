package org.apache.http;
public interface HttpServerConnection
  extends org.apache.http.HttpConnection
{
public abstract  org.apache.http.HttpRequest receiveRequestHeader() throws org.apache.http.HttpException, java.io.IOException;
public abstract  void receiveRequestEntity(org.apache.http.HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, java.io.IOException;
public abstract  void sendResponseHeader(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException;
public abstract  void sendResponseEntity(org.apache.http.HttpResponse response) throws org.apache.http.HttpException, java.io.IOException;
public abstract  void flush() throws java.io.IOException;
}
