package java.security;
public abstract class KeyPairGeneratorSpi
{
public  KeyPairGeneratorSpi() { throw new RuntimeException("Stub!"); }
public abstract  java.security.KeyPair generateKeyPair();
public abstract  void initialize(int keysize, java.security.SecureRandom random);
public  void initialize(java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
}
