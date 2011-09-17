package org.apache.http.impl.auth;
public interface NTLMEngine
{
public abstract  java.lang.String generateType1Msg(java.lang.String domain, java.lang.String workstation) throws org.apache.http.impl.auth.NTLMEngineException;
public abstract  java.lang.String generateType3Msg(java.lang.String username, java.lang.String password, java.lang.String domain, java.lang.String workstation, java.lang.String challenge) throws org.apache.http.impl.auth.NTLMEngineException;
}
