package org.xml.sax.helpers;
public class XMLFilterImpl
  implements org.xml.sax.XMLFilter, org.xml.sax.EntityResolver, org.xml.sax.DTDHandler, org.xml.sax.ContentHandler, org.xml.sax.ErrorHandler
{
public  XMLFilterImpl() { throw new RuntimeException("Stub!"); }
public  XMLFilterImpl(org.xml.sax.XMLReader parent) { throw new RuntimeException("Stub!"); }
public  void setParent(org.xml.sax.XMLReader parent) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.XMLReader getParent() { throw new RuntimeException("Stub!"); }
public  void setFeature(java.lang.String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  boolean getFeature(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setProperty(java.lang.String name, java.lang.Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setEntityResolver(org.xml.sax.EntityResolver resolver) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.EntityResolver getEntityResolver() { throw new RuntimeException("Stub!"); }
public  void setDTDHandler(org.xml.sax.DTDHandler handler) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.DTDHandler getDTDHandler() { throw new RuntimeException("Stub!"); }
public  void setContentHandler(org.xml.sax.ContentHandler handler) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.ContentHandler getContentHandler() { throw new RuntimeException("Stub!"); }
public  void setErrorHandler(org.xml.sax.ErrorHandler handler) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.ErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource input) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.xml.sax.InputSource resolveEntity(java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void setDocumentLocator(org.xml.sax.Locator locator) { throw new RuntimeException("Stub!"); }
public  void startDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void startPrefixMapping(java.lang.String prefix, java.lang.String uri) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endPrefixMapping(java.lang.String prefix) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void skippedEntity(java.lang.String name) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void warning(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void error(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void fatalError(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
}
