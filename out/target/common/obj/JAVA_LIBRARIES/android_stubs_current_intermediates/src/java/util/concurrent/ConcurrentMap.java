package java.util.concurrent;
public interface ConcurrentMap<K, V>
  extends java.util.Map<K, V>
{
public abstract  V putIfAbsent(K key, V value);
public abstract  boolean remove(java.lang.Object key, java.lang.Object value);
public abstract  boolean replace(K key, V oldValue, V newValue);
public abstract  V replace(K key, V value);
}
