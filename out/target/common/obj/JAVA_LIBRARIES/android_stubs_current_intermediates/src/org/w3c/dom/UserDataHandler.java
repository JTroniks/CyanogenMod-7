package org.w3c.dom;
public interface UserDataHandler
{
public abstract  void handle(short operation, java.lang.String key, java.lang.Object data, org.w3c.dom.Node src, org.w3c.dom.Node dst);
public static final short NODE_CLONED = 1;
public static final short NODE_IMPORTED = 2;
public static final short NODE_DELETED = 3;
public static final short NODE_RENAMED = 4;
public static final short NODE_ADOPTED = 5;
}
