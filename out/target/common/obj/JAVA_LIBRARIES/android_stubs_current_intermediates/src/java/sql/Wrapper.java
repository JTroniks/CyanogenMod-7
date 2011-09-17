package java.sql;
public interface Wrapper
{
public abstract <T> T unwrap(java.lang.Class<T> iface) throws java.sql.SQLException;
public abstract  boolean isWrapperFor(java.lang.Class<?> iface) throws java.sql.SQLException;
}
