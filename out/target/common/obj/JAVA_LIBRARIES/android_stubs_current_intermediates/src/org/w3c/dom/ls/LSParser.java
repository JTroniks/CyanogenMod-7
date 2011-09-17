package org.w3c.dom.ls;
public interface LSParser
{
public abstract  org.w3c.dom.DOMConfiguration getDomConfig();
public abstract  org.w3c.dom.ls.LSParserFilter getFilter();
public abstract  void setFilter(org.w3c.dom.ls.LSParserFilter filter);
public abstract  boolean getAsync();
public abstract  boolean getBusy();
public abstract  org.w3c.dom.Document parse(org.w3c.dom.ls.LSInput input) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException;
public abstract  org.w3c.dom.Document parseURI(java.lang.String uri) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException;
public abstract  org.w3c.dom.Node parseWithContext(org.w3c.dom.ls.LSInput input, org.w3c.dom.Node contextArg, short action) throws org.w3c.dom.DOMException, org.w3c.dom.ls.LSException;
public abstract  void abort();
public static final short ACTION_APPEND_AS_CHILDREN = 1;
public static final short ACTION_REPLACE_CHILDREN = 2;
public static final short ACTION_INSERT_BEFORE = 3;
public static final short ACTION_INSERT_AFTER = 4;
public static final short ACTION_REPLACE = 5;
}
