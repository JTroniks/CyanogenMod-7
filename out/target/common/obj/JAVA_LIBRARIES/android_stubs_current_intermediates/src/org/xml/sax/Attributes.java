package org.xml.sax;
public interface Attributes
{
public abstract  int getLength();
public abstract  java.lang.String getURI(int index);
public abstract  java.lang.String getLocalName(int index);
public abstract  java.lang.String getQName(int index);
public abstract  java.lang.String getType(int index);
public abstract  java.lang.String getValue(int index);
public abstract  int getIndex(java.lang.String uri, java.lang.String localName);
public abstract  int getIndex(java.lang.String qName);
public abstract  java.lang.String getType(java.lang.String uri, java.lang.String localName);
public abstract  java.lang.String getType(java.lang.String qName);
public abstract  java.lang.String getValue(java.lang.String uri, java.lang.String localName);
public abstract  java.lang.String getValue(java.lang.String qName);
}
