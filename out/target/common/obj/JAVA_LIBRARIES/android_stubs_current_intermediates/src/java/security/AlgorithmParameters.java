package java.security;
public class AlgorithmParameters
{
protected  AlgorithmParameters(java.security.AlgorithmParametersSpi algPramSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public static  java.security.AlgorithmParameters getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.AlgorithmParameters getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.AlgorithmParameters getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  void init(java.security.spec.AlgorithmParameterSpec paramSpec) throws java.security.spec.InvalidParameterSpecException { throw new RuntimeException("Stub!"); }
public final  void init(byte[] params) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void init(byte[] params, java.lang.String format) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final <T extends java.security.spec.AlgorithmParameterSpec> T getParameterSpec(java.lang.Class<T> paramSpec) throws java.security.spec.InvalidParameterSpecException { throw new RuntimeException("Stub!"); }
public final  byte[] getEncoded() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  byte[] getEncoded(java.lang.String format) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
