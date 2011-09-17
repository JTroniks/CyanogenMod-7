package org.w3c.dom.ls;
public interface LSParserFilter
{
public abstract  short startElement(org.w3c.dom.Element elementArg);
public abstract  short acceptNode(org.w3c.dom.Node nodeArg);
public abstract  int getWhatToShow();
public static final short FILTER_ACCEPT = 1;
public static final short FILTER_REJECT = 2;
public static final short FILTER_SKIP = 3;
public static final short FILTER_INTERRUPT = 4;
}
