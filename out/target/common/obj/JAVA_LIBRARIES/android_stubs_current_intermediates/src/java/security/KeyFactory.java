package java.security;
public class KeyFactory
{
protected  KeyFactory(java.security.KeyFactorySpi keyFacSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public static  java.security.KeyFactory getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.KeyFactory getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.KeyFactory getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.PublicKey generatePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException { throw new RuntimeException("Stub!"); }
public final  java.security.PrivateKey generatePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException { throw new RuntimeException("Stub!"); }
public final <T extends java.security.spec.KeySpec> T getKeySpec(java.security.Key key, java.lang.Class<T> keySpec) throws java.security.spec.InvalidKeySpecException { throw new RuntimeException("Stub!"); }
public final  java.security.Key translateKey(java.security.Key key) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
}
