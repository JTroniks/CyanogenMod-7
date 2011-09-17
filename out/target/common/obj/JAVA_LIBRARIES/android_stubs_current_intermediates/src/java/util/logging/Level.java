package java.util.logging;
public class Level
  implements java.io.Serializable
{
protected  Level(java.lang.String name, int level) { throw new RuntimeException("Stub!"); }
protected  Level(java.lang.String name, int level, java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Level parse(java.lang.String name) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getResourceBundleName() { throw new RuntimeException("Stub!"); }
public final  int intValue() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocalizedName() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final java.util.logging.Level OFF;
public static final java.util.logging.Level SEVERE;
public static final java.util.logging.Level WARNING;
public static final java.util.logging.Level INFO;
public static final java.util.logging.Level CONFIG;
public static final java.util.logging.Level FINE;
public static final java.util.logging.Level FINER;
public static final java.util.logging.Level FINEST;
public static final java.util.logging.Level ALL;
static { OFF = null; SEVERE = null; WARNING = null; INFO = null; CONFIG = null; FINE = null; FINER = null; FINEST = null; ALL = null; }
}
