package javax.crypto;
public abstract class KeyAgreementSpi
{
public  KeyAgreementSpi() { throw new RuntimeException("Stub!"); }
protected abstract  java.security.Key engineDoPhase(java.security.Key key, boolean lastPhase) throws java.security.InvalidKeyException, java.lang.IllegalStateException;
protected abstract  byte[] engineGenerateSecret() throws java.lang.IllegalStateException;
protected abstract  int engineGenerateSecret(byte[] sharedSecret, int offset) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException;
protected abstract  javax.crypto.SecretKey engineGenerateSecret(java.lang.String algorithm) throws java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException;
protected abstract  void engineInit(java.security.Key key, java.security.SecureRandom random) throws java.security.InvalidKeyException;
protected abstract  void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
}
