package java.security.cert;
public class X509CRLSelector
  implements java.security.cert.CRLSelector
{
public  X509CRLSelector() { throw new RuntimeException("Stub!"); }
public  void setIssuers(java.util.Collection<javax.security.auth.x500.X500Principal> issuers) { throw new RuntimeException("Stub!"); }
public  void setIssuerNames(java.util.Collection<?> names) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addIssuer(javax.security.auth.x500.X500Principal issuer) { throw new RuntimeException("Stub!"); }
public  void addIssuerName(java.lang.String iss_name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addIssuerName(byte[] iss_name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setMinCRLNumber(java.math.BigInteger minCRL) { throw new RuntimeException("Stub!"); }
public  void setMaxCRLNumber(java.math.BigInteger maxCRL) { throw new RuntimeException("Stub!"); }
public  void setDateAndTime(java.util.Date dateAndTime) { throw new RuntimeException("Stub!"); }
public  void setCertificateChecking(java.security.cert.X509Certificate cert) { throw new RuntimeException("Stub!"); }
public  java.util.Collection<javax.security.auth.x500.X500Principal> getIssuers() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.lang.Object> getIssuerNames() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger getMinCRL() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger getMaxCRL() { throw new RuntimeException("Stub!"); }
public  java.util.Date getDateAndTime() { throw new RuntimeException("Stub!"); }
public  java.security.cert.X509Certificate getCertificateChecking() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean match(java.security.cert.CRL crl) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
}
