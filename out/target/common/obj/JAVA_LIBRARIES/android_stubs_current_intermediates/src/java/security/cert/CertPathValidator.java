package java.security.cert;
public class CertPathValidator
{
protected  CertPathValidator(java.security.cert.CertPathValidatorSpi validatorSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertPathValidator getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertPathValidator getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertPathValidator getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.cert.CertPathValidatorResult validate(java.security.cert.CertPath certPath, java.security.cert.CertPathParameters params) throws java.security.cert.CertPathValidatorException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public static final  java.lang.String getDefaultType() { throw new RuntimeException("Stub!"); }
}
