package org.xml.sax.ext;
public interface LexicalHandler
{
public abstract  void startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException;
public abstract  void endDTD() throws org.xml.sax.SAXException;
public abstract  void startEntity(java.lang.String name) throws org.xml.sax.SAXException;
public abstract  void endEntity(java.lang.String name) throws org.xml.sax.SAXException;
public abstract  void startCDATA() throws org.xml.sax.SAXException;
public abstract  void endCDATA() throws org.xml.sax.SAXException;
public abstract  void comment(char[] ch, int start, int length) throws org.xml.sax.SAXException;
}
