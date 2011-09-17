package java.util.logging;
public interface LoggingMXBean
{
public abstract  java.lang.String getLoggerLevel(java.lang.String loggerName);
public abstract  java.util.List<java.lang.String> getLoggerNames();
public abstract  java.lang.String getParentLoggerName(java.lang.String loggerName);
public abstract  void setLoggerLevel(java.lang.String loggerName, java.lang.String levelName);
}
