package java.security.cert;
public interface PolicyNode
{
public abstract  java.util.Iterator<? extends java.security.cert.PolicyNode> getChildren();
public abstract  int getDepth();
public abstract  java.util.Set<java.lang.String> getExpectedPolicies();
public abstract  java.security.cert.PolicyNode getParent();
public abstract  java.util.Set<? extends java.security.cert.PolicyQualifierInfo> getPolicyQualifiers();
public abstract  java.lang.String getValidPolicy();
public abstract  boolean isCritical();
}
