package org.apache.http.protocol;
public interface HttpExpectationVerifier
{
public abstract  void verify(org.apache.http.HttpRequest request, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException;
}
