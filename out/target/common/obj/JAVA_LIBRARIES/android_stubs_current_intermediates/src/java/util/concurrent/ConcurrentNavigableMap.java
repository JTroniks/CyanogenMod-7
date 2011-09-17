package java.util.concurrent;
public interface ConcurrentNavigableMap<K, V>
  extends java.util.concurrent.ConcurrentMap<K, V>, java.util.NavigableMap<K, V>
{
public abstract  java.util.concurrent.ConcurrentNavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive);
public abstract  java.util.concurrent.ConcurrentNavigableMap<K, V> headMap(K toKey, boolean inclusive);
public abstract  java.util.concurrent.ConcurrentNavigableMap<K, V> tailMap(K fromKey, boolean inclusive);
public abstract  java.util.concurrent.ConcurrentNavigableMap<K, V> subMap(K fromKey, K toKey);
public abstract  java.util.concurrent.ConcurrentNavigableMap<K, V> headMap(K toKey);
public abstract  java.util.concurrent.ConcurrentNavigableMap<K, V> tailMap(K fromKey);
public abstract  java.util.concurrent.ConcurrentNavigableMap<K, V> descendingMap();
public abstract  java.util.NavigableSet<K> navigableKeySet();
public abstract  java.util.NavigableSet<K> keySet();
public abstract  java.util.NavigableSet<K> descendingKeySet();
}
