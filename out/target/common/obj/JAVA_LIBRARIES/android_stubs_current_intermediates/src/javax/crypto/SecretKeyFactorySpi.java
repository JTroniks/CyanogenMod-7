package javax.crypto;
public abstract class SecretKeyFactorySpi
{
public  SecretKeyFactorySpi() { throw new RuntimeException("Stub!"); }
protected abstract  javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException;
protected abstract  java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey key, java.lang.Class keySpec) throws java.security.spec.InvalidKeySpecException;
protected abstract  javax.crypto.SecretKey engineTranslateKey(javax.crypto.SecretKey key) throws java.security.InvalidKeyException;
}
