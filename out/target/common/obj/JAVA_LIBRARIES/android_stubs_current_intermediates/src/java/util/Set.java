package java.util;
public interface Set<E>
  extends java.util.Collection<E>
{
public abstract  boolean add(E object);
public abstract  boolean addAll(java.util.Collection<? extends E> collection);
public abstract  void clear();
public abstract  boolean contains(java.lang.Object object);
public abstract  boolean containsAll(java.util.Collection<?> collection);
public abstract  boolean equals(java.lang.Object object);
public abstract  int hashCode();
public abstract  boolean isEmpty();
public abstract  java.util.Iterator<E> iterator();
public abstract  boolean remove(java.lang.Object object);
public abstract  boolean removeAll(java.util.Collection<?> collection);
public abstract  boolean retainAll(java.util.Collection<?> collection);
public abstract  int size();
public abstract  java.lang.Object[] toArray();
public abstract <T> T[] toArray(T[] array);
}
