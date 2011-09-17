package java.security.interfaces;
public interface RSAMultiPrimePrivateCrtKey
  extends java.security.interfaces.RSAPrivateKey
{
public abstract  java.math.BigInteger getCrtCoefficient();
public abstract  java.security.spec.RSAOtherPrimeInfo[] getOtherPrimeInfo();
public abstract  java.math.BigInteger getPrimeP();
public abstract  java.math.BigInteger getPrimeQ();
public abstract  java.math.BigInteger getPrimeExponentP();
public abstract  java.math.BigInteger getPrimeExponentQ();
public abstract  java.math.BigInteger getPublicExponent();
public static final long serialVersionUID = 618058533534628008L;
}
