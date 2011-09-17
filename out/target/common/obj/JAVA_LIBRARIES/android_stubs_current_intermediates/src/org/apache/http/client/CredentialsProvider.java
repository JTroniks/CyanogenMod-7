package org.apache.http.client;
public interface CredentialsProvider
{
public abstract  void setCredentials(org.apache.http.auth.AuthScope authscope, org.apache.http.auth.Credentials credentials);
public abstract  org.apache.http.auth.Credentials getCredentials(org.apache.http.auth.AuthScope authscope);
public abstract  void clear();
}
