package org.apache.http;
public interface TokenIterator
  extends java.util.Iterator
{
public abstract  boolean hasNext();
public abstract  java.lang.String nextToken();
}
