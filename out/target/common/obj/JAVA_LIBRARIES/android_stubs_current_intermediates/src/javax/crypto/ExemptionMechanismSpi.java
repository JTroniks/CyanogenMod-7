package javax.crypto;
public abstract class ExemptionMechanismSpi
{
public  ExemptionMechanismSpi() { throw new RuntimeException("Stub!"); }
protected abstract  byte[] engineGenExemptionBlob() throws javax.crypto.ExemptionMechanismException;
protected abstract  int engineGenExemptionBlob(byte[] output, int outputOffset) throws javax.crypto.ShortBufferException, javax.crypto.ExemptionMechanismException;
protected abstract  int engineGetOutputSize(int inputLen);
protected abstract  void engineInit(java.security.Key key) throws java.security.InvalidKeyException, javax.crypto.ExemptionMechanismException;
protected abstract  void engineInit(java.security.Key key, java.security.AlgorithmParameters params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, javax.crypto.ExemptionMechanismException;
protected abstract  void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec params) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, javax.crypto.ExemptionMechanismException;
}
