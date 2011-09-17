package org.apache.http.entity;
public class FileEntity
  extends org.apache.http.entity.AbstractHttpEntity
  implements java.lang.Cloneable
{
public  FileEntity(java.io.File file, java.lang.String contentType) { throw new RuntimeException("Stub!"); }
public  boolean isRepeatable() { throw new RuntimeException("Stub!"); }
public  long getContentLength() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeTo(java.io.OutputStream outstream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean isStreaming() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected final java.io.File file;
}
