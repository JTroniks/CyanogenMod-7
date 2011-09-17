package javax.sql;
public interface PooledConnection
{
public abstract  void addConnectionEventListener(javax.sql.ConnectionEventListener theListener);
public abstract  void close() throws java.sql.SQLException;
public abstract  java.sql.Connection getConnection() throws java.sql.SQLException;
public abstract  void removeConnectionEventListener(javax.sql.ConnectionEventListener theListener);
public abstract  void addStatementEventListener(javax.sql.StatementEventListener listener);
public abstract  void removeStatementEventListener(javax.sql.StatementEventListener listener);
}
