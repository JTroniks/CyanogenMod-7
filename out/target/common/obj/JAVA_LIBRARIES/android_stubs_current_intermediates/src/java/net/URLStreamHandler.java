package java.net;
public abstract class URLStreamHandler
{
public  URLStreamHandler() { throw new RuntimeException("Stub!"); }
protected abstract  java.net.URLConnection openConnection(java.net.URL u) throws java.io.IOException;
protected  java.net.URLConnection openConnection(java.net.URL u, java.net.Proxy proxy) throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected  void parseURL(java.net.URL u, java.lang.String str, int start, int end) { throw new RuntimeException("Stub!"); }
protected  void setURL(java.net.URL u, java.lang.String protocol, java.lang.String host, int port, java.lang.String file, java.lang.String ref) { throw new RuntimeException("Stub!"); }
protected  void setURL(java.net.URL u, java.lang.String protocol, java.lang.String host, int port, java.lang.String authority, java.lang.String userInfo, java.lang.String file, java.lang.String query, java.lang.String ref) { throw new RuntimeException("Stub!"); }
protected  java.lang.String toExternalForm(java.net.URL url) { throw new RuntimeException("Stub!"); }
protected  boolean equals(java.net.URL url1, java.net.URL url2) { throw new RuntimeException("Stub!"); }
protected  int getDefaultPort() { throw new RuntimeException("Stub!"); }
protected  java.net.InetAddress getHostAddress(java.net.URL url) { throw new RuntimeException("Stub!"); }
protected  int hashCode(java.net.URL url) { throw new RuntimeException("Stub!"); }
protected  boolean hostsEqual(java.net.URL a, java.net.URL b) { throw new RuntimeException("Stub!"); }
protected  boolean sameFile(java.net.URL url1, java.net.URL url2) { throw new RuntimeException("Stub!"); }
}
