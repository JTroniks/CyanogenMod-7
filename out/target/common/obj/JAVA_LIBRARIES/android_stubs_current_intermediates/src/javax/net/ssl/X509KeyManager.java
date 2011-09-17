package javax.net.ssl;
public interface X509KeyManager
  extends javax.net.ssl.KeyManager
{
public abstract  java.lang.String chooseClientAlias(java.lang.String[] keyType, java.security.Principal[] issuers, java.net.Socket socket);
public abstract  java.lang.String chooseServerAlias(java.lang.String keyType, java.security.Principal[] issuers, java.net.Socket socket);
public abstract  java.security.cert.X509Certificate[] getCertificateChain(java.lang.String alias);
public abstract  java.lang.String[] getClientAliases(java.lang.String keyType, java.security.Principal[] issuers);
public abstract  java.lang.String[] getServerAliases(java.lang.String keyType, java.security.Principal[] issuers);
public abstract  java.security.PrivateKey getPrivateKey(java.lang.String alias);
}
