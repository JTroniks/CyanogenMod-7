package java.nio.channels.spi;
public abstract class SelectorProvider
{
protected  SelectorProvider() { throw new RuntimeException("Stub!"); }
public static synchronized  java.nio.channels.spi.SelectorProvider provider() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.DatagramChannel openDatagramChannel() throws java.io.IOException;
public abstract  java.nio.channels.Pipe openPipe() throws java.io.IOException;
public abstract  java.nio.channels.spi.AbstractSelector openSelector() throws java.io.IOException;
public abstract  java.nio.channels.ServerSocketChannel openServerSocketChannel() throws java.io.IOException;
public abstract  java.nio.channels.SocketChannel openSocketChannel() throws java.io.IOException;
public  java.nio.channels.Channel inheritedChannel() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
