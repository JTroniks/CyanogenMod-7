package java.lang;
public final class String
  implements java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.CharSequence
{
public  String() { throw new RuntimeException("Stub!"); }
public  String(byte[] data) { throw new RuntimeException("Stub!"); }
public  String(byte[] data, int high) { throw new RuntimeException("Stub!"); }
public  String(byte[] data, int start, int length) { throw new RuntimeException("Stub!"); }
public  String(byte[] data, int high, int start, int length) { throw new RuntimeException("Stub!"); }
public  String(byte[] data, int start, int length, java.lang.String charsetName) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  String(byte[] data, java.lang.String charsetName) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  String(byte[] data, int start, int length, java.nio.charset.Charset charset) { throw new RuntimeException("Stub!"); }
public  String(byte[] data, java.nio.charset.Charset charset) { throw new RuntimeException("Stub!"); }
public  String(char[] data) { throw new RuntimeException("Stub!"); }
public  String(char[] data, int start, int length) { throw new RuntimeException("Stub!"); }
public  String(java.lang.String toCopy) { throw new RuntimeException("Stub!"); }
public  String(java.lang.StringBuffer stringbuffer) { throw new RuntimeException("Stub!"); }
public  String(int[] codePoints, int offset, int count) { throw new RuntimeException("Stub!"); }
public  String(java.lang.StringBuilder sb) { throw new RuntimeException("Stub!"); }
public  char charAt(int index) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.lang.String string) { throw new RuntimeException("Stub!"); }
public  int compareToIgnoreCase(java.lang.String string) { throw new RuntimeException("Stub!"); }
public  java.lang.String concat(java.lang.String string) { throw new RuntimeException("Stub!"); }
public static  java.lang.String copyValueOf(char[] data) { throw new RuntimeException("Stub!"); }
public static  java.lang.String copyValueOf(char[] data, int start, int length) { throw new RuntimeException("Stub!"); }
public  boolean endsWith(java.lang.String suffix) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  boolean equalsIgnoreCase(java.lang.String string) { throw new RuntimeException("Stub!"); }
public  void getBytes(int start, int end, byte[] data, int index) { throw new RuntimeException("Stub!"); }
public  byte[] getBytes() { throw new RuntimeException("Stub!"); }
public  byte[] getBytes(java.lang.String charsetName) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  byte[] getBytes(java.nio.charset.Charset charset) { throw new RuntimeException("Stub!"); }
public  void getChars(int start, int end, char[] buffer, int index) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int indexOf(int c) { throw new RuntimeException("Stub!"); }
public  int indexOf(int c, int start) { throw new RuntimeException("Stub!"); }
public  int indexOf(java.lang.String string) { throw new RuntimeException("Stub!"); }
public  int indexOf(java.lang.String subString, int start) { throw new RuntimeException("Stub!"); }
public native  java.lang.String intern();
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  int lastIndexOf(int c) { throw new RuntimeException("Stub!"); }
public  int lastIndexOf(int c, int start) { throw new RuntimeException("Stub!"); }
public  int lastIndexOf(java.lang.String string) { throw new RuntimeException("Stub!"); }
public  int lastIndexOf(java.lang.String subString, int start) { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public  boolean regionMatches(int thisStart, java.lang.String string, int start, int length) { throw new RuntimeException("Stub!"); }
public  boolean regionMatches(boolean ignoreCase, int thisStart, java.lang.String string, int start, int length) { throw new RuntimeException("Stub!"); }
public  java.lang.String replace(char oldChar, char newChar) { throw new RuntimeException("Stub!"); }
public  java.lang.String replace(java.lang.CharSequence target, java.lang.CharSequence replacement) { throw new RuntimeException("Stub!"); }
public  boolean startsWith(java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  boolean startsWith(java.lang.String prefix, int start) { throw new RuntimeException("Stub!"); }
public  java.lang.String substring(int start) { throw new RuntimeException("Stub!"); }
public  java.lang.String substring(int start, int end) { throw new RuntimeException("Stub!"); }
public  char[] toCharArray() { throw new RuntimeException("Stub!"); }
public  java.lang.String toLowerCase() { throw new RuntimeException("Stub!"); }
public  java.lang.String toLowerCase(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toUpperCase() { throw new RuntimeException("Stub!"); }
public  java.lang.String toUpperCase(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.lang.String trim() { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(char[] data) { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(char[] data, int start, int length) { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(char value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(double value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(float value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(int value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(long value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(java.lang.Object value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String valueOf(boolean value) { throw new RuntimeException("Stub!"); }
public  boolean contentEquals(java.lang.StringBuffer strbuf) { throw new RuntimeException("Stub!"); }
public  boolean contentEquals(java.lang.CharSequence cs) { throw new RuntimeException("Stub!"); }
public  boolean matches(java.lang.String regularExpression) { throw new RuntimeException("Stub!"); }
public  java.lang.String replaceAll(java.lang.String regularExpression, java.lang.String replacement) { throw new RuntimeException("Stub!"); }
public  java.lang.String replaceFirst(java.lang.String regularExpression, java.lang.String replacement) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] split(java.lang.String regularExpression) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] split(java.lang.String regularExpression, int limit) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence subSequence(int start, int end) { throw new RuntimeException("Stub!"); }
public  int codePointAt(int index) { throw new RuntimeException("Stub!"); }
public  int codePointBefore(int index) { throw new RuntimeException("Stub!"); }
public  int codePointCount(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
public  boolean contains(java.lang.CharSequence cs) { throw new RuntimeException("Stub!"); }
public  int offsetByCodePoints(int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
public static  java.lang.String format(java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public static  java.lang.String format(java.util.Locale locale, java.lang.String format, java.lang.Object... args) { throw new RuntimeException("Stub!"); }
public static final java.util.Comparator<java.lang.String> CASE_INSENSITIVE_ORDER;
static { CASE_INSENSITIVE_ORDER = null; }
}
