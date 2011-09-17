package org.apache.http.impl.client;
public abstract class AbstractAuthenticationHandler
  implements org.apache.http.client.AuthenticationHandler
{
public  AbstractAuthenticationHandler() { throw new RuntimeException("Stub!"); }
protected  java.util.Map<java.lang.String, org.apache.http.Header> parseChallenges(org.apache.http.Header[] headers) throws org.apache.http.auth.MalformedChallengeException { throw new RuntimeException("Stub!"); }
protected  java.util.List<java.lang.String> getAuthPreferences() { throw new RuntimeException("Stub!"); }
public  org.apache.http.auth.AuthScheme selectScheme(java.util.Map<java.lang.String, org.apache.http.Header> challenges, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.auth.AuthenticationException { throw new RuntimeException("Stub!"); }
}
