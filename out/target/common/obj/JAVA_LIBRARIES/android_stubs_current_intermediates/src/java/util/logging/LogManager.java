package java.util.logging;
public class LogManager
{
protected  LogManager() { throw new RuntimeException("Stub!"); }
public static  java.util.logging.LoggingMXBean getLoggingMXBean() { throw new RuntimeException("Stub!"); }
public  void checkAccess() { throw new RuntimeException("Stub!"); }
public synchronized  boolean addLogger(java.util.logging.Logger logger) { throw new RuntimeException("Stub!"); }
public synchronized  java.util.logging.Logger getLogger(java.lang.String name) { throw new RuntimeException("Stub!"); }
public synchronized  java.util.Enumeration<java.lang.String> getLoggerNames() { throw new RuntimeException("Stub!"); }
public static  java.util.logging.LogManager getLogManager() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProperty(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void readConfiguration() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void readConfiguration(java.io.InputStream ins) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void reset() { throw new RuntimeException("Stub!"); }
public  void addPropertyChangeListener(java.beans.PropertyChangeListener l) { throw new RuntimeException("Stub!"); }
public  void removePropertyChangeListener(java.beans.PropertyChangeListener l) { throw new RuntimeException("Stub!"); }
public static final java.lang.String LOGGING_MXBEAN_NAME = "java.util.logging:type=Logging";
}
