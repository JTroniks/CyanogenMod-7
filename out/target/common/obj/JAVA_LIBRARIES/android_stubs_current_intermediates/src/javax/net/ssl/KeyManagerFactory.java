package javax.net.ssl;
public class KeyManagerFactory
{
protected  KeyManagerFactory(javax.net.ssl.KeyManagerFactorySpi factorySpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String getDefaultAlgorithm() { throw new RuntimeException("Stub!"); }
public static final  javax.net.ssl.KeyManagerFactory getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  javax.net.ssl.KeyManagerFactory getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  javax.net.ssl.KeyManagerFactory getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  void init(java.security.KeyStore ks, char[] password) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public final  void init(javax.net.ssl.ManagerFactoryParameters spec) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  javax.net.ssl.KeyManager[] getKeyManagers() { throw new RuntimeException("Stub!"); }
}
