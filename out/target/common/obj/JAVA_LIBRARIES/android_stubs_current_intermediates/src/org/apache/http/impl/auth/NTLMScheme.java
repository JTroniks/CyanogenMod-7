package org.apache.http.impl.auth;
public class NTLMScheme
  extends org.apache.http.impl.auth.AuthSchemeBase
{
public  NTLMScheme(org.apache.http.impl.auth.NTLMEngine engine) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSchemeName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getParameter(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String getRealm() { throw new RuntimeException("Stub!"); }
public  boolean isConnectionBased() { throw new RuntimeException("Stub!"); }
protected  void parseChallenge(org.apache.http.util.CharArrayBuffer buffer, int pos, int len) throws org.apache.http.auth.MalformedChallengeException { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header authenticate(org.apache.http.auth.Credentials credentials, org.apache.http.HttpRequest request) throws org.apache.http.auth.AuthenticationException { throw new RuntimeException("Stub!"); }
public  boolean isComplete() { throw new RuntimeException("Stub!"); }
}
