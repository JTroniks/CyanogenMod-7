package org.w3c.dom;
public interface CharacterData
  extends org.w3c.dom.Node
{
public abstract  java.lang.String getData() throws org.w3c.dom.DOMException;
public abstract  void setData(java.lang.String data) throws org.w3c.dom.DOMException;
public abstract  int getLength();
public abstract  java.lang.String substringData(int offset, int count) throws org.w3c.dom.DOMException;
public abstract  void appendData(java.lang.String arg) throws org.w3c.dom.DOMException;
public abstract  void insertData(int offset, java.lang.String arg) throws org.w3c.dom.DOMException;
public abstract  void deleteData(int offset, int count) throws org.w3c.dom.DOMException;
public abstract  void replaceData(int offset, int count, java.lang.String arg) throws org.w3c.dom.DOMException;
}
