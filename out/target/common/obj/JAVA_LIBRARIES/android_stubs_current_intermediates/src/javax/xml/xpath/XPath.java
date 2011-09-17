package javax.xml.xpath;
public interface XPath
{
public abstract  void reset();
public abstract  void setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver resolver);
public abstract  javax.xml.xpath.XPathVariableResolver getXPathVariableResolver();
public abstract  void setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver resolver);
public abstract  javax.xml.xpath.XPathFunctionResolver getXPathFunctionResolver();
public abstract  void setNamespaceContext(javax.xml.namespace.NamespaceContext nsContext);
public abstract  javax.xml.namespace.NamespaceContext getNamespaceContext();
public abstract  javax.xml.xpath.XPathExpression compile(java.lang.String expression) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.Object evaluate(java.lang.String expression, java.lang.Object item, javax.xml.namespace.QName returnType) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.String evaluate(java.lang.String expression, java.lang.Object item) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.Object evaluate(java.lang.String expression, org.xml.sax.InputSource source, javax.xml.namespace.QName returnType) throws javax.xml.xpath.XPathExpressionException;
public abstract  java.lang.String evaluate(java.lang.String expression, org.xml.sax.InputSource source) throws javax.xml.xpath.XPathExpressionException;
}
