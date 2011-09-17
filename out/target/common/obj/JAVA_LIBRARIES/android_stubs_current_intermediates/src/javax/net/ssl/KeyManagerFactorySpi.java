package javax.net.ssl;
public abstract class KeyManagerFactorySpi
{
public  KeyManagerFactorySpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineInit(java.security.KeyStore ks, char[] password) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException;
protected abstract  void engineInit(javax.net.ssl.ManagerFactoryParameters spec) throws java.security.InvalidAlgorithmParameterException;
protected abstract  javax.net.ssl.KeyManager[] engineGetKeyManagers();
}
