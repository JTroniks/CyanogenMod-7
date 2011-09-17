package java.lang.annotation;
public interface Annotation
{
public abstract  java.lang.Class<? extends java.lang.annotation.Annotation> annotationType();
public abstract  boolean equals(java.lang.Object obj);
public abstract  int hashCode();
public abstract  java.lang.String toString();
}
