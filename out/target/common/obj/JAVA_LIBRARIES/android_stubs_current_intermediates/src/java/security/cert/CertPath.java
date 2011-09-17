package java.security.cert;
public abstract class CertPath
  implements java.io.Serializable
{
protected static class CertPathRep
  implements java.io.Serializable
{
protected  CertPathRep(java.lang.String type, byte[] data) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.ObjectStreamException { throw new RuntimeException("Stub!"); }
}
protected  CertPath(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public abstract  java.util.List<? extends java.security.cert.Certificate> getCertificates();
public abstract  byte[] getEncoded() throws java.security.cert.CertificateEncodingException;
public abstract  byte[] getEncoded(java.lang.String encoding) throws java.security.cert.CertificateEncodingException;
public abstract  java.util.Iterator<java.lang.String> getEncodings();
protected  java.lang.Object writeReplace() throws java.io.ObjectStreamException { throw new RuntimeException("Stub!"); }
}
