package java.security.cert;
public class TrustAnchor
{
public  TrustAnchor(java.security.cert.X509Certificate trustedCert, byte[] nameConstraints) { throw new RuntimeException("Stub!"); }
public  TrustAnchor(java.lang.String caName, java.security.PublicKey caPublicKey, byte[] nameConstraints) { throw new RuntimeException("Stub!"); }
public  TrustAnchor(javax.security.auth.x500.X500Principal caPrincipal, java.security.PublicKey caPublicKey, byte[] nameConstraints) { throw new RuntimeException("Stub!"); }
public final  byte[] getNameConstraints() { throw new RuntimeException("Stub!"); }
public final  java.security.cert.X509Certificate getTrustedCert() { throw new RuntimeException("Stub!"); }
public final  javax.security.auth.x500.X500Principal getCA() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getCAName() { throw new RuntimeException("Stub!"); }
public final  java.security.PublicKey getCAPublicKey() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
