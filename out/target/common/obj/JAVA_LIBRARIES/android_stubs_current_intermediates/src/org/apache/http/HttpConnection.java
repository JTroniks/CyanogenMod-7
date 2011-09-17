package org.apache.http;
public interface HttpConnection
{
public abstract  void close() throws java.io.IOException;
public abstract  boolean isOpen();
public abstract  boolean isStale();
public abstract  void setSocketTimeout(int timeout);
public abstract  int getSocketTimeout();
public abstract  void shutdown() throws java.io.IOException;
public abstract  org.apache.http.HttpConnectionMetrics getMetrics();
}
