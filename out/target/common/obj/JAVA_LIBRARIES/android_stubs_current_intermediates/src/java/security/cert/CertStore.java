package java.security.cert;
public class CertStore
{
protected  CertStore(java.security.cert.CertStoreSpi storeSpi, java.security.Provider provider, java.lang.String type, java.security.cert.CertStoreParameters params) { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertStore getInstance(java.lang.String type, java.security.cert.CertStoreParameters params) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertStore getInstance(java.lang.String type, java.security.cert.CertStoreParameters params, java.lang.String provider) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.cert.CertStore getInstance(java.lang.String type, java.security.cert.CertStoreParameters params, java.security.Provider provider) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.security.cert.CertStoreParameters getCertStoreParameters() { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<? extends java.security.cert.Certificate> getCertificates(java.security.cert.CertSelector selector) throws java.security.cert.CertStoreException { throw new RuntimeException("Stub!"); }
public final  java.util.Collection<? extends java.security.cert.CRL> getCRLs(java.security.cert.CRLSelector selector) throws java.security.cert.CertStoreException { throw new RuntimeException("Stub!"); }
public static final  java.lang.String getDefaultType() { throw new RuntimeException("Stub!"); }
}
