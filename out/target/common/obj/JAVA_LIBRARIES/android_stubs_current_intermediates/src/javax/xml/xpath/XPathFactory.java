package javax.xml.xpath;
public abstract class XPathFactory
{
protected  XPathFactory() { throw new RuntimeException("Stub!"); }
public static final  javax.xml.xpath.XPathFactory newInstance() { throw new RuntimeException("Stub!"); }
public static final  javax.xml.xpath.XPathFactory newInstance(java.lang.String uri) throws javax.xml.xpath.XPathFactoryConfigurationException { throw new RuntimeException("Stub!"); }
public static  javax.xml.xpath.XPathFactory newInstance(java.lang.String uri, java.lang.String factoryClassName, java.lang.ClassLoader classLoader) throws javax.xml.xpath.XPathFactoryConfigurationException { throw new RuntimeException("Stub!"); }
public abstract  boolean isObjectModelSupported(java.lang.String objectModel);
public abstract  void setFeature(java.lang.String name, boolean value) throws javax.xml.xpath.XPathFactoryConfigurationException;
public abstract  boolean getFeature(java.lang.String name) throws javax.xml.xpath.XPathFactoryConfigurationException;
public abstract  void setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver resolver);
public abstract  void setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver resolver);
public abstract  javax.xml.xpath.XPath newXPath();
public static final java.lang.String DEFAULT_PROPERTY_NAME = "javax.xml.xpath.XPathFactory";
public static final java.lang.String DEFAULT_OBJECT_MODEL_URI = "http://java.sun.com/jaxp/xpath/dom";
}
