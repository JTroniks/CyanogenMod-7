package org.apache.http.protocol;
public interface HttpRequestHandler
{
public abstract  void handle(org.apache.http.HttpRequest request, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException;
}
