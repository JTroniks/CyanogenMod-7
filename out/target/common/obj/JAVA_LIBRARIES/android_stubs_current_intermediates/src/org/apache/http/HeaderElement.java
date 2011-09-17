package org.apache.http;
public interface HeaderElement
{
public abstract  java.lang.String getName();
public abstract  java.lang.String getValue();
public abstract  org.apache.http.NameValuePair[] getParameters();
public abstract  org.apache.http.NameValuePair getParameterByName(java.lang.String name);
public abstract  int getParameterCount();
public abstract  org.apache.http.NameValuePair getParameter(int index);
}
