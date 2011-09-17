package javax.net.ssl;
public abstract class TrustManagerFactorySpi
{
public  TrustManagerFactorySpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineInit(java.security.KeyStore ks) throws java.security.KeyStoreException;
protected abstract  void engineInit(javax.net.ssl.ManagerFactoryParameters spec) throws java.security.InvalidAlgorithmParameterException;
protected abstract  javax.net.ssl.TrustManager[] engineGetTrustManagers();
}
