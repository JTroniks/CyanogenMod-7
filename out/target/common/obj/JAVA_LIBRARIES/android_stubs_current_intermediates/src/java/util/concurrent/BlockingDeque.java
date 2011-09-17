package java.util.concurrent;
public interface BlockingDeque<E>
  extends java.util.concurrent.BlockingQueue<E>, java.util.Deque<E>
{
public abstract  void addFirst(E e);
public abstract  void addLast(E e);
public abstract  boolean offerFirst(E e);
public abstract  boolean offerLast(E e);
public abstract  void putFirst(E e) throws java.lang.InterruptedException;
public abstract  void putLast(E e) throws java.lang.InterruptedException;
public abstract  boolean offerFirst(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  boolean offerLast(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E takeFirst() throws java.lang.InterruptedException;
public abstract  E takeLast() throws java.lang.InterruptedException;
public abstract  E pollFirst(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E pollLast(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  boolean removeFirstOccurrence(java.lang.Object o);
public abstract  boolean removeLastOccurrence(java.lang.Object o);
public abstract  boolean add(E e);
public abstract  boolean offer(E e);
public abstract  void put(E e) throws java.lang.InterruptedException;
public abstract  boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E remove();
public abstract  E poll();
public abstract  E take() throws java.lang.InterruptedException;
public abstract  E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E element();
public abstract  E peek();
public abstract  boolean remove(java.lang.Object o);
public abstract  boolean contains(java.lang.Object o);
public abstract  int size();
public abstract  java.util.Iterator<E> iterator();
public abstract  void push(E e);
}
