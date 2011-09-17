package java.io;
public class DataOutputStream
  extends java.io.FilterOutputStream
  implements java.io.DataOutput
{
public  DataOutputStream(java.io.OutputStream out) { super((java.io.OutputStream)null); throw new RuntimeException("Stub!"); }
public  void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  int size() { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(int oneByte) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeBoolean(boolean val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeByte(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeBytes(java.lang.String str) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeChar(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeChars(java.lang.String str) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeDouble(double val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeFloat(float val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeInt(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeLong(long val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeShort(int val) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void writeUTF(java.lang.String str) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected int written;
}
