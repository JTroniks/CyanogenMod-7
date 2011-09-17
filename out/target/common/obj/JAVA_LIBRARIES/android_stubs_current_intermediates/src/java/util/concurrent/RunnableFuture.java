package java.util.concurrent;
public interface RunnableFuture<V>
  extends java.lang.Runnable, java.util.concurrent.Future<V>
{
public abstract  void run();
}
