package org.apache.http.protocol;
public interface HttpRequestInterceptorList
{
public abstract  void addRequestInterceptor(org.apache.http.HttpRequestInterceptor itcp);
public abstract  void addRequestInterceptor(org.apache.http.HttpRequestInterceptor itcp, int index);
public abstract  int getRequestInterceptorCount();
public abstract  org.apache.http.HttpRequestInterceptor getRequestInterceptor(int index);
public abstract  void clearRequestInterceptors();
public abstract  void removeRequestInterceptorByClass(java.lang.Class clazz);
public abstract  void setInterceptors(java.util.List itcps);
}
