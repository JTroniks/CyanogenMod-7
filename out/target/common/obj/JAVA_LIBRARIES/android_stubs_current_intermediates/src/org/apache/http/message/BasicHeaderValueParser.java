package org.apache.http.message;
public class BasicHeaderValueParser
  implements org.apache.http.message.HeaderValueParser
{
public  BasicHeaderValueParser() { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.HeaderElement[] parseElements(java.lang.String value, org.apache.http.message.HeaderValueParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderElement[] parseElements(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.HeaderElement parseHeaderElement(java.lang.String value, org.apache.http.message.HeaderValueParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.HeaderElement parseHeaderElement(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.HeaderElement createHeaderElement(java.lang.String name, java.lang.String value, org.apache.http.NameValuePair[] params) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.NameValuePair[] parseParameters(java.lang.String value, org.apache.http.message.HeaderValueParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.NameValuePair[] parseParameters(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.NameValuePair parseNameValuePair(java.lang.String value, org.apache.http.message.HeaderValueParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.NameValuePair parseNameValuePair(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public  org.apache.http.NameValuePair parseNameValuePair(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor, char[] delimiters) { throw new RuntimeException("Stub!"); }
protected  org.apache.http.NameValuePair createNameValuePair(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.message.BasicHeaderValueParser DEFAULT;
static { DEFAULT = null; }
}
