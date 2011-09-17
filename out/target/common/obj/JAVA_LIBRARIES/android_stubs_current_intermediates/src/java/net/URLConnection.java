package java.net;
public abstract class URLConnection
{
protected  URLConnection(java.net.URL url) { throw new RuntimeException("Stub!"); }
public abstract  void connect() throws java.io.IOException;
public  boolean getAllowUserInteraction() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getContent() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.Object getContent(java.lang.Class[] types) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getContentEncoding() { throw new RuntimeException("Stub!"); }
public  int getContentLength() { throw new RuntimeException("Stub!"); }
public  java.lang.String getContentType() { throw new RuntimeException("Stub!"); }
public  long getDate() { throw new RuntimeException("Stub!"); }
public static  boolean getDefaultAllowUserInteraction() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDefaultRequestProperty(java.lang.String field) { throw new RuntimeException("Stub!"); }
public  boolean getDefaultUseCaches() { throw new RuntimeException("Stub!"); }
public  boolean getDoInput() { throw new RuntimeException("Stub!"); }
public  boolean getDoOutput() { throw new RuntimeException("Stub!"); }
public  long getExpiration() { throw new RuntimeException("Stub!"); }
public static  java.net.FileNameMap getFileNameMap() { throw new RuntimeException("Stub!"); }
public  java.lang.String getHeaderField(int pos) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderFields() { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties() { throw new RuntimeException("Stub!"); }
public  void addRequestProperty(java.lang.String field, java.lang.String newValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHeaderField(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  long getHeaderFieldDate(java.lang.String field, long defaultValue) { throw new RuntimeException("Stub!"); }
public  int getHeaderFieldInt(java.lang.String field, int defaultValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String getHeaderFieldKey(int posn) { throw new RuntimeException("Stub!"); }
public  long getIfModifiedSince() { throw new RuntimeException("Stub!"); }
public  java.io.InputStream getInputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  long getLastModified() { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.security.Permission getPermission() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getRequestProperty(java.lang.String field) { throw new RuntimeException("Stub!"); }
public  java.net.URL getURL() { throw new RuntimeException("Stub!"); }
public  boolean getUseCaches() { throw new RuntimeException("Stub!"); }
public static  java.lang.String guessContentTypeFromName(java.lang.String url) { throw new RuntimeException("Stub!"); }
public static  java.lang.String guessContentTypeFromStream(java.io.InputStream is) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void setAllowUserInteraction(boolean newValue) { throw new RuntimeException("Stub!"); }
public static synchronized  void setContentHandlerFactory(java.net.ContentHandlerFactory contentFactory) { throw new RuntimeException("Stub!"); }
public static  void setDefaultAllowUserInteraction(boolean allows) { throw new RuntimeException("Stub!"); }
public static  void setDefaultRequestProperty(java.lang.String field, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setDefaultUseCaches(boolean newValue) { throw new RuntimeException("Stub!"); }
public  void setDoInput(boolean newValue) { throw new RuntimeException("Stub!"); }
public  void setDoOutput(boolean newValue) { throw new RuntimeException("Stub!"); }
public static  void setFileNameMap(java.net.FileNameMap map) { throw new RuntimeException("Stub!"); }
public  void setIfModifiedSince(long newValue) { throw new RuntimeException("Stub!"); }
public  void setRequestProperty(java.lang.String field, java.lang.String newValue) { throw new RuntimeException("Stub!"); }
public  void setUseCaches(boolean newValue) { throw new RuntimeException("Stub!"); }
public  void setConnectTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getConnectTimeout() { throw new RuntimeException("Stub!"); }
public  void setReadTimeout(int timeout) { throw new RuntimeException("Stub!"); }
public  int getReadTimeout() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected java.net.URL url;
protected long ifModifiedSince;
protected boolean useCaches;
protected boolean connected;
protected boolean doOutput;
protected boolean doInput;
protected boolean allowUserInteraction;
}
