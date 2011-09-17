package java.security.cert;
public abstract class CertStoreSpi
{
public  CertStoreSpi(java.security.cert.CertStoreParameters params) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public abstract  java.util.Collection<? extends java.security.cert.Certificate> engineGetCertificates(java.security.cert.CertSelector selector) throws java.security.cert.CertStoreException;
public abstract  java.util.Collection<? extends java.security.cert.CRL> engineGetCRLs(java.security.cert.CRLSelector selector) throws java.security.cert.CertStoreException;
}
