package java.net;
public abstract class SecureCacheResponse
  extends java.net.CacheResponse
{
public  SecureCacheResponse() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getCipherSuite();
public abstract  java.util.List<java.security.cert.Certificate> getLocalCertificateChain();
public abstract  java.util.List<java.security.cert.Certificate> getServerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException;
public abstract  java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException;
public abstract  java.security.Principal getLocalPrincipal();
}
