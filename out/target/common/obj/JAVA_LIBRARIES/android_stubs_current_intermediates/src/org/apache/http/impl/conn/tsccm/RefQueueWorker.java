package org.apache.http.impl.conn.tsccm;
public class RefQueueWorker
  implements java.lang.Runnable
{
public  RefQueueWorker(java.lang.ref.ReferenceQueue<?> queue, org.apache.http.impl.conn.tsccm.RefQueueHandler handler) { throw new RuntimeException("Stub!"); }
public  void run() { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected final java.lang.ref.ReferenceQueue<?> refQueue;
protected final org.apache.http.impl.conn.tsccm.RefQueueHandler refHandler;
protected volatile java.lang.Thread workerThread;
}
