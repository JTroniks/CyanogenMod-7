package java.util.concurrent;
public class ScheduledThreadPoolExecutor
  extends java.util.concurrent.ThreadPoolExecutor
  implements java.util.concurrent.ScheduledExecutorService
{
public  ScheduledThreadPoolExecutor(int corePoolSize) { super(0,0,0,(java.util.concurrent.TimeUnit)null,(java.util.concurrent.BlockingQueue)null,(java.util.concurrent.ThreadFactory)null,(java.util.concurrent.RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); }
public  ScheduledThreadPoolExecutor(int corePoolSize, java.util.concurrent.ThreadFactory threadFactory) { super(0,0,0,(java.util.concurrent.TimeUnit)null,(java.util.concurrent.BlockingQueue)null,(java.util.concurrent.ThreadFactory)null,(java.util.concurrent.RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); }
public  ScheduledThreadPoolExecutor(int corePoolSize, java.util.concurrent.RejectedExecutionHandler handler) { super(0,0,0,(java.util.concurrent.TimeUnit)null,(java.util.concurrent.BlockingQueue)null,(java.util.concurrent.ThreadFactory)null,(java.util.concurrent.RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); }
public  ScheduledThreadPoolExecutor(int corePoolSize, java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler handler) { super(0,0,0,(java.util.concurrent.TimeUnit)null,(java.util.concurrent.BlockingQueue)null,(java.util.concurrent.ThreadFactory)null,(java.util.concurrent.RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); }
protected <V> java.util.concurrent.RunnableScheduledFuture<V> decorateTask(java.lang.Runnable runnable, java.util.concurrent.RunnableScheduledFuture<V> task) { throw new RuntimeException("Stub!"); }
protected <V> java.util.concurrent.RunnableScheduledFuture<V> decorateTask(java.util.concurrent.Callable<V> callable, java.util.concurrent.RunnableScheduledFuture<V> task) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  void execute(java.lang.Runnable command) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Future<?> submit(java.lang.Runnable task) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task) { throw new RuntimeException("Stub!"); }
public  void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value) { throw new RuntimeException("Stub!"); }
public  boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() { throw new RuntimeException("Stub!"); }
public  void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value) { throw new RuntimeException("Stub!"); }
public  boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() { throw new RuntimeException("Stub!"); }
public  void shutdown() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Runnable> shutdownNow() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.BlockingQueue<java.lang.Runnable> getQueue() { throw new RuntimeException("Stub!"); }
}
