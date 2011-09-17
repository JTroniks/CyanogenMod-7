package javax.sql;
public interface StatementEventListener
  extends java.util.EventListener
{
public abstract  void statementClosed(javax.sql.StatementEvent event);
public abstract  void statementErrorOccurred(javax.sql.StatementEvent event);
}
