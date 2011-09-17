package javax.net.ssl;
public interface X509TrustManager
  extends javax.net.ssl.TrustManager
{
public abstract  void checkClientTrusted(java.security.cert.X509Certificate[] chain, java.lang.String authType) throws java.security.cert.CertificateException;
public abstract  void checkServerTrusted(java.security.cert.X509Certificate[] chain, java.lang.String authType) throws java.security.cert.CertificateException;
public abstract  java.security.cert.X509Certificate[] getAcceptedIssuers();
}
