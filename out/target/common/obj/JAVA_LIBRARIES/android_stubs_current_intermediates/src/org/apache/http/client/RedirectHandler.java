package org.apache.http.client;
public interface RedirectHandler
{
public abstract  boolean isRedirectRequested(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context);
public abstract  java.net.URI getLocationURI(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.ProtocolException;
}
