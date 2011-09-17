package java.net;
public class ServerSocket
{
public  ServerSocket() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  ServerSocket(int aport) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  ServerSocket(int aport, int backlog) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  ServerSocket(int aport, int backlog, java.net.InetAddress localAddr) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.Socket accept() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public synchronized  int getSoTimeout() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected final  void implAccept(java.net.Socket aSocket) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static synchronized  void setSocketFactory(java.net.SocketImplFactory aFactory) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void setSoTimeout(int timeout) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void bind(java.net.SocketAddress localAddr) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void bind(java.net.SocketAddress localAddr, int backlog) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
public  boolean isBound() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  void setReuseAddress(boolean reuse) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean getReuseAddress() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setReceiveBufferSize(int size) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  int getReceiveBufferSize() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  java.nio.channels.ServerSocketChannel getChannel() { throw new RuntimeException("Stub!"); }
public  void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!"); }
}
