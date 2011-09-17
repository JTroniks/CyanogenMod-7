package org.apache.http;
public interface StatusLine
{
public abstract  org.apache.http.ProtocolVersion getProtocolVersion();
public abstract  int getStatusCode();
public abstract  java.lang.String getReasonPhrase();
}
