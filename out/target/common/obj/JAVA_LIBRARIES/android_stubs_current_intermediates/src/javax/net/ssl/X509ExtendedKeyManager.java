package javax.net.ssl;
public abstract class X509ExtendedKeyManager
  implements javax.net.ssl.X509KeyManager
{
protected  X509ExtendedKeyManager() { throw new RuntimeException("Stub!"); }
public  java.lang.String chooseEngineClientAlias(java.lang.String[] keyType, java.security.Principal[] issuers, javax.net.ssl.SSLEngine engine) { throw new RuntimeException("Stub!"); }
public  java.lang.String chooseEngineServerAlias(java.lang.String keyType, java.security.Principal[] issuers, javax.net.ssl.SSLEngine engine) { throw new RuntimeException("Stub!"); }
}
