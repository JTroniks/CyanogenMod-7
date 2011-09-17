package javax.crypto;
public abstract class MacSpi
{
public  MacSpi() { throw new RuntimeException("Stub!"); }
protected abstract  int engineGetMacLength();
protected abstract  void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
protected abstract  void engineUpdate(byte input);
protected abstract  void engineUpdate(byte[] input, int offset, int len);
protected  void engineUpdate(java.nio.ByteBuffer input) { throw new RuntimeException("Stub!"); }
protected abstract  byte[] engineDoFinal();
protected abstract  void engineReset();
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
