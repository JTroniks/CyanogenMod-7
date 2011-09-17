package javax.crypto;
public class Mac
  implements java.lang.Cloneable
{
protected  Mac(javax.crypto.MacSpi macSpi, java.security.Provider provider, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.Mac getInstance(java.lang.String algorithm) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.Mac getInstance(java.lang.String algorithm, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.Mac getInstance(java.lang.String algorithm, java.security.Provider provider) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public final  int getMacLength() { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key, java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(java.security.Key key) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void update(byte input) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  void update(byte[] input, int offset, int len) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  void update(byte[] input) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  void update(java.nio.ByteBuffer input) { throw new RuntimeException("Stub!"); }
public final  byte[] doFinal() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  void doFinal(byte[] output, int outOffset) throws javax.crypto.ShortBufferException, java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  byte[] doFinal(byte[] input) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public final  void reset() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
