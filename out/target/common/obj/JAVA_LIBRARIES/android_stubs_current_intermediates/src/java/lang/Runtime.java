package java.lang;
public class Runtime
{
Runtime() { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String[] progArray) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String[] progArray, java.lang.String[] envp) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String[] progArray, java.lang.String[] envp, java.io.File directory) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String prog) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String prog, java.lang.String[] envp) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Process exec(java.lang.String prog, java.lang.String[] envp, java.io.File directory) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void exit(int code) { throw new RuntimeException("Stub!"); }
public native  long freeMemory();
public native  void gc();
public static  java.lang.Runtime getRuntime() { throw new RuntimeException("Stub!"); }
public  void load(java.lang.String pathName) { throw new RuntimeException("Stub!"); }
public  void loadLibrary(java.lang.String libName) { throw new RuntimeException("Stub!"); }
public  void runFinalization() { throw new RuntimeException("Stub!"); }
public static  void runFinalizersOnExit(boolean run) { throw new RuntimeException("Stub!"); }
public native  long totalMemory();
public  void traceInstructions(boolean enable) { throw new RuntimeException("Stub!"); }
public  void traceMethodCalls(boolean enable) { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getLocalizedInputStream(java.io.InputStream stream) { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getLocalizedOutputStream(java.io.OutputStream stream) { throw new RuntimeException("Stub!"); }
public  void addShutdownHook(java.lang.Thread hook) { throw new RuntimeException("Stub!"); }
public  boolean removeShutdownHook(java.lang.Thread hook) { throw new RuntimeException("Stub!"); }
public  void halt(int code) { throw new RuntimeException("Stub!"); }
public native  int availableProcessors();
public native  long maxMemory();
}
