package org.apache.http.conn;
public interface ConnectionKeepAliveStrategy
{
public abstract  long getKeepAliveDuration(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context);
}
