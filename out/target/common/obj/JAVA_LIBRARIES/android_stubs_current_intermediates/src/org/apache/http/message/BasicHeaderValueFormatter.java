package org.apache.http.message;
public class BasicHeaderValueFormatter
  implements org.apache.http.message.HeaderValueFormatter
{
public  BasicHeaderValueFormatter() { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatElements(org.apache.http.HeaderElement[] elems, boolean quote, org.apache.http.message.HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatElements(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.HeaderElement[] elems, boolean quote) { throw new RuntimeException("Stub!"); }
protected  int estimateElementsLen(org.apache.http.HeaderElement[] elems) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatHeaderElement(org.apache.http.HeaderElement elem, boolean quote, org.apache.http.message.HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatHeaderElement(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.HeaderElement elem, boolean quote) { throw new RuntimeException("Stub!"); }
protected  int estimateHeaderElementLen(org.apache.http.HeaderElement elem) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatParameters(org.apache.http.NameValuePair[] nvps, boolean quote, org.apache.http.message.HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatParameters(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.NameValuePair[] nvps, boolean quote) { throw new RuntimeException("Stub!"); }
protected  int estimateParametersLen(org.apache.http.NameValuePair[] nvps) { throw new RuntimeException("Stub!"); }
public static final  java.lang.String formatNameValuePair(org.apache.http.NameValuePair nvp, boolean quote, org.apache.http.message.HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); }
public  org.apache.http.util.CharArrayBuffer formatNameValuePair(org.apache.http.util.CharArrayBuffer buffer, org.apache.http.NameValuePair nvp, boolean quote) { throw new RuntimeException("Stub!"); }
protected  int estimateNameValuePairLen(org.apache.http.NameValuePair nvp) { throw new RuntimeException("Stub!"); }
protected  void doFormatValue(org.apache.http.util.CharArrayBuffer buffer, java.lang.String value, boolean quote) { throw new RuntimeException("Stub!"); }
protected  boolean isSeparator(char ch) { throw new RuntimeException("Stub!"); }
protected  boolean isUnsafe(char ch) { throw new RuntimeException("Stub!"); }
public static final org.apache.http.message.BasicHeaderValueFormatter DEFAULT;
public static final java.lang.String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
public static final java.lang.String UNSAFE_CHARS = "\"\\";
static { DEFAULT = null; }
}
