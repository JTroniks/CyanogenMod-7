package org.apache.http.params;
public interface HttpParams
{
public abstract  java.lang.Object getParameter(java.lang.String name);
public abstract  org.apache.http.params.HttpParams setParameter(java.lang.String name, java.lang.Object value);
public abstract  org.apache.http.params.HttpParams copy();
public abstract  boolean removeParameter(java.lang.String name);
public abstract  long getLongParameter(java.lang.String name, long defaultValue);
public abstract  org.apache.http.params.HttpParams setLongParameter(java.lang.String name, long value);
public abstract  int getIntParameter(java.lang.String name, int defaultValue);
public abstract  org.apache.http.params.HttpParams setIntParameter(java.lang.String name, int value);
public abstract  double getDoubleParameter(java.lang.String name, double defaultValue);
public abstract  org.apache.http.params.HttpParams setDoubleParameter(java.lang.String name, double value);
public abstract  boolean getBooleanParameter(java.lang.String name, boolean defaultValue);
public abstract  org.apache.http.params.HttpParams setBooleanParameter(java.lang.String name, boolean value);
public abstract  boolean isParameterTrue(java.lang.String name);
public abstract  boolean isParameterFalse(java.lang.String name);
}
