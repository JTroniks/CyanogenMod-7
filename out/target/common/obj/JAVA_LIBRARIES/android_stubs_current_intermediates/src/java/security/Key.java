package java.security;
public interface Key
  extends java.io.Serializable
{
public abstract  java.lang.String getAlgorithm();
public abstract  java.lang.String getFormat();
public abstract  byte[] getEncoded();
public static final long serialVersionUID = 6603384152749567654L;
}
