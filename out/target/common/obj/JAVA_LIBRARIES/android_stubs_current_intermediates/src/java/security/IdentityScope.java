package java.security;
@java.lang.Deprecated()
public abstract class IdentityScope
  extends java.security.Identity
{
protected  IdentityScope() { throw new RuntimeException("Stub!"); }
public  IdentityScope(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  IdentityScope(java.lang.String name, java.security.IdentityScope scope) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public static  java.security.IdentityScope getSystemScope() { throw new RuntimeException("Stub!"); }
protected static  void setSystemScope(java.security.IdentityScope scope) { throw new RuntimeException("Stub!"); }
public abstract  int size();
public abstract  java.security.Identity getIdentity(java.lang.String name);
public  java.security.Identity getIdentity(java.security.Principal principal) { throw new RuntimeException("Stub!"); }
public abstract  java.security.Identity getIdentity(java.security.PublicKey key);
public abstract  void addIdentity(java.security.Identity identity) throws java.security.KeyManagementException;
public abstract  void removeIdentity(java.security.Identity identity) throws java.security.KeyManagementException;
public abstract  java.util.Enumeration<java.security.Identity> identities();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
