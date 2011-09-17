package java.security;
public abstract class Provider
  extends java.util.Properties
{
public static class Service
{
public  Service(java.security.Provider provider, java.lang.String type, java.lang.String algorithm, java.lang.String className, java.util.List<java.lang.String> aliases, java.util.Map<java.lang.String, java.lang.String> attributes) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.security.Provider getProvider() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getClassName() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAttribute(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.Object newInstance(java.lang.Object constructorParameter) throws java.security.NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
public  boolean supportsParameter(java.lang.Object parameter) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
protected  Provider(java.lang.String name, double version, java.lang.String info) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  double getVersion() { throw new RuntimeException("Stub!"); }
public  java.lang.String getInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public synchronized  void clear() { throw new RuntimeException("Stub!"); }
public synchronized  void load(java.io.InputStream inStream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public synchronized  void putAll(java.util.Map<?, ?> t) { throw new RuntimeException("Stub!"); }
public synchronized  java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> entrySet() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.Object> keySet() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.lang.Object> values() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Object put(java.lang.Object key, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Object remove(java.lang.Object key) { throw new RuntimeException("Stub!"); }
public synchronized  java.security.Provider.Service getService(java.lang.String type, java.lang.String algorithm) { throw new RuntimeException("Stub!"); }
public synchronized  java.util.Set<java.security.Provider.Service> getServices() { throw new RuntimeException("Stub!"); }
protected synchronized  void putService(java.security.Provider.Service s) { throw new RuntimeException("Stub!"); }
protected synchronized  void removeService(java.security.Provider.Service s) { throw new RuntimeException("Stub!"); }
}
