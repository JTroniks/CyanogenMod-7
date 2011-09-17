package org.apache.http.conn;
public interface ConnectionReleaseTrigger
{
public abstract  void releaseConnection() throws java.io.IOException;
public abstract  void abortConnection() throws java.io.IOException;
}
