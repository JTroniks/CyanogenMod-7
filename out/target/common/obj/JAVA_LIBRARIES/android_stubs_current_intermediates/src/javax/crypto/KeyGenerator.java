package javax.crypto;
public class KeyGenerator
{
protected  KeyGenerator(javax.crypto.KeyGeneratorSpi keyGenSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.KeyGenerator getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.KeyGenerator getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.KeyGenerator getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  javax.crypto.SecretKey generateKey() { throw new RuntimeException("Stub!"); }
public final  void init(java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(int keysize) { throw new RuntimeException("Stub!"); }
public final  void init(int keysize, java.security.SecureRandom random) { throw new RuntimeException("Stub!"); }
public final  void init(java.security.SecureRandom random) { throw new RuntimeException("Stub!"); }
}
