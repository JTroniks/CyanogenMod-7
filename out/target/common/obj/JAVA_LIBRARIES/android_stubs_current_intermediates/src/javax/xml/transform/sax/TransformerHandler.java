package javax.xml.transform.sax;
public interface TransformerHandler
  extends org.xml.sax.ContentHandler, org.xml.sax.ext.LexicalHandler, org.xml.sax.DTDHandler
{
public abstract  void setResult(javax.xml.transform.Result result) throws java.lang.IllegalArgumentException;
public abstract  void setSystemId(java.lang.String systemID);
public abstract  java.lang.String getSystemId();
public abstract  javax.xml.transform.Transformer getTransformer();
}
