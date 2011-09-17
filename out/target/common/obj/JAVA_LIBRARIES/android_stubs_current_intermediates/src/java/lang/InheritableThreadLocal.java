package java.lang;
public class InheritableThreadLocal<T>
  extends java.lang.ThreadLocal<T>
{
public  InheritableThreadLocal() { throw new RuntimeException("Stub!"); }
protected  T childValue(T parentValue) { throw new RuntimeException("Stub!"); }
}
