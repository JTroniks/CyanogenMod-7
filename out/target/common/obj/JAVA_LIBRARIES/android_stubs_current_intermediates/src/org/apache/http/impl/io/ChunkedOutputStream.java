package org.apache.http.impl.io;
public class ChunkedOutputStream
  extends java.io.OutputStream
{
public  ChunkedOutputStream(org.apache.http.io.SessionOutputBuffer out, int bufferSize) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  ChunkedOutputStream(org.apache.http.io.SessionOutputBuffer out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void flushCache() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void flushCacheWithAppend(byte[] bufferToAppend, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void writeClosingChunk() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void finish() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] src, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
