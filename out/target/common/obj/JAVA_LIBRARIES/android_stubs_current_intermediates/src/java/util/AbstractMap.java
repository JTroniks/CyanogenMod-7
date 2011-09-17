package java.util;
public abstract class AbstractMap<K, V>
  implements java.util.Map<K, V>
{
public static class SimpleImmutableEntry<K, V>
  implements java.util.Map.Entry<K, V>, java.io.Serializable
{
public  SimpleImmutableEntry(K theKey, V theValue) { throw new RuntimeException("Stub!"); }
public  SimpleImmutableEntry(java.util.Map.Entry<? extends K, ? extends V> copyFrom) { throw new RuntimeException("Stub!"); }
public  K getKey() { throw new RuntimeException("Stub!"); }
public  V getValue() { throw new RuntimeException("Stub!"); }
public  V setValue(V object) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static class SimpleEntry<K, V>
  implements java.util.Map.Entry<K, V>, java.io.Serializable
{
public  SimpleEntry(K theKey, V theValue) { throw new RuntimeException("Stub!"); }
public  SimpleEntry(java.util.Map.Entry<? extends K, ? extends V> copyFrom) { throw new RuntimeException("Stub!"); }
public  K getKey() { throw new RuntimeException("Stub!"); }
public  V getValue() { throw new RuntimeException("Stub!"); }
public  V setValue(V object) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
protected  AbstractMap() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  boolean containsValue(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public abstract  java.util.Set<java.util.Map.Entry<K, V>> entrySet();
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  V get(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  java.util.Set<K> keySet() { throw new RuntimeException("Stub!"); }
public  V put(K key, V value) { throw new RuntimeException("Stub!"); }
public  void putAll(java.util.Map<? extends K, ? extends V> map) { throw new RuntimeException("Stub!"); }
public  V remove(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<V> values() { throw new RuntimeException("Stub!"); }
protected  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
