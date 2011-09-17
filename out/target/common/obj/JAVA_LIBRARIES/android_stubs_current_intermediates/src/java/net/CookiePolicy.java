package java.net;
public interface CookiePolicy
{
public abstract  boolean shouldAccept(java.net.URI uri, java.net.HttpCookie cookie);
public static final java.net.CookiePolicy ACCEPT_ALL = null;
public static final java.net.CookiePolicy ACCEPT_NONE = null;
public static final java.net.CookiePolicy ACCEPT_ORIGINAL_SERVER = null;
}
