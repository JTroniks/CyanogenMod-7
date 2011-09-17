package java.net;
public class DatagramSocket
{
public  DatagramSocket() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  DatagramSocket(int aPort) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  DatagramSocket(int aPort, java.net.InetAddress addr) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
protected  DatagramSocket(java.net.DatagramSocketImpl socketImpl) { throw new RuntimeException("Stub!"); }
public  DatagramSocket(java.net.SocketAddress localAddr) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void connect(java.net.InetAddress anAddress, int aPort) { throw new RuntimeException("Stub!"); }
public  void disconnect() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
public  int getLocalPort() { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public synchronized  int getReceiveBufferSize() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  int getSendBufferSize() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  int getSoTimeout() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  void receive(java.net.DatagramPacket pack) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void send(java.net.DatagramPacket pack) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void setSendBufferSize(int size) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  void setReceiveBufferSize(int size) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  void setSoTimeout(int timeout) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public static synchronized  void setDatagramSocketImplFactory(java.net.DatagramSocketImplFactory fac) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void bind(java.net.SocketAddress localAddr) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void connect(java.net.SocketAddress remoteAddr) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean isBound() { throw new RuntimeException("Stub!"); }
public  boolean isConnected() { throw new RuntimeException("Stub!"); }
public  java.net.SocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); }
public  java.net.SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
public  void setReuseAddress(boolean reuse) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean getReuseAddress() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setBroadcast(boolean broadcast) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean getBroadcast() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setTrafficClass(int value) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  int getTrafficClass() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  boolean isClosed() { throw new RuntimeException("Stub!"); }
public  java.nio.channels.DatagramChannel getChannel() { throw new RuntimeException("Stub!"); }
}
