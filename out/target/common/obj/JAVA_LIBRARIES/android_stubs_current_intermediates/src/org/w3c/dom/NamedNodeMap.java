package org.w3c.dom;
public interface NamedNodeMap
{
public abstract  org.w3c.dom.Node getNamedItem(java.lang.String name);
public abstract  org.w3c.dom.Node setNamedItem(org.w3c.dom.Node arg) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node removeNamedItem(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node item(int index);
public abstract  int getLength();
public abstract  org.w3c.dom.Node getNamedItemNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node setNamedItemNS(org.w3c.dom.Node arg) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node removeNamedItemNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;
}
