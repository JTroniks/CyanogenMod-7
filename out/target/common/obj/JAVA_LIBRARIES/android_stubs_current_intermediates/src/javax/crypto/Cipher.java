package javax.crypto;
public class Cipher
{
protected  Cipher(javax.crypto.CipherSpi cipherSpi, java.security.Provider provider, java.lang.String transformation) { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.Cipher getInstance(java.lang.String transformation) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.Cipher getInstance(java.lang.String transformation, java.lang.String provider) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, javax.crypto.NoSuchPaddingException { throw new RuntimeException("Stub!"); }
public static final  javax.crypto.Cipher getInstance(java.lang.String transformation, java.security.Provider provider) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  int getBlockSize() { throw new RuntimeException("Stub!"); }
public final  int getOutputSize(int inputLen) { throw new RuntimeException("Stub!"); }
public final  byte[] getIV() { throw new RuntimeException("Stub!"); }
public final  java.security.AlgorithmParameters getParameters() { throw new RuntimeException("Stub!"); }
public final  javax.crypto.ExemptionMechanism getExemptionMechanism() { throw new RuntimeException("Stub!"); }
public final  void init(int opmode, java.security.Key key) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void init(int opmode, java.security.Key key, java.security.SecureRandom random) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void init(int opmode, java.security.Key key, java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(int opmode, java.security.Key key, java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(int opmode, java.security.Key key, java.security.AlgorithmParameters params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(int opmode, java.security.Key key, java.security.AlgorithmParameters params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
public final  void init(int opmode, java.security.cert.Certificate certificate) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  void init(int opmode, java.security.cert.Certificate certificate, java.security.SecureRandom random) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  byte[] update(byte[] input) { throw new RuntimeException("Stub!"); }
public final  byte[] update(byte[] input, int inputOffset, int inputLen) { throw new RuntimeException("Stub!"); }
public final  int update(byte[] input, int inputOffset, int inputLen, byte[] output) throws javax.crypto.ShortBufferException { throw new RuntimeException("Stub!"); }
public final  int update(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws javax.crypto.ShortBufferException { throw new RuntimeException("Stub!"); }
public final  int update(java.nio.ByteBuffer input, java.nio.ByteBuffer output) throws javax.crypto.ShortBufferException { throw new RuntimeException("Stub!"); }
public final  byte[] doFinal() throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  int doFinal(byte[] output, int outputOffset) throws javax.crypto.IllegalBlockSizeException, javax.crypto.ShortBufferException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  byte[] doFinal(byte[] input) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  byte[] doFinal(byte[] input, int inputOffset, int inputLen) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  int doFinal(byte[] input, int inputOffset, int inputLen, byte[] output) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  int doFinal(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  int doFinal(java.nio.ByteBuffer input, java.nio.ByteBuffer output) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  byte[] wrap(java.security.Key key) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  java.security.Key unwrap(byte[] wrappedKey, java.lang.String wrappedKeyAlgorithm, int wrappedKeyType) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  int getMaxAllowedKeyLength(java.lang.String transformation) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final  java.security.spec.AlgorithmParameterSpec getMaxAllowedParameterSpec(java.lang.String transformation) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public static final int DECRYPT_MODE = 2;
public static final int ENCRYPT_MODE = 1;
public static final int PRIVATE_KEY = 2;
public static final int PUBLIC_KEY = 1;
public static final int SECRET_KEY = 3;
public static final int UNWRAP_MODE = 4;
public static final int WRAP_MODE = 3;
}
