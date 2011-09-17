package javax.sql;
public interface CommonDataSource
{
public abstract  int getLoginTimeout() throws java.sql.SQLException;
public abstract  java.io.PrintWriter getLogWriter() throws java.sql.SQLException;
public abstract  void setLoginTimeout(int seconds) throws java.sql.SQLException;
public abstract  void setLogWriter(java.io.PrintWriter out) throws java.sql.SQLException;
}
