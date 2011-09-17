package java.io;
public class RandomAccessFile
  implements java.io.DataInput, java.io.DataOutput, java.io.Closeable
{
public  RandomAccessFile(java.io.File file, java.lang.String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  RandomAccessFile(java.lang.String fileName, java.lang.String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public  void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public final synchronized  java.nio.channels.FileChannel getChannel() { throw new RuntimeException("Stub!"); }
public final  java.io.FileDescriptor getFD() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long getFilePointer() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long length() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int read(byte[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  boolean readBoolean() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  byte readByte() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  char readChar() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  double readDouble() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  float readFloat() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void readFully(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  void readFully(byte[] buffer, int offset, int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  int readInt() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  java.lang.String readLine() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  long readLong() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  short readShort() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  int readUnsignedByte() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  int readUnsignedShort() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public final  java.lang.String readUTF() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void seek(long offset) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setLength(long newLength) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int skipBytes(int count) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void write(byte[] buffer) throws java.io.IOException { throw new RuntimeException("Stub!"); }
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
}
