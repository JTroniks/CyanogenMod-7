package org.apache.http.message;
public interface HeaderValueParser
{
public abstract  org.apache.http.HeaderElement[] parseElements(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException;
public abstract  org.apache.http.HeaderElement parseHeaderElement(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException;
public abstract  org.apache.http.NameValuePair[] parseParameters(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException;
public abstract  org.apache.http.NameValuePair parseNameValuePair(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException;
}
