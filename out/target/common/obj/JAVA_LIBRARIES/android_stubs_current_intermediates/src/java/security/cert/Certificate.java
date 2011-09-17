package java.security.cert;
public abstract class Certificate
  implements java.io.Serializable
{
protected static class CertificateRep
  implements java.io.Serializable
{
protected  CertificateRep(java.lang.String type, byte[] data) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.ObjectStreamException { throw new RuntimeException("Stub!"); }
}
protected  Certificate(java.lang.String type) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  byte[] getEncoded() throws java.security.cert.CertificateEncodingException;
public abstract  void verify(java.security.PublicKey key) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
public abstract  void verify(java.security.PublicKey key, java.lang.String sigProvider) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
public abstract  java.lang.String toString();
public abstract  java.security.PublicKey getPublicKey();
protected  java.lang.Object writeReplace() throws java.io.ObjectStreamException { throw new RuntimeException("Stub!"); }
}
