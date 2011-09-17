package org.w3c.dom;
public interface Document
  extends org.w3c.dom.Node
{
public abstract  org.w3c.dom.DocumentType getDoctype();
public abstract  org.w3c.dom.DOMImplementation getImplementation();
public abstract  org.w3c.dom.Element getDocumentElement();
public abstract  org.w3c.dom.Element createElement(java.lang.String tagName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.DocumentFragment createDocumentFragment();
public abstract  org.w3c.dom.Text createTextNode(java.lang.String data);
public abstract  org.w3c.dom.Comment createComment(java.lang.String data);
public abstract  org.w3c.dom.CDATASection createCDATASection(java.lang.String data) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.ProcessingInstruction createProcessingInstruction(java.lang.String target, java.lang.String data) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Attr createAttribute(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.EntityReference createEntityReference(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.NodeList getElementsByTagName(java.lang.String tagname);
public abstract  org.w3c.dom.Node importNode(org.w3c.dom.Node importedNode, boolean deep) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Element createElementNS(java.lang.String namespaceURI, java.lang.String qualifiedName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Attr createAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName);
public abstract  org.w3c.dom.Element getElementById(java.lang.String elementId);
public abstract  java.lang.String getInputEncoding();
public abstract  java.lang.String getXmlEncoding();
public abstract  boolean getXmlStandalone();
public abstract  void setXmlStandalone(boolean xmlStandalone) throws org.w3c.dom.DOMException;
public abstract  java.lang.String getXmlVersion();
public abstract  void setXmlVersion(java.lang.String xmlVersion) throws org.w3c.dom.DOMException;
public abstract  boolean getStrictErrorChecking();
public abstract  void setStrictErrorChecking(boolean strictErrorChecking);
public abstract  java.lang.String getDocumentURI();
public abstract  void setDocumentURI(java.lang.String documentURI);
public abstract  org.w3c.dom.Node adoptNode(org.w3c.dom.Node source) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.DOMConfiguration getDomConfig();
public abstract  void normalizeDocument();
public abstract  org.w3c.dom.Node renameNode(org.w3c.dom.Node n, java.lang.String namespaceURI, java.lang.String qualifiedName) throws org.w3c.dom.DOMException;
}
