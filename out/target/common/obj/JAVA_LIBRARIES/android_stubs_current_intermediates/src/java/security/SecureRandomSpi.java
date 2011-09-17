package java.security;
public abstract class SecureRandomSpi
  implements java.io.Serializable
{
public  SecureRandomSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineSetSeed(byte[] seed);
protected abstract  void engineNextBytes(byte[] bytes);
protected abstract  byte[] engineGenerateSeed(int numBytes);
}
