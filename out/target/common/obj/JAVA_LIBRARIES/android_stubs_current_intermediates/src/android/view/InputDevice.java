package android.view;
public final class InputDevice
  implements android.os.Parcelable
{
public static final class MotionRange
{
MotionRange() { throw new RuntimeException("Stub!"); }
public  float getMin() { throw new RuntimeException("Stub!"); }
public  float getMax() { throw new RuntimeException("Stub!"); }
public  float getRange() { throw new RuntimeException("Stub!"); }
public  float getFlat() { throw new RuntimeException("Stub!"); }
public  float getFuzz() { throw new RuntimeException("Stub!"); }
}
InputDevice() { throw new RuntimeException("Stub!"); }
public static  android.view.InputDevice getDevice(int id) { throw new RuntimeException("Stub!"); }
public static  int[] getDeviceIds() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  int getSources() { throw new RuntimeException("Stub!"); }
public  int getKeyboardType() { throw new RuntimeException("Stub!"); }
public  android.view.KeyCharacterMap getKeyCharacterMap() { throw new RuntimeException("Stub!"); }
public  android.view.InputDevice.MotionRange getMotionRange(int rangeType) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int SOURCE_CLASS_MASK = 255;
public static final int SOURCE_CLASS_BUTTON = 1;
public static final int SOURCE_CLASS_POINTER = 2;
public static final int SOURCE_CLASS_TRACKBALL = 4;
public static final int SOURCE_CLASS_POSITION = 8;
public static final int SOURCE_UNKNOWN = 0;
public static final int SOURCE_KEYBOARD = 257;
public static final int SOURCE_DPAD = 513;
public static final int SOURCE_TOUCHSCREEN = 4098;
public static final int SOURCE_MOUSE = 8194;
public static final int SOURCE_TRACKBALL = 65540;
public static final int SOURCE_TOUCHPAD = 1048584;
public static final int SOURCE_ANY = -256;
public static final int MOTION_RANGE_X = 0;
public static final int MOTION_RANGE_Y = 1;
public static final int MOTION_RANGE_PRESSURE = 2;
public static final int MOTION_RANGE_SIZE = 3;
public static final int MOTION_RANGE_TOUCH_MAJOR = 4;
public static final int MOTION_RANGE_TOUCH_MINOR = 5;
public static final int MOTION_RANGE_TOOL_MAJOR = 6;
public static final int MOTION_RANGE_TOOL_MINOR = 7;
public static final int MOTION_RANGE_ORIENTATION = 8;
public static final int KEYBOARD_TYPE_NONE = 0;
public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
public static final android.os.Parcelable.Creator<android.view.InputDevice> CREATOR;
static { CREATOR = null; }
}
