package javax.net.ssl;
public interface SSLSessionContext
{
public abstract  java.util.Enumeration<byte[]> getIds();
public abstract  javax.net.ssl.SSLSession getSession(byte[] sessionId);
public abstract  int getSessionCacheSize();
public abstract  int getSessionTimeout();
public abstract  void setSessionCacheSize(int size) throws java.lang.IllegalArgumentException;
public abstract  void setSessionTimeout(int seconds) throws java.lang.IllegalArgumentException;
}
