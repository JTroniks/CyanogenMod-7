package java.sql;
public interface Clob
{
public abstract  java.io.InputStream getAsciiStream() throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream() throws java.sql.SQLException;
public abstract  java.lang.String getSubString(long pos, int length) throws java.sql.SQLException;
public abstract  long length() throws java.sql.SQLException;
public abstract  long position(java.sql.Clob searchstr, long start) throws java.sql.SQLException;
public abstract  long position(java.lang.String searchstr, long start) throws java.sql.SQLException;
public abstract  java.io.OutputStream setAsciiStream(long pos) throws java.sql.SQLException;
public abstract  java.io.Writer setCharacterStream(long pos) throws java.sql.SQLException;
public abstract  int setString(long pos, java.lang.String str) throws java.sql.SQLException;
public abstract  int setString(long pos, java.lang.String str, int offset, int len) throws java.sql.SQLException;
public abstract  void truncate(long len) throws java.sql.SQLException;
public abstract  void free() throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream(long pos, long length) throws java.sql.SQLException;
}
