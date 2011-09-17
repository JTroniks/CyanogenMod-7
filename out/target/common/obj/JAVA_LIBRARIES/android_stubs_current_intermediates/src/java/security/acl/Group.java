package java.security.acl;
public interface Group
  extends java.security.Principal
{
public abstract  boolean addMember(java.security.Principal user);
public abstract  boolean removeMember(java.security.Principal user);
public abstract  boolean isMember(java.security.Principal member);
public abstract  java.util.Enumeration<? extends java.security.Principal> members();
}
