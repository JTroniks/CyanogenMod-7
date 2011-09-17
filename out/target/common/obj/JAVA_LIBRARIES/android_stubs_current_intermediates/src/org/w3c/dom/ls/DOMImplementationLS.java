package org.w3c.dom.ls;
public interface DOMImplementationLS
{
public abstract  org.w3c.dom.ls.LSParser createLSParser(short mode, java.lang.String schemaType) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.ls.LSSerializer createLSSerializer();
public abstract  org.w3c.dom.ls.LSInput createLSInput();
public abstract  org.w3c.dom.ls.LSOutput createLSOutput();
public static final short MODE_SYNCHRONOUS = 1;
public static final short MODE_ASYNCHRONOUS = 2;
}
