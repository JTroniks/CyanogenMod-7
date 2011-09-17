package org.xml.sax;
public interface EntityResolver
{
public abstract  org.xml.sax.InputSource resolveEntity(java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException;
}
