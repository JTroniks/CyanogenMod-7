package java.security;
public class SecureRandom
  extends java.util.Random
{
public  SecureRandom() { throw new RuntimeException("Stub!"); }
public  SecureRandom(byte[] seed) { throw new RuntimeException("Stub!"); }
protected  SecureRandom(java.security.SecureRandomSpi secureRandomSpi, java.security.Provider provider) { throw new RuntimeException("Stub!"); }
public static  java.security.SecureRandom getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static  java.security.SecureRandom getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static  java.security.SecureRandom getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public synchronized  void setSeed(byte[] seed) { throw new RuntimeException("Stub!"); }
public  void setSeed(long seed) { throw new RuntimeException("Stub!"); }
public synchronized  void nextBytes(byte[] bytes) { throw new RuntimeException("Stub!"); }
protected final  int next(int numBits) { throw new RuntimeException("Stub!"); }
public static  byte[] getSeed(int numBytes) { throw new RuntimeException("Stub!"); }
public  byte[] generateSeed(int numBytes) { throw new RuntimeException("Stub!"); }
}
