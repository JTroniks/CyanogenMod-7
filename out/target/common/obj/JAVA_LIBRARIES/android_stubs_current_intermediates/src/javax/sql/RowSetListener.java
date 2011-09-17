package javax.sql;
public interface RowSetListener
  extends java.util.EventListener
{
public abstract  void cursorMoved(javax.sql.RowSetEvent theEvent);
public abstract  void rowChanged(javax.sql.RowSetEvent theEvent);
public abstract  void rowSetChanged(javax.sql.RowSetEvent theEvent);
}
