package java.lang.reflect;
public class Proxy
  implements java.io.Serializable
{
protected  Proxy(java.lang.reflect.InvocationHandler h) { throw new RuntimeException("Stub!"); }
public static  java.lang.Class<?> getProxyClass(java.lang.ClassLoader loader, java.lang.Class<?>... interfaces) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public static  java.lang.Object newProxyInstance(java.lang.ClassLoader loader, java.lang.Class<?>[] interfaces, java.lang.reflect.InvocationHandler h) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public static  boolean isProxyClass(java.lang.Class<?> cl) { throw new RuntimeException("Stub!"); }
public static  java.lang.reflect.InvocationHandler getInvocationHandler(java.lang.Object proxy) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
protected java.lang.reflect.InvocationHandler h;
}
