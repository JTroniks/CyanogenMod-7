package junit.framework;
public class TestResult
{
public  TestResult() { throw new RuntimeException("Stub!"); }
public synchronized  void addError(junit.framework.Test test, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
public synchronized  void addFailure(junit.framework.Test test, junit.framework.AssertionFailedError t) { throw new RuntimeException("Stub!"); }
public synchronized  void addListener(junit.framework.TestListener listener) { throw new RuntimeException("Stub!"); }
public synchronized  void removeListener(junit.framework.TestListener listener) { throw new RuntimeException("Stub!"); }
public  void endTest(junit.framework.Test test) { throw new RuntimeException("Stub!"); }
public synchronized  int errorCount() { throw new RuntimeException("Stub!"); }
public synchronized  java.util.Enumeration errors() { throw new RuntimeException("Stub!"); }
public synchronized  int failureCount() { throw new RuntimeException("Stub!"); }
public synchronized  java.util.Enumeration failures() { throw new RuntimeException("Stub!"); }
protected  void run(junit.framework.TestCase test) { throw new RuntimeException("Stub!"); }
public synchronized  int runCount() { throw new RuntimeException("Stub!"); }
public  void runProtected(junit.framework.Test test, junit.framework.Protectable p) { throw new RuntimeException("Stub!"); }
public synchronized  boolean shouldStop() { throw new RuntimeException("Stub!"); }
public  void startTest(junit.framework.Test test) { throw new RuntimeException("Stub!"); }
public synchronized  void stop() { throw new RuntimeException("Stub!"); }
public synchronized  boolean wasSuccessful() { throw new RuntimeException("Stub!"); }
protected java.util.Vector fFailures;
protected java.util.Vector fErrors;
protected java.util.Vector fListeners;
protected int fRunTests;
}
