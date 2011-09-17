package java.sql;
public interface SQLData
{
public abstract  java.lang.String getSQLTypeName() throws java.sql.SQLException;
public abstract  void readSQL(java.sql.SQLInput stream, java.lang.String typeName) throws java.sql.SQLException;
public abstract  void writeSQL(java.sql.SQLOutput stream) throws java.sql.SQLException;
}
