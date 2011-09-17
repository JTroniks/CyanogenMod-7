package org.apache.http.impl.io;
public abstract class AbstractMessageParser
  implements org.apache.http.io.HttpMessageParser
{
public  AbstractMessageParser(org.apache.http.io.SessionInputBuffer buffer, org.apache.http.message.LineParser parser, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
public static  org.apache.http.Header[] parseHeaders(org.apache.http.io.SessionInputBuffer inbuffer, int maxHeaderCount, int maxLineLen, org.apache.http.message.LineParser parser) throws org.apache.http.HttpException, java.io.IOException { throw new RuntimeException("Stub!"); }
protected abstract  org.apache.http.HttpMessage parseHead(org.apache.http.io.SessionInputBuffer sessionBuffer) throws java.io.IOException, org.apache.http.HttpException, org.apache.http.ParseException;
public  org.apache.http.HttpMessage parse() throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected final org.apache.http.message.LineParser lineParser;
}
