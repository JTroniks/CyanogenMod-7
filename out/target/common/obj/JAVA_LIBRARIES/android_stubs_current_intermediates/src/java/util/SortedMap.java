package java.util;
public interface SortedMap<K, V>
  extends java.util.Map<K, V>
{
public abstract  java.util.Comparator<? super K> comparator();
public abstract  K firstKey();
public abstract  java.util.SortedMap<K, V> headMap(K endKey);
public abstract  K lastKey();
public abstract  java.util.SortedMap<K, V> subMap(K startKey, K endKey);
public abstract  java.util.SortedMap<K, V> tailMap(K startKey);
}
