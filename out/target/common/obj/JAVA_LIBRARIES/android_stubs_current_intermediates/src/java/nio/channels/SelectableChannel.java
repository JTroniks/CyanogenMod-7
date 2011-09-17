package java.nio.channels;
public abstract class SelectableChannel
  extends java.nio.channels.spi.AbstractInterruptibleChannel
  implements java.nio.channels.Channel
{
protected  SelectableChannel() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Object blockingLock();
public abstract  java.nio.channels.SelectableChannel configureBlocking(boolean block) throws java.io.IOException;
public abstract  boolean isBlocking();
public abstract  boolean isRegistered();
public abstract  java.nio.channels.SelectionKey keyFor(java.nio.channels.Selector sel);
public abstract  java.nio.channels.spi.SelectorProvider provider();
public final  java.nio.channels.SelectionKey register(java.nio.channels.Selector selector, int operations) throws java.nio.channels.ClosedChannelException { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.SelectionKey register(java.nio.channels.Selector sel, int ops, java.lang.Object att) throws java.nio.channels.ClosedChannelException;
public abstract  int validOps();
}
