package java.util.logging;
public abstract class Handler
{
protected  Handler() { throw new RuntimeException("Stub!"); }
public abstract  void close();
public abstract  void flush();
public abstract  void publish(java.util.logging.LogRecord record);
public  java.lang.String getEncoding() { throw new RuntimeException("Stub!"); }
public  java.util.logging.ErrorManager getErrorManager() { throw new RuntimeException("Stub!"); }
public  java.util.logging.Filter getFilter() { throw new RuntimeException("Stub!"); }
public  java.util.logging.Formatter getFormatter() { throw new RuntimeException("Stub!"); }
public  java.util.logging.Level getLevel() { throw new RuntimeException("Stub!"); }
public  boolean isLoggable(java.util.logging.LogRecord record) { throw new RuntimeException("Stub!"); }
protected  void reportError(java.lang.String msg, java.lang.Exception ex, int code) { throw new RuntimeException("Stub!"); }
public  void setEncoding(java.lang.String encoding) throws java.lang.SecurityException, java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  void setErrorManager(java.util.logging.ErrorManager em) { throw new RuntimeException("Stub!"); }
public  void setFilter(java.util.logging.Filter newFilter) { throw new RuntimeException("Stub!"); }
public  void setFormatter(java.util.logging.Formatter newFormatter) { throw new RuntimeException("Stub!"); }
public  void setLevel(java.util.logging.Level newLevel) { throw new RuntimeException("Stub!"); }
}
