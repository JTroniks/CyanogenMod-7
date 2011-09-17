package java.util;
public interface ListIterator<E>
  extends java.util.Iterator<E>
{
public abstract  void add(E object);
public abstract  boolean hasNext();
public abstract  boolean hasPrevious();
public abstract  E next();
public abstract  int nextIndex();
public abstract  E previous();
public abstract  int previousIndex();
public abstract  void remove();
public abstract  void set(E object);
}
