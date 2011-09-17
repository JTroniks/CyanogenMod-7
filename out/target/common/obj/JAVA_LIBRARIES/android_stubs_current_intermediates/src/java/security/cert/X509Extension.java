package java.security.cert;
public interface X509Extension
{
public abstract  java.util.Set<java.lang.String> getCriticalExtensionOIDs();
public abstract  byte[] getExtensionValue(java.lang.String oid);
public abstract  java.util.Set<java.lang.String> getNonCriticalExtensionOIDs();
public abstract  boolean hasUnsupportedCriticalExtension();
}
