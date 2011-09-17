package org.w3c.dom.ls;
public interface LSInput
{
public abstract  java.io.Reader getCharacterStream();
public abstract  void setCharacterStream(java.io.Reader characterStream);
public abstract  java.io.InputStream getByteStream();
public abstract  void setByteStream(java.io.InputStream byteStream);
public abstract  java.lang.String getStringData();
public abstract  void setStringData(java.lang.String stringData);
public abstract  java.lang.String getSystemId();
public abstract  void setSystemId(java.lang.String systemId);
public abstract  java.lang.String getPublicId();
public abstract  void setPublicId(java.lang.String publicId);
public abstract  java.lang.String getBaseURI();
public abstract  void setBaseURI(java.lang.String baseURI);
public abstract  java.lang.String getEncoding();
public abstract  void setEncoding(java.lang.String encoding);
public abstract  boolean getCertifiedText();
public abstract  void setCertifiedText(boolean certifiedText);
}
