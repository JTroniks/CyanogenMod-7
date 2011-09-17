package java.io;
public class ObjectInputStream
  extends java.io.InputStream
  implements java.io.ObjectInput, java.io.ObjectStreamConstants
{
public abstract static class GetField
{
public  GetField() { throw new RuntimeException("Stub!"); }
public abstract  java.io.ObjectStreamClass getObjectStreamClass();
public abstract  boolean defaulted(java.lang.String name) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  boolean get(java.lang.String name, boolean defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  char get(java.lang.String name, char defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  byte get(java.lang.String name, byte defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  short get(java.lang.String name, short defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  int get(java.lang.String name, int defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  long get(java.lang.String name, long defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  float get(java.lang.String name, float defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  double get(java.lang.String name, double defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
public abstract  java.lang.Object get(java.lang.String name, java.lang.Object defaultValue) throws java.io.IOException, java.lang.IllegalArgumentException;
}
protected  ObjectInputStream() throws java.io.IOException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  ObjectInputStream(java.io.InputStream input) throws java.io.StreamCorruptedException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  int available() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void defaultReadObject() throws java.io.IOException, java.lang.ClassNotFoundException, java.io.NotActiveException { throw new RuntimeException("Stub!"); }
protected  boolean enableResolveObject(boolean enable) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer, int offset, int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean readBoolean() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  byte readByte() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  char readChar() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  double readDouble() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.ObjectInputStream.GetField readFields() throws java.io.IOException, java.lang.ClassNotFoundException, java.io.NotActiveException { throw new RuntimeException("Stub!"); }
public  float readFloat() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void readFully(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void readFully(byte[] buffer, int offset, int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int readInt() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String readLine() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long readLong() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  java.io.ObjectStreamClass readClassDescriptor() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> resolveProxyClass(java.lang.String[] interfaceNames) throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object readObject() throws java.io.OptionalDataException, java.lang.ClassNotFoundException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Object readUnshared() throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readObjectOverride() throws java.io.OptionalDataException, java.lang.ClassNotFoundException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  short readShort() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void readStreamHeader() throws java.io.IOException, java.io.StreamCorruptedException { throw new RuntimeException("Stub!"); }
public  int readUnsignedByte() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int readUnsignedShort() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String readUTF() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void registerValidation(java.io.ObjectInputValidation object, int priority) throws java.io.NotActiveException, java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> resolveClass(java.io.ObjectStreamClass osClass) throws java.io.IOException, java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  java.lang.Object resolveObject(java.lang.Object object) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int skipBytes(int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
