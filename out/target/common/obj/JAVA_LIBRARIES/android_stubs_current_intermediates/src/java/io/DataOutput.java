package java.io;
public interface DataOutput
{
public abstract  void write(byte[] buffer) throws java.io.IOException;
public abstract  void write(byte[] buffer, int offset, int count) throws java.io.IOException;
public abstract  void write(int oneByte) throws java.io.IOException;
public abstract  void writeBoolean(boolean val) throws java.io.IOException;
public abstract  void writeByte(int val) throws java.io.IOException;
public abstract  void writeBytes(java.lang.String str) throws java.io.IOException;
public abstract  void writeChar(int val) throws java.io.IOException;
public abstract  void writeChars(java.lang.String str) throws java.io.IOException;
public abstract  void writeDouble(double val) throws java.io.IOException;
public abstract  void writeFloat(float val) throws java.io.IOException;
public abstract  void writeInt(int val) throws java.io.IOException;
public abstract  void writeLong(long val) throws java.io.IOException;
public abstract  void writeShort(int val) throws java.io.IOException;
public abstract  void writeUTF(java.lang.String str) throws java.io.IOException;
}
