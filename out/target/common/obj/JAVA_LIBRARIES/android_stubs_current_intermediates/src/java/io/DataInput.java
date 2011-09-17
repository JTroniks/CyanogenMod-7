package java.io;
public interface DataInput
{
public abstract  boolean readBoolean() throws java.io.IOException;
public abstract  byte readByte() throws java.io.IOException;
public abstract  char readChar() throws java.io.IOException;
public abstract  double readDouble() throws java.io.IOException;
public abstract  float readFloat() throws java.io.IOException;
public abstract  void readFully(byte[] buffer) throws java.io.IOException;
public abstract  void readFully(byte[] buffer, int offset, int count) throws java.io.IOException;
public abstract  int readInt() throws java.io.IOException;
public abstract  java.lang.String readLine() throws java.io.IOException;
public abstract  long readLong() throws java.io.IOException;
public abstract  short readShort() throws java.io.IOException;
public abstract  int readUnsignedByte() throws java.io.IOException;
public abstract  int readUnsignedShort() throws java.io.IOException;
public abstract  java.lang.String readUTF() throws java.io.IOException;
public abstract  int skipBytes(int count) throws java.io.IOException;
}
