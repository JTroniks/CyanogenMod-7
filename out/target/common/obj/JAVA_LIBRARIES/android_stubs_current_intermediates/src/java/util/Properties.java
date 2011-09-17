package java.util;
public class Properties
  extends java.util.Hashtable<java.lang.Object, java.lang.Object>
{
public  Properties() { throw new RuntimeException("Stub!"); }
public  Properties(java.util.Properties properties) { throw new RuntimeException("Stub!"); }
public  java.lang.String getProperty(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String getProperty(java.lang.String name, java.lang.String defaultValue) { throw new RuntimeException("Stub!"); }
public  void list(java.io.PrintStream out) { throw new RuntimeException("Stub!"); }
public  void list(java.io.PrintWriter writer) { throw new RuntimeException("Stub!"); }
public synchronized  void load(java.io.InputStream in) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void load(java.io.Reader in) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.util.Enumeration<?> propertyNames() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> stringPropertyNames() { throw new RuntimeException("Stub!"); }
public  void save(java.io.OutputStream out, java.lang.String comment) { throw new RuntimeException("Stub!"); }
public  java.lang.Object setProperty(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public synchronized  void store(java.io.OutputStream out, java.lang.String comment) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void store(java.io.Writer writer, java.lang.String comment) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void loadFromXML(java.io.InputStream in) throws java.io.IOException, java.util.InvalidPropertiesFormatException { throw new RuntimeException("Stub!"); }
public  void storeToXML(java.io.OutputStream os, java.lang.String comment) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void storeToXML(java.io.OutputStream os, java.lang.String comment, java.lang.String encoding) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected java.util.Properties defaults;
}
