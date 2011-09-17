package java.util.concurrent;
public class SynchronousQueue<E>
  extends java.util.AbstractQueue<E>
  implements java.util.concurrent.BlockingQueue<E>, java.io.Serializable
{
public  SynchronousQueue() { throw new RuntimeException("Stub!"); }
public  SynchronousQueue(boolean fair) { throw new RuntimeException("Stub!"); }
public  void put(E o) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  boolean offer(E o, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  boolean offer(E e) { throw new RuntimeException("Stub!"); }
public  E take() throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException { throw new RuntimeException("Stub!"); }
public  E poll() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  int remainingCapacity() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  boolean containsAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
public  boolean removeAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
public  boolean retainAll(java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
public  E peek() { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }
public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
public  int drainTo(java.util.Collection<? super E> c) { throw new RuntimeException("Stub!"); }
public  int drainTo(java.util.Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); }
}
