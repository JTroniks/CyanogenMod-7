package java.security;
public final class AccessController
{
AccessController() { throw new RuntimeException("Stub!"); }
public static <T> T doPrivileged(java.security.PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
public static <T> T doPrivileged(java.security.PrivilegedAction<T> action, java.security.AccessControlContext context) { throw new RuntimeException("Stub!"); }
public static <T> T doPrivileged(java.security.PrivilegedExceptionAction<T> action) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public static <T> T doPrivileged(java.security.PrivilegedExceptionAction<T> action, java.security.AccessControlContext context) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public static <T> T doPrivilegedWithCombiner(java.security.PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
public static <T> T doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction<T> action) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public static  void checkPermission(java.security.Permission permission) throws java.security.AccessControlException { throw new RuntimeException("Stub!"); }
public static  java.security.AccessControlContext getContext() { throw new RuntimeException("Stub!"); }
}
