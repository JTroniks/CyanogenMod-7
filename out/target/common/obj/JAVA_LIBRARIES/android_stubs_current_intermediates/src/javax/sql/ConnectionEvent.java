package javax.sql;
public class ConnectionEvent
  extends java.util.EventObject
  implements java.io.Serializable
{
public  ConnectionEvent(javax.sql.PooledConnection theConnection) { super((java.lang.Object)null); throw new RuntimeException("Stub!"); }
public  ConnectionEvent(javax.sql.PooledConnection theConnection, java.sql.SQLException theException) { super((java.lang.Object)null); throw new RuntimeException("Stub!"); }
public  java.sql.SQLException getSQLException() { throw new RuntimeException("Stub!"); }
}
