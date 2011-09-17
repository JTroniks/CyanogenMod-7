package org.xml.sax;
public interface DTDHandler
{
public abstract  void notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException;
public abstract  void unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName) throws org.xml.sax.SAXException;
}
