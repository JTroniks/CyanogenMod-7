package java.text;
public abstract class NumberFormat
  extends java.text.Format
{
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String fieldName) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final java.text.NumberFormat.Field SIGN;
public static final java.text.NumberFormat.Field INTEGER;
public static final java.text.NumberFormat.Field FRACTION;
public static final java.text.NumberFormat.Field EXPONENT;
public static final java.text.NumberFormat.Field EXPONENT_SIGN;
public static final java.text.NumberFormat.Field EXPONENT_SYMBOL;
public static final java.text.NumberFormat.Field DECIMAL_SEPARATOR;
public static final java.text.NumberFormat.Field GROUPING_SEPARATOR;
public static final java.text.NumberFormat.Field PERCENT;
public static final java.text.NumberFormat.Field PERMILLE;
public static final java.text.NumberFormat.Field CURRENCY;
static { SIGN = null; INTEGER = null; FRACTION = null; EXPONENT = null; EXPONENT_SIGN = null; EXPONENT_SYMBOL = null; DECIMAL_SEPARATOR = null; GROUPING_SEPARATOR = null; PERCENT = null; PERMILLE = null; CURRENCY = null; }
}
protected  NumberFormat() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(double value) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuffer format(double value, java.lang.StringBuffer buffer, java.text.FieldPosition field);
public final  java.lang.String format(long value) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuffer format(long value, java.lang.StringBuffer buffer, java.text.FieldPosition field);
public  java.lang.StringBuffer format(java.lang.Object object, java.lang.StringBuffer buffer, java.text.FieldPosition field) { throw new RuntimeException("Stub!"); }
public static  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public  java.util.Currency getCurrency() { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getCurrencyInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getCurrencyInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getIntegerInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getIntegerInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); }
public  int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); }
public  int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); }
public  int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getNumberInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getNumberInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static final  java.text.NumberFormat getPercentInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.NumberFormat getPercentInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean isGroupingUsed() { throw new RuntimeException("Stub!"); }
public  boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }
public  java.lang.Number parse(java.lang.String string) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Number parse(java.lang.String string, java.text.ParsePosition position);
public final  java.lang.Object parseObject(java.lang.String string, java.text.ParsePosition position) { throw new RuntimeException("Stub!"); }
public  void setCurrency(java.util.Currency currency) { throw new RuntimeException("Stub!"); }
public  void setGroupingUsed(boolean value) { throw new RuntimeException("Stub!"); }
public  void setMaximumFractionDigits(int value) { throw new RuntimeException("Stub!"); }
public  void setMaximumIntegerDigits(int value) { throw new RuntimeException("Stub!"); }
public  void setMinimumFractionDigits(int value) { throw new RuntimeException("Stub!"); }
public  void setMinimumIntegerDigits(int value) { throw new RuntimeException("Stub!"); }
public  void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); }
public  java.math.RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); }
public  void setRoundingMode(java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }
public static final int INTEGER_FIELD = 0;
public static final int FRACTION_FIELD = 1;
}
