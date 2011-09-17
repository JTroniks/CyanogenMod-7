package java.security.cert;
public abstract class CertificateFactorySpi
{
public  CertificateFactorySpi() { throw new RuntimeException("Stub!"); }
public abstract  java.security.cert.Certificate engineGenerateCertificate(java.io.InputStream inStream) throws java.security.cert.CertificateException;
public abstract  java.util.Collection<? extends java.security.cert.Certificate> engineGenerateCertificates(java.io.InputStream inStream) throws java.security.cert.CertificateException;
public abstract  java.security.cert.CRL engineGenerateCRL(java.io.InputStream inStream) throws java.security.cert.CRLException;
public abstract  java.util.Collection<? extends java.security.cert.CRL> engineGenerateCRLs(java.io.InputStream inStream) throws java.security.cert.CRLException;
public  java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream inStream) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream inStream, java.lang.String encoding) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertPath engineGenerateCertPath(java.util.List<? extends java.security.cert.Certificate> certificates) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<java.lang.String> engineGetCertPathEncodings() { throw new RuntimeException("Stub!"); }
}
