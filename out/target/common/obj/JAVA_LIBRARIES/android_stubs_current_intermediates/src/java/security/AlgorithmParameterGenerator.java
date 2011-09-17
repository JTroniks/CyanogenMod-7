package java.security;
public class AlgorithmParameterGenerator
{
protected  AlgorithmParameterGenerator(java.security.AlgorithmParameterGeneratorSpi paramGenSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public static  java.security.AlgorithmParameterGenerator getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.AlgorithmParameterGenerator getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.AlgorithmParameterGenerator getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  void init(int size) { throw new RuntimeException("Stub!"); }
public final  void init(int size, java.security.SecureRandom random) { throw new RuntimeException("Stub!"); }
public final  void init(java.security.spec.AlgorithmParameterSpec genParamSpec) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.spec.AlgorithmParameterSpec genParamSpec, java.security.SecureRandom random) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  java.security.AlgorithmParameters generateParameters() { throw new RuntimeException("Stub!"); }
}
