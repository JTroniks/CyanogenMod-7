package org.apache.http;
public interface HeaderIterator
  extends java.util.Iterator
{
public abstract  boolean hasNext();
public abstract  org.apache.http.Header nextHeader();
}
