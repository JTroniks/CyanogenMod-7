package java.text;
public abstract class Collator
  implements java.util.Comparator<java.lang.Object>, java.lang.Cloneable
{
protected  Collator() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  int compare(java.lang.Object object1, java.lang.Object object2) { throw new RuntimeException("Stub!"); }
public abstract  int compare(java.lang.String string1, java.lang.String string2);
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.String string1, java.lang.String string2) { throw new RuntimeException("Stub!"); }
public static  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public abstract  java.text.CollationKey getCollationKey(java.lang.String string);
public  int getDecomposition() { throw new RuntimeException("Stub!"); }
public static  java.text.Collator getInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.Collator getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  int getStrength() { throw new RuntimeException("Stub!"); }
public abstract  int hashCode();
public  void setDecomposition(int value) { throw new RuntimeException("Stub!"); }
public  void setStrength(int value) { throw new RuntimeException("Stub!"); }
public static final int NO_DECOMPOSITION = 0;
public static final int CANONICAL_DECOMPOSITION = 1;
public static final int FULL_DECOMPOSITION = 2;
public static final int PRIMARY = 0;
public static final int SECONDARY = 1;
public static final int TERTIARY = 2;
public static final int IDENTICAL = 3;
}
