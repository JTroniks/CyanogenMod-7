package javax.crypto;
public class SealedObject
  implements java.io.Serializable
{
public  SealedObject(java.io.Serializable object, javax.crypto.Cipher c) throws java.io.IOException, javax.crypto.IllegalBlockSizeException { throw new RuntimeException("Stub!"); }
protected  SealedObject(javax.crypto.SealedObject so) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(java.security.Key key) throws java.io.IOException, java.lang.ClassNotFoundException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(javax.crypto.Cipher c) throws java.io.IOException, java.lang.ClassNotFoundException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(java.security.Key key, java.lang.String provider) throws java.io.IOException, java.lang.ClassNotFoundException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
protected byte[] encodedParams = null;
}
