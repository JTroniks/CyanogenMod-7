package java.nio.charset;
public class CoderResult
{
CoderResult() { throw new RuntimeException("Stub!"); }
public static synchronized  java.nio.charset.CoderResult malformedForLength(int length) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public static synchronized  java.nio.charset.CoderResult unmappableForLength(int length) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  boolean isUnderflow() { throw new RuntimeException("Stub!"); }
public  boolean isError() { throw new RuntimeException("Stub!"); }
public  boolean isMalformed() { throw new RuntimeException("Stub!"); }
public  boolean isOverflow() { throw new RuntimeException("Stub!"); }
public  boolean isUnmappable() { throw new RuntimeException("Stub!"); }
public  int length() throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void throwException() throws java.nio.BufferUnderflowException, java.nio.BufferOverflowException, java.nio.charset.UnmappableCharacterException, java.nio.charset.MalformedInputException, java.nio.charset.CharacterCodingException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final java.nio.charset.CoderResult UNDERFLOW;
public static final java.nio.charset.CoderResult OVERFLOW;
static { UNDERFLOW = null; OVERFLOW = null; }
}
