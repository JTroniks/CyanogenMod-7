package java.sql;
public interface Struct
{
public abstract  java.lang.String getSQLTypeName() throws java.sql.SQLException;
public abstract  java.lang.Object[] getAttributes() throws java.sql.SQLException;
public abstract  java.lang.Object[] getAttributes(java.util.Map<java.lang.String, java.lang.Class<?>> theMap) throws java.sql.SQLException;
}
