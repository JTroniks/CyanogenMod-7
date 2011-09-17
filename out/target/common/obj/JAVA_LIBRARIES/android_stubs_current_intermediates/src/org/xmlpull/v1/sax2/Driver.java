package org.xmlpull.v1.sax2;
public class Driver
  implements org.xml.sax.Locator, org.xml.sax.XMLReader, org.xml.sax.Attributes
{
public  Driver() throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
public  Driver(org.xmlpull.v1.XmlPullParser pp) throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
public  int getLength() { throw new RuntimeException("Stub!"); }
public  java.lang.String getURI(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocalName(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String getQName(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String getType(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String getValue(int index) { throw new RuntimeException("Stub!"); }
public  int getIndex(java.lang.String uri, java.lang.String localName) { throw new RuntimeException("Stub!"); }
public  int getIndex(java.lang.String qName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getType(java.lang.String uri, java.lang.String localName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getType(java.lang.String qName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getValue(java.lang.String uri, java.lang.String localName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getValue(java.lang.String qName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPublicId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemId() { throw new RuntimeException("Stub!"); }
public  int getLineNumber() { throw new RuntimeException("Stub!"); }
public  int getColumnNumber() { throw new RuntimeException("Stub!"); }
public  boolean getFeature(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setFeature(java.lang.String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setProperty(java.lang.String name, java.lang.Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setEntityResolver(org.xml.sax.EntityResolver resolver) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.EntityResolver getEntityResolver() { throw new RuntimeException("Stub!"); }
public  void setDTDHandler(org.xml.sax.DTDHandler handler) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.DTDHandler getDTDHandler() { throw new RuntimeException("Stub!"); }
public  void setContentHandler(org.xml.sax.ContentHandler handler) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.ContentHandler getContentHandler() { throw new RuntimeException("Stub!"); }
public  void setErrorHandler(org.xml.sax.ErrorHandler handler) { throw new RuntimeException("Stub!"); }
public  org.xml.sax.ErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource source) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parseSubTree(org.xmlpull.v1.XmlPullParser pp) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void startElement(java.lang.String namespace, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
protected static final java.lang.String DECLARATION_HANDLER_PROPERTY = "http://xml.org/sax/properties/declaration-handler";
protected static final java.lang.String LEXICAL_HANDLER_PROPERTY = "http://xml.org/sax/properties/lexical-handler";
protected static final java.lang.String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
protected static final java.lang.String NAMESPACE_PREFIXES_FEATURE = "http://xml.org/sax/features/namespace-prefixes";
protected static final java.lang.String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
protected static final java.lang.String APACHE_SCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
protected static final java.lang.String APACHE_DYNAMIC_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/dynamic";
protected org.xml.sax.ContentHandler contentHandler;
protected org.xml.sax.ErrorHandler errorHandler;
protected java.lang.String systemId;
protected org.xmlpull.v1.XmlPullParser pp;
}
