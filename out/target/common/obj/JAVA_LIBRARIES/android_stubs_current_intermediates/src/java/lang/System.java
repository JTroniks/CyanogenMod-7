package java.lang;
public final class System
{
System() { throw new RuntimeException("Stub!"); }
public static  void setIn(java.io.InputStream newIn) { throw new RuntimeException("Stub!"); }
public static  void setOut(java.io.PrintStream newOut) { throw new RuntimeException("Stub!"); }
public static  void setErr(java.io.PrintStream newErr) { throw new RuntimeException("Stub!"); }
public static native  void arraycopy(java.lang.Object src, int srcPos, java.lang.Object dst, int dstPos, int length);
public static native  long currentTimeMillis();
public static native  long nanoTime();
public static  void exit(int code) { throw new RuntimeException("Stub!"); }
public static  void gc() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getenv(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.util.Map<java.lang.String, java.lang.String> getenv() { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.Channel inheritedChannel() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  java.util.Properties getProperties() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getProperty(java.lang.String propertyName) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getProperty(java.lang.String prop, java.lang.String defaultValue) { throw new RuntimeException("Stub!"); }
public static  java.lang.String setProperty(java.lang.String prop, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String clearProperty(java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  java.io.Console console() { throw new RuntimeException("Stub!"); }
public static  java.lang.SecurityManager getSecurityManager() { throw new RuntimeException("Stub!"); }
public static native  int identityHashCode(java.lang.Object anObject);
public static  void load(java.lang.String pathName) { throw new RuntimeException("Stub!"); }
public static  void loadLibrary(java.lang.String libName) { throw new RuntimeException("Stub!"); }
public static  void runFinalization() { throw new RuntimeException("Stub!"); }
public static  void runFinalizersOnExit(boolean flag) { throw new RuntimeException("Stub!"); }
public static  void setProperties(java.util.Properties p) { throw new RuntimeException("Stub!"); }
public static  void setSecurityManager(java.lang.SecurityManager sm) { throw new RuntimeException("Stub!"); }
public static native  java.lang.String mapLibraryName(java.lang.String userLibName);
public static final java.io.InputStream in;
public static final java.io.PrintStream out;
public static final java.io.PrintStream err;
static { in = null; out = null; err = null; }
}
