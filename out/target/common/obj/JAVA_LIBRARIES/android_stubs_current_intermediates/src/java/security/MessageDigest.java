package java.security;
public abstract class MessageDigest
  extends java.security.MessageDigestSpi
{
protected  MessageDigest(java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public static  java.security.MessageDigest getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.MessageDigest getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.MessageDigest getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void update(byte arg0) { throw new RuntimeException("Stub!"); }
public  void update(byte[] input, int offset, int len) { throw new RuntimeException("Stub!"); }
public  void update(byte[] input) { throw new RuntimeException("Stub!"); }
public  byte[] digest() { throw new RuntimeException("Stub!"); }
public  int digest(byte[] buf, int offset, int len) throws java.security.DigestException { throw new RuntimeException("Stub!"); }
public  byte[] digest(byte[] input) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  boolean isEqual(byte[] digesta, byte[] digestb) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  int getDigestLength() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public final  void update(java.nio.ByteBuffer input) { throw new RuntimeException("Stub!"); }
}
