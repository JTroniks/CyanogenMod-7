package android.view;
public abstract class InputEvent
  implements android.os.Parcelable
{
InputEvent() { throw new RuntimeException("Stub!"); }
public final  int getDeviceId() { throw new RuntimeException("Stub!"); }
public final  android.view.InputDevice getDevice() { throw new RuntimeException("Stub!"); }
public final  int getSource() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.InputEvent> CREATOR;
static { CREATOR = null; }
}
