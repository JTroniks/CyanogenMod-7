package javax.crypto;
public abstract class CipherSpi
{
public  CipherSpi() { throw new RuntimeException("Stub!"); }
protected abstract  void engineSetMode(java.lang.String mode) throws java.security.NoSuchAlgorithmException;
protected abstract  void engineSetPadding(java.lang.String padding) throws javax.crypto.NoSuchPaddingException;
protected abstract  int engineGetBlockSize();
protected abstract  int engineGetOutputSize(int inputLen);
protected abstract  byte[] engineGetIV();
protected abstract  java.security.AlgorithmParameters engineGetParameters();
protected abstract  void engineInit(int opmode, java.security.Key key, java.security.SecureRandom random) throws java.security.InvalidKeyException;
protected abstract  void engineInit(int opmode, java.security.Key key, java.security.spec.AlgorithmParameterSpec params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
protected abstract  void engineInit(int opmode, java.security.Key key, java.security.AlgorithmParameters params, java.security.SecureRandom random) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
protected abstract  byte[] engineUpdate(byte[] input, int inputOffset, int inputLen);
protected abstract  int engineUpdate(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws javax.crypto.ShortBufferException;
protected  int engineUpdate(java.nio.ByteBuffer input, java.nio.ByteBuffer output) throws javax.crypto.ShortBufferException { throw new RuntimeException("Stub!"); }
protected abstract  byte[] engineDoFinal(byte[] input, int inputOffset, int inputLen) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException;
protected abstract  int engineDoFinal(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException;
protected  int engineDoFinal(java.nio.ByteBuffer input, java.nio.ByteBuffer output) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
protected  byte[] engineWrap(java.security.Key key) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
protected  java.security.Key engineUnwrap(byte[] wrappedKey, java.lang.String wrappedKeyAlgorithm, int wrappedKeyType) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
protected  int engineGetKeySize(java.security.Key key) throws java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
}
