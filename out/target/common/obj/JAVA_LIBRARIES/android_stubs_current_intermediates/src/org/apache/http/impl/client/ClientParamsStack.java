package org.apache.http.impl.client;
public class ClientParamsStack
  extends org.apache.http.params.AbstractHttpParams
{
public  ClientParamsStack(org.apache.http.params.HttpParams aparams, org.apache.http.params.HttpParams cparams, org.apache.http.params.HttpParams rparams, org.apache.http.params.HttpParams oparams) { throw new RuntimeException("Stub!"); }
public  ClientParamsStack(org.apache.http.impl.client.ClientParamsStack stack) { throw new RuntimeException("Stub!"); }
public  ClientParamsStack(org.apache.http.impl.client.ClientParamsStack stack, org.apache.http.params.HttpParams aparams, org.apache.http.params.HttpParams cparams, org.apache.http.params.HttpParams rparams, org.apache.http.params.HttpParams oparams) { throw new RuntimeException("Stub!"); }
public final  org.apache.http.params.HttpParams getApplicationParams() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.params.HttpParams getClientParams() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.params.HttpParams getRequestParams() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.params.HttpParams getOverrideParams() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getParameter(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams setParameter(java.lang.String name, java.lang.Object value) throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  boolean removeParameter(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  org.apache.http.params.HttpParams copy() { throw new RuntimeException("Stub!"); }
protected final org.apache.http.params.HttpParams applicationParams;
protected final org.apache.http.params.HttpParams clientParams;
protected final org.apache.http.params.HttpParams requestParams;
protected final org.apache.http.params.HttpParams overrideParams;
}
