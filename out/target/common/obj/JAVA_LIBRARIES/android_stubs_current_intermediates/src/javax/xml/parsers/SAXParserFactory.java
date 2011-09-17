package javax.xml.parsers;
public abstract class SAXParserFactory
{
protected  SAXParserFactory() { throw new RuntimeException("Stub!"); }
public static  javax.xml.parsers.SAXParserFactory newInstance() { throw new RuntimeException("Stub!"); }
public static  javax.xml.parsers.SAXParserFactory newInstance(java.lang.String factoryClassName, java.lang.ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.parsers.SAXParser newSAXParser() throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException;
public  void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); }
public  void setValidating(boolean validating) { throw new RuntimeException("Stub!"); }
public  boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
public  boolean isValidating() { throw new RuntimeException("Stub!"); }
public abstract  void setFeature(java.lang.String name, boolean value) throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  boolean getFeature(java.lang.String name) throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public  javax.xml.validation.Schema getSchema() { throw new RuntimeException("Stub!"); }
public  void setSchema(javax.xml.validation.Schema schema) { throw new RuntimeException("Stub!"); }
public  void setXIncludeAware(boolean state) { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
}
