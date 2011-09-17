package java.net;
public abstract class SocketImpl
  implements java.net.SocketOptions
{
public  SocketImpl() { throw new RuntimeException("Stub!"); }
protected abstract  void accept(java.net.SocketImpl newSocket) throws java.io.IOException;
protected abstract  int available() throws java.io.IOException;
protected abstract  void bind(java.net.InetAddress address, int port) throws java.io.IOException;
protected abstract  void close() throws java.io.IOException;
protected abstract  void connect(java.lang.String host, int port) throws java.io.IOException;
protected abstract  void connect(java.net.InetAddress address, int port) throws java.io.IOException;
protected abstract  void create(boolean isStreaming) throws java.io.IOException;
protected  java.io.FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
protected  java.net.InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
protected abstract  java.io.InputStream getInputStream() throws java.io.IOException;
protected  int getLocalPort() { throw new RuntimeException("Stub!"); }
protected abstract  java.io.OutputStream getOutputStream() throws java.io.IOException;
protected  int getPort() { throw new RuntimeException("Stub!"); }
protected abstract  void listen(int backlog) throws java.io.IOException;
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected  void shutdownInput() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void shutdownOutput() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected abstract  void connect(java.net.SocketAddress remoteAddr, int timeout) throws java.io.IOException;
protected  boolean supportsUrgentData() { throw new RuntimeException("Stub!"); }
protected abstract  void sendUrgentData(int value) throws java.io.IOException;
protected  void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!"); }
protected java.net.InetAddress address;
protected int port;
protected java.io.FileDescriptor fd;
protected int localport;
}
