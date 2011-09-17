package java.sql;
public interface Blob
{
public abstract  java.io.InputStream getBinaryStream() throws java.sql.SQLException;
public abstract  java.io.InputStream getBinaryStream(long pos, long length) throws java.sql.SQLException;
public abstract  byte[] getBytes(long pos, int length) throws java.sql.SQLException;
public abstract  long length() throws java.sql.SQLException;
public abstract  long position(java.sql.Blob pattern, long start) throws java.sql.SQLException;
public abstract  long position(byte[] pattern, long start) throws java.sql.SQLException;
public abstract  java.io.OutputStream setBinaryStream(long pos) throws java.sql.SQLException;
public abstract  int setBytes(long pos, byte[] theBytes) throws java.sql.SQLException;
public abstract  int setBytes(long pos, byte[] theBytes, int offset, int len) throws java.sql.SQLException;
public abstract  void truncate(long len) throws java.sql.SQLException;
public abstract  void free() throws java.sql.SQLException;
}
