package org.w3c.dom.ls;
public interface LSSerializer
{
public abstract  org.w3c.dom.DOMConfiguration getDomConfig();
public abstract  java.lang.String getNewLine();
public abstract  void setNewLine(java.lang.String newLine);
public abstract  boolean write(org.w3c.dom.Node nodeArg, org.w3c.dom.ls.LSOutput destination) throws org.w3c.dom.ls.LSException;
public abstract  boolean writeToURI(org.w3c.dom.Node nodeArg, java.lang.String uri) throws org.w3c.dom.ls.LSException;
public abstract  java.lang.String writeToString(org.w3c.dom.Node nodeArg) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException;
}
