package org.apache.http.client.methods;
public interface AbortableHttpRequest
{
public abstract  void setConnectionRequest(org.apache.http.conn.ClientConnectionRequest connRequest) throws java.io.IOException;
public abstract  void setReleaseTrigger(org.apache.http.conn.ConnectionReleaseTrigger releaseTrigger) throws java.io.IOException;
public abstract  void abort();
}
