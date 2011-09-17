package java.util.regex;
public interface MatchResult
{
public abstract  int end();
public abstract  int end(int group);
public abstract  java.lang.String group();
public abstract  java.lang.String group(int group);
public abstract  int groupCount();
public abstract  int start();
public abstract  int start(int group);
}
