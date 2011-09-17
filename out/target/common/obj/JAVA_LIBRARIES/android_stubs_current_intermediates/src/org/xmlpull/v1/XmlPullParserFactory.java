package org.xmlpull.v1;
public class XmlPullParserFactory
{
protected  XmlPullParserFactory() { throw new RuntimeException("Stub!"); }
public  void setFeature(java.lang.String name, boolean state) throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
public  boolean getFeature(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); }
public  boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
public  void setValidating(boolean validating) { throw new RuntimeException("Stub!"); }
public  boolean isValidating() { throw new RuntimeException("Stub!"); }
public  org.xmlpull.v1.XmlPullParser newPullParser() throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
public  org.xmlpull.v1.XmlSerializer newSerializer() throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
public static  org.xmlpull.v1.XmlPullParserFactory newInstance() throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
public static  org.xmlpull.v1.XmlPullParserFactory newInstance(java.lang.String classNames, java.lang.Class context) throws org.xmlpull.v1.XmlPullParserException { throw new RuntimeException("Stub!"); }
public static final java.lang.String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
protected java.util.ArrayList parserClasses;
protected java.lang.String classNamesLocation;
protected java.util.ArrayList serializerClasses;
protected java.util.HashMap features;
}
