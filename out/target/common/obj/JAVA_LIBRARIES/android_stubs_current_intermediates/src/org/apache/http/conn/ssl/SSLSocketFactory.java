package org.apache.http.conn.ssl;
public class SSLSocketFactory
  implements org.apache.http.conn.scheme.LayeredSocketFactory
{
public  SSLSocketFactory(java.lang.String algorithm, java.security.KeyStore keystore, java.lang.String keystorePassword, java.security.KeyStore truststore, java.security.SecureRandom random, org.apache.http.conn.scheme.HostNameResolver nameResolver) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public  SSLSocketFactory(java.security.KeyStore keystore, java.lang.String keystorePassword, java.security.KeyStore truststore) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public  SSLSocketFactory(java.security.KeyStore keystore, java.lang.String keystorePassword) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public  SSLSocketFactory(java.security.KeyStore truststore) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public static  org.apache.http.conn.ssl.SSLSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.Socket connectSocket(java.net.Socket sock, java.lang.String host, int port, java.net.InetAddress localAddress, int localPort, org.apache.http.params.HttpParams params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isSecure(java.net.Socket sock) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket(java.net.Socket socket, java.lang.String host, int port, boolean autoClose) throws java.io.IOException, java.net.UnknownHostException { throw new RuntimeException("Stub!"); }
public  void setHostnameVerifier(org.apache.http.conn.ssl.X509HostnameVerifier hostnameVerifier) { throw new RuntimeException("Stub!"); }
public  org.apache.http.conn.ssl.X509HostnameVerifier getHostnameVerifier() { throw new RuntimeException("Stub!"); }
public static final java.lang.String TLS = "TLS";
public static final java.lang.String SSL = "SSL";
public static final java.lang.String SSLV2 = "SSLv2";
public static final org.apache.http.conn.ssl.X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER;
public static final org.apache.http.conn.ssl.X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
public static final org.apache.http.conn.ssl.X509HostnameVerifier STRICT_HOSTNAME_VERIFIER;
static { ALLOW_ALL_HOSTNAME_VERIFIER = null; BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = null; STRICT_HOSTNAME_VERIFIER = null; }
}
