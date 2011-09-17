package org.w3c.dom;
public interface Element
  extends org.w3c.dom.Node
{
public abstract  java.lang.String getTagName();
public abstract  java.lang.String getAttribute(java.lang.String name);
public abstract  void setAttribute(java.lang.String name, java.lang.String value) throws org.w3c.dom.DOMException;
public abstract  void removeAttribute(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Attr getAttributeNode(java.lang.String name);
public abstract  org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.NodeList getElementsByTagName(java.lang.String name);
public abstract  java.lang.String getAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
public abstract  void setAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName, java.lang.String value) throws org.w3c.dom.DOMException;
public abstract  void removeAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Attr getAttributeNodeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
public abstract  boolean hasAttribute(java.lang.String name);
public abstract  boolean hasAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.TypeInfo getSchemaTypeInfo();
public abstract  void setIdAttribute(java.lang.String name, boolean isId) throws org.w3c.dom.DOMException;
public abstract  void setIdAttributeNS(java.lang.String namespaceURI, java.lang.String localName, boolean isId) throws org.w3c.dom.DOMException;
public abstract  void setIdAttributeNode(org.w3c.dom.Attr idAttr, boolean isId) throws org.w3c.dom.DOMException;
}
