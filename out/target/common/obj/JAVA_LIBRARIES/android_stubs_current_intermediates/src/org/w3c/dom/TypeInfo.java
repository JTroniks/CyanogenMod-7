package org.w3c.dom;
public interface TypeInfo
{
public abstract  java.lang.String getTypeName();
public abstract  java.lang.String getTypeNamespace();
public abstract  boolean isDerivedFrom(java.lang.String typeNamespaceArg, java.lang.String typeNameArg, int derivationMethod);
public static final int DERIVATION_RESTRICTION = 1;
public static final int DERIVATION_EXTENSION = 2;
public static final int DERIVATION_UNION = 4;
public static final int DERIVATION_LIST = 8;
}
