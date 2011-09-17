package java.security.cert;
public class X509CertSelector
  implements java.security.cert.CertSelector
{
public  X509CertSelector() { throw new RuntimeException("Stub!"); }
public  void setCertificate(java.security.cert.X509Certificate certificate) { throw new RuntimeException("Stub!"); }
public  java.security.cert.X509Certificate getCertificate() { throw new RuntimeException("Stub!"); }
public  void setSerialNumber(java.math.BigInteger serialNumber) { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger getSerialNumber() { throw new RuntimeException("Stub!"); }
public  void setIssuer(javax.security.auth.x500.X500Principal issuer) { throw new RuntimeException("Stub!"); }
public  javax.security.auth.x500.X500Principal getIssuer() { throw new RuntimeException("Stub!"); }
public  void setIssuer(java.lang.String issuerName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getIssuerAsString() { throw new RuntimeException("Stub!"); }
public  void setIssuer(byte[] issuerDN) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] getIssuerAsBytes() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSubject(javax.security.auth.x500.X500Principal subject) { throw new RuntimeException("Stub!"); }
public  javax.security.auth.x500.X500Principal getSubject() { throw new RuntimeException("Stub!"); }
public  void setSubject(java.lang.String subjectDN) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubjectAsString() { throw new RuntimeException("Stub!"); }
public  void setSubject(byte[] subjectDN) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] getSubjectAsBytes() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setSubjectKeyIdentifier(byte[] subjectKeyIdentifier) { throw new RuntimeException("Stub!"); }
public  byte[] getSubjectKeyIdentifier() { throw new RuntimeException("Stub!"); }
public  void setAuthorityKeyIdentifier(byte[] authorityKeyIdentifier) { throw new RuntimeException("Stub!"); }
public  byte[] getAuthorityKeyIdentifier() { throw new RuntimeException("Stub!"); }
public  void setCertificateValid(java.util.Date certificateValid) { throw new RuntimeException("Stub!"); }
public  java.util.Date getCertificateValid() { throw new RuntimeException("Stub!"); }
public  void setPrivateKeyValid(java.util.Date privateKeyValid) { throw new RuntimeException("Stub!"); }
public  java.util.Date getPrivateKeyValid() { throw new RuntimeException("Stub!"); }
public  void setSubjectPublicKeyAlgID(java.lang.String oid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubjectPublicKeyAlgID() { throw new RuntimeException("Stub!"); }
public  void setSubjectPublicKey(java.security.PublicKey key) { throw new RuntimeException("Stub!"); }
public  void setSubjectPublicKey(byte[] key) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.security.PublicKey getSubjectPublicKey() { throw new RuntimeException("Stub!"); }
public  void setKeyUsage(boolean[] keyUsage) { throw new RuntimeException("Stub!"); }
public  boolean[] getKeyUsage() { throw new RuntimeException("Stub!"); }
public  void setExtendedKeyUsage(java.util.Set<java.lang.String> keyUsage) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getExtendedKeyUsage() { throw new RuntimeException("Stub!"); }
public  void setMatchAllSubjectAltNames(boolean matchAllNames) { throw new RuntimeException("Stub!"); }
public  boolean getMatchAllSubjectAltNames() { throw new RuntimeException("Stub!"); }
public  void setSubjectAlternativeNames(java.util.Collection<java.util.List<?>> names) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addSubjectAlternativeName(int tag, java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addSubjectAlternativeName(int tag, byte[] name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.util.List<?>> getSubjectAlternativeNames() { throw new RuntimeException("Stub!"); }
public  void setNameConstraints(byte[] bytes) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte[] getNameConstraints() { throw new RuntimeException("Stub!"); }
public  void setBasicConstraints(int pathLen) { throw new RuntimeException("Stub!"); }
public  int getBasicConstraints() { throw new RuntimeException("Stub!"); }
public  void setPolicy(java.util.Set<java.lang.String> policies) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getPolicy() { throw new RuntimeException("Stub!"); }
public  void setPathToNames(java.util.Collection<java.util.List<?>> names) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addPathToName(int type, java.lang.String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void addPathToName(int type, byte[] name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.util.List<?>> getPathToNames() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean match(java.security.cert.Certificate certificate) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
}
