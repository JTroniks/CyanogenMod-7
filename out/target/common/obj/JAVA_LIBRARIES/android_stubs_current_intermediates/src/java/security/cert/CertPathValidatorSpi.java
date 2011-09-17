package java.security.cert;
public abstract class CertPathValidatorSpi
{
public  CertPathValidatorSpi() { throw new RuntimeException("Stub!"); }
public abstract  java.security.cert.CertPathValidatorResult engineValidate(java.security.cert.CertPath certPath, java.security.cert.CertPathParameters params) throws java.security.cert.CertPathValidatorException, java.security.InvalidAlgorithmParameterException;
}
