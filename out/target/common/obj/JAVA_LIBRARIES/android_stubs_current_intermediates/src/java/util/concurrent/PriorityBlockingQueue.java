package java.util.concurrent;
public class PriorityBlockingQueue<E>
  extends java.util.AbstractQueue<E>
  implements java.util.concurrent.BlockingQueue<E>, java.io.Serializable
{
public  PriorityBlockingQueue() { throw new RuntimeException("Stub!"); }
public  PriorityBlockingQueue(int initialCapacity) { throw new RuntimeException("Stub!"); }
public  PriorityBlockingQueue(int initialCapacity, java.util.Comparator<? super E> comparator) { throw new RuntimeException("Stub!"); }
public  PriorityBlockingQueue(java.util.Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
public  boolean add(E e) { throw new RuntimeException("Stub!"); }
public  boolean offer(E e) { throw new RuntimeException("Stub!"); }
public  void put(E e) { throw new RuntimeException("Stub!"); }
public  boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) { throw new RuntimeException("Stub!"); }
public  E poll() { throw new RuntimeException("Stub!"); }
public  E take() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  E peek() { throw new RuntimeException("Stub!"); }
public  java.util.Comparator<? super E> comparator() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  int remainingCapacity() { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int drainTo(java.util.Collection<? super E> c) { throw new RuntimeException("Stub!"); }
public  int drainTo(java.util.Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
}
