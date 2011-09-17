package android.os;
public final class StrictMode
{
public static final class ThreadPolicy
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.os.StrictMode.ThreadPolicy policy) { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectAll() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitAll() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectNetwork() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitNetwork() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectDiskReads() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitDiskReads() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder detectDiskWrites() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder permitDiskWrites() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyDialog() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyDeath() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyLog() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy.Builder penaltyDropBox() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.ThreadPolicy build() { throw new RuntimeException("Stub!"); }
}
ThreadPolicy() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.StrictMode.ThreadPolicy LAX;
static { LAX = null; }
}
public static final class VmPolicy
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectAll() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder detectLeakedSqlLiteObjects() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyDeath() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyLog() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy.Builder penaltyDropBox() { throw new RuntimeException("Stub!"); }
public  android.os.StrictMode.VmPolicy build() { throw new RuntimeException("Stub!"); }
}
VmPolicy() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.StrictMode.VmPolicy LAX;
static { LAX = null; }
}
StrictMode() { throw new RuntimeException("Stub!"); }
public static  void setThreadPolicy(android.os.StrictMode.ThreadPolicy policy) { throw new RuntimeException("Stub!"); }
public static  android.os.StrictMode.ThreadPolicy getThreadPolicy() { throw new RuntimeException("Stub!"); }
public static  android.os.StrictMode.ThreadPolicy allowThreadDiskWrites() { throw new RuntimeException("Stub!"); }
public static  android.os.StrictMode.ThreadPolicy allowThreadDiskReads() { throw new RuntimeException("Stub!"); }
public static  void setVmPolicy(android.os.StrictMode.VmPolicy policy) { throw new RuntimeException("Stub!"); }
public static  android.os.StrictMode.VmPolicy getVmPolicy() { throw new RuntimeException("Stub!"); }
public static  void enableDefaults() { throw new RuntimeException("Stub!"); }
}
