package javax.net;
public abstract class ServerSocketFactory
{
protected  ServerSocketFactory() { throw new RuntimeException("Stub!"); }
public static synchronized  javax.net.ServerSocketFactory getDefault() { throw new RuntimeException("Stub!"); }
public  java.net.ServerSocket createServerSocket() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.net.ServerSocket createServerSocket(int port) throws java.io.IOException;
public abstract  java.net.ServerSocket createServerSocket(int port, int backlog) throws java.io.IOException;
public abstract  java.net.ServerSocket createServerSocket(int port, int backlog, java.net.InetAddress iAddress) throws java.io.IOException;
}
