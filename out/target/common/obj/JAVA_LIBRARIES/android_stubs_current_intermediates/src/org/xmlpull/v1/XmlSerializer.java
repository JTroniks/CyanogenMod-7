package org.xmlpull.v1;
public interface XmlSerializer
{
public abstract  void setFeature(java.lang.String name, boolean state) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  boolean getFeature(java.lang.String name);
public abstract  void setProperty(java.lang.String name, java.lang.Object value) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  java.lang.Object getProperty(java.lang.String name);
public abstract  void setOutput(java.io.OutputStream os, java.lang.String encoding) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void setOutput(java.io.Writer writer) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void startDocument(java.lang.String encoding, java.lang.Boolean standalone) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void endDocument() throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void setPrefix(java.lang.String prefix, java.lang.String namespace) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  java.lang.String getPrefix(java.lang.String namespace, boolean generatePrefix) throws java.lang.IllegalArgumentException;
public abstract  int getDepth();
public abstract  java.lang.String getNamespace();
public abstract  java.lang.String getName();
public abstract  org.xmlpull.v1.XmlSerializer startTag(java.lang.String namespace, java.lang.String name) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  org.xmlpull.v1.XmlSerializer attribute(java.lang.String namespace, java.lang.String name, java.lang.String value) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  org.xmlpull.v1.XmlSerializer endTag(java.lang.String namespace, java.lang.String name) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  org.xmlpull.v1.XmlSerializer text(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  org.xmlpull.v1.XmlSerializer text(char[] buf, int start, int len) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void cdsect(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void entityRef(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void processingInstruction(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void comment(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void docdecl(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void ignorableWhitespace(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
public abstract  void flush() throws java.io.IOException;
}
