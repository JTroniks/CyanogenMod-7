package java.lang.reflect;
public interface AnnotatedElement
{
public abstract <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> annotationType);
public abstract  java.lang.annotation.Annotation[] getAnnotations();
public abstract  java.lang.annotation.Annotation[] getDeclaredAnnotations();
public abstract  boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> annotationType);
}
