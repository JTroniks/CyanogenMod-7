package java.security;
@java.lang.Deprecated()
public interface Certificate
{
public abstract  void decode(java.io.InputStream stream) throws java.security.KeyException, java.io.IOException;
public abstract  void encode(java.io.OutputStream stream) throws java.security.KeyException, java.io.IOException;
public abstract  java.lang.String getFormat();
public abstract  java.security.Principal getGuarantor();
public abstract  java.security.Principal getPrincipal();
public abstract  java.security.PublicKey getPublicKey();
public abstract  java.lang.String toString(boolean detailed);
}
