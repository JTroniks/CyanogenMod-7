package javax.net.ssl;
public abstract class SSLServerSocket
  extends java.net.ServerSocket
{
protected  SSLServerSocket() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  SSLServerSocket(int port) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  SSLServerSocket(int port, int backlog) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  SSLServerSocket(int port, int backlog, java.net.InetAddress address) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String[] getEnabledCipherSuites();
public abstract  void setEnabledCipherSuites(java.lang.String[] suites);
public abstract  java.lang.String[] getSupportedCipherSuites();
public abstract  java.lang.String[] getSupportedProtocols();
public abstract  java.lang.String[] getEnabledProtocols();
public abstract  void setEnabledProtocols(java.lang.String[] protocols);
public abstract  void setNeedClientAuth(boolean need);
public abstract  boolean getNeedClientAuth();
public abstract  void setWantClientAuth(boolean want);
public abstract  boolean getWantClientAuth();
public abstract  void setUseClientMode(boolean mode);
public abstract  boolean getUseClientMode();
public abstract  void setEnableSessionCreation(boolean flag);
public abstract  boolean getEnableSessionCreation();
}
