package org.apache.http.impl;
public class DefaultHttpResponseFactory
  implements org.apache.http.HttpResponseFactory
{
public  DefaultHttpResponseFactory(org.apache.http.ReasonPhraseCatalog catalog) { throw new RuntimeException("Stub!"); }
public  DefaultHttpResponseFactory() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse newHttpResponse(org.apache.http.ProtocolVersion ver, int status, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse newHttpResponse(org.apache.http.StatusLine statusline, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
protected  java.util.Locale determineLocale(org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
protected final org.apache.http.ReasonPhraseCatalog reasonCatalog;
}
