package org.w3c.dom;
public interface Attr
  extends org.w3c.dom.Node
{
public abstract  java.lang.String getName();
public abstract  boolean getSpecified();
public abstract  java.lang.String getValue();
public abstract  void setValue(java.lang.String value) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Element getOwnerElement();
public abstract  org.w3c.dom.TypeInfo getSchemaTypeInfo();
public abstract  boolean isId();
}
