package java.net;
public class Socket
{
public  Socket() { throw new RuntimeException("Stub!"); }
public  Socket(java.net.Proxy proxy) { throw new RuntimeException("Stub!"); }
public  Socket(java.lang.String dstName, int dstPort) throws java.net.UnknownHostException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  Socket(java.lang.String dstName, int dstPort, java.net.InetAddress localAddress, int localPort) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  Socket(java.lang.String hostName, int port, boolean streaming) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  Socket(java.net.InetAddress dstAddress, int dstPort) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  Socket(java.net.InetAddress dstAddress, int dstPort, java.net.InetAddress localAddress, int localPort) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  Socket(java.net.InetAddress addr, int port, boolean streaming) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  Socket(java.net.SocketImpl impl) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean getKeepAlive() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  int getSoLinger() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  int getReceiveBufferSize() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  int getSendBufferSize() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  int getSoTimeout() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean getTcpNoDelay() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setKeepAlive(boolean keepAlive) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public static synchronized  void setSocketImplFactory(java.net.SocketImplFactory fac) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void setSendBufferSize(int size) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  void setReceiveBufferSize(int size) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setSoLinger(boolean on, int timeout) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  void setSoTimeout(int timeout) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setTcpNoDelay(boolean on) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void shutdownInput() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void shutdownOutput() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.net.SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
public  java.net.SocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); }
public  boolean isBound() { throw new RuntimeException("Stub!"); }
public  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  void bind(java.net.SocketAddress localAddr) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void connect(java.net.SocketAddress remoteAddr) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void connect(java.net.SocketAddress remoteAddr, int timeout) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isInputShutdown() { throw new RuntimeException("Stub!"); }
public  boolean isOutputShutdown() { throw new RuntimeException("Stub!"); }
public  void setReuseAddress(boolean reuse) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean getReuseAddress() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setOOBInline(boolean oobinline) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean getOOBInline() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setTrafficClass(int value) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  int getTrafficClass() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void sendUrgentData(int value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.nio.channels.SocketChannel getChannel() { throw new RuntimeException("Stub!"); }
public  void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!"); }
}
