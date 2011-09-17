package javax.sql;
public interface ConnectionPoolDataSource
  extends javax.sql.CommonDataSource
{
public abstract  javax.sql.PooledConnection getPooledConnection() throws java.sql.SQLException;
public abstract  javax.sql.PooledConnection getPooledConnection(java.lang.String theUser, java.lang.String thePassword) throws java.sql.SQLException;
}
