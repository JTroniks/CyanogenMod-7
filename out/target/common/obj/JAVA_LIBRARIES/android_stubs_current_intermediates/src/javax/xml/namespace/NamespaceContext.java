package javax.xml.namespace;
public interface NamespaceContext
{
public abstract  java.lang.String getNamespaceURI(java.lang.String prefix);
public abstract  java.lang.String getPrefix(java.lang.String namespaceURI);
public abstract  java.util.Iterator getPrefixes(java.lang.String namespaceURI);
}
