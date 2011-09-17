package java.util;
public class TreeMap<K, V>
  extends java.util.AbstractMap<K, V>
  implements java.util.SortedMap<K, V>, java.util.NavigableMap<K, V>, java.lang.Cloneable, java.io.Serializable
{
public  TreeMap() { throw new RuntimeException("Stub!"); }
public  TreeMap(java.util.Map<? extends K, ? extends V> copyFrom) { throw new RuntimeException("Stub!"); }
public  TreeMap(java.util.Comparator<? super K> comparator) { throw new RuntimeException("Stub!"); }
public  TreeMap(java.util.SortedMap<K, ? extends V> copyFrom) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  V get(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  V put(K key, V value) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  V remove(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> firstEntry() { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> pollFirstEntry() { throw new RuntimeException("Stub!"); }
public  K firstKey() { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> lastEntry() { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> pollLastEntry() { throw new RuntimeException("Stub!"); }
public  K lastKey() { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> lowerEntry(K key) { throw new RuntimeException("Stub!"); }
public  K lowerKey(K key) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> floorEntry(K key) { throw new RuntimeException("Stub!"); }
public  K floorKey(K key) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> ceilingEntry(K key) { throw new RuntimeException("Stub!"); }
public  K ceilingKey(K key) { throw new RuntimeException("Stub!"); }
public  java.util.Map.Entry<K, V> higherEntry(K key) { throw new RuntimeException("Stub!"); }
public  K higherKey(K key) { throw new RuntimeException("Stub!"); }
public  java.util.Comparator<? super K> comparator() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.util.Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
public  java.util.Set<K> keySet() { throw new RuntimeException("Stub!"); }
public  java.util.NavigableSet<K> navigableKeySet() { throw new RuntimeException("Stub!"); }
public  java.util.NavigableMap<K, V> subMap(K from, boolean fromInclusive, K to, boolean toInclusive) { throw new RuntimeException("Stub!"); }
public  java.util.SortedMap<K, V> subMap(K fromInclusive, K toExclusive) { throw new RuntimeException("Stub!"); }
public  java.util.NavigableMap<K, V> headMap(K to, boolean inclusive) { throw new RuntimeException("Stub!"); }
public  java.util.SortedMap<K, V> headMap(K toExclusive) { throw new RuntimeException("Stub!"); }
public  java.util.NavigableMap<K, V> tailMap(K from, boolean inclusive) { throw new RuntimeException("Stub!"); }
public  java.util.SortedMap<K, V> tailMap(K fromInclusive) { throw new RuntimeException("Stub!"); }
public  java.util.NavigableMap<K, V> descendingMap() { throw new RuntimeException("Stub!"); }
public  java.util.NavigableSet<K> descendingKeySet() { throw new RuntimeException("Stub!"); }
}
