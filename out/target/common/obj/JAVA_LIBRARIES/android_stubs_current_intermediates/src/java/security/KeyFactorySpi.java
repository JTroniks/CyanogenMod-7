package java.security;
public abstract class KeyFactorySpi
{
public  KeyFactorySpi() { throw new RuntimeException("Stub!"); }
protected abstract  java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException;
protected abstract  java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException;
protected abstract <T extends java.security.spec.KeySpec> T engineGetKeySpec(java.security.Key key, java.lang.Class<T> keySpec) throws java.security.spec.InvalidKeySpecException;
protected abstract  java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException;
}
