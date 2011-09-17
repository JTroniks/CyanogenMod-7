package java.security.cert;
public abstract class CertPathBuilderSpi
{
public  CertPathBuilderSpi() { throw new RuntimeException("Stub!"); }
public abstract  java.security.cert.CertPathBuilderResult engineBuild(java.security.cert.CertPathParameters params) throws java.security.cert.CertPathBuilderException, java.security.InvalidAlgorithmParameterException;
}
