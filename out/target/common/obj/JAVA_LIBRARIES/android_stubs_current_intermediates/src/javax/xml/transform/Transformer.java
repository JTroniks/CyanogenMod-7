package javax.xml.transform;
public abstract class Transformer
{
protected  Transformer() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public abstract  void transform(javax.xml.transform.Source xmlSource, javax.xml.transform.Result outputTarget) throws javax.xml.transform.TransformerException;
public abstract  void setParameter(java.lang.String name, java.lang.Object value);
public abstract  java.lang.Object getParameter(java.lang.String name);
public abstract  void clearParameters();
public abstract  void setURIResolver(javax.xml.transform.URIResolver resolver);
public abstract  javax.xml.transform.URIResolver getURIResolver();
public abstract  void setOutputProperties(java.util.Properties oformat);
public abstract  java.util.Properties getOutputProperties();
public abstract  void setOutputProperty(java.lang.String name, java.lang.String value) throws java.lang.IllegalArgumentException;
public abstract  java.lang.String getOutputProperty(java.lang.String name) throws java.lang.IllegalArgumentException;
public abstract  void setErrorListener(javax.xml.transform.ErrorListener listener) throws java.lang.IllegalArgumentException;
public abstract  javax.xml.transform.ErrorListener getErrorListener();
}
