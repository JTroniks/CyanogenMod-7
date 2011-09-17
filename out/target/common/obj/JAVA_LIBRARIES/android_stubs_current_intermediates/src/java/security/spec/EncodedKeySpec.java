package java.security.spec;
public abstract class EncodedKeySpec
  implements java.security.spec.KeySpec
{
public  EncodedKeySpec(byte[] encodedKey) { throw new RuntimeException("Stub!"); }
public  byte[] getEncoded() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getFormat();
}
