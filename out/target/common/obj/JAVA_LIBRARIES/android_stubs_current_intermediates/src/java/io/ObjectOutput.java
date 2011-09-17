package java.io;
public interface ObjectOutput
  extends java.io.DataOutput
{
public abstract  void close() throws java.io.IOException;
public abstract  void flush() throws java.io.IOException;
public abstract  void write(byte[] buffer) throws java.io.IOException;
public abstract  void write(byte[] buffer, int offset, int count) throws java.io.IOException;
public abstract  void write(int value) throws java.io.IOException;
public abstract  void writeObject(java.lang.Object obj) throws java.io.IOException;
}
