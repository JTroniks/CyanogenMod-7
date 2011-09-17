package javax.net.ssl;
public class TrustManagerFactory
{
protected  TrustManagerFactory(javax.net.ssl.TrustManagerFactorySpi factorySpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String getDefaultAlgorithm() { throw new RuntimeException("Stub!"); }
public static final  javax.net.ssl.TrustManagerFactory getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  javax.net.ssl.TrustManagerFactory getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  javax.net.ssl.TrustManagerFactory getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  void init(java.security.KeyStore ks) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  void init(javax.net.ssl.ManagerFactoryParameters spec) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.TrustManager[] getTrustManagers() { throw new RuntimeException("Stub!"); }
}
