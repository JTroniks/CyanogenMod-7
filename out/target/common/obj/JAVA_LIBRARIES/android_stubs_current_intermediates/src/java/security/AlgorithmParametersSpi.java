package java.security;
public abstract class AlgorithmParametersSpi
{
public  AlgorithmParametersSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineInit(java.security.spec.AlgorithmParameterSpec paramSpec) throws java.security.spec.InvalidParameterSpecException;
protected abstract  void engineInit(byte[] params) throws java.io.IOException;
protected abstract  void engineInit(byte[] params, java.lang.String format) throws java.io.IOException;
protected abstract <T extends java.security.spec.AlgorithmParameterSpec> T engineGetParameterSpec(java.lang.Class<T> paramSpec) throws java.security.spec.InvalidParameterSpecException;
protected abstract  byte[] engineGetEncoded() throws java.io.IOException;
protected abstract  byte[] engineGetEncoded(java.lang.String format) throws java.io.IOException;
protected abstract  java.lang.String engineToString();
}
