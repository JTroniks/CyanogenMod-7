package java.util.concurrent.locks;
public abstract class AbstractQueuedSynchronizer
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
protected  AbstractQueuedSynchronizer() { throw new RuntimeException("Stub!"); }
protected final  int getState() { throw new RuntimeException("Stub!"); }
protected final  void setState(int newState) { throw new RuntimeException("Stub!"); }
protected final  boolean compareAndSetState(int expect, int update) { throw new RuntimeException("Stub!"); }
protected  boolean tryAcquire(int arg) { throw new RuntimeException("Stub!"); }
protected  boolean tryRelease(int arg) { throw new RuntimeException("Stub!"); }
protected  int tryAcquireShared(int arg) { throw new RuntimeException("Stub!"); }
protected  boolean tryReleaseShared(int arg) { throw new RuntimeException("Stub!"); }
protected  boolean isHeldExclusively() { throw new RuntimeException("Stub!"); }
public final  void acquire(int arg) { throw new RuntimeException("Stub!"); }
public final  void acquireInterruptibly(int arg) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean tryAcquireNanos(int arg, long nanosTimeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean release(int arg) { throw new RuntimeException("Stub!"); }
public final  void acquireShared(int arg) { throw new RuntimeException("Stub!"); }
public final  void acquireSharedInterruptibly(int arg) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean tryAcquireSharedNanos(int arg, long nanosTimeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  boolean releaseShared(int arg) { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  boolean hasContended() { throw new RuntimeException("Stub!"); }
public final  java.lang.Thread getFirstQueuedThread() { throw new RuntimeException("Stub!"); }
public final  boolean isQueued(java.lang.Thread thread) { throw new RuntimeException("Stub!"); }
public final  int getQueueLength() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getExclusiveQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getSharedQueuedThreads() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  boolean owns(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  boolean hasWaiters(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  int getWaitQueueLength(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<java.lang.Thread> getWaitingThreads(java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject condition) { throw new RuntimeException("Stub!"); }
}
