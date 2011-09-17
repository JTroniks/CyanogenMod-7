package java.util.concurrent.locks;
public class ReentrantLock
  implements java.util.concurrent.locks.Lock, java.io.Serializable
{
public  ReentrantLock() { throw new RuntimeException("Stub!"); }
public  ReentrantLock(boolean fair) { throw new RuntimeException("Stub!"); }
public  void lock() { throw new RuntimeException("Stub!"); }
public  void lockInterruptibly() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  boolean tryLock() { throw new RuntimeException("Stub!"); }
public  boolean tryLock(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void unlock() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.locks.Condition newCondition() { throw new RuntimeException("Stub!"); }
public  int getHoldCount() { throw new RuntimeException("Stub!"); }
public  boolean isHeldByCurrentThread() { throw new RuntimeException("Stub!"); }
public  boolean isLocked() { throw new RuntimeException("Stub!"); }
public final  boolean isFair() { throw new RuntimeException("Stub!"); }
protected  java.lang.Thread getOwner() { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThread(java.lang.Thread thread) { throw new RuntimeException("Stub!"); }
public final  int getQueueLength() { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<java.lang.Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
public  boolean hasWaiters(java.util.concurrent.locks.Condition condition) { throw new RuntimeException("Stub!"); }
public  int getWaitQueueLength(java.util.concurrent.locks.Condition condition) { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<java.lang.Thread> getWaitingThreads(java.util.concurrent.locks.Condition condition) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
