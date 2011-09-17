package junit.framework;
public interface TestListener
{
public abstract  void addError(junit.framework.Test test, java.lang.Throwable t);
public abstract  void addFailure(junit.framework.Test test, junit.framework.AssertionFailedError t);
public abstract  void endTest(junit.framework.Test test);
public abstract  void startTest(junit.framework.Test test);
}
