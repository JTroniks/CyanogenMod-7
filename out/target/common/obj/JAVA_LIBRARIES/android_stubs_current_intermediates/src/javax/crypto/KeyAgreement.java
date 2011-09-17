package javax.crypto;
public class KeyAgreement
{
protected  KeyAgreement(javax.crypto.KeyAgreementSpi keyAgreeSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.KeyAgreement getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.KeyAgreement getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.KeyAgreement getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key, java.security.SecureRandom random) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key, java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key, java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  java.security.Key doPhase(java.security.Key key, boolean lastPhase) throws java.security.InvalidKeyException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  byte[] generateSecret() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  int generateSecret(byte[] sharedSecret, int offset) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException { throw new RuntimeException("Stub!"); }
public final  javax.crypto.SecretKey generateSecret(java.lang.String algorithm) throws java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
}
