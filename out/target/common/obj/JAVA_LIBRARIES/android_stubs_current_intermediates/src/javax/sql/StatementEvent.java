package javax.sql;
public class StatementEvent
  extends java.util.EventObject
{
public  StatementEvent(javax.sql.PooledConnection con, java.sql.PreparedStatement statement, java.sql.SQLException exception) { super((java.lang.Object)null); throw new RuntimeException("Stub!"); }
public  StatementEvent(javax.sql.PooledConnection con, java.sql.PreparedStatement statement) { super((java.lang.Object)null); throw new RuntimeException("Stub!"); }
public  java.sql.PreparedStatement getStatement() { throw new RuntimeException("Stub!"); }
public  java.sql.SQLException getSQLException() { throw new RuntimeException("Stub!"); }
}
