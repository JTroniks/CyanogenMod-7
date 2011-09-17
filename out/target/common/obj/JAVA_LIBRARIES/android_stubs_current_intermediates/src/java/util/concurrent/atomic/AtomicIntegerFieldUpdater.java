package java.util.concurrent.atomic;
public abstract class AtomicIntegerFieldUpdater<T>
{
protected  AtomicIntegerFieldUpdater() { throw new RuntimeException("Stub!"); }
public static <U> java.util.concurrent.atomic.AtomicIntegerFieldUpdater<U> newUpdater(java.lang.Class<U> tclass, java.lang.String fieldName) { throw new RuntimeException("Stub!"); }
public abstract  boolean compareAndSet(T obj, int expect, int update);
public abstract  boolean weakCompareAndSet(T obj, int expect, int update);
public abstract  void set(T obj, int newValue);
public abstract  void lazySet(T obj, int newValue);
public abstract  int get(T obj);
public  int getAndSet(T obj, int newValue) { throw new RuntimeException("Stub!"); }
public  int getAndIncrement(T obj) { throw new RuntimeException("Stub!"); }
public  int getAndDecrement(T obj) { throw new RuntimeException("Stub!"); }
public  int getAndAdd(T obj, int delta) { throw new RuntimeException("Stub!"); }
public  int incrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
public  int decrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
public  int addAndGet(T obj, int delta) { throw new RuntimeException("Stub!"); }
}
