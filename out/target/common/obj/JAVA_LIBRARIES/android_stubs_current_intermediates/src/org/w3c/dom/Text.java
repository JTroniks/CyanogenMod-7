package org.w3c.dom;
public interface Text
  extends org.w3c.dom.CharacterData
{
public abstract  org.w3c.dom.Text splitText(int offset) throws org.w3c.dom.DOMException;
public abstract  boolean isElementContentWhitespace();
public abstract  java.lang.String getWholeText();
public abstract  org.w3c.dom.Text replaceWholeText(java.lang.String content) throws org.w3c.dom.DOMException;
}
