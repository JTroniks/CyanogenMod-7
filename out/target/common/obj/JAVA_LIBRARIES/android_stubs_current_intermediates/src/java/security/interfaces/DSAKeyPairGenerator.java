package java.security.interfaces;
public interface DSAKeyPairGenerator
{
public abstract  void initialize(java.security.interfaces.DSAParams params, java.security.SecureRandom random) throws java.security.InvalidParameterException;
public abstract  void initialize(int modlen, boolean genParams, java.security.SecureRandom random) throws java.security.InvalidParameterException;
}
