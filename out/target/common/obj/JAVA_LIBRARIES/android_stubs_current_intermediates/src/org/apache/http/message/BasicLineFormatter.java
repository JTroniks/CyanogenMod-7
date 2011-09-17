package org.apache.http.message;
public class BasicLineFormatter
  implements org.apache.http.message.LineFormatter
{
public  BasicLineFormatter() { throw new RuntimeException("Stub!"); }
protected  org.apache.http.util.CharArrayBuffer initBuffer(org.apache.http.util.CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatProtocolVersion(org.apache.http.ProtocolVersion version, org.apache.http.message.LineFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer appendProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.ProtocolVersion version) { throw new RuntimeException("Stub!"); }
protected  int estimateProtocolVersionLen(org.apache.http.ProtocolVersion version) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatRequestLine(org.apache.http.RequestLine reqline, org.apache.http.message.LineFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatRequestLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.RequestLine reqline) { throw new RuntimeException("Stub!"); }
protected  void doFormatRequestLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.RequestLine reqline) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatStatusLine(org.apache.http.StatusLine statline, org.apache.http.message.LineFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatStatusLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.StatusLine statline) { throw new RuntimeException("Stub!"); }
protected  void doFormatStatusLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.StatusLine statline) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatHeader(org.apache.http.Header header, org.apache.http.message.LineFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatHeader(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
protected  void doFormatHeader(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.Header header) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.message.BasicLineFormatter DEFAULT;
static { DEFAULT = null; }
}
