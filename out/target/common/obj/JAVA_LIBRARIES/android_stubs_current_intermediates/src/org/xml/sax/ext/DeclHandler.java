package org.xml.sax.ext;
public interface DeclHandler
{
public abstract  void elementDecl(java.lang.String name, java.lang.String model) throws org.xml.sax.SAXException;
public abstract  void attributeDecl(java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String mode, java.lang.String value) throws org.xml.sax.SAXException;
public abstract  void internalEntityDecl(java.lang.String name, java.lang.String value) throws org.xml.sax.SAXException;
public abstract  void externalEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException;
}
