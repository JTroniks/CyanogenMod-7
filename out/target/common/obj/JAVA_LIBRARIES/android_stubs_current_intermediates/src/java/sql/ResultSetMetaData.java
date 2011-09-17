package java.sql;
public interface ResultSetMetaData
  extends java.sql.Wrapper
{
public abstract  java.lang.String getCatalogName(int column) throws java.sql.SQLException;
public abstract  java.lang.String getColumnClassName(int column) throws java.sql.SQLException;
public abstract  int getColumnCount() throws java.sql.SQLException;
public abstract  int getColumnDisplaySize(int column) throws java.sql.SQLException;
public abstract  java.lang.String getColumnLabel(int column) throws java.sql.SQLException;
public abstract  java.lang.String getColumnName(int column) throws java.sql.SQLException;
public abstract  int getColumnType(int column) throws java.sql.SQLException;
public abstract  java.lang.String getColumnTypeName(int column) throws java.sql.SQLException;
public abstract  int getPrecision(int column) throws java.sql.SQLException;
public abstract  int getScale(int column) throws java.sql.SQLException;
public abstract  java.lang.String getSchemaName(int column) throws java.sql.SQLException;
public abstract  java.lang.String getTableName(int column) throws java.sql.SQLException;
public abstract  boolean isAutoIncrement(int column) throws java.sql.SQLException;
public abstract  boolean isCaseSensitive(int column) throws java.sql.SQLException;
public abstract  boolean isCurrency(int column) throws java.sql.SQLException;
public abstract  boolean isDefinitelyWritable(int column) throws java.sql.SQLException;
public abstract  int isNullable(int column) throws java.sql.SQLException;
public abstract  boolean isReadOnly(int column) throws java.sql.SQLException;
public abstract  boolean isSearchable(int column) throws java.sql.SQLException;
public abstract  boolean isSigned(int column) throws java.sql.SQLException;
public abstract  boolean isWritable(int column) throws java.sql.SQLException;
public static final int columnNoNulls = 0;
public static final int columnNullable = 1;
public static final int columnNullableUnknown = 2;
}
