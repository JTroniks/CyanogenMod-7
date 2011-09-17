package javax.xml.transform.stream;
public class StreamResult
  implements javax.xml.transform.Result
{
public  StreamResult() { throw new RuntimeException("Stub!"); }
public  StreamResult(java.io.OutputStream outputStream) { throw new RuntimeException("Stub!"); }
public  StreamResult(java.io.Writer writer) { throw new RuntimeException("Stub!"); }
public  StreamResult(java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  StreamResult(java.io.File f) { throw new RuntimeException("Stub!"); }
public  void setOutputStream(java.io.OutputStream outputStream) { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream getOutputStream() { throw new RuntimeException("Stub!"); }
public  void setWriter(java.io.Writer writer) { throw new RuntimeException("Stub!"); }
public  java.io.Writer getWriter() { throw new RuntimeException("Stub!"); }
public  void setSystemId(java.lang.String systemId) { throw new RuntimeException("Stub!"); }
public  void setSystemId(java.io.File f) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemId() { throw new RuntimeException("Stub!"); }
public static final java.lang.String FEATURE = "http://javax.xml.transform.stream.StreamResult/feature";
}
