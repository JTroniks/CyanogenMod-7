package java.util;
public abstract class ResourceBundle
{
@java.lang.SuppressWarnings(value={"nls"})
public static class Control
{
protected  Control() { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle.Control getControl(java.util.List<java.lang.String> formats) { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle.Control getNoFallbackControl(java.util.List<java.lang.String> formats) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.util.Locale> getCandidateLocales(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getFormats(java.lang.String baseName) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getFallbackLocale(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.util.ResourceBundle newBundle(java.lang.String baseName, java.util.Locale locale, java.lang.String format, java.lang.ClassLoader loader, boolean reload) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  long getTimeToLive(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  boolean needsReload(java.lang.String baseName, java.util.Locale locale, java.lang.String format, java.lang.ClassLoader loader, java.util.ResourceBundle bundle, long loadTime) { throw new RuntimeException("Stub!"); }
public  java.lang.String toBundleName(java.lang.String baseName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public final  java.lang.String toResourceName(java.lang.String bundleName, java.lang.String suffix) { throw new RuntimeException("Stub!"); }
public static final java.util.List<java.lang.String> FORMAT_DEFAULT;
public static final java.util.List<java.lang.String> FORMAT_CLASS;
public static final java.util.List<java.lang.String> FORMAT_PROPERTIES;
public static final long TTL_DONT_CACHE = -1L;
public static final long TTL_NO_EXPIRATION_CONTROL = -2L;
static { FORMAT_DEFAULT = null; FORMAT_CLASS = null; FORMAT_PROPERTIES = null; }
}
public  ResourceBundle() { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String bundleName) throws java.util.MissingResourceException { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String bundleName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  java.util.ResourceBundle getBundle(java.lang.String bundleName, java.util.Locale locale, java.lang.ClassLoader loader) throws java.util.MissingResourceException { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.ResourceBundle.Control control) { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.Locale targetLocale, java.util.ResourceBundle.Control control) { throw new RuntimeException("Stub!"); }
public static  java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.Locale targetLocale, java.lang.ClassLoader loader, java.util.ResourceBundle.Control control) { throw new RuntimeException("Stub!"); }
public abstract  java.util.Enumeration<java.lang.String> getKeys();
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(java.lang.String key) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(java.lang.String key) { throw new RuntimeException("Stub!"); }
public final  java.lang.String[] getStringArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
protected abstract  java.lang.Object handleGetObject(java.lang.String key);
protected  void setParent(java.util.ResourceBundle bundle) { throw new RuntimeException("Stub!"); }
public static final  void clearCache() { throw new RuntimeException("Stub!"); }
public static final  void clearCache(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> keySet() { throw new RuntimeException("Stub!"); }
protected  java.util.Set<java.lang.String> handleKeySet() { throw new RuntimeException("Stub!"); }
protected java.util.ResourceBundle parent;
}
