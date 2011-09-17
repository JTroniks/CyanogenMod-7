package org.apache.http;
public interface FormattedHeader
  extends org.apache.http.Header
{
public abstract  org.apache.http.util.CharArrayBuffer getBuffer();
public abstract  int getValuePos();
}
