package java.nio.channels;
public abstract class Pipe
{
public abstract static class SinkChannel
  extends java.nio.channels.spi.AbstractSelectableChannel
  implements java.nio.channels.WritableByteChannel, java.nio.channels.GatheringByteChannel
{
protected  SinkChannel(java.nio.channels.spi.SelectorProvider provider) { super((java.nio.channels.spi.SelectorProvider)null); throw new RuntimeException("Stub!"); }
public final  int validOps() { throw new RuntimeException("Stub!"); }
}
public abstract static class SourceChannel
  extends java.nio.channels.spi.AbstractSelectableChannel
  implements java.nio.channels.ReadableByteChannel, java.nio.channels.ScatteringByteChannel
{
protected  SourceChannel(java.nio.channels.spi.SelectorProvider provider) { super((java.nio.channels.spi.SelectorProvider)null); throw new RuntimeException("Stub!"); }
public final  int validOps() { throw new RuntimeException("Stub!"); }
}
protected  Pipe() { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.Pipe open() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.Pipe.SinkChannel sink();
public abstract  java.nio.channels.Pipe.SourceChannel source();
}
