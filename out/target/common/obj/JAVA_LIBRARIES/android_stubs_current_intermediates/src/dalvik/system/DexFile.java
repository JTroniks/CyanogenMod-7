package dalvik.system;
public final class DexFile
{
public  DexFile(java.io.File file) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  DexFile(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  dalvik.system.DexFile loadDex(java.lang.String sourcePathName, java.lang.String outputPathName, int flags) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Class loadClass(java.lang.String name, java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<java.lang.String> entries() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static native  boolean isDexOptNeeded(java.lang.String fileName) throws java.io.FileNotFoundException, java.io.IOException;
}
