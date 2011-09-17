package org.apache.http.impl.io;
public abstract class AbstractMessageWriter
  implements org.apache.http.io.HttpMessageWriter
{
public  AbstractMessageWriter(org.apache.http.io.SessionOutputBuffer buffer, org.apache.http.message.LineFormatter formatter, org.apache.http.params.HttpParams params) { throw new RuntimeException("Stub!"); }
protected abstract  void writeHeadLine(org.apache.http.HttpMessage message) throws java.io.IOException;
public  void write(org.apache.http.HttpMessage message) throws java.io.IOException, org.apache.http.HttpException { throw new RuntimeException("Stub!"); }
protected final org.apache.http.io.SessionOutputBuffer sessionBuffer;
protected final org.apache.http.util.CharArrayBuffer lineBuf;
protected final org.apache.http.message.LineFormatter lineFormatter;
}
