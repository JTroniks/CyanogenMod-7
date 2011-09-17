package java.nio.channels;
public abstract class DatagramChannel
  extends java.nio.channels.spi.AbstractSelectableChannel
  implements java.nio.channels.ByteChannel, java.nio.channels.ScatteringByteChannel, java.nio.channels.GatheringByteChannel
{
protected  DatagramChannel(java.nio.channels.spi.SelectorProvider selectorProvider) { super((java.nio.channels.spi.SelectorProvider)null); throw new RuntimeException("Stub!"); }
public static  java.nio.channels.DatagramChannel open() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  int validOps() { throw new RuntimeException("Stub!"); }
public abstract  java.net.DatagramSocket socket();
public abstract  boolean isConnected();
public abstract  java.nio.channels.DatagramChannel connect(java.net.SocketAddress address) throws java.io.IOException;
public abstract  java.nio.channels.DatagramChannel disconnect() throws java.io.IOException;
public abstract  java.net.SocketAddress receive(java.nio.ByteBuffer target) throws java.io.IOException;
public abstract  int send(java.nio.ByteBuffer source, java.net.SocketAddress address) throws java.io.IOException;
public abstract  int read(java.nio.ByteBuffer target) throws java.io.IOException;
public abstract  long read(java.nio.ByteBuffer[] targets, int offset, int length) throws java.io.IOException;
public final synchronized  long read(java.nio.ByteBuffer[] targets) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  int write(java.nio.ByteBuffer source) throws java.io.IOException;
public abstract  long write(java.nio.ByteBuffer[] sources, int offset, int length) throws java.io.IOException;
public final synchronized  long write(java.nio.ByteBuffer[] sources) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
