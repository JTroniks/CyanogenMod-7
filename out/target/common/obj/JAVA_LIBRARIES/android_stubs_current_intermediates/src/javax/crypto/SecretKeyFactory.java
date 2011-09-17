package javax.crypto;
public class SecretKeyFactory
{
protected  SecretKeyFactory(javax.crypto.SecretKeyFactorySpi keyFacSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.SecretKeyFactory getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.SecretKeyFactory getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.SecretKeyFactory getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  javax.crypto.SecretKey generateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException { throw new RuntimeException("Stub!"); }
public final  java.security.spec.KeySpec getKeySpec(javax.crypto.SecretKey key, java.lang.Class keySpec) throws java.security.spec.InvalidKeySpecException { throw new RuntimeException("Stub!"); }
public final  javax.crypto.SecretKey translateKey(javax.crypto.SecretKey key) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
}
