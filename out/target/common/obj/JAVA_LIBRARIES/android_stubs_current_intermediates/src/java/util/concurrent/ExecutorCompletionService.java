package java.util.concurrent;
public class ExecutorCompletionService<V>
  implements java.util.concurrent.CompletionService<V>
{
public  ExecutorCompletionService(java.util.concurrent.Executor executor) { throw new RuntimeException("Stub!"); }
public  ExecutorCompletionService(java.util.concurrent.Executor executor, java.util.concurrent.BlockingQueue<java.util.concurrent.Future<V>> completionQueue) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Future<V> submit(java.util.concurrent.Callable<V> task) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Future<V> submit(java.lang.Runnable task, V result) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Future<V> take() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Future<V> poll() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.Future<V> poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
}
