package org.w3c.dom;
public interface NameList
{
public abstract  java.lang.String getName(int index);
public abstract  java.lang.String getNamespaceURI(int index);
public abstract  int getLength();
public abstract  boolean contains(java.lang.String str);
public abstract  boolean containsNS(java.lang.String namespaceURI, java.lang.String name);
}
