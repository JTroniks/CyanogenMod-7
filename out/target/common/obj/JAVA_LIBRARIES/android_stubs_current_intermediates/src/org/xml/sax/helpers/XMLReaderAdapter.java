package org.xml.sax.helpers;
public class XMLReaderAdapter
  implements org.xml.sax.Parser, org.xml.sax.ContentHandler
{
public  XMLReaderAdapter() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  XMLReaderAdapter(org.xml.sax.XMLReader xmlReader) { throw new RuntimeException("Stub!"); }
public  void setLocale(java.util.Locale locale) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void setEntityResolver(org.xml.sax.EntityResolver resolver) { throw new RuntimeException("Stub!"); }
public  void setDTDHandler(org.xml.sax.DTDHandler handler) { throw new RuntimeException("Stub!"); }
public  void setDocumentHandler(org.xml.sax.DocumentHandler handler) { throw new RuntimeException("Stub!"); }
public  void setErrorHandler(org.xml.sax.ErrorHandler handler) { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String systemId) throws java.io.IOException, org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource input) throws java.io.IOException, org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void setDocumentLocator(org.xml.sax.Locator locator) { throw new RuntimeException("Stub!"); }
public  void startDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void startPrefixMapping(java.lang.String prefix, java.lang.String uri) { throw new RuntimeException("Stub!"); }
public  void endPrefixMapping(java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  void skippedEntity(java.lang.String name) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
}
