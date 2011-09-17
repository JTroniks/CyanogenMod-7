package java.util;
public interface NavigableSet<E>
  extends java.util.SortedSet<E>
{
public abstract  E pollFirst();
public abstract  E pollLast();
public abstract  E higher(E e);
public abstract  E ceiling(E e);
public abstract  E lower(E e);
public abstract  E floor(E e);
public abstract  java.util.Iterator<E> descendingIterator();
public abstract  java.util.NavigableSet<E> descendingSet();
public abstract  java.util.NavigableSet<E> subSet(E start, boolean startInclusive, E end, boolean endInclusive);
public abstract  java.util.NavigableSet<E> headSet(E end, boolean endInclusive);
public abstract  java.util.NavigableSet<E> tailSet(E start, boolean startInclusive);
}
