package org.apache.http;
public interface HttpConnectionMetrics
{
public abstract  long getRequestCount();
public abstract  long getResponseCount();
public abstract  long getSentBytesCount();
public abstract  long getReceivedBytesCount();
public abstract  java.lang.Object getMetric(java.lang.String metricName);
public abstract  void reset();
}
