package java.security.cert;
public interface CertSelector
  extends java.lang.Cloneable
{
public abstract  java.lang.Object clone();
public abstract  boolean match(java.security.cert.Certificate cert);
}
