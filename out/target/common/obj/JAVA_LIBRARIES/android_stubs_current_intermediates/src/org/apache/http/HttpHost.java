package org.apache.http;
public final class HttpHost
  implements java.lang.Cloneable
{
public  HttpHost(java.lang.String hostname, int port, java.lang.String scheme) { throw new RuntimeException("Stub!"); }
public  HttpHost(java.lang.String hostname, int port) { throw new RuntimeException("Stub!"); }
public  HttpHost(java.lang.String hostname) { throw new RuntimeException("Stub!"); }
public  HttpHost(org.apache.http.HttpHost httphost) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHostName() { throw new RuntimeException("Stub!"); }
public  int getPort() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSchemeName() { throw new RuntimeException("Stub!"); }
public  java.lang.String toURI() { throw new RuntimeException("Stub!"); }
public  java.lang.String toHostString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public static final java.lang.String DEFAULT_SCHEME_NAME = "http";
protected final java.lang.String hostname;
protected final java.lang.String lcHostname;
protected final int port;
protected final java.lang.String schemeName;
}
