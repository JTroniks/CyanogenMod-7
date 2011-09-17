package org.apache.http.io;
public interface SessionOutputBuffer
{
public abstract  void write(byte[] b, int off, int len) throws java.io.IOException;
public abstract  void write(byte[] b) throws java.io.IOException;
public abstract  void write(int b) throws java.io.IOException;
public abstract  void writeLine(java.lang.String s) throws java.io.IOException;
public abstract  void writeLine(org.apache.http.util.CharArrayBuffer buffer) throws java.io.IOException;
public abstract  void flush() throws java.io.IOException;
public abstract  org.apache.http.io.HttpTransportMetrics getMetrics();
}
