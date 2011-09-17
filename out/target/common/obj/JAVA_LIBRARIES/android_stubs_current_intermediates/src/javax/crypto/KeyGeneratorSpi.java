package javax.crypto;
public abstract class KeyGeneratorSpi
{
public  KeyGeneratorSpi() { throw new RuntimeException("Stub!"); }
protected abstract  javax.crypto.SecretKey engineGenerateKey();
protected abstract  void engineInit(java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidAlgorithmParameterException;
protected abstract  void engineInit(int keysize, java.security.SecureRandom random);
protected abstract  void engineInit(java.security.SecureRandom random);
}
