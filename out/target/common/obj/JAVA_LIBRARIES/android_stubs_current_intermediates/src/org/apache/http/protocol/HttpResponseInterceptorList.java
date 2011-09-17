package org.apache.http.protocol;
public interface HttpResponseInterceptorList
{
public abstract  void addResponseInterceptor(org.apache.http.HttpResponseInterceptor itcp);
public abstract  void addResponseInterceptor(org.apache.http.HttpResponseInterceptor itcp, int index);
public abstract  int getResponseInterceptorCount();
public abstract  org.apache.http.HttpResponseInterceptor getResponseInterceptor(int index);
public abstract  void clearResponseInterceptors();
public abstract  void removeResponseInterceptorByClass(java.lang.Class clazz);
public abstract  void setInterceptors(java.util.List itcps);
}
