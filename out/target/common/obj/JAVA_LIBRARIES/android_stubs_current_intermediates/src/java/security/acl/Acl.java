package java.security.acl;
public interface Acl
  extends java.security.acl.Owner
{
public abstract  void setName(java.security.Principal caller, java.lang.String name) throws java.security.acl.NotOwnerException;
public abstract  java.lang.String getName();
public abstract  boolean addEntry(java.security.Principal caller, java.security.acl.AclEntry entry) throws java.security.acl.NotOwnerException;
public abstract  boolean removeEntry(java.security.Principal caller, java.security.acl.AclEntry entry) throws java.security.acl.NotOwnerException;
public abstract  java.util.Enumeration<java.security.acl.Permission> getPermissions(java.security.Principal user);
public abstract  java.util.Enumeration<java.security.acl.AclEntry> entries();
public abstract  boolean checkPermission(java.security.Principal principal, java.security.acl.Permission permission);
public abstract  java.lang.String toString();
}
