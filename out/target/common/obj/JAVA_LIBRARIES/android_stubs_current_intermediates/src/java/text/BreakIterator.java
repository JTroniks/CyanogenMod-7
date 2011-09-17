package java.text;
public abstract class BreakIterator
  implements java.lang.Cloneable
{
protected  BreakIterator() { throw new RuntimeException("Stub!"); }
public static  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getCharacterInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getCharacterInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getLineInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getLineInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getSentenceInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getSentenceInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getWordInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getWordInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public  boolean isBoundary(int offset) { throw new RuntimeException("Stub!"); }
public  int preceding(int offset) { throw new RuntimeException("Stub!"); }
public  void setText(java.lang.String newText) { throw new RuntimeException("Stub!"); }
public abstract  int current();
public abstract  int first();
public abstract  int following(int offset);
public abstract  java.text.CharacterIterator getText();
public abstract  int last();
public abstract  int next();
public abstract  int next(int n);
public abstract  int previous();
public abstract  void setText(java.text.CharacterIterator newText);
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public static final int DONE = -1;
}
