package java.util;
public interface Queue<E>
  extends java.util.Collection<E>
{
public abstract  boolean offer(E o);
public abstract  E poll();
public abstract  E remove();
public abstract  E peek();
public abstract  E element();
}
