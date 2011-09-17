package java.util.concurrent;
public class ConcurrentSkipListMap<K, V>
  extends java.util.AbstractMap<K, V>
  implements java.util.concurrent.ConcurrentNavigableMap<K, V>, java.lang.Cloneable, java.io.Serializable
{
public  ConcurrentSkipListMap() { throw new RuntimeException("Stub!"); }
public  ConcurrentSkipListMap(java.util.Comparator<? super K> comparator) { throw new RuntimeException("Stub!"); }
public  ConcurrentSkipListMap(java.util.Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
public  ConcurrentSkipListMap(java.util.SortedMap<K, ? extends V> m) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentSkipListMap<K, V> clone() { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  V get(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  V put(K key, V value) { throw new RuntimeException("Stub!"); }
public  V remove(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  boolean containsValue(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  java.util.NavigableSet<K> keySet() { throw new RuntimeException("Stub!"); }
public  java.util.NavigableSet<K> navigableKeySet() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<V> values() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.util.Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentNavigableMap<K, V> descendingMap() { throw new RuntimeException("Stub!"); }
public  java.util.NavigableSet<K> descendingKeySet() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }
public  boolean remove(java.lang.Object key, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
public  V replace(K key, V value) { throw new RuntimeException("Stub!"); }
public  java.util.Comparator<? super K> comparator() { throw new RuntimeException("Stub!"); }
public  K firstKey() { throw new RuntimeException("Stub!"); }
public  K lastKey() { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentNavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentNavigableMap<K, V> headMap(K toKey, boolean inclusive) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentNavigableMap<K, V> tailMap(K fromKey, boolean inclusive) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentNavigableMap<K, V> subMap(K fromKey, K toKey) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentNavigableMap<K, V> headMap(K toKey) { throw new RuntimeException("Stub!"); }
public  java.util.concurrent.ConcurrentNavigableMap<K, V> tailMap(K fromKey) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> lowerEntry(K key) { throw new RuntimeException("Stub!"); }
public  K lowerKey(K key) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> floorEntry(K key) { throw new RuntimeException("Stub!"); }
public  K floorKey(K key) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> ceilingEntry(K key) { throw new RuntimeException("Stub!"); }
public  K ceilingKey(K key) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> higherEntry(K key) { throw new RuntimeException("Stub!"); }
public  K higherKey(K key) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> firstEntry() { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> lastEntry() { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> pollFirstEntry() { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> pollLastEntry() { throw new RuntimeException("Stub!"); }
}
