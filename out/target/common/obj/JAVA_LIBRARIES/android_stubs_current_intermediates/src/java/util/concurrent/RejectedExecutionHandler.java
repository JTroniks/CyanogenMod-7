package java.util.concurrent;
public interface RejectedExecutionHandler
{
public abstract  void rejectedExecution(java.lang.Runnable r, java.util.concurrent.ThreadPoolExecutor executor);
}
