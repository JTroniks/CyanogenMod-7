package java.util.concurrent.locks;
public abstract class AbstractQueuedLongSynchronizer
  extends java.util.concurrent.locks.AbstractOwnableSynchronizer
  implements java.io.Serializable
{
public class ConditionObject
  implements java.util.concurrent.locks.Condition, java.io.Serializable
{
public  ConditionObject() { throw new RuntimeException("Stub!"); }
public final  void signal() { throw new RuntimeException("Stub!"); }
public final  void signalAll() { throw new RuntimeException("Stub!"); }
public final  void awaitUninterruptibly() { throw new RuntimeException("Stub!"); }
public final  void await() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  long awaitNanos(long nanosTimeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean awaitUntil(java.util.Date deadline) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean await(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
protected final  boolean hasWaiters() { throw new RuntimeException("Stub!"); }
protected final  int getWaitQueueLength() { throw new RuntimeException("Stub!"); }
protected final  java.util.Collection<java.lang.Thread> getWaitingThreads() { throw new RuntimeException("Stub!"); }
}
protected  AbstractQueuedLongSynchronizer() { throw new RuntimeException("Stub!"); }
protected final  long getState() { throw new RuntimeException("Stub!"); }
protected final  void setState(long newState) { throw new RuntimeException("Stub!"); }
protected final  boolean compareAndSetState(long expect, long update) { throw new RuntimeException("Stub!"); }
protected  boolean tryAcquire(long arg) { throw new RuntimeException("Stub!"); }
protected  boolean tryRelease(long arg) { throw new RuntimeException("Stub!"); }
protected  long tryAcquireShared(long arg) { throw new RuntimeException("Stub!"); }
protected  boolean tryReleaseShared(long arg) { throw new RuntimeException("Stub!"); }
protected  boolean isHeldExclusively() { throw new RuntimeException("Stub!"); }
public final  void acquire(long arg) { throw new RuntimeException("Stub!"); }
public final  void acquireInterruptibly(long arg) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean tryAcquireNanos(long arg, long nanosTimeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean release(long arg) { throw new RuntimeException("Stub!"); }
public final  void acquireShared(long arg) { throw new RuntimeException("Stub!"); }
public final  void acquireSharedInterruptibly(long arg) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean tryAcquireSharedNanos(long arg, long nanosTimeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean releaseShared(long arg) { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  boolean hasContended() { throw new RuntimeException("Stub!"); }
public final  java.lang.Thread getFirstQueuedThread() { throw new RuntimeException("Stub!"); }
public final  boolean isQueued(java.lang.Thread thread) { throw new RuntimeException("Stub!"); }
public final  int getQueueLength() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getExclusiveQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getSharedQueuedThreads() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  boolean owns(java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  boolean hasWaiters(java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  int getWaitQueueLength(java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getWaitingThreads(java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
}
