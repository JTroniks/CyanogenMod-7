package android.content.res;
public class ObbInfo
  implements android.os.Parcelable
{
ObbInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public static final int OBB_OVERLAY = 1;
public java.lang.String filename;
public java.lang.String packageName;
public int version;
public int flags;
public static final android.os.Parcelable.Creator<android.content.res.ObbInfo> CREATOR;
static { CREATOR = null; }
}
