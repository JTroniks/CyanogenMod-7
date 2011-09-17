package javax.xml.parsers;
public abstract class SAXParser
{
protected  SAXParser() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream is, org.xml.sax.HandlerBase hb) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream is, org.xml.sax.HandlerBase hb, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream is, org.xml.sax.helpers.DefaultHandler dh) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream is, org.xml.sax.helpers.DefaultHandler dh, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String uri, org.xml.sax.HandlerBase hb) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String uri, org.xml.sax.helpers.DefaultHandler dh) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.File f, org.xml.sax.HandlerBase hb) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.File f, org.xml.sax.helpers.DefaultHandler dh) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource is, org.xml.sax.HandlerBase hb) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource is, org.xml.sax.helpers.DefaultHandler dh) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  org.xml.sax.Parser getParser() throws org.xml.sax.SAXException;
public abstract  org.xml.sax.XMLReader getXMLReader() throws org.xml.sax.SAXException;
public abstract  boolean isNamespaceAware();
public abstract  boolean isValidating();
public abstract  void setProperty(java.lang.String name, java.lang.Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public  javax.xml.validation.Schema getSchema() { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
}
