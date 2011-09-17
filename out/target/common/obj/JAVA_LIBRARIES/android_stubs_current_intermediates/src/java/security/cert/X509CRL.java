package java.security.cert;
public abstract class X509CRL
  extends java.security.cert.CRL
  implements java.security.cert.X509Extension
{
protected  X509CRL() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  byte[] getEncoded() throws java.security.cert.CRLException;
public abstract  void verify(java.security.PublicKey key) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
public abstract  void verify(java.security.PublicKey key, java.lang.String sigProvider) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
public abstract  int getVersion();
public abstract  java.security.Principal getIssuerDN();
public  javax.security.auth.x500.X500Principal getIssuerX500Principal() { throw new RuntimeException("Stub!"); }
public abstract  java.util.Date getThisUpdate();
public abstract  java.util.Date getNextUpdate();
public abstract  java.security.cert.X509CRLEntry getRevokedCertificate(java.math.BigInteger serialNumber);
public  java.security.cert.X509CRLEntry getRevokedCertificate(java.security.cert.X509Certificate certificate) { throw new RuntimeException("Stub!"); }
public abstract  java.util.Set<? extends java.security.cert.X509CRLEntry> getRevokedCertificates();
public abstract  byte[] getTBSCertList() throws java.security.cert.CRLException;
public abstract  byte[] getSignature();
public abstract  java.lang.String getSigAlgName();
public abstract  java.lang.String getSigAlgOID();
public abstract  byte[] getSigAlgParams();
}
