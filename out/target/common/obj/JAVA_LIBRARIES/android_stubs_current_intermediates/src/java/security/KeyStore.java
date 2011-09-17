package java.security;
public class KeyStore
{
public abstract static class Builder
{
protected  Builder() { throw new RuntimeException("Stub!"); }
public abstract  java.security.KeyStore getKeyStore() throws java.security.KeyStoreException;
public abstract  java.security.KeyStore.ProtectionParameter getProtectionParameter(java.lang.String alias) throws java.security.KeyStoreException;
public static  java.security.KeyStore.Builder newInstance(java.security.KeyStore keyStore, java.security.KeyStore.ProtectionParameter protectionParameter) { throw new RuntimeException("Stub!"); }
public static  java.security.KeyStore.Builder newInstance(java.lang.String type, java.security.Provider provider, java.io.File file, java.security.KeyStore.ProtectionParameter protectionParameter) { throw new RuntimeException("Stub!"); }
public static  java.security.KeyStore.Builder newInstance(java.lang.String type, java.security.Provider provider, java.security.KeyStore.ProtectionParameter protectionParameter) { throw new RuntimeException("Stub!"); }
}
public static class CallbackHandlerProtection
  implements java.security.KeyStore.ProtectionParameter
{
public  CallbackHandlerProtection(javax.security.auth.callback.CallbackHandler handler) { throw new RuntimeException("Stub!"); }
public  javax.security.auth.callback.CallbackHandler getCallbackHandler() { throw new RuntimeException("Stub!"); }
}
public static interface Entry
{
}
public static interface LoadStoreParameter
{
public abstract  java.security.KeyStore.ProtectionParameter getProtectionParameter();
}
public static class PasswordProtection
  implements java.security.KeyStore.ProtectionParameter, javax.security.auth.Destroyable
{
public  PasswordProtection(char[] password) { throw new RuntimeException("Stub!"); }
public synchronized  char[] getPassword() { throw new RuntimeException("Stub!"); }
public synchronized  void destroy() throws javax.security.auth.DestroyFailedException { throw new RuntimeException("Stub!"); }
public synchronized  boolean isDestroyed() { throw new RuntimeException("Stub!"); }
}
public static interface ProtectionParameter
{
}
public static final class PrivateKeyEntry
  implements java.security.KeyStore.Entry
{
public  PrivateKeyEntry(java.security.PrivateKey privateKey, java.security.cert.Certificate[] chain) { throw new RuntimeException("Stub!"); }
public  java.security.PrivateKey getPrivateKey() { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate[] getCertificateChain() { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate getCertificate() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static final class SecretKeyEntry
  implements java.security.KeyStore.Entry
{
public  SecretKeyEntry(javax.crypto.SecretKey secretKey) { throw new RuntimeException("Stub!"); }
public  javax.crypto.SecretKey getSecretKey() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static final class TrustedCertificateEntry
  implements java.security.KeyStore.Entry
{
public  TrustedCertificateEntry(java.security.cert.Certificate trustCertificate) { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate getTrustedCertificate() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
protected  KeyStore(java.security.KeyStoreSpi keyStoreSpi, java.security.Provider provider, java.lang.String type) { throw new RuntimeException("Stub!"); }
public static  java.security.KeyStore getInstance(java.lang.String type) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public static  java.security.KeyStore getInstance(java.lang.String type, java.lang.String provider) throws java.security.KeyStoreException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.KeyStore getInstance(java.lang.String type, java.security.Provider provider) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public static final  java.lang.String getDefaultType() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public final  java.security.Key getKey(java.lang.String alias, char[] password) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
public final  java.security.cert.Certificate[] getCertificateChain(java.lang.String alias) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  java.security.cert.Certificate getCertificate(java.lang.String alias) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  java.util.Date getCreationDate(java.lang.String alias) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  void setKeyEntry(java.lang.String alias, java.security.Key key, char[] password, java.security.cert.Certificate[] chain) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  void setKeyEntry(java.lang.String alias, byte[] key, java.security.cert.Certificate[] chain) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  void setCertificateEntry(java.lang.String alias, java.security.cert.Certificate cert) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  void deleteEntry(java.lang.String alias) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  java.util.Enumeration<java.lang.String> aliases() throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  boolean containsAlias(java.lang.String alias) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  int size() throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  boolean isKeyEntry(java.lang.String alias) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  boolean isCertificateEntry(java.lang.String alias) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  java.lang.String getCertificateAlias(java.security.cert.Certificate cert) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  void store(java.io.OutputStream stream, char[] password) throws java.security.KeyStoreException, java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  void store(java.security.KeyStore.LoadStoreParameter param) throws java.security.KeyStoreException, java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  void load(java.io.InputStream stream, char[] password) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  void load(java.security.KeyStore.LoadStoreParameter param) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public final  java.security.KeyStore.Entry getEntry(java.lang.String alias, java.security.KeyStore.ProtectionParameter param) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableEntryException, java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  void setEntry(java.lang.String alias, java.security.KeyStore.Entry entry, java.security.KeyStore.ProtectionParameter param) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
public final  boolean entryInstanceOf(java.lang.String alias, java.lang.Class<? extends java.security.KeyStore.Entry> entryClass) throws java.security.KeyStoreException { throw new RuntimeException("Stub!"); }
}
