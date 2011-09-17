package javax.net.ssl;
public abstract class SSLServerSocketFactory
  extends javax.net.ServerSocketFactory
{
protected  SSLServerSocketFactory() { throw new RuntimeException("Stub!"); }
public static synchronized  javax.net.ServerSocketFactory getDefault() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String[] getDefaultCipherSuites();
public abstract  java.lang.String[] getSupportedCipherSuites();
}
