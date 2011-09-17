package javax.net.ssl;
public abstract class SSLEngine
{
protected  SSLEngine() { throw new RuntimeException("Stub!"); }
protected  SSLEngine(java.lang.String host, int port) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPeerHost() { throw new RuntimeException("Stub!"); }
public  int getPeerPort() { throw new RuntimeException("Stub!"); }
public abstract  void beginHandshake() throws javax.net.ssl.SSLException;
public abstract  void closeInbound() throws javax.net.ssl.SSLException;
public abstract  void closeOutbound();
public abstract  java.lang.Runnable getDelegatedTask();
public abstract  java.lang.String[] getEnabledCipherSuites();
public abstract  java.lang.String[] getEnabledProtocols();
public abstract  boolean getEnableSessionCreation();
public abstract  javax.net.ssl.SSLEngineResult.HandshakeStatus getHandshakeStatus();
public abstract  boolean getNeedClientAuth();
public abstract  javax.net.ssl.SSLSession getSession();
public abstract  java.lang.String[] getSupportedCipherSuites();
public abstract  java.lang.String[] getSupportedProtocols();
public abstract  boolean getUseClientMode();
public abstract  boolean getWantClientAuth();
public abstract  boolean isInboundDone();
public abstract  boolean isOutboundDone();
public abstract  void setEnabledCipherSuites(java.lang.String[] suites);
public abstract  void setEnabledProtocols(java.lang.String[] protocols);
public abstract  void setEnableSessionCreation(boolean flag);
public abstract  void setNeedClientAuth(boolean need);
public abstract  void setUseClientMode(boolean mode);
public abstract  void setWantClientAuth(boolean want);
public abstract  javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer src, java.nio.ByteBuffer[] dsts, int offset, int length) throws javax.net.ssl.SSLException;
public abstract  javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] srcs, int offset, int length, java.nio.ByteBuffer dst) throws javax.net.ssl.SSLException;
public  javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer src, java.nio.ByteBuffer dst) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer src, java.nio.ByteBuffer[] dsts) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] srcs, java.nio.ByteBuffer dst) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer src, java.nio.ByteBuffer dst) throws javax.net.ssl.SSLException { throw new RuntimeException("Stub!"); }
public  javax.net.ssl.SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); }
public  void setSSLParameters(javax.net.ssl.SSLParameters p) { throw new RuntimeException("Stub!"); }
}
