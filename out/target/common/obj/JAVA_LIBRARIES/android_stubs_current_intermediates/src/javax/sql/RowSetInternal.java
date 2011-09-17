package javax.sql;
public interface RowSetInternal
{
public abstract  java.sql.Connection getConnection() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getOriginal() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getOriginalRow() throws java.sql.SQLException;
public abstract  java.lang.Object[] getParams() throws java.sql.SQLException;
public abstract  void setMetaData(javax.sql.RowSetMetaData theMetaData) throws java.sql.SQLException;
}
