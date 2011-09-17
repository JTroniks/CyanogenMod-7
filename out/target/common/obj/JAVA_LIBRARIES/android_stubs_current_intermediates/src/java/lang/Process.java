package java.lang;
public abstract class Process
{
public  Process() { throw new RuntimeException("Stub!"); }
public abstract  void destroy();
public abstract  int exitValue();
public abstract  java.io.InputStream getErrorStream();
public abstract  java.io.InputStream getInputStream();
public abstract  java.io.OutputStream getOutputStream();
public abstract  int waitFor() throws java.lang.InterruptedException;
}
