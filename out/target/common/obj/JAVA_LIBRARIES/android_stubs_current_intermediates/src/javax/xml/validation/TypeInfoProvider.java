package javax.xml.validation;
public abstract class TypeInfoProvider
{
protected  TypeInfoProvider() { throw new RuntimeException("Stub!"); }
public abstract  org.w3c.dom.TypeInfo getElementTypeInfo();
public abstract  org.w3c.dom.TypeInfo getAttributeTypeInfo(int index);
public abstract  boolean isIdAttribute(int index);
public abstract  boolean isSpecified(int index);
}
