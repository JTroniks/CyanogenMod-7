package org.apache.http.message;
public interface HeaderValueFormatter
{
public abstract  org.apache.http.util.CharArrayBuffer formatElements(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.HeaderElement[] elems, boolean quote);
public abstract  org.apache.http.util.CharArrayBuffer formatHeaderElement(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.HeaderElement elem, boolean quote);
public abstract  org.apache.http.util.CharArrayBuffer formatParameters(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.NameValuePair[] nvps, boolean quote);
public abstract  org.apache.http.util.CharArrayBuffer formatNameValuePair(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.NameValuePair nvp, boolean quote);
}
