package javax.crypto;
public class ExemptionMechanism
{
protected  ExemptionMechanism(javax.crypto.ExemptionMechanismSpi exmechSpi, java.security.Provider provider, java.lang.String mechanism) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.ExemptionMechanism getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.ExemptionMechanism getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.ExemptionMechanism getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  boolean isCryptoAllowed(java.security.Key key) throws javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  int getOutputSize(int inputLen) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key) throws java.security.InvalidKeyException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key, java.security.AlgorithmParameters param) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key, java.security.spec.AlgorithmParameterSpec param) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  byte[] genExemptionBlob() throws java.lang.IllegalStateException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  int genExemptionBlob(byte[] output) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
public final  int genExemptionBlob(byte[] output, int outputOffset) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException, javax.crypto.ExemptionMechanismException { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
}
