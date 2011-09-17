package org.apache.http.client;
public interface HttpClient
{
public abstract  org.apache.http.params.HttpParams getParams();
public abstract  org.apache.http.conn.ClientConnectionManager getConnectionManager();
public abstract  org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest request) throws java.io.IOException, org.apache.http.client.ClientProtocolException;
public abstract  org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException;
public abstract  org.apache.http.HttpResponse execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request) throws java.io.IOException, org.apache.http.client.ClientProtocolException;
public abstract  org.apache.http.HttpResponse execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException;
public abstract <T> T execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler) throws java.io.IOException, org.apache.http.client.ClientProtocolException;
public abstract <T> T execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException;
public abstract <T> T execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler) throws java.io.IOException, org.apache.http.client.ClientProtocolException;
public abstract <T> T execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException;
}
