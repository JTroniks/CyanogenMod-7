package javax.net.ssl;
public abstract class SSLSocket
  extends java.net.Socket
{
protected  SSLSocket() { throw new RuntimeException("Stub!"); }
protected  SSLSocket(java.lang.String host, int port) throws java.io.IOException, java.net.UnknownHostException { throw new RuntimeException("Stub!"); }
protected  SSLSocket(java.net.InetAddress address, int port) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  SSLSocket(java.lang.String host, int port, java.net.InetAddress clientAddress, int clientPort) throws java.io.IOException, java.net.UnknownHostException { throw new RuntimeException("Stub!"); }
protected  SSLSocket(java.net.InetAddress address, int port, java.net.InetAddress clientAddress, int clientPort) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String[] getSupportedCipherSuites();
public abstract  java.lang.String[] getEnabledCipherSuites();
public abstract  void setEnabledCipherSuites(java.lang.String[] suites);
public abstract  java.lang.String[] getSupportedProtocols();
public abstract  java.lang.String[] getEnabledProtocols();
public abstract  void setEnabledProtocols(java.lang.String[] protocols);
public abstract  javax.net.ssl.SSLSession getSession();
public abstract  void addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener listener);
public abstract  void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener listener);
public abstract  void startHandshake() throws java.io.IOException;
public abstract  void setUseClientMode(boolean mode);
public abstract  boolean getUseClientMode();
public abstract  void setNeedClientAuth(boolean need);
public abstract  boolean getNeedClientAuth();
public abstract  void setWantClientAuth(boolean want);
public abstract  boolean getWantClientAuth();
public abstract  void setEnableSessionCreation(boolean flag);
public abstract  boolean getEnableSessionCreation();
public  javax.net.ssl.SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); }
public  void setSSLParameters(javax.net.ssl.SSLParameters p) { throw new RuntimeException("Stub!"); }
}
