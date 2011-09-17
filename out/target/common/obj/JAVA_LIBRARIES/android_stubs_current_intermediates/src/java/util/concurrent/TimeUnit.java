package java.util.concurrent;
public enum TimeUnit
{
DAYS(),
HOURS(),
MICROSECONDS(),
MILLISECONDS(),
MINUTES(),
NANOSECONDS(),
SECONDS();
public  long convert(long sourceDuration, java.util.concurrent.TimeUnit sourceUnit) { throw new RuntimeException("Stub!"); }
public  long toNanos(long duration) { throw new RuntimeException("Stub!"); }
public  long toMicros(long duration) { throw new RuntimeException("Stub!"); }
public  long toMillis(long duration) { throw new RuntimeException("Stub!"); }
public  long toSeconds(long duration) { throw new RuntimeException("Stub!"); }
public  long toMinutes(long duration) { throw new RuntimeException("Stub!"); }
public  long toHours(long duration) { throw new RuntimeException("Stub!"); }
public  long toDays(long duration) { throw new RuntimeException("Stub!"); }
public  void timedWait(java.lang.Object obj, long timeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void timedJoin(java.lang.Thread thread, long timeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  void sleep(long timeout) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
}
