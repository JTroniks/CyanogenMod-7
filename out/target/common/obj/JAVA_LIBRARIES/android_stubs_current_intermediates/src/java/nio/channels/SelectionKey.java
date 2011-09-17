package java.nio.channels;
public abstract class SelectionKey
{
protected  SelectionKey() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object attach(java.lang.Object anObject) { throw new RuntimeException("Stub!"); }
public final  java.lang.Object attachment() { throw new RuntimeException("Stub!"); }
public abstract  void cancel();
public abstract  java.nio.channels.SelectableChannel channel();
public abstract  int interestOps();
public abstract  java.nio.channels.SelectionKey interestOps(int operations);
public final  boolean isAcceptable() { throw new RuntimeException("Stub!"); }
public final  boolean isConnectable() { throw new RuntimeException("Stub!"); }
public final  boolean isReadable() { throw new RuntimeException("Stub!"); }
public abstract  boolean isValid();
public final  boolean isWritable() { throw new RuntimeException("Stub!"); }
public abstract  int readyOps();
public abstract  java.nio.channels.Selector selector();
public static final int OP_ACCEPT = 16;
public static final int OP_CONNECT = 8;
public static final int OP_READ = 1;
public static final int OP_WRITE = 4;
}
