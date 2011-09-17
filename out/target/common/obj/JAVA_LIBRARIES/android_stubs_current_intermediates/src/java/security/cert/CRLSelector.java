package java.security.cert;
public interface CRLSelector
  extends java.lang.Cloneable
{
public abstract  java.lang.Object clone();
public abstract  boolean match(java.security.cert.CRL crl);
}
