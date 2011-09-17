package java.util;
public interface List<E>
  extends java.util.Collection<E>
{
public abstract  void add(int location, E object);
public abstract  boolean add(E object);
public abstract  boolean addAll(int location, java.util.Collection<? extends E> collection);
public abstract  boolean addAll(java.util.Collection<? extends E> collection);
public abstract  void clear();
public abstract  boolean contains(java.lang.Object object);
public abstract  boolean containsAll(java.util.Collection<?> collection);
public abstract  boolean equals(java.lang.Object object);
public abstract  E get(int location);
public abstract  int hashCode();
public abstract  int indexOf(java.lang.Object object);
public abstract  boolean isEmpty();
public abstract  java.util.Iterator<E> iterator();
public abstract  int lastIndexOf(java.lang.Object object);
public abstract  java.util.ListIterator<E> listIterator();
public abstract  java.util.ListIterator<E> listIterator(int location);
public abstract  E remove(int location);
public abstract  boolean remove(java.lang.Object object);
public abstract  boolean removeAll(java.util.Collection<?> collection);
public abstract  boolean retainAll(java.util.Collection<?> collection);
public abstract  E set(int location, E object);
public abstract  int size();
public abstract  java.util.List<E> subList(int start, int end);
public abstract  java.lang.Object[] toArray();
public abstract <T> T[] toArray(T[] array);
}
