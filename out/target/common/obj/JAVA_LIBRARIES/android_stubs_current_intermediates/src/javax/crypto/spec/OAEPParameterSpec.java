package javax.crypto.spec;
public class OAEPParameterSpec
  implements java.security.spec.AlgorithmParameterSpec
{
public  OAEPParameterSpec(java.lang.String mdName, java.lang.String mgfName, java.security.spec.AlgorithmParameterSpec mgfSpec, javax.crypto.spec.PSource pSrc) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDigestAlgorithm() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMGFAlgorithm() { throw new RuntimeException("Stub!"); }
public  java.security.spec.AlgorithmParameterSpec getMGFParameters() { throw new RuntimeException("Stub!"); }
public  javax.crypto.spec.PSource getPSource() { throw new RuntimeException("Stub!"); }
public static final javax.crypto.spec.OAEPParameterSpec DEFAULT;
static { DEFAULT = null; }
}
