package java.security.cert;
public abstract class X509CRLEntry
  implements java.security.cert.X509Extension
{
public  X509CRLEntry() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  byte[] getEncoded() throws java.security.cert.CRLException;
public abstract  java.math.BigInteger getSerialNumber();
public  javax.security.auth.x500.X500Principal getCertificateIssuer() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Date getRevocationDate();
public abstract  boolean hasExtensions();
public abstract  java.lang.String toString();
}
