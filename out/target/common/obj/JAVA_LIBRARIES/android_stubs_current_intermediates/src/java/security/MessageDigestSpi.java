package java.security;
public abstract class MessageDigestSpi
{
public  MessageDigestSpi() { throw new RuntimeException("Stub!"); }
protected  int engineGetDigestLength() { throw new RuntimeException("Stub!"); }
protected abstract  void engineUpdate(byte input);
protected abstract  void engineUpdate(byte[] input, int offset, int len);
protected  void engineUpdate(java.nio.ByteBuffer input) { throw new RuntimeException("Stub!"); }
protected abstract  byte[] engineDigest();
protected  int engineDigest(byte[] buf, int offset, int len) throws java.security.DigestException { throw new RuntimeException("Stub!"); }
protected abstract  void engineReset();
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
