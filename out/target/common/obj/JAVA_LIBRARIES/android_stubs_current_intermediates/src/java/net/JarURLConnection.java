package java.net;
public abstract class JarURLConnection
  extends java.net.URLConnection
{
protected  JarURLConnection(java.net.URL url) throws java.net.MalformedURLException { super((java.net.URL)null); throw new RuntimeException("Stub!"); }
public  java.util.jar.Attributes getAttributes() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.security.cert.Certificate[] getCertificates() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getEntryName() { throw new RuntimeException("Stub!"); }
public  java.util.jar.JarEntry getJarEntry() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.util.jar.Manifest getManifest() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.util.jar.JarFile getJarFile() throws java.io.IOException;
public  java.net.URL getJarFileURL() { throw new RuntimeException("Stub!"); }
public  java.util.jar.Attributes getMainAttributes() throws java.io.IOException { throw new RuntimeException("Stub!"); }
protected java.net.URLConnection jarFileURLConnection;
}
