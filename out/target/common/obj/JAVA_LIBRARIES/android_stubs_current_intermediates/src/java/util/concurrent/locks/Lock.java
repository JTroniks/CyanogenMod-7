package java.util.concurrent.locks;
public interface Lock
{
public abstract  void lock();
public abstract  void lockInterruptibly() throws java.lang.InterruptedException;
public abstract  boolean tryLock();
public abstract  boolean tryLock(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  void unlock();
public abstract  java.util.concurrent.locks.Condition newCondition();
}
