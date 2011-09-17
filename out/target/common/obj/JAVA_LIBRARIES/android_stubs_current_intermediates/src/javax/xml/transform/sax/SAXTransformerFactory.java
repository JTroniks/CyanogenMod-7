package javax.xml.transform.sax;
public abstract class SAXTransformerFactory
  extends javax.xml.transform.TransformerFactory
{
protected  SAXTransformerFactory() { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.transform.sax.TransformerHandler newTransformerHandler(javax.xml.transform.Source src) throws javax.xml.transform.TransformerConfigurationException;
public abstract  javax.xml.transform.sax.TransformerHandler newTransformerHandler(javax.xml.transform.Templates templates) throws javax.xml.transform.TransformerConfigurationException;
public abstract  javax.xml.transform.sax.TransformerHandler newTransformerHandler() throws javax.xml.transform.TransformerConfigurationException;
public abstract  javax.xml.transform.sax.TemplatesHandler newTemplatesHandler() throws javax.xml.transform.TransformerConfigurationException;
public abstract  org.xml.sax.XMLFilter newXMLFilter(javax.xml.transform.Source src) throws javax.xml.transform.TransformerConfigurationException;
public abstract  org.xml.sax.XMLFilter newXMLFilter(javax.xml.transform.Templates templates) throws javax.xml.transform.TransformerConfigurationException;
public static final java.lang.String FEATURE = "http://javax.xml.transform.sax.SAXTransformerFactory/feature";
public static final java.lang.String FEATURE_XMLFILTER = "http://javax.xml.transform.sax.SAXTransformerFactory/feature/xmlfilter";
}
