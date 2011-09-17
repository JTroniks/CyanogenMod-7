package java.security;
public class SecureClassLoader
  extends java.lang.ClassLoader
{
protected  SecureClassLoader() { throw new RuntimeException("Stub!"); }
protected  SecureClassLoader(java.lang.ClassLoader parent) { throw new RuntimeException("Stub!"); }
protected  java.security.PermissionCollection getPermissions(java.security.CodeSource codesource) { throw new RuntimeException("Stub!"); }
protected final  java.lang.Class<?> defineClass(java.lang.String name, byte[] b, int off, int len, java.security.CodeSource cs) { throw new RuntimeException("Stub!"); }
protected final  java.lang.Class<?> defineClass(java.lang.String name, java.nio.ByteBuffer b, java.security.CodeSource cs) { throw new RuntimeException("Stub!"); }
}
