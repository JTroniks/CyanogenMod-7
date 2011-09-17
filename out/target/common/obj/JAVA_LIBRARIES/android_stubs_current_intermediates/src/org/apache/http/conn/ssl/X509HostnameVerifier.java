package org.apache.http.conn.ssl;
public interface X509HostnameVerifier
  extends javax.net.ssl.HostnameVerifier
{
public abstract  boolean verify(java.lang.String host, javax.net.ssl.SSLSession session);
public abstract  void verify(java.lang.String host, javax.net.ssl.SSLSocket ssl) throws java.io.IOException;
public abstract  void verify(java.lang.String host, java.security.cert.X509Certificate cert) throws javax.net.ssl.SSLException;
public abstract  void verify(java.lang.String host, java.lang.String[] cns, java.lang.String[] subjectAlts) throws javax.net.ssl.SSLException;
}
