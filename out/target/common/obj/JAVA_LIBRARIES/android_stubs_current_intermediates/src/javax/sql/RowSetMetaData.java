package javax.sql;
public interface RowSetMetaData
  extends java.sql.ResultSetMetaData
{
public abstract  void setAutoIncrement(int columnIndex, boolean autoIncrement) throws java.sql.SQLException;
public abstract  void setCaseSensitive(int columnIndex, boolean caseSensitive) throws java.sql.SQLException;
public abstract  void setCatalogName(int columnIndex, java.lang.String catalogName) throws java.sql.SQLException;
public abstract  void setColumnCount(int columnCount) throws java.sql.SQLException;
public abstract  void setColumnDisplaySize(int columnIndex, int displaySize) throws java.sql.SQLException;
public abstract  void setColumnLabel(int columnIndex, java.lang.String theLabel) throws java.sql.SQLException;
public abstract  void setColumnName(int columnIndex, java.lang.String theColumnName) throws java.sql.SQLException;
public abstract  void setColumnType(int columnIndex, int theSQLType) throws java.sql.SQLException;
public abstract  void setColumnTypeName(int columnIndex, java.lang.String theTypeName) throws java.sql.SQLException;
public abstract  void setCurrency(int columnIndex, boolean isCurrency) throws java.sql.SQLException;
public abstract  void setNullable(int columnIndex, int nullability) throws java.sql.SQLException;
public abstract  void setPrecision(int columnIndex, int thePrecision) throws java.sql.SQLException;
public abstract  void setScale(int columnIndex, int theScale) throws java.sql.SQLException;
public abstract  void setSchemaName(int columnIndex, java.lang.String theSchemaName) throws java.sql.SQLException;
public abstract  void setSearchable(int columnIndex, boolean isSearchable) throws java.sql.SQLException;
public abstract  void setSigned(int columnIndex, boolean isSigned) throws java.sql.SQLException;
public abstract  void setTableName(int columnIndex, java.lang.String theTableName) throws java.sql.SQLException;
}
