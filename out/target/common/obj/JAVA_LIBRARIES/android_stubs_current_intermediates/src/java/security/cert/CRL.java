package java.security.cert;
public abstract class CRL
{
protected  CRL(java.lang.String type) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public abstract  boolean isRevoked(java.security.cert.Certificate cert);
public abstract  java.lang.String toString();
}
