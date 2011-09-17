package java.nio.channels;
public abstract class Selector
{
protected  Selector() { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.Selector open() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void close() throws java.io.IOException;
public abstract  boolean isOpen();
public abstract  java.util.Set<java.nio.channels.SelectionKey> keys();
public abstract  java.nio.channels.spi.SelectorProvider provider();
public abstract  int select() throws java.io.IOException;
public abstract  int select(long timeout) throws java.io.IOException;
public abstract  java.util.Set<java.nio.channels.SelectionKey> selectedKeys();
public abstract  int selectNow() throws java.io.IOException;
public abstract  java.nio.channels.Selector wakeup();
}
