package java.security;
public class CodeSource
  implements java.io.Serializable
{
public  CodeSource(java.net.URL location, java.security.cert.Certificate[] certs) { throw new RuntimeException("Stub!"); }
public  CodeSource(java.net.URL location, java.security.CodeSigner[] signers) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public final  java.security.cert.Certificate[] getCertificates() { throw new RuntimeException("Stub!"); }
public final  java.security.CodeSigner[] getCodeSigners() { throw new RuntimeException("Stub!"); }
public final  java.net.URL getLocation() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean implies(java.security.CodeSource cs) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
