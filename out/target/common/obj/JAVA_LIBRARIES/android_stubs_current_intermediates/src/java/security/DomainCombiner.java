package java.security;
public interface DomainCombiner
{
public abstract  java.security.ProtectionDomain[] combine(java.security.ProtectionDomain[] current, java.security.ProtectionDomain[] assigned);
}
