package java.net;
public abstract class DatagramSocketImpl
  implements java.net.SocketOptions
{
public  DatagramSocketImpl() { throw new RuntimeException("Stub!"); }
protected abstract  void bind(int port, java.net.InetAddress addr) throws java.net.SocketException;
protected abstract  void close();
protected abstract  void create() throws java.net.SocketException;
protected  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
protected  int getLocalPort() { throw new RuntimeException("Stub!"); }
protected abstract  byte getTTL() throws java.io.IOException;
protected abstract  int getTimeToLive() throws java.io.IOException;
protected abstract  void join(java.net.InetAddress addr) throws java.io.IOException;
protected abstract  void joinGroup(java.net.SocketAddress addr, java.net.NetworkInterface netInterface) throws java.io.IOException;
protected abstract  void leave(java.net.InetAddress addr) throws java.io.IOException;
protected abstract  void leaveGroup(java.net.SocketAddress addr, java.net.NetworkInterface netInterface) throws java.io.IOException;
protected abstract  int peek(java.net.InetAddress sender) throws java.io.IOException;
protected abstract  void receive(java.net.DatagramPacket pack) throws java.io.IOException;
protected abstract  void send(java.net.DatagramPacket pack) throws java.io.IOException;
protected abstract  void setTimeToLive(int ttl) throws java.io.IOException;
protected abstract  void setTTL(byte ttl) throws java.io.IOException;
protected  void connect(java.net.InetAddress inetAddr, int port) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
protected  void disconnect() { throw new RuntimeException("Stub!"); }
protected abstract  int peekData(java.net.DatagramPacket pack) throws java.io.IOException;
protected java.io.FileDescriptor fd;
protected int localPort;
}
