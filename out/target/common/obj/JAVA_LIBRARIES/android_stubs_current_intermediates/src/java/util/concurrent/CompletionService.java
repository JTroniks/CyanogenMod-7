package java.util.concurrent;
public interface CompletionService<V>
{
public abstract  java.util.concurrent.Future<V> submit(java.util.concurrent.Callable<V> task);
public abstract  java.util.concurrent.Future<V> submit(java.lang.Runnable task, V result);
public abstract  java.util.concurrent.Future<V> take() throws java.lang.InterruptedException;
public abstract  java.util.concurrent.Future<V> poll();
public abstract  java.util.concurrent.Future<V> poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
}
