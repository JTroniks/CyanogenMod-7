package java.lang;
public abstract class Enum<E extends java.lang.Enum<E>>
  implements java.io.Serializable, java.lang.Comparable<E>
{
protected  Enum(java.lang.String name, int ordinal) { throw new RuntimeException("Stub!"); }
public final  java.lang.String name() { throw new RuntimeException("Stub!"); }
public final  int ordinal() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
protected final  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public final  int compareTo(E o) { throw new RuntimeException("Stub!"); }
public final  java.lang.Class<E> getDeclaringClass() { throw new RuntimeException("Stub!"); }
public static <T extends java.lang.Enum<T>> T valueOf(java.lang.Class<T> enumType, java.lang.String name) { throw new RuntimeException("Stub!"); }
protected final  void finalize() { throw new RuntimeException("Stub!"); }
}
