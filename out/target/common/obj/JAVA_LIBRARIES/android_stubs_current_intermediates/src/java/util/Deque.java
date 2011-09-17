package java.util;
public interface Deque<E>
  extends java.util.Queue<E>
{
public abstract  void addFirst(E e);
public abstract  void addLast(E e);
public abstract  boolean offerFirst(E e);
public abstract  boolean offerLast(E e);
public abstract  E removeFirst();
public abstract  E removeLast();
public abstract  E pollFirst();
public abstract  E pollLast();
public abstract  E getFirst();
public abstract  E getLast();
public abstract  E peekFirst();
public abstract  E peekLast();
public abstract  boolean removeFirstOccurrence(java.lang.Object o);
public abstract  boolean removeLastOccurrence(java.lang.Object o);
public abstract  void push(E e);
public abstract  E pop();
public abstract  java.util.Iterator<E> descendingIterator();
}
