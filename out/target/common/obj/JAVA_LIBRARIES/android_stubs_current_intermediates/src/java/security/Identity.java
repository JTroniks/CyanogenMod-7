package java.security;
@java.lang.Deprecated()
public abstract class Identity
  implements java.security.Principal, java.io.Serializable
{
protected  Identity() { throw new RuntimeException("Stub!"); }
public  Identity(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  Identity(java.lang.String name, java.security.IdentityScope scope) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public  void addCertificate(java.security.Certificate certificate) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public  void removeCertificate(java.security.Certificate certificate) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public  java.security.Certificate[] certificates() { throw new RuntimeException("Stub!"); }
protected  boolean identityEquals(java.security.Identity identity) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString(boolean detailed) { throw new RuntimeException("Stub!"); }
public final  java.security.IdentityScope getScope() { throw new RuntimeException("Stub!"); }
public  void setPublicKey(java.security.PublicKey key) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }
public  java.security.PublicKey getPublicKey() { throw new RuntimeException("Stub!"); }
public  void setInfo(java.lang.String info) { throw new RuntimeException("Stub!"); }
public  java.lang.String getInfo() { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
