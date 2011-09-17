package java.util.concurrent.atomic;
public abstract class AtomicReferenceFieldUpdater<T, V>
{
protected  AtomicReferenceFieldUpdater() { throw new RuntimeException("Stub!"); }
public static <U, W> java.util.concurrent.atomic.AtomicReferenceFieldUpdater<U, W> newUpdater(java.lang.Class<U> tclass, java.lang.Class<W> vclass, java.lang.String fieldName) { throw new RuntimeException("Stub!"); }
public abstract  boolean compareAndSet(T obj, V expect, V update);
public abstract  boolean weakCompareAndSet(T obj, V expect, V update);
public abstract  void set(T obj, V newValue);
public abstract  void lazySet(T obj, V newValue);
public abstract  V get(T obj);
public  V getAndSet(T obj, V newValue) { throw new RuntimeException("Stub!"); }
}
