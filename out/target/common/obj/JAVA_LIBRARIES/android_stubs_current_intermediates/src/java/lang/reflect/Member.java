package java.lang.reflect;
public interface Member
{
public abstract  java.lang.Class<?> getDeclaringClass();
public abstract  int getModifiers();
public abstract  java.lang.String getName();
public abstract  boolean isSynthetic();
public static final int PUBLIC = 0;
public static final int DECLARED = 1;
}
