package java.nio.channels;
public abstract class ServerSocketChannel
  extends java.nio.channels.spi.AbstractSelectableChannel
{
protected  ServerSocketChannel(java.nio.channels.spi.SelectorProvider selectorProvider) { super((java.nio.channels.spi.SelectorProvider)null); throw new RuntimeException("Stub!"); }
public static  java.nio.channels.ServerSocketChannel open() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  int validOps() { throw new RuntimeException("Stub!"); }
public abstract  java.net.ServerSocket socket();
public abstract  java.nio.channels.SocketChannel accept() throws java.io.IOException;
}
