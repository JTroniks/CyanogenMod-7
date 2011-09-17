package java.security.cert;
public class PKIXParameters
  implements java.security.cert.CertPathParameters
{
public  PKIXParameters(java.util.Set<java.security.cert.TrustAnchor> trustAnchors) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public  PKIXParameters(java.security.KeyStore keyStore) throws java.security.KeyStoreException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.security.cert.TrustAnchor> getTrustAnchors() { throw new RuntimeException("Stub!"); }
public  void setTrustAnchors(java.util.Set<java.security.cert.TrustAnchor> trustAnchors) throws java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public  boolean isAnyPolicyInhibited() { throw new RuntimeException("Stub!"); }
public  void setAnyPolicyInhibited(boolean anyPolicyInhibited) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.security.cert.PKIXCertPathChecker> getCertPathCheckers() { throw new RuntimeException("Stub!"); }
public  void setCertPathCheckers(java.util.List<java.security.cert.PKIXCertPathChecker> certPathCheckers) { throw new RuntimeException("Stub!"); }
public  void addCertPathChecker(java.security.cert.PKIXCertPathChecker checker) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.security.cert.CertStore> getCertStores() { throw new RuntimeException("Stub!"); }
public  void setCertStores(java.util.List<java.security.cert.CertStore> certStores) { throw new RuntimeException("Stub!"); }
public  void addCertStore(java.security.cert.CertStore store) { throw new RuntimeException("Stub!"); }
public  java.util.Date getDate() { throw new RuntimeException("Stub!"); }
public  void setDate(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  boolean isExplicitPolicyRequired() { throw new RuntimeException("Stub!"); }
public  void setExplicitPolicyRequired(boolean explicitPolicyRequired) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getInitialPolicies() { throw new RuntimeException("Stub!"); }
public  void setInitialPolicies(java.util.Set<java.lang.String> initialPolicies) { throw new RuntimeException("Stub!"); }
public  boolean isPolicyMappingInhibited() { throw new RuntimeException("Stub!"); }
public  void setPolicyMappingInhibited(boolean policyMappingInhibited) { throw new RuntimeException("Stub!"); }
public  boolean getPolicyQualifiersRejected() { throw new RuntimeException("Stub!"); }
public  void setPolicyQualifiersRejected(boolean policyQualifiersRejected) { throw new RuntimeException("Stub!"); }
public  boolean isRevocationEnabled() { throw new RuntimeException("Stub!"); }
public  void setRevocationEnabled(boolean revocationEnabled) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSigProvider() { throw new RuntimeException("Stub!"); }
public  void setSigProvider(java.lang.String sigProvider) { throw new RuntimeException("Stub!"); }
public  java.security.cert.CertSelector getTargetCertConstraints() { throw new RuntimeException("Stub!"); }
public  void setTargetCertConstraints(java.security.cert.CertSelector targetCertConstraints) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
