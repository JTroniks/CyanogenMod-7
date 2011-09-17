package java.util;
public abstract class TimerTask
  implements java.lang.Runnable
{
protected  TimerTask() { throw new RuntimeException("Stub!"); }
public  boolean cancel() { throw new RuntimeException("Stub!"); }
public  long scheduledExecutionTime() { throw new RuntimeException("Stub!"); }
public abstract  void run();
}
