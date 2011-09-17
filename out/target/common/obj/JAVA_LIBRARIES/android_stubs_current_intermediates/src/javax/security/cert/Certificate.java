package javax.security.cert;
public abstract class Certificate
{
public  Certificate() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  byte[] getEncoded() throws javax.security.cert.CertificateEncodingException;
public abstract  void verify(java.security.PublicKey key) throws javax.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
public abstract  void verify(java.security.PublicKey key, java.lang.String sigProvider) throws javax.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException;
public abstract  java.lang.String toString();
public abstract  java.security.PublicKey getPublicKey();
}
