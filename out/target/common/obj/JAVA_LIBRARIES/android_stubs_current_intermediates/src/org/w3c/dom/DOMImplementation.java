package org.w3c.dom;
public interface DOMImplementation
{
public abstract  boolean hasFeature(java.lang.String feature, java.lang.String version);
public abstract  org.w3c.dom.DocumentType createDocumentType(java.lang.String qualifiedName, java.lang.String publicId, java.lang.String systemId) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Document createDocument(java.lang.String namespaceURI, java.lang.String qualifiedName, org.w3c.dom.DocumentType doctype) throws org.w3c.dom.DOMException;
public abstract  java.lang.Object getFeature(java.lang.String feature, java.lang.String version);
}
