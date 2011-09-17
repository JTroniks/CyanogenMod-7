package org.apache.http.conn;
public class BasicManagedEntity
  extends org.apache.http.entity.HttpEntityWrapper
  implements org.apache.http.conn.ConnectionReleaseTrigger, org.apache.http.conn.EofSensorWatcher
{
public  BasicManagedEntity(org.apache.http.HttpEntity entity, org.apache.http.conn.ManagedClientConnection conn, boolean reuse) { super((org.apache.http.HttpEntity)null); throw new RuntimeException("Stub!"); }
public  boolean isRepeatable() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void consumeContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeTo(java.io.OutputStream outstream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void releaseConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void abortConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean eofDetected(java.io.InputStream wrapped) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean streamClosed(java.io.InputStream wrapped) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean streamAbort(java.io.InputStream wrapped) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void releaseManagedConnection() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected org.apache.http.conn.ManagedClientConnection managedConn;
protected final boolean attemptReuse;
}
