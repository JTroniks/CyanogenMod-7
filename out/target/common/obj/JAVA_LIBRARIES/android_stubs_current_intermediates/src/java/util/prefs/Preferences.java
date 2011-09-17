package java.util.prefs;
public abstract class Preferences
{
protected  Preferences() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String absolutePath();
public abstract  java.lang.String[] childrenNames() throws java.util.prefs.BackingStoreException;
public abstract  void clear() throws java.util.prefs.BackingStoreException;
public abstract  void exportNode(java.io.OutputStream ostream) throws java.io.IOException, java.util.prefs.BackingStoreException;
public abstract  void exportSubtree(java.io.OutputStream ostream) throws java.io.IOException, java.util.prefs.BackingStoreException;
public abstract  void flush() throws java.util.prefs.BackingStoreException;
public abstract  java.lang.String get(java.lang.String key, java.lang.String deflt);
public abstract  boolean getBoolean(java.lang.String key, boolean deflt);
public abstract  byte[] getByteArray(java.lang.String key, byte[] deflt);
public abstract  double getDouble(java.lang.String key, double deflt);
public abstract  float getFloat(java.lang.String key, float deflt);
public abstract  int getInt(java.lang.String key, int deflt);
public abstract  long getLong(java.lang.String key, long deflt);
public static  void importPreferences(java.io.InputStream istream) throws java.util.prefs.InvalidPreferencesFormatException, java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  boolean isUserNode();
public abstract  java.lang.String[] keys() throws java.util.prefs.BackingStoreException;
public abstract  java.lang.String name();
public abstract  java.util.prefs.Preferences node(java.lang.String path);
public abstract  boolean nodeExists(java.lang.String path) throws java.util.prefs.BackingStoreException;
public abstract  java.util.prefs.Preferences parent();
public abstract  void put(java.lang.String key, java.lang.String value);
public abstract  void putBoolean(java.lang.String key, boolean value);
public abstract  void putByteArray(java.lang.String key, byte[] value);
public abstract  void putDouble(java.lang.String key, double value);
public abstract  void putFloat(java.lang.String key, float value);
public abstract  void putInt(java.lang.String key, int value);
public abstract  void putLong(java.lang.String key, long value);
public abstract  void remove(java.lang.String key);
public abstract  void removeNode() throws java.util.prefs.BackingStoreException;
public abstract  void addNodeChangeListener(java.util.prefs.NodeChangeListener ncl);
public abstract  void addPreferenceChangeListener(java.util.prefs.PreferenceChangeListener pcl);
public abstract  void removeNodeChangeListener(java.util.prefs.NodeChangeListener ncl);
public abstract  void removePreferenceChangeListener(java.util.prefs.PreferenceChangeListener pcl);
public abstract  void sync() throws java.util.prefs.BackingStoreException;
public static  java.util.prefs.Preferences systemNodeForPackage(java.lang.Class<?> c) { throw new RuntimeException("Stub!"); }
public static  java.util.prefs.Preferences systemRoot() { throw new RuntimeException("Stub!"); }
public static  java.util.prefs.Preferences userNodeForPackage(java.lang.Class<?> c) { throw new RuntimeException("Stub!"); }
public static  java.util.prefs.Preferences userRoot() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String toString();
public static final int MAX_KEY_LENGTH = 80;
public static final int MAX_NAME_LENGTH = 80;
public static final int MAX_VALUE_LENGTH = 8192;
}
