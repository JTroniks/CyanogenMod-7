package org.xml.sax.ext;
public class DefaultHandler2
  extends org.xml.sax.helpers.DefaultHandler
  implements org.xml.sax.ext.LexicalHandler, org.xml.sax.ext.DeclHandler, org.xml.sax.ext.EntityResolver2
{
public  DefaultHandler2() { throw new RuntimeException("Stub!"); }
public  void startCDATA() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endCDATA() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endDTD() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void startEntity(java.lang.String name) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endEntity(java.lang.String name) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void comment(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void attributeDecl(java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String mode, java.lang.String value) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void elementDecl(java.lang.String name, java.lang.String model) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void externalEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void internalEntityDecl(java.lang.String name, java.lang.String value) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  org.xml.sax.InputSource getExternalSubset(java.lang.String name, java.lang.String baseURI) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.xml.sax.InputSource resolveEntity(java.lang.String name, java.lang.String publicId, java.lang.String baseURI, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.xml.sax.InputSource resolveEntity(java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
}
