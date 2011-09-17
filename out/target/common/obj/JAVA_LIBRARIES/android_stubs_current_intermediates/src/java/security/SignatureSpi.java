package java.security;
public abstract class SignatureSpi
{
public  SignatureSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException;
protected abstract  void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException;
protected  void engineInitSign(java.security.PrivateKey privateKey, java.security.SecureRandom random) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
protected abstract  void engineUpdate(byte b) throws java.security.SignatureException;
protected abstract  void engineUpdate(byte[] b, int off, int len) throws java.security.SignatureException;
protected  void engineUpdate(java.nio.ByteBuffer input) { throw new RuntimeException("Stub!"); }
protected abstract  byte[] engineSign() throws java.security.SignatureException;
protected  int engineSign(byte[] outbuf, int offset, int len) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
protected abstract  boolean engineVerify(byte[] sigBytes) throws java.security.SignatureException;
protected  boolean engineVerify(byte[] sigBytes, int offset, int length) throws java.security.SignatureException { throw new RuntimeException("Stub!"); }
protected abstract  void engineSetParameter(java.lang.String param, java.lang.Object value) throws java.security.InvalidParameterException;
protected  void engineSetParameter(java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
protected  java.security.AlgorithmParameters engineGetParameters() { throw new RuntimeException("Stub!"); }
protected abstract  java.lang.Object engineGetParameter(java.lang.String param) throws java.security.InvalidParameterException;
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected java.security.SecureRandom appRandom;
}
