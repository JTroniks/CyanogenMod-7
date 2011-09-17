package java.sql;
public interface Array
{
public abstract  java.lang.Object getArray() throws java.sql.SQLException;
public abstract  java.lang.Object getArray(long index, int count) throws java.sql.SQLException;
public abstract  java.lang.Object getArray(long index, int count, java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  java.lang.Object getArray(java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  int getBaseType() throws java.sql.SQLException;
public abstract  java.lang.String getBaseTypeName() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getResultSet() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getResultSet(long index, int count) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getResultSet(long index, int count, java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getResultSet(java.util.Map<java.lang.String, java.lang.Class<?>> map) throws java.sql.SQLException;
public abstract  void free() throws java.sql.SQLException;
}
