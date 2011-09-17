package org.apache.http;
public interface HeaderElementIterator
  extends java.util.Iterator
{
public abstract  boolean hasNext();
public abstract  org.apache.http.HeaderElement nextElement();
}
