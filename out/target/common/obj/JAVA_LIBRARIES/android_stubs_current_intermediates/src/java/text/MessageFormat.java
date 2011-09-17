package java.text;
public class MessageFormat
  extends java.text.Format
{
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String fieldName) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final java.text.MessageFormat.Field ARGUMENT;
static { ARGUMENT = null; }
}
public  MessageFormat(java.lang.String template, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  MessageFormat(java.lang.String template) { throw new RuntimeException("Stub!"); }
public  void applyPattern(java.lang.String template) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object[] objects, java.lang.StringBuffer buffer, java.text.FieldPosition field) { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object object, java.lang.StringBuffer buffer, java.text.FieldPosition field) { throw new RuntimeException("Stub!"); }
public static  java.lang.String format(java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public  java.text.Format[] getFormats() { throw new RuntimeException("Stub!"); }
public  java.text.Format[] getFormatsByArgumentIndex() { throw new RuntimeException("Stub!"); }
public  void setFormatByArgumentIndex(int argIndex, java.text.Format format) { throw new RuntimeException("Stub!"); }
public  void setFormatsByArgumentIndex(java.text.Format[] formats) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] parse(java.lang.String string) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] parse(java.lang.String string, java.text.ParsePosition position) { throw new RuntimeException("Stub!"); }
public  java.lang.Object parseObject(java.lang.String string, java.text.ParsePosition position) { throw new RuntimeException("Stub!"); }
public  void setFormat(int offset, java.text.Format format) { throw new RuntimeException("Stub!"); }
public  void setFormats(java.text.Format[] formats) { throw new RuntimeException("Stub!"); }
public  void setLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.lang.String toPattern() { throw new RuntimeException("Stub!"); }
}
