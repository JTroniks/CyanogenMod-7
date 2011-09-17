package org.apache.http.message;
public interface LineFormatter
{
public abstract  org.apache.http.util.CharArrayBuffer appendProtocolVersion(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.ProtocolVersion version);
public abstract  org.apache.http.util.CharArrayBuffer formatRequestLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.RequestLine reqline);
public abstract  org.apache.http.util.CharArrayBuffer formatStatusLine(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.StatusLine statline);
public abstract  org.apache.http.util.CharArrayBuffer formatHeader(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.Header header);
}
