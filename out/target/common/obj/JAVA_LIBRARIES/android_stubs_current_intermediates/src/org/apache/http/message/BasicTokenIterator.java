package org.apache.http.message;
public class BasicTokenIterator
  implements org.apache.http.TokenIterator
{
public  BasicTokenIterator(org.apache.http.HeaderIterator headerIterator) { throw new RuntimeException("Stub!"); }
public  boolean hasNext() { throw new RuntimeException("Stub!"); }
public  java.lang.String nextToken() throws java.util.NoSuchElementException, org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object next() throws java.util.NoSuchElementException, org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public final  void remove() throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
protected  int findNext(int from) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  java.lang.String createToken(java.lang.String value, int start, int end) { throw new RuntimeException("Stub!"); }
protected  int findTokenStart(int from) { throw new RuntimeException("Stub!"); }
protected  int findTokenSeparator(int from) { throw new RuntimeException("Stub!"); }
protected  int findTokenEnd(int from) { throw new RuntimeException("Stub!"); }
protected  boolean isTokenSeparator(char ch) { throw new RuntimeException("Stub!"); }
protected  boolean isWhitespace(char ch) { throw new RuntimeException("Stub!"); }
protected  boolean isTokenChar(char ch) { throw new RuntimeException("Stub!"); }
protected  boolean isHttpSeparator(char ch) { throw new RuntimeException("Stub!"); }
public static final java.lang.String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
protected final org.apache.http.HeaderIterator headerIt;
protected java.lang.String currentHeader;
protected java.lang.String currentToken;
protected int searchPos;
}
