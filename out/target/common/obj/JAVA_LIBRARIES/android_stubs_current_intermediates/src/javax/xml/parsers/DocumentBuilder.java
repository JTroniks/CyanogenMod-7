package javax.xml.parsers;
public abstract class DocumentBuilder
{
protected  DocumentBuilder() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.io.InputStream is) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.io.InputStream is, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.lang.String uri) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.io.File f) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  org.w3c.dom.Document parse(org.xml.sax.InputSource is) throws org.xml.sax.SAXException, java.io.IOException;
public abstract  boolean isNamespaceAware();
public abstract  boolean isValidating();
public abstract  void setEntityResolver(org.xml.sax.EntityResolver er);
public abstract  void setErrorHandler(org.xml.sax.ErrorHandler eh);
public abstract  org.w3c.dom.Document newDocument();
public abstract  org.w3c.dom.DOMImplementation getDOMImplementation();
public  javax.xml.validation.Schema getSchema() { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
}
