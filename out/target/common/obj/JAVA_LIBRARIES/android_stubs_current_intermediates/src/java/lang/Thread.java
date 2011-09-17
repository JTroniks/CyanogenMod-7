package java.lang;
public class Thread
  implements java.lang.Runnable
{
public static enum State
{
BLOCKED(),
NEW(),
RUNNABLE(),
TERMINATED(),
TIMED_WAITING(),
WAITING();
}
public static interface UncaughtExceptionHandler
{
public abstract  void uncaughtException(java.lang.Thread thread, java.lang.Throwable ex);
}
public  Thread() { throw new RuntimeException("Stub!"); }
public  Thread(java.lang.Runnable runnable) { throw new RuntimeException("Stub!"); }
public  Thread(java.lang.Runnable runnable, java.lang.String threadName) { throw new RuntimeException("Stub!"); }
public  Thread(java.lang.String threadName) { throw new RuntimeException("Stub!"); }
public  Thread(java.lang.ThreadGroup group, java.lang.Runnable runnable) { throw new RuntimeException("Stub!"); }
public  Thread(java.lang.ThreadGroup group, java.lang.Runnable runnable, java.lang.String threadName) { throw new RuntimeException("Stub!"); }
public  Thread(java.lang.ThreadGroup group, java.lang.String threadName) { throw new RuntimeException("Stub!"); }
public  Thread(java.lang.ThreadGroup group, java.lang.Runnable runnable, java.lang.String threadName, long stackSize) { throw new RuntimeException("Stub!"); }
public static  int activeCount() { throw new RuntimeException("Stub!"); }
public final  void checkAccess() { throw new RuntimeException("Stub!"); }
public  int countStackFrames() { throw new RuntimeException("Stub!"); }
public static  java.lang.Thread currentThread() { throw new RuntimeException("Stub!"); }
public  void destroy() { throw new RuntimeException("Stub!"); }
public static  void dumpStack() { throw new RuntimeException("Stub!"); }
public static  int enumerate(java.lang.Thread[] threads) { throw new RuntimeException("Stub!"); }
public static  java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> getAllStackTraces() { throw new RuntimeException("Stub!"); }
public  java.lang.ClassLoader getContextClassLoader() { throw new RuntimeException("Stub!"); }
public static  java.lang.Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() { throw new RuntimeException("Stub!"); }
public  long getId() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public final  int getPriority() { throw new RuntimeException("Stub!"); }
public  java.lang.StackTraceElement[] getStackTrace() { throw new RuntimeException("Stub!"); }
public  java.lang.Thread.State getState() { throw new RuntimeException("Stub!"); }
public final  java.lang.ThreadGroup getThreadGroup() { throw new RuntimeException("Stub!"); }
public  java.lang.Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() { throw new RuntimeException("Stub!"); }
public  void interrupt() { throw new RuntimeException("Stub!"); }
public static  boolean interrupted() { throw new RuntimeException("Stub!"); }
public final  boolean isAlive() { throw new RuntimeException("Stub!"); }
public final  boolean isDaemon() { throw new RuntimeException("Stub!"); }
public  boolean isInterrupted() { throw new RuntimeException("Stub!"); }
public final  void join() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  void join(long millis) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  void join(long millis, int nanos) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public final  void resume() { throw new RuntimeException("Stub!"); }
public  void run() { throw new RuntimeException("Stub!"); }
public  void setContextClassLoader(java.lang.ClassLoader cl) { throw new RuntimeException("Stub!"); }
public final  void setDaemon(boolean isDaemon) { throw new RuntimeException("Stub!"); }
public static  void setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler handler) { throw new RuntimeException("Stub!"); }
public final  void setName(java.lang.String threadName) { throw new RuntimeException("Stub!"); }
public final  void setPriority(int priority) { throw new RuntimeException("Stub!"); }
public  void setUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler handler) { throw new RuntimeException("Stub!"); }
public static  void sleep(long time) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public static  void sleep(long millis, int nanos) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public synchronized  void start() { throw new RuntimeException("Stub!"); }
public final  void stop() { throw new RuntimeException("Stub!"); }
public final synchronized  void stop(java.lang.Throwable throwable) { throw new RuntimeException("Stub!"); }
public final  void suspend() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  void yield() { throw new RuntimeException("Stub!"); }
public static  boolean holdsLock(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public static final int MAX_PRIORITY = 10;
public static final int MIN_PRIORITY = 1;
public static final int NORM_PRIORITY = 5;
}
