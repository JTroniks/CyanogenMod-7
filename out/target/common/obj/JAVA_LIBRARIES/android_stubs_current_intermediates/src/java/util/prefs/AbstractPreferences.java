package java.util.prefs;
public abstract class AbstractPreferences
  extends java.util.prefs.Preferences
{
protected  AbstractPreferences(java.util.prefs.AbstractPreferences parent, java.lang.String name) { throw new RuntimeException("Stub!"); }
protected final  java.util.prefs.AbstractPreferences[] cachedChildren() { throw new RuntimeException("Stub!"); }
protected  java.util.prefs.AbstractPreferences getChild(java.lang.String name) throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
protected  boolean isRemoved() { throw new RuntimeException("Stub!"); }
protected abstract  void flushSpi() throws java.util.prefs.BackingStoreException;
protected abstract  java.lang.String[] childrenNamesSpi() throws java.util.prefs.BackingStoreException;
protected abstract  java.util.prefs.AbstractPreferences childSpi(java.lang.String name);
protected abstract  void putSpi(java.lang.String name, java.lang.String value);
protected abstract  java.lang.String getSpi(java.lang.String key);
protected abstract  java.lang.String[] keysSpi() throws java.util.prefs.BackingStoreException;
protected abstract  void removeNodeSpi() throws java.util.prefs.BackingStoreException;
protected abstract  void removeSpi(java.lang.String key);
protected abstract  void syncSpi() throws java.util.prefs.BackingStoreException;
public  java.lang.String absolutePath() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] childrenNames() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  void clear() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  void exportNode(java.io.OutputStream ostream) throws java.io.IOException, java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  void exportSubtree(java.io.OutputStream ostream) throws java.io.IOException, java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  void flush() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  java.lang.String get(java.lang.String key, java.lang.String deflt) { throw new RuntimeException("Stub!"); }
public  boolean getBoolean(java.lang.String key, boolean deflt) { throw new RuntimeException("Stub!"); }
public  byte[] getByteArray(java.lang.String key, byte[] deflt) { throw new RuntimeException("Stub!"); }
public  double getDouble(java.lang.String key, double deflt) { throw new RuntimeException("Stub!"); }
public  float getFloat(java.lang.String key, float deflt) { throw new RuntimeException("Stub!"); }
public  int getInt(java.lang.String key, int deflt) { throw new RuntimeException("Stub!"); }
public  long getLong(java.lang.String key, long deflt) { throw new RuntimeException("Stub!"); }
public  boolean isUserNode() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] keys() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  java.lang.String name() { throw new RuntimeException("Stub!"); }
public  java.util.prefs.Preferences node(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean nodeExists(java.lang.String name) throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  java.util.prefs.Preferences parent() { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void putBoolean(java.lang.String key, boolean value) { throw new RuntimeException("Stub!"); }
public  void putByteArray(java.lang.String key, byte[] value) { throw new RuntimeException("Stub!"); }
public  void putDouble(java.lang.String key, double value) { throw new RuntimeException("Stub!"); }
public  void putFloat(java.lang.String key, float value) { throw new RuntimeException("Stub!"); }
public  void putInt(java.lang.String key, int value) { throw new RuntimeException("Stub!"); }
public  void putLong(java.lang.String key, long value) { throw new RuntimeException("Stub!"); }
public  void remove(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void removeNode() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  void addNodeChangeListener(java.util.prefs.NodeChangeListener ncl) { throw new RuntimeException("Stub!"); }
public  void addPreferenceChangeListener(java.util.prefs.PreferenceChangeListener pcl) { throw new RuntimeException("Stub!"); }
public  void removeNodeChangeListener(java.util.prefs.NodeChangeListener ncl) { throw new RuntimeException("Stub!"); }
public  void removePreferenceChangeListener(java.util.prefs.PreferenceChangeListener pcl) { throw new RuntimeException("Stub!"); }
public  void sync() throws java.util.prefs.BackingStoreException { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected final java.lang.Object lock;
protected boolean newNode;
}
