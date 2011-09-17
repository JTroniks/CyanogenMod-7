package org.w3c.dom;
public interface DOMConfiguration
{
public abstract  void setParameter(java.lang.String name, java.lang.Object value) throws org.w3c.dom.DOMException;
public abstract  java.lang.Object getParameter(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  boolean canSetParameter(java.lang.String name, java.lang.Object value);
public abstract  org.w3c.dom.DOMStringList getParameterNames();
}
