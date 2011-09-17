package java.lang;
public class ThreadGroup
  implements java.lang.Thread.UncaughtExceptionHandler
{
public  ThreadGroup(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  ThreadGroup(java.lang.ThreadGroup parent, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int activeCount() { throw new RuntimeException("Stub!"); }
public  int activeGroupCount() { throw new RuntimeException("Stub!"); }
public  boolean allowThreadSuspension(boolean b) { throw new RuntimeException("Stub!"); }
public final  void checkAccess() { throw new RuntimeException("Stub!"); }
public final  void destroy() { throw new RuntimeException("Stub!"); }
public  int enumerate(java.lang.Thread[] threads) { throw new RuntimeException("Stub!"); }
public  int enumerate(java.lang.Thread[] threads, boolean recurse) { throw new RuntimeException("Stub!"); }
public  int enumerate(java.lang.ThreadGroup[] groups) { throw new RuntimeException("Stub!"); }
public  int enumerate(java.lang.ThreadGroup[] groups, boolean recurse) { throw new RuntimeException("Stub!"); }
public final  int getMaxPriority() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public final  java.lang.ThreadGroup getParent() { throw new RuntimeException("Stub!"); }
public final  void interrupt() { throw new RuntimeException("Stub!"); }
public final  boolean isDaemon() { throw new RuntimeException("Stub!"); }
public synchronized  boolean isDestroyed() { throw new RuntimeException("Stub!"); }
public  void list() { throw new RuntimeException("Stub!"); }
public final  boolean parentOf(java.lang.ThreadGroup g) { throw new RuntimeException("Stub!"); }
public final  void resume() { throw new RuntimeException("Stub!"); }
public final  void setDaemon(boolean isDaemon) { throw new RuntimeException("Stub!"); }
public final  void setMaxPriority(int newMax) { throw new RuntimeException("Stub!"); }
public final  void stop() { throw new RuntimeException("Stub!"); }
public final  void suspend() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void uncaughtException(java.lang.Thread t, java.lang.Throwable e) { throw new RuntimeException("Stub!"); }
}
