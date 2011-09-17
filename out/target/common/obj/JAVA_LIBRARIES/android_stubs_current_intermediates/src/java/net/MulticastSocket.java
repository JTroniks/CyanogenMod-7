package java.net;
public class MulticastSocket
  extends java.net.DatagramSocket
{
public  MulticastSocket() throws java.io.IOException { super((java.net.DatagramSocketImpl)null); throw new RuntimeException("Stub!"); }
public  MulticastSocket(int aPort) throws java.io.IOException { super((java.net.DatagramSocketImpl)null); throw new RuntimeException("Stub!"); }
public  MulticastSocket(java.net.SocketAddress localAddr) throws java.io.IOException { super((java.net.DatagramSocketImpl)null); throw new RuntimeException("Stub!"); }
public  java.net.InetAddress getInterface() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  java.net.NetworkInterface getNetworkInterface() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  int getTimeToLive() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte getTTL() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void joinGroup(java.net.InetAddress groupAddr) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void joinGroup(java.net.SocketAddress groupAddress, java.net.NetworkInterface netInterface) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void leaveGroup(java.net.InetAddress groupAddr) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void leaveGroup(java.net.SocketAddress groupAddress, java.net.NetworkInterface netInterface) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void send(java.net.DatagramPacket pack, byte ttl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setInterface(java.net.InetAddress addr) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setNetworkInterface(java.net.NetworkInterface netInterface) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setTimeToLive(int ttl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setTTL(byte ttl) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean getLoopbackMode() throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  void setLoopbackMode(boolean disable) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
}
