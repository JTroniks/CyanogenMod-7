package java.nio.channels.spi;
public abstract class AbstractSelector
  extends java.nio.channels.Selector
{
protected  AbstractSelector(java.nio.channels.spi.SelectorProvider selectorProvider) { throw new RuntimeException("Stub!"); }
public final  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected abstract  void implCloseSelector() throws java.io.IOException;
public final  boolean isOpen() { throw new RuntimeException("Stub!"); }
public final  java.nio.channels.spi.SelectorProvider provider() { throw new RuntimeException("Stub!"); }
protected final  java.util.Set<java.nio.channels.SelectionKey> cancelledKeys() { throw new RuntimeException("Stub!"); }
protected abstract  java.nio.channels.SelectionKey register(java.nio.channels.spi.AbstractSelectableChannel channel, int operations, java.lang.Object attachment);
protected final  void deregister(java.nio.channels.spi.AbstractSelectionKey key) { throw new RuntimeException("Stub!"); }
protected final  void begin() { throw new RuntimeException("Stub!"); }
protected final  void end() { throw new RuntimeException("Stub!"); }
}
