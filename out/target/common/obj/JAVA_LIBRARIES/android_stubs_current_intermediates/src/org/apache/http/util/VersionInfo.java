package org.apache.http.util;
public class VersionInfo
{
protected  VersionInfo(java.lang.String pckg, java.lang.String module, java.lang.String release, java.lang.String time, java.lang.String clsldr) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getPackage() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getModule() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getRelease() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getTimestamp() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getClassloader() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.util.VersionInfo[] loadVersionInfo(java.lang.String[] pckgs, java.lang.ClassLoader clsldr) { throw new RuntimeException("Stub!"); }
public static final  org.apache.http.util.VersionInfo loadVersionInfo(java.lang.String pckg, java.lang.ClassLoader clsldr) { throw new RuntimeException("Stub!"); }
protected static final  org.apache.http.util.VersionInfo fromMap(java.lang.String pckg, java.util.Map info, java.lang.ClassLoader clsldr) { throw new RuntimeException("Stub!"); }
public static final java.lang.String UNAVAILABLE = "UNAVAILABLE";
public static final java.lang.String VERSION_PROPERTY_FILE = "version.properties";
public static final java.lang.String PROPERTY_MODULE = "info.module";
public static final java.lang.String PROPERTY_RELEASE = "info.release";
public static final java.lang.String PROPERTY_TIMESTAMP = "info.timestamp";
}
