package java.sql;
public interface Driver
{
public abstract  boolean acceptsURL(java.lang.String url) throws java.sql.SQLException;
public abstract  java.sql.Connection connect(java.lang.String url, java.util.Properties info) throws java.sql.SQLException;
public abstract  int getMajorVersion();
public abstract  int getMinorVersion();
public abstract  java.sql.DriverPropertyInfo[] getPropertyInfo(java.lang.String url, java.util.Properties info) throws java.sql.SQLException;
public abstract  boolean jdbcCompliant();
}
