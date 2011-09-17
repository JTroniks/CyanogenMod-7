package org.xml.sax;
public interface XMLFilter
  extends org.xml.sax.XMLReader
{
public abstract  void setParent(org.xml.sax.XMLReader parent);
public abstract  org.xml.sax.XMLReader getParent();
}
