package javax.net.ssl;
public interface SSLSession
{
public abstract  int getApplicationBufferSize();
public abstract  java.lang.String getCipherSuite();
public abstract  long getCreationTime();
public abstract  byte[] getId();
public abstract  long getLastAccessedTime();
public abstract  java.security.cert.Certificate[] getLocalCertificates();
public abstract  java.security.Principal getLocalPrincipal();
public abstract  int getPacketBufferSize();
public abstract  javax.security.cert.X509Certificate[] getPeerCertificateChain() throws javax.net.ssl.SSLPeerUnverifiedException;
public abstract  java.security.cert.Certificate[] getPeerCertificates() throws javax.net.ssl.SSLPeerUnverifiedException;
public abstract  java.lang.String getPeerHost();
public abstract  int getPeerPort();
public abstract  java.security.Principal getPeerPrincipal() throws javax.net.ssl.SSLPeerUnverifiedException;
public abstract  java.lang.String getProtocol();
public abstract  javax.net.ssl.SSLSessionContext getSessionContext();
public abstract  java.lang.Object getValue(java.lang.String name);
public abstract  java.lang.String[] getValueNames();
public abstract  void invalidate();
public abstract  boolean isValid();
public abstract  void putValue(java.lang.String name, java.lang.Object value);
public abstract  void removeValue(java.lang.String name);
}
