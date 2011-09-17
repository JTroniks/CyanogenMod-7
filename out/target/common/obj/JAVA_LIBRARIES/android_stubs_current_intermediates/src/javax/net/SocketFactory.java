package javax.net;
public abstract class SocketFactory
{
protected  SocketFactory() { throw new RuntimeException("Stub!"); }
public static synchronized  javax.net.SocketFactory getDefault() { throw new RuntimeException("Stub!"); }
public  java.net.Socket createSocket() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.net.Socket createSocket(java.lang.String host, int port) throws java.io.IOException, java.net.UnknownHostException;
public abstract  java.net.Socket createSocket(java.lang.String host, int port, java.net.InetAddress localHost, int localPort) throws java.io.IOException, java.net.UnknownHostException;
public abstract  java.net.Socket createSocket(java.net.InetAddress host, int port) throws java.io.IOException;
public abstract  java.net.Socket createSocket(java.net.InetAddress address, int port, java.net.InetAddress localAddress, int localPort) throws java.io.IOException;
}
