package org.xml.sax;
public interface XMLReader
{
public abstract  boolean getFeature(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  void setFeature(java.lang.String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  void setProperty(java.lang.String name, java.lang.Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  void setEntityResolver(org.xml.sax.EntityResolver resolver);
public abstract  org.xml.sax.EntityResolver getEntityResolver();
public abstract  void setDTDHandler(org.xml.sax.DTDHandler handler);
public abstract  org.xml.sax.DTDHandler getDTDHandler();
public abstract  void setContentHandler(org.xml.sax.ContentHandler handler);
public abstract  org.xml.sax.ContentHandler getContentHandler();
public abstract  void setErrorHandler(org.xml.sax.ErrorHandler handler);
public abstract  org.xml.sax.ErrorHandler getErrorHandler();
public abstract  void parse(org.xml.sax.InputSource input) throws java.io.IOException, org.xml.sax.SAXException;
public abstract  void parse(java.lang.String systemId) throws java.io.IOException, org.xml.sax.SAXException;
}
