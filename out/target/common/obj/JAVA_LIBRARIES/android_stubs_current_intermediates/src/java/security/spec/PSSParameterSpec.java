package java.security.spec;
public class PSSParameterSpec
  implements java.security.spec.AlgorithmParameterSpec
{
public  PSSParameterSpec(int saltLen) { throw new RuntimeException("Stub!"); }
public  PSSParameterSpec(java.lang.String mdName, java.lang.String mgfName, java.security.spec.AlgorithmParameterSpec mgfSpec, int saltLen, int trailerField) { throw new RuntimeException("Stub!"); }
public  int getSaltLength() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDigestAlgorithm() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMGFAlgorithm() { throw new RuntimeException("Stub!"); }
public  java.security.spec.AlgorithmParameterSpec getMGFParameters() { throw new RuntimeException("Stub!"); }
public  int getTrailerField() { throw new RuntimeException("Stub!"); }
public static final java.security.spec.PSSParameterSpec DEFAULT;
static { DEFAULT = null; }
}
