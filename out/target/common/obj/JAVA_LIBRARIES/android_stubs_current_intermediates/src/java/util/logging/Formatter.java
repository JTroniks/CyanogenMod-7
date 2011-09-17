package java.util.logging;
public abstract class Formatter
{
protected  Formatter() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String format(java.util.logging.LogRecord r);
public  java.lang.String formatMessage(java.util.logging.LogRecord r) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHead(java.util.logging.Handler h) { throw new RuntimeException("Stub!"); }
public  java.lang.String getTail(java.util.logging.Handler h) { throw new RuntimeException("Stub!"); }
}
