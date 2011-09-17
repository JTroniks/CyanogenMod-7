package java.net;
public abstract class ContentHandler
{
public  ContentHandler() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Object getContent(java.net.URLConnection uConn) throws java.io.IOException;
public  java.lang.Object getContent(java.net.URLConnection uConn, java.lang.Class[] types) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
