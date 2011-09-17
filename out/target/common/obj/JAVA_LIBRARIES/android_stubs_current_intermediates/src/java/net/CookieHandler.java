package java.net;
public abstract class CookieHandler
{
public  CookieHandler() { throw new RuntimeException("Stub!"); }
public static  java.net.CookieHandler getDefault() { throw new RuntimeException("Stub!"); }
public static  void setDefault(java.net.CookieHandler cHandler) { throw new RuntimeException("Stub!"); }
public abstract  java.util.Map<java.lang.String, java.util.List<java.lang.String>> get(java.net.URI uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestHeaders) throws java.io.IOException;
public abstract  void put(java.net.URI uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders) throws java.io.IOException;
}
