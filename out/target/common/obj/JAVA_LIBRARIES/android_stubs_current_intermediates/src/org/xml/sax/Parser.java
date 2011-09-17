package org.xml.sax;
@java.lang.Deprecated()
public interface Parser
{
public abstract  void setLocale(java.util.Locale locale) throws org.xml.sax.SAXException;
public abstract  void setEntityResolver(org.xml.sax.EntityResolver resolver);
public abstract  void setDTDHandler(org.xml.sax.DTDHandler handler);
public abstract  void setDocumentHandler(org.xml.sax.DocumentHandler handler);
public abstract  void setErrorHandler(org.xml.sax.ErrorHandler handler);
public abstract  void parse(org.xml.sax.InputSource source) throws org.xml.sax.SAXException, java.io.IOException;
public abstract  void parse(java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException;
}
