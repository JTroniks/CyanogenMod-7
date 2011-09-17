package org.apache.http.impl.auth;
public class BasicScheme
  extends org.apache.http.impl.auth.RFC2617Scheme
{
public  BasicScheme() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSchemeName() { throw new RuntimeException("Stub!"); }
public  void processChallenge(org.apache.http.Header header) throws org.apache.http.auth.MalformedChallengeException { throw new RuntimeException("Stub!"); }
public  boolean isComplete() { throw new RuntimeException("Stub!"); }
public  boolean isConnectionBased() { throw new RuntimeException("Stub!"); }
public  org.apache.http.Header authenticate(org.apache.http.auth.Credentials credentials, org.apache.http.HttpRequest request) throws org.apache.http.auth.AuthenticationException { throw new RuntimeException("Stub!"); }
public static  org.apache.http.Header authenticate(org.apache.http.auth.Credentials credentials, java.lang.String charset, boolean proxy) { throw new RuntimeException("Stub!"); }
}
