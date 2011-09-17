package java.util.concurrent;
public abstract class AbstractExecutorService
  implements java.util.concurrent.ExecutorService
{
public  AbstractExecutorService() { throw new RuntimeException("Stub!"); }
protected <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.lang.Runnable runnable, T value) { throw new RuntimeException("Stub!"); }
protected <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.util.concurrent.Callable<T> callable) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Future<?> submit(java.lang.Runnable task) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result) { throw new RuntimeException("Stub!"); }
public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task) { throw new RuntimeException("Stub!"); }
public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException { throw new RuntimeException("Stub!"); }
public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
}
