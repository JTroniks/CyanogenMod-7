package java.nio.channels.spi;
public abstract class AbstractSelectableChannel
  extends java.nio.channels.SelectableChannel
{
protected  AbstractSelectableChannel(java.nio.channels.spi.SelectorProvider selectorProvider) { throw new RuntimeException("Stub!"); }
public final  java.nio.channels.spi.SelectorProvider provider() { throw new RuntimeException("Stub!"); }
public final synchronized  boolean isRegistered() { throw new RuntimeException("Stub!"); }
public final synchronized  java.nio.channels.SelectionKey keyFor(java.nio.channels.Selector selector) { throw new RuntimeException("Stub!"); }
public final  java.nio.channels.SelectionKey register(java.nio.channels.Selector selector, int interestSet, java.lang.Object attachment) throws java.nio.channels.ClosedChannelException { throw new RuntimeException("Stub!"); }
protected final synchronized  void implCloseChannel() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected abstract  void implCloseSelectableChannel() throws java.io.IOException;
public final  boolean isBlocking() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object blockingLock() { throw new RuntimeException("Stub!"); }
public final  java.nio.channels.SelectableChannel configureBlocking(boolean blockingMode) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected abstract  void implConfigureBlocking(boolean blockingMode) throws java.io.IOException;
}
