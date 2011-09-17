package javax.xml.transform;
public interface ErrorListener
{
public abstract  void warning(javax.xml.transform.TransformerException exception) throws javax.xml.transform.TransformerException;
public abstract  void error(javax.xml.transform.TransformerException exception) throws javax.xml.transform.TransformerException;
public abstract  void fatalError(javax.xml.transform.TransformerException exception) throws javax.xml.transform.TransformerException;
}
