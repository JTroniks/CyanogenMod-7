package java.lang;
public class SecurityManager
{
public  SecurityManager() { throw new RuntimeException("Stub!"); }
public  void checkAccept(java.lang.String host, int port) { throw new RuntimeException("Stub!"); }
public  void checkAccess(java.lang.Thread thread) { throw new RuntimeException("Stub!"); }
public  void checkAccess(java.lang.ThreadGroup group) { throw new RuntimeException("Stub!"); }
public  void checkConnect(java.lang.String host, int port) { throw new RuntimeException("Stub!"); }
public  void checkConnect(java.lang.String host, int port, java.lang.Object context) { throw new RuntimeException("Stub!"); }
public  void checkCreateClassLoader() { throw new RuntimeException("Stub!"); }
public  void checkDelete(java.lang.String file) { throw new RuntimeException("Stub!"); }
public  void checkExec(java.lang.String cmd) { throw new RuntimeException("Stub!"); }
public  void checkExit(int status) { throw new RuntimeException("Stub!"); }
public  void checkLink(java.lang.String libName) { throw new RuntimeException("Stub!"); }
public  void checkListen(int port) { throw new RuntimeException("Stub!"); }
public  void checkMemberAccess(java.lang.Class<?> cls, int type) { throw new RuntimeException("Stub!"); }
public  void checkMulticast(java.net.InetAddress maddr) { throw new RuntimeException("Stub!"); }
public  void checkMulticast(java.net.InetAddress maddr, byte ttl) { throw new RuntimeException("Stub!"); }
public  void checkPackageAccess(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void checkPackageDefinition(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void checkPropertiesAccess() { throw new RuntimeException("Stub!"); }
public  void checkPropertyAccess(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void checkRead(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  void checkRead(java.lang.String file) { throw new RuntimeException("Stub!"); }
public  void checkRead(java.lang.String file, java.lang.Object context) { throw new RuntimeException("Stub!"); }
public  void checkSecurityAccess(java.lang.String target) { throw new RuntimeException("Stub!"); }
public  void checkSetFactory() { throw new RuntimeException("Stub!"); }
public  boolean checkTopLevelWindow(java.lang.Object window) { throw new RuntimeException("Stub!"); }
public  void checkSystemClipboardAccess() { throw new RuntimeException("Stub!"); }
public  void checkAwtEventQueueAccess() { throw new RuntimeException("Stub!"); }
public  void checkPrintJobAccess() { throw new RuntimeException("Stub!"); }
public  void checkWrite(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public  void checkWrite(java.lang.String file) { throw new RuntimeException("Stub!"); }
public  boolean getInCheck() { throw new RuntimeException("Stub!"); }
protected  java.lang.Class[] getClassContext() { throw new RuntimeException("Stub!"); }
protected  java.lang.ClassLoader currentClassLoader() { throw new RuntimeException("Stub!"); }
protected  int classLoaderDepth() { throw new RuntimeException("Stub!"); }
protected  java.lang.Class<?> currentLoadedClass() { throw new RuntimeException("Stub!"); }
protected  int classDepth(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  boolean inClass(java.lang.String name) { throw new RuntimeException("Stub!"); }
protected  boolean inClassLoader() { throw new RuntimeException("Stub!"); }
public  java.lang.ThreadGroup getThreadGroup() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getSecurityContext() { throw new RuntimeException("Stub!"); }
public  void checkPermission(java.security.Permission permission) { throw new RuntimeException("Stub!"); }
public  void checkPermission(java.security.Permission permission, java.lang.Object context) { throw new RuntimeException("Stub!"); }
protected boolean inCheck;
}
