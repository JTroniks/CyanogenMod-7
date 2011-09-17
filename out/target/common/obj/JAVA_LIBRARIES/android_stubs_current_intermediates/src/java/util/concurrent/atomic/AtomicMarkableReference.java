package java.util.concurrent.atomic;
public class AtomicMarkableReference<V>
{
public  AtomicMarkableReference(V initialRef, boolean initialMark) { throw new RuntimeException("Stub!"); }
public  V getReference() { throw new RuntimeException("Stub!"); }
public  boolean isMarked() { throw new RuntimeException("Stub!"); }
public  V get(boolean[] markHolder) { throw new RuntimeException("Stub!"); }
public  boolean weakCompareAndSet(V expectedReference, V newReference, boolean expectedMark, boolean newMark) { throw new RuntimeException("Stub!"); }
public  boolean compareAndSet(V expectedReference, V newReference, boolean expectedMark, boolean newMark) { throw new RuntimeException("Stub!"); }
public  void set(V newReference, boolean newMark) { throw new RuntimeException("Stub!"); }
public  boolean attemptMark(V expectedReference, boolean newMark) { throw new RuntimeException("Stub!"); }
}
