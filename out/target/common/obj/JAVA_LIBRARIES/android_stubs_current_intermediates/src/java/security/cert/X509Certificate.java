package java.security.cert;
public abstract class X509Certificate
  extends java.security.cert.Certificate
  implements java.security.cert.X509Extension
{
protected  X509Certificate() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public abstract  void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException;
public abstract  void checkValidity(java.util.Date date) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException;
public abstract  int getVersion();
public abstract  java.math.BigInteger getSerialNumber();
public abstract  java.security.Principal getIssuerDN();
public  javax.security.auth.x500.X500Principal getIssuerX500Principal() { throw new RuntimeException("Stub!"); }
public abstract  java.security.Principal getSubjectDN();
public  javax.security.auth.x500.X500Principal getSubjectX500Principal() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Date getNotBefore();
public abstract  java.util.Date getNotAfter();
public abstract  byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException;
public abstract  byte[] getSignature();
public abstract  java.lang.String getSigAlgName();
public abstract  java.lang.String getSigAlgOID();
public abstract  byte[] getSigAlgParams();
public abstract  boolean[] getIssuerUniqueID();
public abstract  boolean[] getSubjectUniqueID();
public abstract  boolean[] getKeyUsage();
public  java.util.List<java.lang.String> getExtendedKeyUsage() throws java.security.cert.CertificateParsingException { throw new RuntimeException("Stub!"); }
public abstract  int getBasicConstraints();
public  java.util.Collection<java.util.List<?>> getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.util.List<?>> getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException { throw new RuntimeException("Stub!"); }
}
