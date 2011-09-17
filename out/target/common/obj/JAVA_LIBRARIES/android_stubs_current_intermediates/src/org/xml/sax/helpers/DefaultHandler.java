package org.xml.sax.helpers;
public class DefaultHandler
  implements org.xml.sax.EntityResolver, org.xml.sax.DTDHandler, org.xml.sax.ContentHandler, org.xml.sax.ErrorHandler
{
public  DefaultHandler() { throw new RuntimeException("Stub!"); }
public  org.xml.sax.InputSource resolveEntity(java.lang.String publicId, java.lang.String systemId) throws java.io.IOException, org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void setDocumentLocator(org.xml.sax.Locator locator) { throw new RuntimeException("Stub!"); }
public  void startDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void startPrefixMapping(java.lang.String prefix, java.lang.String uri) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endPrefixMapping(java.lang.String prefix) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void skippedEntity(java.lang.String name) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void warning(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void error(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void fatalError(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
}
