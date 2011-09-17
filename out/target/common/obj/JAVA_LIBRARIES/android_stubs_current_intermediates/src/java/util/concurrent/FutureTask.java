package java.util.concurrent;
public class FutureTask<V>
  implements java.util.concurrent.RunnableFuture<V>
{
public  FutureTask(java.util.concurrent.Callable<V> callable) { throw new RuntimeException("Stub!"); }
public  FutureTask(java.lang.Runnable runnable, V result) { throw new RuntimeException("Stub!"); }
public  boolean isCancelled() { throw new RuntimeException("Stub!"); }
public  boolean isDone() { throw new RuntimeException("Stub!"); }
public  boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); }
public  V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException { throw new RuntimeException("Stub!"); }
public  V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException { throw new RuntimeException("Stub!"); }
protected  void done() { throw new RuntimeException("Stub!"); }
protected  void set(V v) { throw new RuntimeException("Stub!"); }
protected  void setException(java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public  void run() { throw new RuntimeException("Stub!"); }
protected  boolean runAndReset() { throw new RuntimeException("Stub!"); }
}
