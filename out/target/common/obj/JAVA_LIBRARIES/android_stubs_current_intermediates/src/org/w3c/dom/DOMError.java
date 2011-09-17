package org.w3c.dom;
public interface DOMError
{
public abstract  short getSeverity();
public abstract  java.lang.String getMessage();
public abstract  java.lang.String getType();
public abstract  java.lang.Object getRelatedException();
public abstract  java.lang.Object getRelatedData();
public abstract  org.w3c.dom.DOMLocator getLocation();
public static final short SEVERITY_WARNING = 1;
public static final short SEVERITY_ERROR = 2;
public static final short SEVERITY_FATAL_ERROR = 3;
}
