package java.io;
public class StreamTokenizer
{
public  StreamTokenizer(java.io.InputStream is) { throw new RuntimeException("Stub!"); }
public  StreamTokenizer(java.io.Reader r) { throw new RuntimeException("Stub!"); }
public  void commentChar(int ch) { throw new RuntimeException("Stub!"); }
public  void eolIsSignificant(boolean flag) { throw new RuntimeException("Stub!"); }
public  int lineno() { throw new RuntimeException("Stub!"); }
public  void lowerCaseMode(boolean flag) { throw new RuntimeException("Stub!"); }
public  int nextToken() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void ordinaryChar(int ch) { throw new RuntimeException("Stub!"); }
public  void ordinaryChars(int low, int hi) { throw new RuntimeException("Stub!"); }
public  void parseNumbers() { throw new RuntimeException("Stub!"); }
public  void pushBack() { throw new RuntimeException("Stub!"); }
public  void quoteChar(int ch) { throw new RuntimeException("Stub!"); }
public  void resetSyntax() { throw new RuntimeException("Stub!"); }
public  void slashSlashComments(boolean flag) { throw new RuntimeException("Stub!"); }
public  void slashStarComments(boolean flag) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void whitespaceChars(int low, int hi) { throw new RuntimeException("Stub!"); }
public  void wordChars(int low, int hi) { throw new RuntimeException("Stub!"); }
public double nval;
public java.lang.String sval;
public static final int TT_EOF = -1;
public static final int TT_EOL = 10;
public static final int TT_NUMBER = -2;
public static final int TT_WORD = -3;
public int ttype;
}
