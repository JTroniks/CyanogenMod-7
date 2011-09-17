package javax.net.ssl;
public abstract class HttpsURLConnection
  extends java.net.HttpURLConnection
{
protected  HttpsURLConnection(java.net.URL url) { super((java.net.URL)null); throw new RuntimeException("Stub!"); }
public static  void setDefaultHostnameVerifier(javax.net.ssl.HostnameVerifier v) { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.HostnameVerifier getDefaultHostnameVerifier() { throw new RuntimeException("Stub!"); }
public static  void setDefaultSSLSocketFactory(javax.net.ssl.SSLSocketFactory sf) { throw new RuntimeException("Stub!"); }
public static  javax.net.ssl.SSLSocketFactory getDefaultSSLSocketFactory() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getCipherSuite();
public abstract  java.security.cert.Certificate[] getLocalCertificates();
public abstract  java.security.cert.Certificate[] getServerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException;
public  java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
public  java.security.Principal getLocalPrincipal() { throw new RuntimeException("Stub!"); }
public  void setHostnameVerifier(javax.net.ssl.HostnameVerifier v) { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.HostnameVerifier getHostnameVerifier() { throw new RuntimeException("Stub!"); }
public  void setSSLSocketFactory(javax.net.ssl.SSLSocketFactory sf) { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLSocketFactory getSSLSocketFactory() { throw new RuntimeException("Stub!"); }
protected javax.net.ssl.HostnameVerifier hostnameVerifier;
}
