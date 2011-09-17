package javax.sql;
public interface ConnectionEventListener
  extends java.util.EventListener
{
public abstract  void connectionClosed(javax.sql.ConnectionEvent theEvent);
public abstract  void connectionErrorOccurred(javax.sql.ConnectionEvent theEvent);
}
