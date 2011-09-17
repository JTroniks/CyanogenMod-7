package java.lang;
public abstract class ClassLoader
{
protected  ClassLoader() { throw new RuntimeException("Stub!"); }
protected  ClassLoader(java.lang.ClassLoader parentLoader) { throw new RuntimeException("Stub!"); }
public static  java.lang.ClassLoader getSystemClassLoader() { throw new RuntimeException("Stub!"); }
public static  java.net.URL getSystemResource(java.lang.String resName) { throw new RuntimeException("Stub!"); }
public static  java.util.Enumeration<java.net.URL> getSystemResources(java.lang.String resName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  java.io.InputStream getSystemResourceAsStream(java.lang.String resName) { throw new RuntimeException("Stub!"); }
protected final  java.lang.Class<?> defineClass(byte[] classRep, int offset, int length) throws java.lang.ClassFormatError { throw new RuntimeException("Stub!"); }
protected final  java.lang.Class<?> defineClass(java.lang.String className, byte[] classRep, int offset, int length) throws java.lang.ClassFormatError { throw new RuntimeException("Stub!"); }
protected final  java.lang.Class<?> defineClass(java.lang.String className, byte[] classRep, int offset, int length, java.security.ProtectionDomain protectionDomain) throws java.lang.ClassFormatError { throw new RuntimeException("Stub!"); }
protected final  java.lang.Class<?> defineClass(java.lang.String name, java.nio.ByteBuffer b, java.security.ProtectionDomain protectionDomain) throws java.lang.ClassFormatError { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> findClass(java.lang.String className) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected final  java.lang.Class<?> findLoadedClass(java.lang.String className) { throw new RuntimeException("Stub!"); }
protected final  java.lang.Class<?> findSystemClass(java.lang.String className) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public final  java.lang.ClassLoader getParent() { throw new RuntimeException("Stub!"); }
public  java.net.URL getResource(java.lang.String resName) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<java.net.URL> getResources(java.lang.String resName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getResourceAsStream(java.lang.String resName) { throw new RuntimeException("Stub!"); }
public  java.lang.Class<?> loadClass(java.lang.String className) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> loadClass(java.lang.String className, boolean resolve) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected final  void resolveClass(java.lang.Class<?> clazz) { throw new RuntimeException("Stub!"); }
protected  java.net.URL findResource(java.lang.String resName) { throw new RuntimeException("Stub!"); }
protected  java.util.Enumeration<java.net.URL> findResources(java.lang.String resName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  java.lang.String findLibrary(java.lang.String libName) { throw new RuntimeException("Stub!"); }
protected  java.lang.Package getPackage(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  java.lang.Package[] getPackages() { throw new RuntimeException("Stub!"); }
protected  java.lang.Package definePackage(java.lang.String name, java.lang.String specTitle, java.lang.String specVersion, java.lang.String specVendor, java.lang.String implTitle, java.lang.String implVersion, java.lang.String implVendor, java.net.URL sealBase) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
protected final  void setSigners(java.lang.Class<?> c, java.lang.Object[] signers) { throw new RuntimeException("Stub!"); }
public  void setClassAssertionStatus(java.lang.String cname, boolean enable) { throw new RuntimeException("Stub!"); }
public  void setPackageAssertionStatus(java.lang.String pname, boolean enable) { throw new RuntimeException("Stub!"); }
public  void setDefaultAssertionStatus(boolean enable) { throw new RuntimeException("Stub!"); }
public  void clearAssertionStatus() { throw new RuntimeException("Stub!"); }
}
