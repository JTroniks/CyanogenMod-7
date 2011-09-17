package org.apache.http.impl.conn.tsccm;
public class WaitingThread
{
public  WaitingThread(java.util.concurrent.locks.Condition cond, org.apache.http.impl.conn.tsccm.RouteSpecificPool pool) { throw new RuntimeException("Stub!"); }
public final  java.util.concurrent.locks.Condition getCondition() { throw new RuntimeException("Stub!"); }
public final  org.apache.http.impl.conn.tsccm.RouteSpecificPool getPool() { throw new RuntimeException("Stub!"); }
public final  java.lang.Thread getThread() { throw new RuntimeException("Stub!"); }
public  boolean await(java.util.Date deadline) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void wakeup() { throw new RuntimeException("Stub!"); }
public  void interrupt() { throw new RuntimeException("Stub!"); }
}
