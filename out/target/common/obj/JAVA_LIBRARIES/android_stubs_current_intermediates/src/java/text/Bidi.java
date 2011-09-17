package java.text;
public final class Bidi
{
public  Bidi(java.text.AttributedCharacterIterator paragraph) { throw new RuntimeException("Stub!"); }
public  Bidi(char[] text, int textStart, byte[] embeddings, int embStart, int paragraphLength, int flags) { throw new RuntimeException("Stub!"); }
public  Bidi(java.lang.String paragraph, int flags) { throw new RuntimeException("Stub!"); }
public  boolean baseIsLeftToRight() { throw new RuntimeException("Stub!"); }
public  java.text.Bidi createLineBidi(int lineStart, int lineLimit) { throw new RuntimeException("Stub!"); }
public  int getBaseLevel() { throw new RuntimeException("Stub!"); }
public  int getLength() { throw new RuntimeException("Stub!"); }
public  int getLevelAt(int offset) { throw new RuntimeException("Stub!"); }
public  int getRunCount() { throw new RuntimeException("Stub!"); }
public  int getRunLevel(int run) { throw new RuntimeException("Stub!"); }
public  int getRunLimit(int run) { throw new RuntimeException("Stub!"); }
public  int getRunStart(int run) { throw new RuntimeException("Stub!"); }
public  boolean isLeftToRight() { throw new RuntimeException("Stub!"); }
public  boolean isMixed() { throw new RuntimeException("Stub!"); }
public  boolean isRightToLeft() { throw new RuntimeException("Stub!"); }
public static  void reorderVisually(byte[] levels, int levelStart, java.lang.Object[] objects, int objectStart, int count) { throw new RuntimeException("Stub!"); }
public static  boolean requiresBidi(char[] text, int start, int limit) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = -2;
public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = -1;
public static final int DIRECTION_LEFT_TO_RIGHT = 0;
public static final int DIRECTION_RIGHT_TO_LEFT = 1;
}
