package java.net;
public abstract class Authenticator
{
public static enum RequestorType
{
PROXY(),
SERVER();
}
public  Authenticator() { throw new RuntimeException("Stub!"); }
protected  java.net.PasswordAuthentication getPasswordAuthentication() { throw new RuntimeException("Stub!"); }
protected final  int getRequestingPort() { throw new RuntimeException("Stub!"); }
protected final  java.net.InetAddress getRequestingSite() { throw new RuntimeException("Stub!"); }
protected final  java.lang.String getRequestingPrompt() { throw new RuntimeException("Stub!"); }
protected final  java.lang.String getRequestingProtocol() { throw new RuntimeException("Stub!"); }
protected final  java.lang.String getRequestingScheme() { throw new RuntimeException("Stub!"); }
public static synchronized  java.net.PasswordAuthentication requestPasswordAuthentication(java.net.InetAddress rAddr, int rPort, java.lang.String rProtocol, java.lang.String rPrompt, java.lang.String rScheme) { throw new RuntimeException("Stub!"); }
public static  void setDefault(java.net.Authenticator a) { throw new RuntimeException("Stub!"); }
public static synchronized  java.net.PasswordAuthentication requestPasswordAuthentication(java.lang.String rHost, java.net.InetAddress rAddr, int rPort, java.lang.String rProtocol, java.lang.String rPrompt, java.lang.String rScheme) { throw new RuntimeException("Stub!"); }
protected final  java.lang.String getRequestingHost() { throw new RuntimeException("Stub!"); }
public static  java.net.PasswordAuthentication requestPasswordAuthentication(java.lang.String rHost, java.net.InetAddress rAddr, int rPort, java.lang.String rProtocol, java.lang.String rPrompt, java.lang.String rScheme, java.net.URL rURL, java.net.Authenticator.RequestorType reqType) { throw new RuntimeException("Stub!"); }
protected  java.net.URL getRequestingURL() { throw new RuntimeException("Stub!"); }
protected  java.net.Authenticator.RequestorType getRequestorType() { throw new RuntimeException("Stub!"); }
}
