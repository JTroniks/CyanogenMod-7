package org.apache.http.io;
public interface HttpTransportMetrics
{
public abstract  long getBytesTransferred();
public abstract  void reset();
}
