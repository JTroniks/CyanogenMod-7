package javax.net.ssl;
public abstract class SSLSocketFactory
  extends javax.net.SocketFactory
{
public  SSLSocketFactory() { throw new RuntimeException("Stub!"); }
public static synchronized  javax.net.SocketFactory getDefault() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String[] getDefaultCipherSuites();
public abstract  java.lang.String[] getSupportedCipherSuites();
public abstract  java.net.Socket createSocket(java.net.Socket s, java.lang.String host, int port, boolean autoClose) throws java.io.IOException;
}
