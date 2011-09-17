package java.sql;
public interface SQLXML
{
public abstract  void free() throws java.sql.SQLException;
public abstract  java.io.InputStream getBinaryStream() throws java.sql.SQLException;
public abstract  java.io.OutputStream setBinaryStream() throws java.sql.SQLException;
public abstract  java.io.Reader getCharacterStream() throws java.sql.SQLException;
public abstract  java.io.Writer setCharacterStream() throws java.sql.SQLException;
public abstract  java.lang.String getString() throws java.sql.SQLException;
public abstract  void setString(java.lang.String value) throws java.sql.SQLException;
public abstract <T extends javax.xml.transform.Source> T getSource(java.lang.Class<T> sourceClass) throws java.sql.SQLException;
public abstract <T extends javax.xml.transform.Result> T setResult(java.lang.Class<T> resultClass) throws java.sql.SQLException;
}
