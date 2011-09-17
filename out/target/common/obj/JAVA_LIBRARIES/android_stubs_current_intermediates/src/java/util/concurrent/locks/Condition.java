package java.util.concurrent.locks;
public interface Condition
{
public abstract  void await() throws java.lang.InterruptedException;
public abstract  void awaitUninterruptibly();
public abstract  long awaitNanos(long nanosTimeout) throws java.lang.InterruptedException;
public abstract  boolean await(long time, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  boolean awaitUntil(java.util.Date deadline) throws java.lang.InterruptedException;
public abstract  void signal();
public abstract  void signalAll();
}
