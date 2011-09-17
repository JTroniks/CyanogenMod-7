package org.apache.http;
public interface HttpRequestFactory
{
public abstract  org.apache.http.HttpRequest newHttpRequest(org.apache.http.RequestLine requestline) throws org.apache.http.MethodNotSupportedException;
public abstract  org.apache.http.HttpRequest newHttpRequest(java.lang.String method, java.lang.String uri) throws org.apache.http.MethodNotSupportedException;
}
