package java.util;
public abstract class Dictionary<K, V>
{
public  Dictionary() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Enumeration<V> elements();
public abstract  V get(java.lang.Object key);
public abstract  boolean isEmpty();
public abstract  java.util.Enumeration<K> keys();
public abstract  V put(K key, V value);
public abstract  V remove(java.lang.Object key);
public abstract  int size();
}
