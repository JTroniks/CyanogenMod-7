package java.text;
public interface CharacterIterator
  extends java.lang.Cloneable
{
public abstract  java.lang.Object clone();
public abstract  char current();
public abstract  char first();
public abstract  int getBeginIndex();
public abstract  int getEndIndex();
public abstract  int getIndex();
public abstract  char last();
public abstract  char next();
public abstract  char previous();
public abstract  char setIndex(int location);
public static final char DONE = 65535;
}
