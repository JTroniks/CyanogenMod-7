package java.security.cert;
public abstract class PKIXCertPathChecker
  implements java.lang.Cloneable
{
protected  PKIXCertPathChecker() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public abstract  void init(boolean forward) throws java.security.cert.CertPathValidatorException;
public abstract  boolean isForwardCheckingSupported();
public abstract  java.util.Set<java.lang.String> getSupportedExtensions();
public abstract  void check(java.security.cert.Certificate cert, java.util.Collection<java.lang.String> unresolvedCritExts) throws java.security.cert.CertPathValidatorException;
}
