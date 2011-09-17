package java.security.acl;
public interface AclEntry
  extends java.lang.Cloneable
{
public abstract  boolean setPrincipal(java.security.Principal user);
public abstract  java.security.Principal getPrincipal();
public abstract  void setNegativePermissions();
public abstract  boolean isNegative();
public abstract  boolean addPermission(java.security.acl.Permission permission);
public abstract  boolean removePermission(java.security.acl.Permission permission);
public abstract  boolean checkPermission(java.security.acl.Permission permission);
public abstract  java.util.Enumeration<java.security.acl.Permission> permissions();
public abstract  java.lang.String toString();
public abstract  java.lang.Object clone();
}
