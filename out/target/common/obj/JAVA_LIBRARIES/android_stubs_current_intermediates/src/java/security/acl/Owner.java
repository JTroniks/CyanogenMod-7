package java.security.acl;
public interface Owner
{
public abstract  boolean addOwner(java.security.Principal caller, java.security.Principal owner) throws java.security.acl.NotOwnerException;
public abstract  boolean deleteOwner(java.security.Principal caller, java.security.Principal owner) throws java.security.acl.NotOwnerException, java.security.acl.LastOwnerException;
public abstract  boolean isOwner(java.security.Principal owner);
}
