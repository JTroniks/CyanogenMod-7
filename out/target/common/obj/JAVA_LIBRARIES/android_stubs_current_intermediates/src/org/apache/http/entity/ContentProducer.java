package org.apache.http.entity;
public interface ContentProducer
{
public abstract  void writeTo(java.io.OutputStream outstream) throws java.io.IOException;
}
