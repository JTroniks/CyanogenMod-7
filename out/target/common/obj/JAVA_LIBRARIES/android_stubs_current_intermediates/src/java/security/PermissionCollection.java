package java.security;
public abstract class PermissionCollection
  implements java.io.Serializable
{
public  PermissionCollection() { throw new RuntimeException("Stub!"); }
public abstract  void add(java.security.Permission permission);
public abstract  java.util.Enumeration<java.security.Permission> elements();
public abstract  boolean implies(java.security.Permission permission);
public  boolean isReadOnly() { throw new RuntimeException("Stub!"); }
public  void setReadOnly() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
