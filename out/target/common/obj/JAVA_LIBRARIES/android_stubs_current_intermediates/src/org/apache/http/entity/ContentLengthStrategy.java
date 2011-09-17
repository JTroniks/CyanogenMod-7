package org.apache.http.entity;
public interface ContentLengthStrategy
{
public abstract  long determineLength(org.apache.http.HttpMessage message) throws org.apache.http.HttpException;
public static final int IDENTITY = -1;
public static final int CHUNKED = -2;
}
