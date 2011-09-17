package javax.xml.validation;
public abstract class Validator
{
protected  Validator() { throw new RuntimeException("Stub!"); }
public abstract  void reset();
public  void validate(javax.xml.transform.Source source) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void validate(javax.xml.transform.Source source, javax.xml.transform.Result result) throws org.xml.sax.SAXException, java.io.IOException;
public abstract  void setErrorHandler(org.xml.sax.ErrorHandler errorHandler);
public abstract  org.xml.sax.ErrorHandler getErrorHandler();
public abstract  void setResourceResolver(org.w3c.dom.ls.LSResourceResolver resourceResolver);
public abstract  org.w3c.dom.ls.LSResourceResolver getResourceResolver();
public  boolean getFeature(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setFeature(java.lang.String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setProperty(java.lang.String name, java.lang.Object object) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException { throw new RuntimeException("Stub!"); }
}
