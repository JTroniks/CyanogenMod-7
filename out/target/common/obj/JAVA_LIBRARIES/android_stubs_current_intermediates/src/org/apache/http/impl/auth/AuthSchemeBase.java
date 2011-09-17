package org.apache.http.impl.auth;
public abstract class AuthSchemeBase
  implements org.apache.http.auth.AuthScheme
{
public  AuthSchemeBase() { throw new RuntimeException("Stub!"); }
public  void processChallenge(org.apache.http.Header header) throws org.apache.http.auth.MalformedChallengeException { throw new RuntimeException("Stub!"); }
protected abstract  void parseChallenge(org.apache.http.util.CharArrayBuffer buffer, int pos, int len) throws org.apache.http.auth.MalformedChallengeException;
public  boolean isProxy() { throw new RuntimeException("Stub!"); }
}
