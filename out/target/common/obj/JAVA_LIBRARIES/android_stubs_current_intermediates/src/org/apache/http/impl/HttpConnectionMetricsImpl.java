package org.apache.http.impl;
public class HttpConnectionMetricsImpl
  implements org.apache.http.HttpConnectionMetrics
{
public  HttpConnectionMetricsImpl(org.apache.http.io.HttpTransportMetrics inTransportMetric, org.apache.http.io.HttpTransportMetrics outTransportMetric) { throw new RuntimeException("Stub!"); }
public  long getReceivedBytesCount() { throw new RuntimeException("Stub!"); }
public  long getSentBytesCount() { throw new RuntimeException("Stub!"); }
public  long getRequestCount() { throw new RuntimeException("Stub!"); }
public  void incrementRequestCount() { throw new RuntimeException("Stub!"); }
public  long getResponseCount() { throw new RuntimeException("Stub!"); }
public  void incrementResponseCount() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getMetric(java.lang.String metricName) { throw new RuntimeException("Stub!"); }
public  void setMetric(java.lang.String metricName, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public static final java.lang.String REQUEST_COUNT = "http.request-count";
public static final java.lang.String RESPONSE_COUNT = "http.response-count";
public static final java.lang.String SENT_BYTES_COUNT = "http.sent-bytes-count";
public static final java.lang.String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
}
