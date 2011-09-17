package java.util.concurrent;
public interface ScheduledExecutorService
  extends java.util.concurrent.ExecutorService
{
public abstract  java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit);
public abstract <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit);
public abstract  java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit);
public abstract  java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit);
}
