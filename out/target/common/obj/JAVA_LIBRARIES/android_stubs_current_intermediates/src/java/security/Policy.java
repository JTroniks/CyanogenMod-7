package java.security;
public abstract class Policy
{
public static interface Parameters
{
}
public  Policy() { throw new RuntimeException("Stub!"); }
public static  java.security.Policy getInstance(java.lang.String type, java.security.Policy.Parameters params) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.Policy getInstance(java.lang.String type, java.security.Policy.Parameters params, java.lang.String provider) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.Policy getInstance(java.lang.String type, java.security.Policy.Parameters params, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public  java.security.Policy.Parameters getParameters() { throw new RuntimeException("Stub!"); }
public  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public  java.security.PermissionCollection getPermissions(java.security.CodeSource cs) { throw new RuntimeException("Stub!"); }
public  void refresh() { throw new RuntimeException("Stub!"); }
public  java.security.PermissionCollection getPermissions(java.security.ProtectionDomain domain) { throw new RuntimeException("Stub!"); }
public  boolean implies(java.security.ProtectionDomain domain, java.security.Permission permission) { throw new RuntimeException("Stub!"); }
public static  java.security.Policy getPolicy() { throw new RuntimeException("Stub!"); }
public static  void setPolicy(java.security.Policy policy) { throw new RuntimeException("Stub!"); }
public static final java.security.PermissionCollection UNSUPPORTED_EMPTY_COLLECTION;
static { UNSUPPORTED_EMPTY_COLLECTION = null; }
}
