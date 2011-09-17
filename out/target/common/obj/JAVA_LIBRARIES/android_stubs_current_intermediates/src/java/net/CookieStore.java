package java.net;
public interface CookieStore
{
public abstract  void add(java.net.URI uri, java.net.HttpCookie cookie);
public abstract  java.util.List<java.net.HttpCookie> get(java.net.URI uri);
public abstract  java.util.List<java.net.HttpCookie> getCookies();
public abstract  java.util.List<java.net.URI> getURIs();
public abstract  boolean remove(java.net.URI uri, java.net.HttpCookie cookie);
public abstract  boolean removeAll();
}
