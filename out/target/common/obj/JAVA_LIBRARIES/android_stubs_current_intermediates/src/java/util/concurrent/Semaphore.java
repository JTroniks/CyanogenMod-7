package java.util.concurrent;
public class Semaphore
  implements java.io.Serializable
{
public  Semaphore(int permits) { throw new RuntimeException("Stub!"); }
public  Semaphore(int permits, boolean fair) { throw new RuntimeException("Stub!"); }
public  void acquire() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void acquireUninterruptibly() { throw new RuntimeException("Stub!"); }
public  boolean tryAcquire() { throw new RuntimeException("Stub!"); }
public  boolean tryAcquire(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
public  void acquire(int permits) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void acquireUninterruptibly(int permits) { throw new RuntimeException("Stub!"); }
public  boolean tryAcquire(int permits) { throw new RuntimeException("Stub!"); }
public  boolean tryAcquire(int permits, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void release(int permits) { throw new RuntimeException("Stub!"); }
public  int availablePermits() { throw new RuntimeException("Stub!"); }
public  int drainPermits() { throw new RuntimeException("Stub!"); }
protected  void reducePermits(int reduction) { throw new RuntimeException("Stub!"); }
public  boolean isFair() { throw new RuntimeException("Stub!"); }
public final  boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); }
public final  int getQueueLength() { throw new RuntimeException("Stub!"); }
protected  java.util.Collection<java.lang.Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
