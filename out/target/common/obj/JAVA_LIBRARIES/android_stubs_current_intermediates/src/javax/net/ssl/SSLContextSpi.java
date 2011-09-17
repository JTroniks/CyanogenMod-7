package javax.net.ssl;
public abstract class SSLContextSpi
{
public  SSLContextSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineInit(javax.net.ssl.KeyManager[] km, javax.net.ssl.TrustManager[] tm, java.security.SecureRandom sr) throws java.security.KeyManagementException;
protected abstract  javax.net.ssl.SSLSocketFactory engineGetSocketFactory();
protected abstract  javax.net.ssl.SSLServerSocketFactory engineGetServerSocketFactory();
protected abstract  javax.net.ssl.SSLEngine engineCreateSSLEngine(java.lang.String host, int port);
protected abstract  javax.net.ssl.SSLEngine engineCreateSSLEngine();
protected abstract  javax.net.ssl.SSLSessionContext engineGetServerSessionContext();
protected abstract  javax.net.ssl.SSLSessionContext engineGetClientSessionContext();
protected  javax.net.ssl.SSLParameters engineGetDefaultSSLParameters() { throw new RuntimeException("Stub!"); }
protected  javax.net.ssl.SSLParameters engineGetSupportedSSLParameters() { throw new RuntimeException("Stub!"); }
}
