package org.w3c.dom.ls;
public interface LSOutput
{
public abstract  java.io.Writer getCharacterStream();
public abstract  void setCharacterStream(java.io.Writer characterStream);
public abstract  java.io.OutputStream getByteStream();
public abstract  void setByteStream(java.io.OutputStream byteStream);
public abstract  java.lang.String getSystemId();
public abstract  void setSystemId(java.lang.String systemId);
public abstract  java.lang.String getEncoding();
public abstract  void setEncoding(java.lang.String encoding);
}
