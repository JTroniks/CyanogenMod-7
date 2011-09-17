package java.net;
public abstract class HttpURLConnection
  extends java.net.URLConnection
{
protected  HttpURLConnection(java.net.URL url) { super((java.net.URL)null); throw new RuntimeException("Stub!"); }
public abstract  void disconnect();
public  java.io.InputStream getErrorStream() { throw new RuntimeException("Stub!"); }
public static  boolean getFollowRedirects() { throw new RuntimeException("Stub!"); }
public  java.security.Permission getPermission() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getRequestMethod() { throw new RuntimeException("Stub!"); }
public  int getResponseCode() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getResponseMessage() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void setFollowRedirects(boolean auto) { throw new RuntimeException("Stub!"); }
public  void setRequestMethod(java.lang.String method) throws java.net.ProtocolException { throw new RuntimeException("Stub!"); }
public abstract  boolean usingProxy();
public  java.lang.String getContentEncoding() { throw new RuntimeException("Stub!"); }
public  boolean getInstanceFollowRedirects() { throw new RuntimeException("Stub!"); }
public  void setInstanceFollowRedirects(boolean followRedirects) { throw new RuntimeException("Stub!"); }
public  long getHeaderFieldDate(java.lang.String field, long defaultValue) { throw new RuntimeException("Stub!"); }
public  void setFixedLengthStreamingMode(int contentLength) { throw new RuntimeException("Stub!"); }
public  void setChunkedStreamingMode(int chunkLength) { throw new RuntimeException("Stub!"); }
protected java.lang.String method;
protected int responseCode;
protected java.lang.String responseMessage;
protected boolean instanceFollowRedirects;
protected int chunkLength;
protected int fixedContentLength;
public static final int HTTP_ACCEPTED = 202;
public static final int HTTP_BAD_GATEWAY = 502;
public static final int HTTP_BAD_METHOD = 405;
public static final int HTTP_BAD_REQUEST = 400;
public static final int HTTP_CLIENT_TIMEOUT = 408;
public static final int HTTP_CONFLICT = 409;
public static final int HTTP_CREATED = 201;
public static final int HTTP_ENTITY_TOO_LARGE = 413;
public static final int HTTP_FORBIDDEN = 403;
public static final int HTTP_GATEWAY_TIMEOUT = 504;
public static final int HTTP_GONE = 410;
public static final int HTTP_INTERNAL_ERROR = 500;
public static final int HTTP_LENGTH_REQUIRED = 411;
public static final int HTTP_MOVED_PERM = 301;
public static final int HTTP_MOVED_TEMP = 302;
public static final int HTTP_MULT_CHOICE = 300;
public static final int HTTP_NO_CONTENT = 204;
public static final int HTTP_NOT_ACCEPTABLE = 406;
public static final int HTTP_NOT_AUTHORITATIVE = 203;
public static final int HTTP_NOT_FOUND = 404;
public static final int HTTP_NOT_IMPLEMENTED = 501;
public static final int HTTP_NOT_MODIFIED = 304;
public static final int HTTP_OK = 200;
public static final int HTTP_PARTIAL = 206;
public static final int HTTP_PAYMENT_REQUIRED = 402;
public static final int HTTP_PRECON_FAILED = 412;
public static final int HTTP_PROXY_AUTH = 407;
public static final int HTTP_REQ_TOO_LONG = 414;
public static final int HTTP_RESET = 205;
public static final int HTTP_SEE_OTHER = 303;
public static final int HTTP_SERVER_ERROR = 500;
public static final int HTTP_USE_PROXY = 305;
public static final int HTTP_UNAUTHORIZED = 401;
public static final int HTTP_UNSUPPORTED_TYPE = 415;
public static final int HTTP_UNAVAILABLE = 503;
public static final int HTTP_VERSION = 505;
}
