package java.nio.channels.spi;
public abstract class AbstractInterruptibleChannel
  implements java.nio.channels.Channel, java.nio.channels.InterruptibleChannel
{
protected  AbstractInterruptibleChannel() { throw new RuntimeException("Stub!"); }
public final synchronized  boolean isOpen() { throw new RuntimeException("Stub!"); }
public final  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected final  void begin() { throw new RuntimeException("Stub!"); }
protected final  void end(boolean success) throws java.nio.channels.AsynchronousCloseException { throw new RuntimeException("Stub!"); }
protected abstract  void implCloseChannel() throws java.io.IOException;
}
