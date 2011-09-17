package org.apache.http.message;
public class BasicLineParser
  implements org.apache.http.message.LineParser
{
public  BasicLineParser(org.apache.http.ProtocolVersion proto) { throw new RuntimeException("Stub!"); }
public  BasicLineParser() { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.ProtocolVersion parseProtocolVersion(java.lang.String value, org.apache.http.message.LineParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.ProtocolVersion parseProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.ProtocolVersion createProtocolVersion(int major, int minor) { throw new RuntimeException("Stub!"); }
public  boolean hasProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.RequestLine parseRequestLine(java.lang.String value, org.apache.http.message.LineParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.RequestLine parseRequestLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.RequestLine createRequestLine(java.lang.String method, java.lang.String uri, org.apache.http.ProtocolVersion ver) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.StatusLine parseStatusLine(java.lang.String value, org.apache.http.message.LineParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.StatusLine parseStatusLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  org.apache.http.StatusLine createStatusLine(org.apache.http.ProtocolVersion ver, int status, java.lang.String reason) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.Header parseHeader(java.lang.String value, org.apache.http.message.LineParser parser) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header parseHeader(org.apache.http.util.CharArrayBuffer buffer) throws org.apache.http.ParseException { throw new RuntimeException("Stub!"); }
protected  void skipWhitespace(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.message.ParserCursor cursor) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.message.BasicLineParser DEFAULT;
protected final org.apache.http.ProtocolVersion protocol;
static { DEFAULT = null; }
}
