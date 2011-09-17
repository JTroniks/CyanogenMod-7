package java.security;
public class KeyRep
  implements java.io.Serializable
{
public static enum Type
{
PRIVATE(),
PUBLIC(),
SECRET();
}
public  KeyRep(java.security.KeyRep.Type type, java.lang.String algorithm, java.lang.String format, byte[] encoded) { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.ObjectStreamException { throw new RuntimeException("Stub!"); }
}
