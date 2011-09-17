package java.security;
public abstract class AuthProvider
  extends java.security.Provider
{
protected  AuthProvider(java.lang.String name, double version, java.lang.String info) { super((java.lang.String)null,0,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public abstract  void login(javax.security.auth.Subject subject, javax.security.auth.callback.CallbackHandler handler) throws javax.security.auth.login.LoginException;
public abstract  void logout() throws javax.security.auth.login.LoginException;
public abstract  void setCallbackHandler(javax.security.auth.callback.CallbackHandler handler);
}
