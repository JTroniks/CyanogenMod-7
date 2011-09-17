package org.apache.http.message;
public interface LineParser
{
public abstract  org.apache.http.ProtocolVersion parseProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException;
public abstract  boolean hasProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor);
public abstract  org.apache.http.RequestLine parseRequestLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException;
public abstract  org.apache.http.StatusLine parseStatusLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException;
public abstract  org.apache.http.Header parseHeader(org.apache.http.util.CharArrayBuffer buffer) throws org.apache.http.ParseException;
}
