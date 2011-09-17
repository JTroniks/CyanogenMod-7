package javax.xml.validation;
public abstract class SchemaFactory
{
protected  SchemaFactory() { throw new RuntimeException("Stub!"); }
public static  javax.xml.validation.SchemaFactory newInstance(java.lang.String schemaLanguage) { throw new RuntimeException("Stub!"); }
public static  javax.xml.validation.SchemaFactory newInstance(java.lang.String schemaLanguage, java.lang.String factoryClassName, java.lang.ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
public abstract  boolean isSchemaLanguageSupported(java.lang.String schemaLanguage);
public  boolean getFeature(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setFeature(java.lang.String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setProperty(java.lang.String name, java.lang.Object object) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public abstract  void setErrorHandler(org.xml.sax.ErrorHandler errorHandler);
public abstract  org.xml.sax.ErrorHandler getErrorHandler();
public abstract  void setResourceResolver(org.w3c.dom.ls.LSResourceResolver resourceResolver);
public abstract  org.w3c.dom.ls.LSResourceResolver getResourceResolver();
public  javax.xml.validation.Schema newSchema(javax.xml.transform.Source schema) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  javax.xml.validation.Schema newSchema(java.io.File schema) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public  javax.xml.validation.Schema newSchema(java.net.URL schema) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.validation.Schema newSchema(javax.xml.transform.Source[] schemas) throws org.xml.sax.SAXException;
public abstract  javax.xml.validation.Schema newSchema() throws org.xml.sax.SAXException;
}
