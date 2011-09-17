package java.io;
public class PipedInputStream
  extends java.io.InputStream
{
public  PipedInputStream() { throw new RuntimeException("Stub!"); }
public  PipedInputStream(java.io.PipedOutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  PipedInputStream(int pipeSize) { throw new RuntimeException("Stub!"); }
public  PipedInputStream(java.io.PipedOutputStream out, int pipeSize) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void connect(java.io.PipedOutputStream src) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  int read(byte[] bytes, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected synchronized  void receive(int oneByte) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected byte[] buffer = null;
protected int in;
protected int out;
protected static final int PIPE_SIZE = 1024;
}
