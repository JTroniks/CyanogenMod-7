package java.text;
public abstract class CollationKey
  implements java.lang.Comparable<java.text.CollationKey>
{
protected  CollationKey(java.lang.String source) { throw new RuntimeException("Stub!"); }
public abstract  int compareTo(java.text.CollationKey value);
public  java.lang.String getSourceString() { throw new RuntimeException("Stub!"); }
public abstract  byte[] toByteArray();
}
