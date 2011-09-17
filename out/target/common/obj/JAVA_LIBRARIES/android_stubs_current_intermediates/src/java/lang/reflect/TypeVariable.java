package java.lang.reflect;
public interface TypeVariable<D extends java.lang.reflect.GenericDeclaration>
  extends java.lang.reflect.Type
{
public abstract  java.lang.reflect.Type[] getBounds();
public abstract  D getGenericDeclaration();
public abstract  java.lang.String getName();
}
