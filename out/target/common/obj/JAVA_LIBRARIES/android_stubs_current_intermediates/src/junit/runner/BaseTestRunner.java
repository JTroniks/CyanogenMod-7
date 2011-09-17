package junit.runner;
public abstract class BaseTestRunner
  implements junit.framework.TestListener
{
public  BaseTestRunner() { throw new RuntimeException("Stub!"); }
public synchronized  void startTest(junit.framework.Test test) { throw new RuntimeException("Stub!"); }
protected static  void setPreferences(java.util.Properties preferences) { throw new RuntimeException("Stub!"); }
protected static  java.util.Properties getPreferences() { throw new RuntimeException("Stub!"); }
public static  void savePreferences() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setPreference(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public synchronized  void endTest(junit.framework.Test test) { throw new RuntimeException("Stub!"); }
public synchronized  void addError(junit.framework.Test test, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public synchronized  void addFailure(junit.framework.Test test, junit.framework.AssertionFailedError t) { throw new RuntimeException("Stub!"); }
public abstract  void testStarted(java.lang.String testName);
public abstract  void testEnded(java.lang.String testName);
public abstract  void testFailed(int status, junit.framework.Test test, java.lang.Throwable t);
public  junit.framework.Test getTest(java.lang.String suiteClassName) { throw new RuntimeException("Stub!"); }
public  java.lang.String elapsedTimeAsString(long runTime) { throw new RuntimeException("Stub!"); }
protected  java.lang.String processArguments(java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public  void setLoading(boolean enable) { throw new RuntimeException("Stub!"); }
public  java.lang.String extractClassName(java.lang.String className) { throw new RuntimeException("Stub!"); }
public static  java.lang.String truncate(java.lang.String s) { throw new RuntimeException("Stub!"); }
protected abstract  void runFailed(java.lang.String message);
protected  java.lang.Class loadSuiteClass(java.lang.String suiteClassName) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
protected  void clearStatus() { throw new RuntimeException("Stub!"); }
public  junit.runner.TestSuiteLoader getLoader() { throw new RuntimeException("Stub!"); }
protected  boolean useReloadingTestSuiteLoader() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getPreference(java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  int getPreference(java.lang.String key, int dflt) { throw new RuntimeException("Stub!"); }
public static  boolean inVAJava() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getFilteredTrace(java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getFilteredTrace(java.lang.String stack) { throw new RuntimeException("Stub!"); }
protected static  boolean showStackRaw() { throw new RuntimeException("Stub!"); }
public static final java.lang.String SUITE_METHODNAME = "suite";
}
