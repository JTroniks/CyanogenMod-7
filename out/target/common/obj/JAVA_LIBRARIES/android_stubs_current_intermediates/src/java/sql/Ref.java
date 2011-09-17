package java.sql;
public interface Ref
{
public abstract  java.lang.String getBaseTypeName() throws java.sql.SQLException;
public abstract  java.lang.Object getObject() throws java.sql.SQLException;
public abstract  java.lang.Object getObject(java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  void setObject(java.lang.Object value) throws java.sql.SQLException;
}
