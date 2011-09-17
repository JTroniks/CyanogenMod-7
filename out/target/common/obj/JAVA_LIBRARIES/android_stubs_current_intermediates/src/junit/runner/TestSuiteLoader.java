package junit.runner;
public interface TestSuiteLoader
{
public abstract  java.lang.Class load(java.lang.String suiteClassName) throws java.lang.ClassNotFoundException;
public abstract  java.lang.Class reload(java.lang.Class aClass) throws java.lang.ClassNotFoundException;
}
