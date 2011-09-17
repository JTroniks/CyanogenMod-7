package java.lang;
public interface Appendable
{
public abstract  java.lang.Appendable append(char c) throws java.io.IOException;
public abstract  java.lang.Appendable append(java.lang.CharSequence csq) throws java.io.IOException;
public abstract  java.lang.Appendable append(java.lang.CharSequence csq, int start, int end) throws java.io.IOException;
}
