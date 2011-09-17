package org.apache.http;
public interface HttpResponseFactory
{
public abstract  org.apache.http.HttpResponse newHttpResponse(org.apache.http.ProtocolVersion ver, int status, org.apache.http.protocol.HttpContext context);
public abstract  org.apache.http.HttpResponse newHttpResponse(org.apache.http.StatusLine statusline, org.apache.http.protocol.HttpContext context);
}
