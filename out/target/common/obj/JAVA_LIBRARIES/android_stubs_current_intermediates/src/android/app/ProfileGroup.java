package android.app;
public class ProfileGroup
  implements android.os.Parcelable
{
public static enum Mode
{
DEFAULT(),
OVERRIDE(),
SUPPRESS();
}
ProfileGroup() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  boolean isDefaultGroup() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getSoundOverride() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getRingerOverride() { throw new RuntimeException("Stub!"); }
public  android.app.ProfileGroup.Mode getSoundMode() { throw new RuntimeException("Stub!"); }
public  android.app.ProfileGroup.Mode getRingerMode() { throw new RuntimeException("Stub!"); }
public  android.app.ProfileGroup.Mode getVibrateMode() { throw new RuntimeException("Stub!"); }
public  android.app.ProfileGroup.Mode getLightsMode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
}
