package java.util.logging;
public class Logger
{
protected  Logger(java.lang.String name, java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Logger getAnonymousLogger() { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Logger getAnonymousLogger(java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Logger getLogger(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.util.logging.Logger getLogger(java.lang.String name, java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }
public  void addHandler(java.util.logging.Handler handler) { throw new RuntimeException("Stub!"); }
public  java.util.logging.Handler[] getHandlers() { throw new RuntimeException("Stub!"); }
public  void removeHandler(java.util.logging.Handler handler) { throw new RuntimeException("Stub!"); }
public  java.util.logging.Filter getFilter() { throw new RuntimeException("Stub!"); }
public  void setFilter(java.util.logging.Filter newFilter) { throw new RuntimeException("Stub!"); }
public  java.util.logging.Level getLevel() { throw new RuntimeException("Stub!"); }
public  void setLevel(java.util.logging.Level newLevel) { throw new RuntimeException("Stub!"); }
public  boolean getUseParentHandlers() { throw new RuntimeException("Stub!"); }
public  void setUseParentHandlers(boolean notifyParentHandlers) { throw new RuntimeException("Stub!"); }
public  java.util.logging.Logger getParent() { throw new RuntimeException("Stub!"); }
public  void setParent(java.util.logging.Logger parent) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.util.ResourceBundle getResourceBundle() { throw new RuntimeException("Stub!"); }
public  java.lang.String getResourceBundleName() { throw new RuntimeException("Stub!"); }
public  boolean isLoggable(java.util.logging.Level l) { throw new RuntimeException("Stub!"); }
public  void entering(java.lang.String sourceClass, java.lang.String sourceMethod) { throw new RuntimeException("Stub!"); }
public  void entering(java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Object param) { throw new RuntimeException("Stub!"); }
public  void entering(java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Object[] params) { throw new RuntimeException("Stub!"); }
public  void exiting(java.lang.String sourceClass, java.lang.String sourceMethod) { throw new RuntimeException("Stub!"); }
public  void exiting(java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Object result) { throw new RuntimeException("Stub!"); }
public  void throwing(java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public  void severe(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void warning(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void info(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void config(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void fine(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void finer(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void finest(java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level logLevel, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level logLevel, java.lang.String msg, java.lang.Object param) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level logLevel, java.lang.String msg, java.lang.Object[] params) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.Level logLevel, java.lang.String msg, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public  void log(java.util.logging.LogRecord record) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level logLevel, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level logLevel, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String msg, java.lang.Object param) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level logLevel, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String msg, java.lang.Object[] params) { throw new RuntimeException("Stub!"); }
public  void logp(java.util.logging.Level logLevel, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String msg, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public  void logrb(java.util.logging.Level logLevel, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String bundleName, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public  void logrb(java.util.logging.Level logLevel, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String bundleName, java.lang.String msg, java.lang.Object param) { throw new RuntimeException("Stub!"); }
public  void logrb(java.util.logging.Level logLevel, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String bundleName, java.lang.String msg, java.lang.Object[] params) { throw new RuntimeException("Stub!"); }
public  void logrb(java.util.logging.Level logLevel, java.lang.String sourceClass, java.lang.String sourceMethod, java.lang.String bundleName, java.lang.String msg, java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }
public static final java.lang.String GLOBAL_LOGGER_NAME = "global";
public static final java.util.logging.Logger global;
static { global = null; }
}
