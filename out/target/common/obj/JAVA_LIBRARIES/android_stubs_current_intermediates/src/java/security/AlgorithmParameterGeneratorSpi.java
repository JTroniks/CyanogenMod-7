package java.security;
public abstract class AlgorithmParameterGeneratorSpi
{
public  AlgorithmParameterGeneratorSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineInit(int size, java.security.SecureRandom random);
protected abstract  void engineInit(java.security.spec.AlgorithmParameterSpec genParamSpec, java.security.SecureRandom random) throws java.security.InvalidAlgorithmParameterException;
protected abstract  java.security.AlgorithmParameters engineGenerateParameters();
}
