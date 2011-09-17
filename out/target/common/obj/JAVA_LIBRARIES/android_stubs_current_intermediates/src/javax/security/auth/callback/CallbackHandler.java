package javax.security.auth.callback;
public interface CallbackHandler
{
public abstract  void handle(javax.security.auth.callback.Callback[] callbacks) throws java.io.IOException, javax.security.auth.callback.UnsupportedCallbackException;
}
