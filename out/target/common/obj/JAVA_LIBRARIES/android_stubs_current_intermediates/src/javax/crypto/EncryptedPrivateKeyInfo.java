package javax.crypto;
public class EncryptedPrivateKeyInfo
{
public  EncryptedPrivateKeyInfo(byte[] encoded) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  EncryptedPrivateKeyInfo(java.lang.String encrAlgName, byte[] encryptedData) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public  EncryptedPrivateKeyInfo(java.security.AlgorithmParameters algParams, byte[] encryptedData) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public  java.lang.String getAlgName() { throw new RuntimeException("Stub!"); }
public  java.security.AlgorithmParameters getAlgParameters() { throw new RuntimeException("Stub!"); }
public  byte[] getEncryptedData() { throw new RuntimeException("Stub!"); }
public  java.security.spec.PKCS8EncodedKeySpec getKeySpec(javax.crypto.Cipher cipher) throws java.security.spec.InvalidKeySpecException { throw new RuntimeException("Stub!"); }
public  java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key decryptKey) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public  java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key decryptKey, java.lang.String providerName) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public  java.security.spec.PKCS8EncodedKeySpec getKeySpec(java.security.Key decryptKey, java.security.Provider provider) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public  byte[] getEncoded() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
