package java.text;
public abstract class Format
  implements java.io.Serializable, java.lang.Cloneable
{
public static class Field
  extends java.text.AttributedCharacterIterator.Attribute
{
protected  Field(java.lang.String fieldName) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
}
protected  Format() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public final  java.lang.String format(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuffer format(java.lang.Object object, java.lang.StringBuffer buffer, java.text.FieldPosition field);
public  java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  java.lang.Object parseObject(java.lang.String string) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Object parseObject(java.lang.String string, java.text.ParsePosition position);
}
