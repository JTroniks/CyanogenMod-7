package java.util.concurrent;
public interface ExecutorService
  extends java.util.concurrent.Executor
{
public abstract  void shutdown();
public abstract  java.util.List<java.lang.Runnable> shutdownNow();
public abstract  boolean isShutdown();
public abstract  boolean isTerminated();
public abstract  boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task);
public abstract <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result);
public abstract  java.util.concurrent.Future<?> submit(java.lang.Runnable task);
public abstract <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) throws java.lang.InterruptedException;
public abstract <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException;
public abstract <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException;
}
