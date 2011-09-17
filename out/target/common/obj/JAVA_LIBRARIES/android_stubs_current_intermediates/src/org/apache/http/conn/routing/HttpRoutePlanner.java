package org.apache.http.conn.routing;
public interface HttpRoutePlanner
{
public abstract  org.apache.http.conn.routing.HttpRoute determineRoute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException;
}
