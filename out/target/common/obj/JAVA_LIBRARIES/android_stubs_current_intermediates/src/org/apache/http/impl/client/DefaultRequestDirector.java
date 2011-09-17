package org.apache.http.impl.client;
public class DefaultRequestDirector
  implements org.apache.http.client.RequestDirector
{
public  DefaultRequestDirector(org.apache.http.protocol.HttpRequestExecutor requestExec, org.apache.http.conn.ClientConnectionManager conman, org.apache.http.ConnectionReuseStrategy reustrat, org.apache.http.conn.ConnectionKeepAliveStrategy kastrat, org.apache.http.conn.routing.HttpRoutePlanner rouplan, org.apache.http.protocol.HttpProcessor httpProcessor, org.apache.http.client.HttpRequestRetryHandler retryHandler, org.apache.http.client.RedirectHandler redirectHandler, org.apache.http.client.AuthenticationHandler targetAuthHandler, org.apache.http.client.AuthenticationHandler proxyAuthHandler, org.apache.http.client.UserTokenHandler userTokenHandler, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected  void rewriteRequestURI(org.apache.http.impl.client.RequestWrapper request, org.apache.http.conn.routing.HttpRoute route) throws org.apache.http.ProtocolException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponse execute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void releaseConnection() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.conn.routing.HttpRoute determineRoute(org.apache.http.HttpHost target, org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  void establishRoute(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean createTunnelToTarget(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean createTunnelToProxy(org.apache.http.conn.routing.HttpRoute route, int hop, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HttpRequest createConnectRequest(org.apache.http.conn.routing.HttpRoute route, org.apache.http.protocol.HttpContext context) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.impl.client.RoutedRequest handleResponse(org.apache.http.impl.client.RoutedRequest roureq, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected final org.apache.http.conn.ClientConnectionManager connManager;
protected final org.apache.http.conn.routing.HttpRoutePlanner routePlanner;
protected final org.apache.http.ConnectionReuseStrategy reuseStrategy;
protected final org.apache.http.conn.ConnectionKeepAliveStrategy keepAliveStrategy;
protected final org.apache.http.protocol.HttpRequestExecutor requestExec;
protected final org.apache.http.protocol.HttpProcessor httpProcessor;
protected final org.apache.http.client.HttpRequestRetryHandler retryHandler;
protected final org.apache.http.client.RedirectHandler redirectHandler;
protected final org.apache.http.params.HttpParams params;
protected org.apache.http.conn.ManagedClientConnection managedConn;
}
