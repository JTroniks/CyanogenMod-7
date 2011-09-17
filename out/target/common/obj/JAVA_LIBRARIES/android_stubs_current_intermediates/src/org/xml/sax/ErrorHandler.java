package org.xml.sax;
public interface ErrorHandler
{
public abstract  void warning(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException;
public abstract  void error(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException;
public abstract  void fatalError(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException;
}
