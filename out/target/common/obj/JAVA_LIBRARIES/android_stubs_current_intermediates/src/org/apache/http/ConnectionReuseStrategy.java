package org.apache.http;
public interface ConnectionReuseStrategy
{
public abstract  boolean keepAlive(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context);
}
