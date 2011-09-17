package java.util;
public interface SortedSet<E>
  extends java.util.Set<E>
{
public abstract  java.util.Comparator<? super E> comparator();
public abstract  E first();
public abstract  java.util.SortedSet<E> headSet(E end);
public abstract  E last();
public abstract  java.util.SortedSet<E> subSet(E start, E end);
public abstract  java.util.SortedSet<E> tailSet(E start);
}
