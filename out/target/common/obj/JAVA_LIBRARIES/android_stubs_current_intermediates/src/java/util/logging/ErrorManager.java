package java.util.logging;
public class ErrorManager
{
public  ErrorManager() { throw new RuntimeException("Stub!"); }
public  void error(java.lang.String message, java.lang.Exception exception, int errorCode) { throw new RuntimeException("Stub!"); }
public static final int GENERIC_FAILURE = 0;
public static final int WRITE_FAILURE = 1;
public static final int FLUSH_FAILURE = 2;
public static final int CLOSE_FAILURE = 3;
public static final int OPEN_FAILURE = 4;
public static final int FORMAT_FAILURE = 5;
}
