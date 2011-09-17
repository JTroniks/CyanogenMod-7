package org.apache.http.protocol;
public final class BasicHttpProcessor
  implements org.apache.http.protocol.HttpProcessor, org.apache.http.protocol.HttpRequestInterceptorList, org.apache.http.protocol.HttpResponseInterceptorList, java.lang.Cloneable
{
public  BasicHttpProcessor() { throw new RuntimeException("Stub!"); }
public  void addRequestInterceptor(org.apache.http.HttpRequestInterceptor itcp) { throw new RuntimeException("Stub!"); }
public  void addRequestInterceptor(org.apache.http.HttpRequestInterceptor itcp, int index) { throw new RuntimeException("Stub!"); }
public  void addResponseInterceptor(org.apache.http.HttpResponseInterceptor itcp, int index) { throw new RuntimeException("Stub!"); }
public  void removeRequestInterceptorByClass(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }
public  void removeResponseInterceptorByClass(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }
public final  void addInterceptor(org.apache.http.HttpRequestInterceptor interceptor) { throw new RuntimeException("Stub!"); }
public final  void addInterceptor(org.apache.http.HttpRequestInterceptor interceptor, int index) { throw new RuntimeException("Stub!"); }
public  int getRequestInterceptorCount() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpRequestInterceptor getRequestInterceptor(int index) { throw new RuntimeException("Stub!"); }
public  void clearRequestInterceptors() { throw new RuntimeException("Stub!"); }
public  void addResponseInterceptor(org.apache.http.HttpResponseInterceptor itcp) { throw new RuntimeException("Stub!"); }
public final  void addInterceptor(org.apache.http.HttpResponseInterceptor interceptor) { throw new RuntimeException("Stub!"); }
public final  void addInterceptor(org.apache.http.HttpResponseInterceptor interceptor, int index) { throw new RuntimeException("Stub!"); }
public  int getResponseInterceptorCount() { throw new RuntimeException("Stub!"); }
public  org.apache.http.HttpResponseInterceptor getResponseInterceptor(int index) { throw new RuntimeException("Stub!"); }
public  void clearResponseInterceptors() { throw new RuntimeException("Stub!"); }
public  void setInterceptors(java.util.List list) { throw new RuntimeException("Stub!"); }
public  void clearInterceptors() { throw new RuntimeException("Stub!"); }
public  void process(org.apache.http.HttpRequest request, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
public  void process(org.apache.http.HttpResponse response, org.apache.http.protocol.HttpContext context) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected  void copyInterceptors(org.apache.http.protocol.BasicHttpProcessor target) { throw new RuntimeException("Stub!"); }
public  org.apache.http.protocol.BasicHttpProcessor copy() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
protected java.util.List requestInterceptors;
protected java.util.List responseInterceptors;
}
