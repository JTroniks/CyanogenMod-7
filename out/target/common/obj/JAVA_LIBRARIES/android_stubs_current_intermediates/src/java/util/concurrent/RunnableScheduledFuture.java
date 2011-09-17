package java.util.concurrent;
public interface RunnableScheduledFuture<V>
  extends java.util.concurrent.RunnableFuture<V>, java.util.concurrent.ScheduledFuture<V>
{
public abstract  boolean isPeriodic();
}
