package javax.xml.xpath;
public interface XPathExpression
{
public abstract  java.lang.Object evaluate(java.lang.Object item, javax.xml.namespace.QName returnType) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.String evaluate(java.lang.Object item) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.Object evaluate(org.xml.sax.InputSource source, javax.xml.namespace.QName returnType) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.String evaluate(org.xml.sax.InputSource source) throws javax.xml.xpath.XPathExpressionException;
}
