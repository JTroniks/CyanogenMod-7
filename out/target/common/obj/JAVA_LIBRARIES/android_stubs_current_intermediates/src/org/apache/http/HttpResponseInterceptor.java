package org.apache.http;
public interface HttpResponseInterceptor
{
public abstract  void process(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException;
}
