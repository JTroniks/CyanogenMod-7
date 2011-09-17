package java.io;
public class File
  implements java.io.Serializable, java.lang.Comparable<java.io.File>
{
public  File(java.io.File dir, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  File(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  File(java.lang.String dirPath, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  File(java.net.URI uri) { throw new RuntimeException("Stub!"); }
public static  java.io.File[] listRoots() { throw new RuntimeException("Stub!"); }
public  boolean canExecute() { throw new RuntimeException("Stub!"); }
public  boolean canRead() { throw new RuntimeException("Stub!"); }
public  boolean canWrite() { throw new RuntimeException("Stub!"); }
public  int compareTo(java.io.File another) { throw new RuntimeException("Stub!"); }
public  boolean delete() { throw new RuntimeException("Stub!"); }
public  void deleteOnExit() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  boolean exists() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAbsolutePath() { throw new RuntimeException("Stub!"); }
public  java.io.File getAbsoluteFile() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCanonicalPath() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.File getCanonicalFile() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getParent() { throw new RuntimeException("Stub!"); }
public  java.io.File getParentFile() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPath() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean isAbsolute() { throw new RuntimeException("Stub!"); }
public  boolean isDirectory() { throw new RuntimeException("Stub!"); }
public  boolean isFile() { throw new RuntimeException("Stub!"); }
public  boolean isHidden() { throw new RuntimeException("Stub!"); }
public  long lastModified() { throw new RuntimeException("Stub!"); }
public  boolean setLastModified(long time) { throw new RuntimeException("Stub!"); }
public  boolean setReadOnly() { throw new RuntimeException("Stub!"); }
public  boolean setExecutable(boolean executable, boolean ownerOnly) { throw new RuntimeException("Stub!"); }
public  boolean setExecutable(boolean executable) { throw new RuntimeException("Stub!"); }
public  boolean setReadable(boolean readable, boolean ownerOnly) { throw new RuntimeException("Stub!"); }
public  boolean setReadable(boolean readable) { throw new RuntimeException("Stub!"); }
public  boolean setWritable(boolean writable, boolean ownerOnly) { throw new RuntimeException("Stub!"); }
public  boolean setWritable(boolean writable) { throw new RuntimeException("Stub!"); }
public  long length() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] list() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] list(java.io.FilenameFilter filter) { throw new RuntimeException("Stub!"); }
public  java.io.File[] listFiles() { throw new RuntimeException("Stub!"); }
public  java.io.File[] listFiles(java.io.FilenameFilter filter) { throw new RuntimeException("Stub!"); }
public  java.io.File[] listFiles(java.io.FileFilter filter) { throw new RuntimeException("Stub!"); }
public  boolean mkdir() { throw new RuntimeException("Stub!"); }
public  boolean mkdirs() { throw new RuntimeException("Stub!"); }
public  boolean createNewFile() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  java.io.File createTempFile(java.lang.String prefix, java.lang.String suffix) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  java.io.File createTempFile(java.lang.String prefix, java.lang.String suffix, java.io.File directory) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean renameTo(java.io.File newPath) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.net.URI toURI() { throw new RuntimeException("Stub!"); }
public  java.net.URL toURL() throws java.net.MalformedURLException { throw new RuntimeException("Stub!"); }
public  long getTotalSpace() { throw new RuntimeException("Stub!"); }
public  long getUsableSpace() { throw new RuntimeException("Stub!"); }
public  long getFreeSpace() { throw new RuntimeException("Stub!"); }
public static final char separatorChar;
public static final java.lang.String separator;
public static final char pathSeparatorChar;
public static final java.lang.String pathSeparator;
static { separatorChar = 0; separator = null; pathSeparatorChar = 0; pathSeparator = null; }
}
