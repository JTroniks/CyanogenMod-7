package java.net;
public final class DatagramPacket
{
public  DatagramPacket(byte[] data, int length) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] data, int offset, int length, java.net.InetAddress host, int aPort) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] data, int length, java.net.InetAddress host, int port) { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] data, int length, java.net.SocketAddress sockAddr) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public  DatagramPacket(byte[] data, int offset, int length, java.net.SocketAddress sockAddr) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public synchronized  java.net.InetAddress getAddress() { throw new RuntimeException("Stub!"); }
public synchronized  byte[] getData() { throw new RuntimeException("Stub!"); }
public synchronized  int getLength() { throw new RuntimeException("Stub!"); }
public synchronized  int getOffset() { throw new RuntimeException("Stub!"); }
public synchronized  int getPort() { throw new RuntimeException("Stub!"); }
public synchronized  void setAddress(java.net.InetAddress addr) { throw new RuntimeException("Stub!"); }
public synchronized  void setData(byte[] buf, int anOffset, int aLength) { throw new RuntimeException("Stub!"); }
public synchronized  void setData(byte[] buf) { throw new RuntimeException("Stub!"); }
public synchronized  void setLength(int len) { throw new RuntimeException("Stub!"); }
public synchronized  void setPort(int aPort) { throw new RuntimeException("Stub!"); }
public synchronized  java.net.SocketAddress getSocketAddress() { throw new RuntimeException("Stub!"); }
public synchronized  void setSocketAddress(java.net.SocketAddress sockAddr) { throw new RuntimeException("Stub!"); }
}
