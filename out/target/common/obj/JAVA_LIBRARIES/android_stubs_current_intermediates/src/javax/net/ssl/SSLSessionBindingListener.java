package javax.net.ssl;
public interface SSLSessionBindingListener
  extends java.util.EventListener
{
public abstract  void valueBound(javax.net.ssl.SSLSessionBindingEvent event);
public abstract  void valueUnbound(javax.net.ssl.SSLSessionBindingEvent event);
}
