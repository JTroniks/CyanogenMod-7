package org.xml.sax.ext;
public interface EntityResolver2
  extends org.xml.sax.EntityResolver
{
public abstract  org.xml.sax.InputSource getExternalSubset(java.lang.String name, java.lang.String baseURI) throws org.xml.sax.SAXException, java.io.IOException;
public abstract  org.xml.sax.InputSource resolveEntity(java.lang.String name, java.lang.String publicId, java.lang.String baseURI, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException;
}
