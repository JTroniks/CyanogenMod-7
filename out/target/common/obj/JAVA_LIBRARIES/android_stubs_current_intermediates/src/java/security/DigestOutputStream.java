package java.security;
public class DigestOutputStream
  extends java.io.FilterOutputStream
{
public  DigestOutputStream(java.io.OutputStream stream, java.security.MessageDigest digest) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  java.security.MessageDigest getMessageDigest() { throw new RuntimeException("Stub!"); }
public  void setMessageDigest(java.security.MessageDigest digest) { throw new RuntimeException("Stub!"); }
public  void write(int b) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] b, int off, int len) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void on(boolean on) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected java.security.MessageDigest digest;
}
