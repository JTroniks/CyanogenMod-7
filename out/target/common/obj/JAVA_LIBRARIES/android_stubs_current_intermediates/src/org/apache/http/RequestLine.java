package org.apache.http;
public interface RequestLine
{
public abstract  java.lang.String getMethod();
public abstract  org.apache.http.ProtocolVersion getProtocolVersion();
public abstract  java.lang.String getUri();
}
