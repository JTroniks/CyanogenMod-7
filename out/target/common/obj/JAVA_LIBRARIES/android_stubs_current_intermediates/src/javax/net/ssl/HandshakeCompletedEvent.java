package javax.net.ssl;
public class HandshakeCompletedEvent
  extends java.util.EventObject
{
public  HandshakeCompletedEvent(javax.net.ssl.SSLSocket sock, javax.net.ssl.SSLSession s) { super((java.lang.Object)null); throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLSession getSession() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCipherSuite() { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate[] getLocalCertificates() { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
public  javax.security.cert.X509Certificate[] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
public  java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
public  java.security.Principal getLocalPrincipal() { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLSocket getSocket() { throw new RuntimeException("Stub!"); }
}
