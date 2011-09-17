package java.io;
public interface Externalizable
  extends java.io.Serializable
{
public abstract  void readExternal(java.io.ObjectInput input) throws java.io.IOException, java.lang.ClassNotFoundException;
public abstract  void writeExternal(java.io.ObjectOutput output) throws java.io.IOException;
}
