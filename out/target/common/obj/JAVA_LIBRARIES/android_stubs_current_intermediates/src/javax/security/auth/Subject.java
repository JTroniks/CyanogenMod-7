package javax.security.auth;
public final class Subject
  implements java.io.Serializable
{
public  Subject() { throw new RuntimeException("Stub!"); }
public  Subject(boolean readOnly, java.util.Set<? extends java.security.Principal> subjPrincipals, java.util.Set<?> pubCredentials, java.util.Set<?> privCredentials) { throw new RuntimeException("Stub!"); }
public static <T> T doAs(javax.security.auth.Subject subject, java.security.PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
public static <T> T doAsPrivileged(javax.security.auth.Subject subject, java.security.PrivilegedAction<T> action, java.security.AccessControlContext context) { throw new RuntimeException("Stub!"); }
public static <T> T doAs(javax.security.auth.Subject subject, java.security.PrivilegedExceptionAction<T> action) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public static <T> T doAsPrivileged(javax.security.auth.Subject subject, java.security.PrivilegedExceptionAction<T> action, java.security.AccessControlContext context) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.security.Principal> getPrincipals() { throw new RuntimeException("Stub!"); }
public <T extends java.security.Principal> java.util.Set<T> getPrincipals(java.lang.Class<T> c) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.Object> getPrivateCredentials() { throw new RuntimeException("Stub!"); }
public <T> java.util.Set<T> getPrivateCredentials(java.lang.Class<T> c) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.Object> getPublicCredentials() { throw new RuntimeException("Stub!"); }
public <T> java.util.Set<T> getPublicCredentials(java.lang.Class<T> c) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  void setReadOnly() { throw new RuntimeException("Stub!"); }
public  boolean isReadOnly() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  javax.security.auth.Subject getSubject(java.security.AccessControlContext context) { throw new RuntimeException("Stub!"); }
}
