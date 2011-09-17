package org.apache.http.io;
public interface HttpMessageWriter
{
public abstract  void write(org.apache.http.HttpMessage message) throws java.io.IOException, org.apache.http.HttpException;
}
