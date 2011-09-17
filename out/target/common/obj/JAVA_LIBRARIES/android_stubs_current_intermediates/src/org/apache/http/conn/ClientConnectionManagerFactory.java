package org.apache.http.conn;
public interface ClientConnectionManagerFactory
{
public abstract  org.apache.http.conn.ClientConnectionManager newInstance(org.apache.http.params.HttpParams params, org.apache.http.conn.scheme.SchemeRegistry schemeRegistry);
}
