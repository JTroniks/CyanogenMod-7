package java.net;
public class URLClassLoader
  extends java.security.SecureClassLoader
{
public  URLClassLoader(java.net.URL[] urls) { throw new RuntimeException("Stub!"); }
public  URLClassLoader(java.net.URL[] urls, java.lang.ClassLoader parent) { throw new RuntimeException("Stub!"); }
public  URLClassLoader(java.net.URL[] searchUrls, java.lang.ClassLoader parent, java.net.URLStreamHandlerFactory factory) { throw new RuntimeException("Stub!"); }
protected  void addURL(java.net.URL url) { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<java.net.URL> findResources(java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  java.security.PermissionCollection getPermissions(java.security.CodeSource codesource) { throw new RuntimeException("Stub!"); }
public  java.net.URL[] getURLs() { throw new RuntimeException("Stub!"); }
public static  java.net.URLClassLoader newInstance(java.net.URL[] urls) { throw new RuntimeException("Stub!"); }
public static  java.net.URLClassLoader newInstance(java.net.URL[] urls, java.lang.ClassLoader parentCl) { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> findClass(java.lang.String clsName) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  java.net.URL findResource(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  java.lang.Package definePackage(java.lang.String packageName, java.util.jar.Manifest manifest, java.net.URL url) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
}
