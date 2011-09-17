package java.security;
public abstract class PolicySpi
{
public  PolicySpi() { throw new RuntimeException("Stub!"); }
protected abstract  boolean engineImplies(java.security.ProtectionDomain domain, java.security.Permission permission);
protected  void engineRefresh() { throw new RuntimeException("Stub!"); }
protected  java.security.PermissionCollection engineGetPermissions(java.security.CodeSource codesource) { throw new RuntimeException("Stub!"); }
protected  java.security.PermissionCollection engineGetPermissions(java.security.ProtectionDomain domain) { throw new RuntimeException("Stub!"); }
}
