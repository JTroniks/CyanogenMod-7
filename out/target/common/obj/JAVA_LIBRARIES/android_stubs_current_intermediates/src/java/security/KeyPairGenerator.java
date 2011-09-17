package java.security;
public abstract class KeyPairGenerator
  extends java.security.KeyPairGeneratorSpi
{
protected  KeyPairGenerator(java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public static  java.security.KeyPairGenerator getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.KeyPairGenerator getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.KeyPairGenerator getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public  void initialize(int keysize) { throw new RuntimeException("Stub!"); }
public  void initialize(java.security.spec.AlgorithmParameterSpec param) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  java.security.KeyPair genKeyPair() { throw new RuntimeException("Stub!"); }
public  java.security.KeyPair generateKeyPair() { throw new RuntimeException("Stub!"); }
public  void initialize(int keysize, java.security.SecureRandom random) { throw new RuntimeException("Stub!"); }
public  void initialize(java.security.spec.AlgorithmParameterSpec param, java.security.SecureRandom random) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
}
