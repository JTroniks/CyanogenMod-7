package org.apache.http.io;
public interface SessionInputBuffer
{
public abstract  int read(byte[] b, int off, int len) throws java.io.IOException;
public abstract  int read(byte[] b) throws java.io.IOException;
public abstract  int read() throws java.io.IOException;
public abstract  int readLine(org.apache.http.util.CharArrayBuffer buffer) throws java.io.IOException;
public abstract  java.lang.String readLine() throws java.io.IOException;
public abstract  boolean isDataAvailable(int timeout) throws java.io.IOException;
public abstract  org.apache.http.io.HttpTransportMetrics getMetrics();
}
