package org.apache.http.conn.ssl;
public abstract class AbstractVerifier
  implements org.apache.http.conn.ssl.X509HostnameVerifier
{
public  AbstractVerifier() { throw new RuntimeException("Stub!"); }
public final  void verify(java.lang.String host, javax.net.ssl.SSLSocket ssl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  boolean verify(java.lang.String host, javax.net.ssl.SSLSession session) { throw new RuntimeException("Stub!"); }
public final  void verify(java.lang.String host, java.security.cert.X509Certificate cert) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public final  void verify(java.lang.String host, java.lang.String[] cns, java.lang.String[] subjectAlts, boolean strictWithSubDomains) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public static  boolean acceptableCountryWildcard(java.lang.String cn) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getCNs(java.security.cert.X509Certificate cert) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getDNSSubjectAlts(java.security.cert.X509Certificate cert) { throw new RuntimeException("Stub!"); }
public static  int countDots(java.lang.String s) { throw new RuntimeException("Stub!"); }
}
