package java.net;
public abstract class ProxySelector
{
public  ProxySelector() { throw new RuntimeException("Stub!"); }
public static  java.net.ProxySelector getDefault() { throw new RuntimeException("Stub!"); }
public static  void setDefault(java.net.ProxySelector selector) { throw new RuntimeException("Stub!"); }
public abstract  java.util.List<java.net.Proxy> select(java.net.URI uri);
public abstract  void connectFailed(java.net.URI uri, java.net.SocketAddress sa, java.io.IOException ioe);
}
