package javax.sql;
public interface DataSource
  extends javax.sql.CommonDataSource, java.sql.Wrapper
{
public abstract  java.sql.Connection getConnection() throws java.sql.SQLException;
public abstract  java.sql.Connection getConnection(java.lang.String theUsername, java.lang.String thePassword) throws java.sql.SQLException;
}
