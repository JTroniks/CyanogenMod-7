package java.net;
public abstract class CacheRequest
{
public  CacheRequest() { throw new RuntimeException("Stub!"); }
public abstract  void abort();
public abstract  java.io.OutputStream getBody() throws java.io.IOException;
}
