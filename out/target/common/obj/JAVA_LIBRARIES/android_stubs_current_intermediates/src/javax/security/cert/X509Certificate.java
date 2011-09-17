package javax.security.cert;
public abstract class X509Certificate
  extends javax.security.cert.Certificate
{
public  X509Certificate() { throw new RuntimeException("Stub!"); }
public static final  javax.security.cert.X509Certificate getInstance(java.io.InputStream inStream) throws javax.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public static final  javax.security.cert.X509Certificate getInstance(byte[] certData) throws javax.security.cert.CertificateException { throw new RuntimeException("Stub!"); }
public abstract  void checkValidity() throws javax.security.cert.CertificateExpiredException, javax.security.cert.CertificateNotYetValidException;
public abstract  void checkValidity(java.util.Date date) throws javax.security.cert.CertificateExpiredException, javax.security.cert.CertificateNotYetValidException;
public abstract  int getVersion();
public abstract  java.math.BigInteger getSerialNumber();
public abstract  java.security.Principal getIssuerDN();
public abstract  java.security.Principal getSubjectDN();
public abstract  java.util.Date getNotBefore();
public abstract  java.util.Date getNotAfter();
public abstract  java.lang.String getSigAlgName();
public abstract  java.lang.String getSigAlgOID();
public abstract  byte[] getSigAlgParams();
}
