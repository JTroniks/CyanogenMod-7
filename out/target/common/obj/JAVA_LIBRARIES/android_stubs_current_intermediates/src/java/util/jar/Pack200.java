package java.util.jar;
public abstract class Pack200
{
public static interface Packer
{
public abstract  java.util.SortedMap<java.lang.String, java.lang.String> properties();
public abstract  void pack(java.util.jar.JarFile in, java.io.OutputStream out) throws java.io.IOException;
public abstract  void pack(java.util.jar.JarInputStream in, java.io.OutputStream out) throws java.io.IOException;
public abstract  void addPropertyChangeListener(java.beans.PropertyChangeListener listener);
public abstract  void removePropertyChangeListener(java.beans.PropertyChangeListener listener);
public static final java.lang.String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";
public static final java.lang.String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";
public static final java.lang.String DEFLATE_HINT = "pack.deflate.hint";
public static final java.lang.String EFFORT = "pack.effort";
public static final java.lang.String ERROR = "error";
public static final java.lang.String FALSE = "false";
public static final java.lang.String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";
public static final java.lang.String KEEP = "keep";
public static final java.lang.String KEEP_FILE_ORDER = "pack.keep.file.order";
public static final java.lang.String LATEST = "latest";
public static final java.lang.String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";
public static final java.lang.String MODIFICATION_TIME = "pack.modification.time";
public static final java.lang.String PASS = "pass";
public static final java.lang.String PASS_FILE_PFX = "pack.pass.file.";
public static final java.lang.String PROGRESS = "pack.progress";
public static final java.lang.String SEGMENT_LIMIT = "pack.segment.limit";
public static final java.lang.String STRIP = "strip";
public static final java.lang.String TRUE = "true";
public static final java.lang.String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";
}
public static interface Unpacker
{
public abstract  java.util.SortedMap<java.lang.String, java.lang.String> properties();
public abstract  void unpack(java.io.InputStream in, java.util.jar.JarOutputStream out) throws java.io.IOException;
public abstract  void unpack(java.io.File in, java.util.jar.JarOutputStream out) throws java.io.IOException;
public abstract  void addPropertyChangeListener(java.beans.PropertyChangeListener listener);
public abstract  void removePropertyChangeListener(java.beans.PropertyChangeListener listener);
public static final java.lang.String DEFLATE_HINT = "unpack.deflate.hint";
public static final java.lang.String FALSE = "false";
public static final java.lang.String KEEP = "keep";
public static final java.lang.String PROGRESS = "unpack.progress";
public static final java.lang.String TRUE = "true";
}
Pack200() { throw new RuntimeException("Stub!"); }
public static  java.util.jar.Pack200.Packer newPacker() { throw new RuntimeException("Stub!"); }
public static  java.util.jar.Pack200.Unpacker newUnpacker() { throw new RuntimeException("Stub!"); }
}
