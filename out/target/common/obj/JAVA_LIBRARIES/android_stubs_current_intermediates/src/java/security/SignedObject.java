package java.security;
public final class SignedObject
  implements java.io.Serializable
{
public  SignedObject(java.io.Serializable object, java.security.PrivateKey signingKey, java.security.Signature signingEngine) throws java.io.IOException, java.security.InvalidKeyException, java.security.SignatureException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getObject() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  byte[] getSignature() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public  boolean verify(java.security.PublicKey verificationKey, java.security.Signature verificationEngine) throws java.security.InvalidKeyException, java.security.SignatureException { throw new RuntimeException("Stub!"); }
}
