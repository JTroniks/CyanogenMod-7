package java.util;
public class Vector<E>
  extends java.util.AbstractList<E>
  implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable
{
public  Vector() { throw new RuntimeException("Stub!"); }
public  Vector(int capacity) { throw new RuntimeException("Stub!"); }
public  Vector(int capacity, int capacityIncrement) { throw new RuntimeException("Stub!"); }
public  Vector(java.util.Collection<? extends E> collection) { throw new RuntimeException("Stub!"); }
public  void add(int location, E object) { throw new RuntimeException("Stub!"); }
public synchronized  boolean add(E object) { throw new RuntimeException("Stub!"); }
public synchronized  boolean addAll(int location, java.util.Collection<? extends E> collection) { throw new RuntimeException("Stub!"); }
public synchronized  boolean addAll(java.util.Collection<? extends E> collection) { throw new RuntimeException("Stub!"); }
public synchronized  void addElement(E object) { throw new RuntimeException("Stub!"); }
public synchronized  int capacity() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public synchronized  boolean containsAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public synchronized  void copyInto(java.lang.Object[] elements) { throw new RuntimeException("Stub!"); }
public synchronized  E elementAt(int location) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<E> elements() { throw new RuntimeException("Stub!"); }
public synchronized  void ensureCapacity(int minimumCapacity) { throw new RuntimeException("Stub!"); }
public synchronized  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public synchronized  E firstElement() { throw new RuntimeException("Stub!"); }
public  E get(int location) { throw new RuntimeException("Stub!"); }
public synchronized  int hashCode() { throw new RuntimeException("Stub!"); }
public  int indexOf(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public synchronized  int indexOf(java.lang.Object object, int location) { throw new RuntimeException("Stub!"); }
public synchronized  void insertElementAt(E object, int location) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public synchronized  E lastElement() { throw new RuntimeException("Stub!"); }
public synchronized  int lastIndexOf(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public synchronized  int lastIndexOf(java.lang.Object object, int location) { throw new RuntimeException("Stub!"); }
public synchronized  E remove(int location) { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public synchronized  boolean removeAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public synchronized  void removeAllElements() { throw new RuntimeException("Stub!"); }
public synchronized  boolean removeElement(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public synchronized  void removeElementAt(int location) { throw new RuntimeException("Stub!"); }
protected  void removeRange(int start, int end) { throw new RuntimeException("Stub!"); }
public synchronized  boolean retainAll(java.util.Collection<?> collection) { throw new RuntimeException("Stub!"); }
public synchronized  E set(int location, E object) { throw new RuntimeException("Stub!"); }
public synchronized  void setElementAt(E object, int location) { throw new RuntimeException("Stub!"); }
public synchronized  void setSize(int length) { throw new RuntimeException("Stub!"); }
public synchronized  int size() { throw new RuntimeException("Stub!"); }
public synchronized  java.util.List<E> subList(int start, int end) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }
public synchronized <T> T[] toArray(T[] contents) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public synchronized  void trimToSize() { throw new RuntimeException("Stub!"); }
protected int elementCount;
protected java.lang.Object[] elementData = null;
protected int capacityIncrement;
}
