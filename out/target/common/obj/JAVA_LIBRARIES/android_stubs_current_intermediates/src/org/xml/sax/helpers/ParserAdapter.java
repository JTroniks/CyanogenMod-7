package org.xml.sax.helpers;
public class ParserAdapter
  implements org.xml.sax.XMLReader, org.xml.sax.DocumentHandler
{
public  ParserAdapter() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  ParserAdapter(org.xml.sax.Parser parser) { throw new RuntimeException("Stub!"); }
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
public  void parse(java.lang.String systemId) throws java.io.IOException, org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource input) throws java.io.IOException, org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void setDocumentLocator(org.xml.sax.Locator locator) { throw new RuntimeException("Stub!"); }
public  void startDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void startElement(java.lang.String qName, org.xml.sax.AttributeList qAtts) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endElement(java.lang.String qName) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
}
