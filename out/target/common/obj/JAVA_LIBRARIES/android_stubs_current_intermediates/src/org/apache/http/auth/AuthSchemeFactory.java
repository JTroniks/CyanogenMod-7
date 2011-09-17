package org.apache.http.auth;
public interface AuthSchemeFactory
{
public abstract  org.apache.http.auth.AuthScheme newInstance(org.apache.http.params.HttpParams params);
}
