package org.apache.http.client;
public interface AuthenticationHandler
{
public abstract  boolean isAuthenticationRequested(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context);
public abstract  java.util.Map<java.lang.String, org.apache.http.Header> getChallenges(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.auth.MalformedChallengeException;
public abstract  org.apache.http.auth.AuthScheme selectScheme(java.util.Map<java.lang.String, org.apache.http.Header> challenges, org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws org.apache.http.auth.AuthenticationException;
}
