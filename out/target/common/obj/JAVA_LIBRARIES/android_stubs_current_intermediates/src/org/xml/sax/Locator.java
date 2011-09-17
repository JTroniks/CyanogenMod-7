package org.xml.sax;
public interface Locator
{
public abstract  java.lang.String getPublicId();
public abstract  java.lang.String getSystemId();
public abstract  int getLineNumber();
public abstract  int getColumnNumber();
}
