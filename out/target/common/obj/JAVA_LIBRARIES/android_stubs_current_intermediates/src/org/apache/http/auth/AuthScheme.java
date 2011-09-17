package org.apache.http.auth;
public interface AuthScheme
{
public abstract  void processChallenge(org.apache.http.Header header) throws org.apache.http.auth.MalformedChallengeException;
public abstract  java.lang.String getSchemeName();
public abstract  java.lang.String getParameter(java.lang.String name);
public abstract  java.lang.String getRealm();
public abstract  boolean isConnectionBased();
public abstract  boolean isComplete();
public abstract  org.apache.http.Header authenticate(org.apache.http.auth.Credentials credentials, org.apache.http.HttpRequest request) throws org.apache.http.auth.AuthenticationException;
}
