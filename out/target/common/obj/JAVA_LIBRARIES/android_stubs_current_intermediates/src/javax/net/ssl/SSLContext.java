package javax.net.ssl;
public class SSLContext
{
protected  SSLContext(javax.net.ssl.SSLContextSpi contextSpi, java.security.Provider provider, java.lang.String protocol) { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLContext getDefault() throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  void setDefault(javax.net.ssl.SSLContext sslContext) { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLContext getInstance(java.lang.String protocol) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLContext getInstance(java.lang.String protocol, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLContext getInstance(java.lang.String protocol, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.lang.String getProtocol() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  void init(javax.net.ssl.KeyManager[] km, javax.net.ssl.TrustManager[] tm, java.security.SecureRandom sr) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLServerSocketFactory getServerSocketFactory() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLEngine createSSLEngine() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLEngine createSSLEngine(java.lang.String peerHost, int peerPort) { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLSessionContext getServerSessionContext() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLSessionContext getClientSessionContext() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLParameters getDefaultSSLParameters() { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.SSLParameters getSupportedSSLParameters() { throw new RuntimeException("Stub!"); }
}
