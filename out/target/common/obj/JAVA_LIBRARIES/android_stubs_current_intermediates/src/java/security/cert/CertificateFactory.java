package java.security.cert;
public class CertificateFactory
{
protected  CertificateFactory(java.security.cert.CertificateFactorySpi certFacSpi, java.security.Provider provider, java.lang.String type) { throw new RuntimeException("Stub!"); }
public static final  java.security.cert.CertificateFactory getInstance(java.lang.String type) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public static final  java.security.cert.CertificateFactory getInstance(java.lang.String type, java.lang.String provider) throws java.security.cert.CertificateException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  java.security.cert.CertificateFactory getInstance(java.lang.String type, java.security.Provider provider) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public final  java.security.cert.Certificate generateCertificate(java.io.InputStream inStream) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  java.util.Iterator<java.lang.String> getCertPathEncodings() { throw new RuntimeException("Stub!"); }
public final  java.security.cert.CertPath generateCertPath(java.io.InputStream inStream) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  java.security.cert.CertPath generateCertPath(java.io.InputStream inStream, java.lang.String encoding) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  java.security.cert.CertPath generateCertPath(java.util.List<? extends java.security.cert.Certificate> certificates) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<? extends java.security.cert.Certificate> generateCertificates(java.io.InputStream inStream) throws java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  java.security.cert.CRL generateCRL(java.io.InputStream inStream) throws java.security.cert.CRLException { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<? extends java.security.cert.CRL> generateCRLs(java.io.InputStream inStream) throws java.security.cert.CRLException { throw new RuntimeException("Stub!"); }
}
