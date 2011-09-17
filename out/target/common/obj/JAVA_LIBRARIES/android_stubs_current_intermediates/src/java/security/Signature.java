package java.security;
public abstract class Signature
  extends java.security.SignatureSpi
{
protected  Signature(java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public static  java.security.Signature getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.Signature getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.Signature getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  void initVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void initVerify(java.security.cert.Certificate certificate) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void initSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void initSign(java.security.PrivateKey privateKey, java.security.SecureRandom random) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  byte[] sign() throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
public final  int sign(byte[] outbuf, int offset, int len) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
public final  boolean verify(byte[] signature) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
public final  boolean verify(byte[] signature, int offset, int length) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
public final  void update(byte b) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
public final  void update(byte[] data) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
public final  void update(byte[] data, int off, int len) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
public final  void update(java.nio.ByteBuffer data) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  void setParameter(java.lang.String param, java.lang.Object value) throws java.security.InvalidParameterException { throw new RuntimeException("Stub!"); }
public final  void setParameter(java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  java.security.AlgorithmParameters getParameters() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getParameter(java.lang.String param) throws java.security.InvalidParameterException { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected static final int UNINITIALIZED = 0;
protected static final int SIGN = 2;
protected static final int VERIFY = 3;
protected int state;
}
