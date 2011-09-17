package org.apache.commons.logging;
public interface Log
{
public abstract  boolean isDebugEnabled();
public abstract  boolean isErrorEnabled();
public abstract  boolean isFatalEnabled();
public abstract  boolean isInfoEnabled();
public abstract  boolean isTraceEnabled();
public abstract  boolean isWarnEnabled();
public abstract  void trace(java.lang.Object arg0);
public abstract  void trace(java.lang.Object arg0, java.lang.Throwable arg1);
public abstract  void debug(java.lang.Object arg0);
public abstract  void debug(java.lang.Object arg0, java.lang.Throwable arg1);
public abstract  void info(java.lang.Object arg0);
public abstract  void info(java.lang.Object arg0, java.lang.Throwable arg1);
public abstract  void warn(java.lang.Object arg0);
public abstract  void warn(java.lang.Object arg0, java.lang.Throwable arg1);
public abstract  void error(java.lang.Object arg0);
public abstract  void error(java.lang.Object arg0, java.lang.Throwable arg1);
public abstract  void fatal(java.lang.Object arg0);
public abstract  void fatal(java.lang.Object arg0, java.lang.Throwable arg1);
}
