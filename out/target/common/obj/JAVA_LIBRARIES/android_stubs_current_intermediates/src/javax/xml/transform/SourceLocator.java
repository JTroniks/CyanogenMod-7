package javax.xml.transform;
public interface SourceLocator
{
public abstract  java.lang.String getPublicId();
public abstract  java.lang.String getSystemId();
public abstract  int getLineNumber();
public abstract  int getColumnNumber();
}
