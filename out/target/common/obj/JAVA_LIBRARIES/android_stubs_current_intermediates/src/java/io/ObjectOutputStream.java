package java.io;
public class ObjectOutputStream
  extends java.io.OutputStream
  implements java.io.ObjectOutput, java.io.ObjectStreamConstants
{
public abstract static class PutField
{
public  PutField() { throw new RuntimeException("Stub!"); }
public abstract  void put(java.lang.String name, boolean value);
public abstract  void put(java.lang.String name, char value);
public abstract  void put(java.lang.String name, byte value);
public abstract  void put(java.lang.String name, short value);
public abstract  void put(java.lang.String name, int value);
public abstract  void put(java.lang.String name, long value);
public abstract  void put(java.lang.String name, float value);
public abstract  void put(java.lang.String name, double value);
public abstract  void put(java.lang.String name, java.lang.Object value);
public abstract  void write(java.io.ObjectOutput out) throws java.io.IOException;
}
protected  ObjectOutputStream() throws java.io.IOException, java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  ObjectOutputStream(java.io.OutputStream output) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void annotateClass(java.lang.Class<?> aClass) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void annotateProxyClass(java.lang.Class<?> aClass) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void defaultWriteObject() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void drain() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  boolean enableReplaceObject(boolean enable) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.ObjectOutputStream.PutField putFields() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  java.lang.Object replaceObject(java.lang.Object object) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void reset() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void useProtocolVersion(int version) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer, int offset, int length) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeBoolean(boolean value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeByte(int value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeBytes(java.lang.String value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeChar(int value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeChars(java.lang.String value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeDouble(double value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeFields() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeFloat(float value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeInt(int value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeLong(long value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void writeClassDescriptor(java.io.ObjectStreamClass classDesc) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeObject(java.lang.Object object) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeUnshared(java.lang.Object object) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void writeObjectOverride(java.lang.Object object) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeShort(int value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void writeStreamHeader() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void writeUTF(java.lang.String value) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
