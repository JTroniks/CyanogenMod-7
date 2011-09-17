package java.util;
public abstract class AbstractCollection<E>
  implements java.util.Collection<E>
{
protected  AbstractCollection() { throw new RuntimeException("Stub!"); }
public  boolean add(E object) { throw new RuntimeException("Stub!"); }
public  boolean addAll(java.util.Collection<? extends E> collection) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  boolean containsAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Iterator<E> iterator();
public  boolean remove(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  boolean removeAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public  boolean retainAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public abstract  int size();
public  java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }
public <T> T[] toArray(T[] contents) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
