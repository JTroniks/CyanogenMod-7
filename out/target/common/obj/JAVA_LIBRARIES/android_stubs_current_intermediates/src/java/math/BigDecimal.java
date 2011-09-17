package java.math;
public class BigDecimal
  extends java.lang.Number
  implements java.lang.Comparable<java.math.BigDecimal>, java.io.Serializable
{
public  BigDecimal(char[] in, int offset, int len) { throw new RuntimeException("Stub!"); }
public  BigDecimal(char[] in, int offset, int len, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  BigDecimal(char[] in) { throw new RuntimeException("Stub!"); }
public  BigDecimal(char[] in, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  BigDecimal(java.lang.String val) { throw new RuntimeException("Stub!"); }
public  BigDecimal(java.lang.String val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  BigDecimal(double val) { throw new RuntimeException("Stub!"); }
public  BigDecimal(double val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  BigDecimal(java.math.BigInteger val) { throw new RuntimeException("Stub!"); }
public  BigDecimal(java.math.BigInteger val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  BigDecimal(java.math.BigInteger unscaledVal, int scale) { throw new RuntimeException("Stub!"); }
public  BigDecimal(java.math.BigInteger unscaledVal, int scale, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  BigDecimal(int val) { throw new RuntimeException("Stub!"); }
public  BigDecimal(int val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  BigDecimal(long val) { throw new RuntimeException("Stub!"); }
public  BigDecimal(long val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public static  java.math.BigDecimal valueOf(long unscaledVal, int scale) { throw new RuntimeException("Stub!"); }
public static  java.math.BigDecimal valueOf(long unscaledVal) { throw new RuntimeException("Stub!"); }
public static  java.math.BigDecimal valueOf(double val) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal add(java.math.BigDecimal augend) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal add(java.math.BigDecimal augend, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal subtract(java.math.BigDecimal subtrahend) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal subtract(java.math.BigDecimal subtrahend, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal multiply(java.math.BigDecimal multiplicand) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal multiply(java.math.BigDecimal multiplicand, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal divide(java.math.BigDecimal divisor, int scale, int roundingMode) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal divide(java.math.BigDecimal divisor, int scale, java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal divide(java.math.BigDecimal divisor, int roundingMode) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal divide(java.math.BigDecimal divisor, java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal divide(java.math.BigDecimal divisor) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal divide(java.math.BigDecimal divisor, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal divideToIntegralValue(java.math.BigDecimal divisor) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal divideToIntegralValue(java.math.BigDecimal divisor, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal remainder(java.math.BigDecimal divisor) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal remainder(java.math.BigDecimal divisor, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal[] divideAndRemainder(java.math.BigDecimal divisor) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal[] divideAndRemainder(java.math.BigDecimal divisor, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal pow(int n) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal pow(int n, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal abs() { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal abs(java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal negate() { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal negate(java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal plus() { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal plus(java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  int signum() { throw new RuntimeException("Stub!"); }
public  int scale() { throw new RuntimeException("Stub!"); }
public  int precision() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger unscaledValue() { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal round(java.math.MathContext mc) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal setScale(int newScale, java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal setScale(int newScale, int roundingMode) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal setScale(int newScale) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal movePointLeft(int n) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal movePointRight(int n) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal scaleByPowerOfTen(int n) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal stripTrailingZeros() { throw new RuntimeException("Stub!"); }
public  int compareTo(java.math.BigDecimal val) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object x) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal min(java.math.BigDecimal val) { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal max(java.math.BigDecimal val) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toEngineeringString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toPlainString() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger toBigInteger() { throw new RuntimeException("Stub!"); }
public  java.math.BigInteger toBigIntegerExact() { throw new RuntimeException("Stub!"); }
public  long longValue() { throw new RuntimeException("Stub!"); }
public  long longValueExact() { throw new RuntimeException("Stub!"); }
public  int intValue() { throw new RuntimeException("Stub!"); }
public  int intValueExact() { throw new RuntimeException("Stub!"); }
public  short shortValueExact() { throw new RuntimeException("Stub!"); }
public  byte byteValueExact() { throw new RuntimeException("Stub!"); }
public  float floatValue() { throw new RuntimeException("Stub!"); }
public  double doubleValue() { throw new RuntimeException("Stub!"); }
public  java.math.BigDecimal ulp() { throw new RuntimeException("Stub!"); }
public static final java.math.BigDecimal ZERO;
public static final java.math.BigDecimal ONE;
public static final java.math.BigDecimal TEN;
public static final int ROUND_UP = 0;
public static final int ROUND_DOWN = 1;
public static final int ROUND_CEILING = 2;
public static final int ROUND_FLOOR = 3;
public static final int ROUND_HALF_UP = 4;
public static final int ROUND_HALF_DOWN = 5;
public static final int ROUND_HALF_EVEN = 6;
public static final int ROUND_UNNECESSARY = 7;
static { ZERO = null; ONE = null; TEN = null; }
}
