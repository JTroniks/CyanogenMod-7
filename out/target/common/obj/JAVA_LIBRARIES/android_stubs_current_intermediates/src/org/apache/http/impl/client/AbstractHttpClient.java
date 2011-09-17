package org.apache.http.impl.client;
public abstract class AbstractHttpClient
  implements org.apache.http.client.HttpClient
{
protected  AbstractHttpClient(org.apache.http.conn.ClientConnectionManager conman, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected abstract  org.apache.http.params.HttpParams createHttpParams();
protected abstract  org.apache.http.protocol.HttpContext createHttpContext();
protected abstract  org.apache.http.protocol.HttpRequestExecutor createRequestExecutor();
protected abstract  org.apache.http.conn.ClientConnectionManager createClientConnectionManager();
protected abstract  org.apache.http.auth.AuthSchemeRegistry createAuthSchemeRegistry();
protected abstract  org.apache.http.cookie.CookieSpecRegistry createCookieSpecRegistry();
protected abstract  org.apache.http.ConnectionReuseStrategy createConnectionReuseStrategy();
protected abstract  org.apache.http.conn.ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy();
protected abstract  org.apache.http.protocol.BasicHttpProcessor createHttpProcessor();
protected abstract  org.apache.http.client.HttpRequestRetryHandler createHttpRequestRetryHandler();
protected abstract  org.apache.http.client.RedirectHandler createRedirectHandler();
protected abstract  org.apache.http.client.AuthenticationHandler createTargetAuthenticationHandler();
protected abstract  org.apache.http.client.AuthenticationHandler createProxyAuthenticationHandler();
protected abstract  org.apache.http.client.CookieStore createCookieStore();
protected abstract  org.apache.http.client.CredentialsProvider createCredentialsProvider();
protected abstract  org.apache.http.conn.routing.HttpRoutePlanner createHttpRoutePlanner();
protected abstract  org.apache.http.client.UserTokenHandler createUserTokenHandler();
public final synchronized  org.apache.http.params.HttpParams getParams() { throw new RuntimeException("Stub!"); }
public synchronized  void setParams(org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.conn.ClientConnectionManager getConnectionManager() { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.protocol.HttpRequestExecutor getRequestExecutor() { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.auth.AuthSchemeRegistry getAuthSchemes() { throw new RuntimeException("Stub!"); }
public synchronized  void setAuthSchemes(org.apache.http.auth.AuthSchemeRegistry authSchemeRegistry) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.cookie.CookieSpecRegistry getCookieSpecs() { throw new RuntimeException("Stub!"); }
public synchronized  void setCookieSpecs(org.apache.http.cookie.CookieSpecRegistry cookieSpecRegistry) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.ConnectionReuseStrategy getConnectionReuseStrategy() { throw new RuntimeException("Stub!"); }
public synchronized  void setReuseStrategy(org.apache.http.ConnectionReuseStrategy reuseStrategy) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.conn.ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy() { throw new RuntimeException("Stub!"); }
public synchronized  void setKeepAliveStrategy(org.apache.http.conn.ConnectionKeepAliveStrategy keepAliveStrategy) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.client.HttpRequestRetryHandler getHttpRequestRetryHandler() { throw new RuntimeException("Stub!"); }
public synchronized  void setHttpRequestRetryHandler(org.apache.http.client.HttpRequestRetryHandler retryHandler) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.client.RedirectHandler getRedirectHandler() { throw new RuntimeException("Stub!"); }
public synchronized  void setRedirectHandler(org.apache.http.client.RedirectHandler redirectHandler) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.client.AuthenticationHandler getTargetAuthenticationHandler() { throw new RuntimeException("Stub!"); }
public synchronized  void setTargetAuthenticationHandler(org.apache.http.client.AuthenticationHandler targetAuthHandler) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.client.AuthenticationHandler getProxyAuthenticationHandler() { throw new RuntimeException("Stub!"); }
public synchronized  void setProxyAuthenticationHandler(org.apache.http.client.AuthenticationHandler proxyAuthHandler) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.client.CookieStore getCookieStore() { throw new RuntimeException("Stub!"); }
public synchronized  void setCookieStore(org.apache.http.client.CookieStore cookieStore) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.client.CredentialsProvider getCredentialsProvider() { throw new RuntimeException("Stub!"); }
public synchronized  void setCredentialsProvider(org.apache.http.client.CredentialsProvider credsProvider) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.conn.routing.HttpRoutePlanner getRoutePlanner() { throw new RuntimeException("Stub!"); }
public synchronized  void setRoutePlanner(org.apache.http.conn.routing.HttpRoutePlanner routePlanner) { throw new RuntimeException("Stub!"); }
public final synchronized  org.apache.http.client.UserTokenHandler getUserTokenHandler() { throw new RuntimeException("Stub!"); }
public synchronized  void setUserTokenHandler(org.apache.http.client.UserTokenHandler userTokenHandler) { throw new RuntimeException("Stub!"); }
protected final synchronized  org.apache.http.protocol.BasicHttpProcessor getHttpProcessor() { throw new RuntimeException("Stub!"); }
public synchronized  void addResponseInterceptor(org.apache.http.HttpResponseInterceptor itcp) { throw new RuntimeException("Stub!"); }
public synchronized  void addResponseInterceptor(org.apache.http.HttpResponseInterceptor itcp, int index) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.HttpResponseInterceptor getResponseInterceptor(int index) { throw new RuntimeException("Stub!"); }
public synchronized  int getResponseInterceptorCount() { throw new RuntimeException("Stub!"); }
public synchronized  void clearResponseInterceptors() { throw new RuntimeException("Stub!"); }
public  void removeResponseInterceptorByClass(java.lang.Class<? extends org.apache.http.HttpResponseInterceptor> clazz) { throw new RuntimeException("Stub!"); }
public synchronized  void addRequestInterceptor(org.apache.http.HttpRequestInterceptor itcp) { throw new RuntimeException("Stub!"); }
public synchronized  void addRequestInterceptor(org.apache.http.HttpRequestInterceptor itcp, int index) { throw new RuntimeException("Stub!"); }
public synchronized  org.apache.http.HttpRequestInterceptor getRequestInterceptor(int index) { throw new RuntimeException("Stub!"); }
public synchronized  int getRequestInterceptorCount() { throw new RuntimeException("Stub!"); }
public synchronized  void clearRequestInterceptors() { throw new RuntimeException("Stub!"); }
public  void removeRequestInterceptorByClass(java.lang.Class<? extends org.apache.http.HttpRequestInterceptor> clazz) { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest request) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpResponse execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpResponse execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public final  org.apache.http.HttpResponse execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.client.RequestDirector createClientRequestDirector(org.apache.http.protocol.HttpRequestExecutor requestExec, org.apache.http.conn.ClientConnectionManager conman, org.apache.http.ConnectionReuseStrategy reustrat, org.apache.http.conn.ConnectionKeepAliveStrategy kastrat, org.apache.http.conn.routing.HttpRoutePlanner rouplan, org.apache.http.protocol.HttpProcessor httpProcessor, org.apache.http.client.HttpRequestRetryHandler retryHandler, org.apache.http.client.RedirectHandler redirectHandler, org.apache.http.client.AuthenticationHandler targetAuthHandler, org.apache.http.client.AuthenticationHandler proxyAuthHandler, org.apache.http.client.UserTokenHandler stateHandler, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.params.HttpParams determineParams(org.apache.http.HttpRequest req) { throw new RuntimeException("Stub!"); }
public <T> T execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public <T> T execute(org.apache.http.client.methods.HttpUriRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public <T> T execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
public <T> T execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.client.ResponseHandler<? extends T> responseHandler, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.client.ClientProtocolException { throw new RuntimeException("Stub!"); }
}
