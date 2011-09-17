package java.net;
public abstract class ResponseCache
{
public  ResponseCache() { throw new RuntimeException("Stub!"); }
public static  java.net.ResponseCache getDefault() { throw new RuntimeException("Stub!"); }
public static  void setDefault(java.net.ResponseCache responseCache) { throw new RuntimeException("Stub!"); }
public abstract  java.net.CacheResponse get(java.net.URI uri, java.lang.String requestMethod, java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestHeaders) throws java.io.IOException;
public abstract  java.net.CacheRequest put(java.net.URI uri, java.net.URLConnection conn) throws java.io.IOException;
}
